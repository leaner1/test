package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by husiqin on 16/12/28.
 */
@WebFilter(filterName = "Loginfilter")
public class Loginfilter implements Filter {

    private FilterConfig filterConfig;

    public void destroy() {
        System.out.println("Loginfilter destory");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        String noFilterListString = filterConfig.getInitParameter("noFilterList");

        if (noFilterListString != null){
            String[] noFilterPathList = noFilterListString.split(";");
            for (String path : noFilterPathList){
                if (path.equals("") || path == null) continue;
                if ( request.getRequestURI().endsWith(path)){
                    chain.doFilter(req,resp);
                    return;
                }
            }

        }

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

        if (request.getSession().getAttribute("user") != null){
            chain.doFilter(req, resp);
        }else {
            response.sendRedirect(request.getContextPath() + "/");
        }


    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Loginfilter init");
        filterConfig = config;
    }

}
