package filter;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by husiqin on 16/12/28.
 */
@WebFilter(filterName = "Loginfilter",
        value = {"/*"},
        initParams = {
                @WebInitParam(
                        name = "noFilterList",
                        value = "index.jsp;errorPage.jsp;login.jsp;css;jpg;bookM/;UserVerify;js;html;ttf;woff;.map;register.jsp")
            },
        dispatcherTypes = {DispatcherType.REQUEST}
        )
public class Loginfilter implements Filter {

    private FilterConfig filterConfig;
    private static final Logger LOGGER = Logger.getLogger(Loginfilter.class.getName());

    public void destroy() {
        System.out.println("Loginfilter destory");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        System.out.println("start Loginfilter" + new Date());
        LOGGER.info(new Date() + "start loginfilter: ");

        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        //if already login
        if (request.getSession().getAttribute("user") != null){
            chain.doFilter(req, resp);
        }else {
            //if not login, go to the index.jsp page
            String noFilterListString = filterConfig.getInitParameter("noFilterList");

            if (noFilterListString != null){
                String[] noFilterPathList = noFilterListString.split(";");
                for (String path : noFilterPathList){
                    if (path.equals("") || path == null) {
                        continue;
                    }
                    if ( request.getRequestURI().endsWith(path)){
//                        System.out.println(path);
                        LOGGER.info("the path do not filter : " + path);
                        chain.doFilter(req,resp);
                        return;
                    }
                    LOGGER.trace("the path filter : " + path);
                }

                response.sendRedirect(request.getContextPath() + "/");
            }

        }
//        System.out.println("end Loginfilter");
        LOGGER.info("*******end Loginfilter");
//        if ( request.getRequestURI().indexOf("view/login.jsp") != -1
//                || request.getRequestURI().indexOf("bookM/index.jsp") != -1
//                || request.getRequestURI().indexOf("servlet/UserVerify.java") != -1
//                || request.getRequestURI().endsWith("login.jsp")
//                || request.getRequestURI().endsWith("index.jsp")
//                || request.getRequestURI().endsWith("bookM/")
//                || request.getRequestURI().endsWith("css")
//                || request.getRequestURI().endsWith("jsp")
// ){
//            chain.doFilter(req, resp);
//            return;
//        }

    }

    public void init(FilterConfig config) throws ServletException {
//        System.out.println("Loginfilter init");
        LOGGER.info("#######loginfilter init");
        filterConfig = config;
    }

}
