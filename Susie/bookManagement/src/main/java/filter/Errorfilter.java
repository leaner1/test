package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by husiq on 12/30/2016.
 */
@WebFilter(filterName = "Errorfilter",
        dispatcherTypes = {DispatcherType.ERROR},
        value = {"/view/errorPage.jsp"}
    )
public class Errorfilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("start errorfilter");
        chain.doFilter(req, resp);
        System.out.println("end errorfilter");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Init errorfilter");
    }

}
