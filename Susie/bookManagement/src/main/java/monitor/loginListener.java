package monitor; /**
 * Created by husiqin on 17/1/8.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class loginListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    private int numOfUsers;
    // Public constructor is required by servlet spec
    public loginListener() {

    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
      numOfUsers = 0;
      String textParam = sce.getServletContext().getInitParameter("testParam");
        sce.getServletContext().setAttribute("text","value");
        System.out.println("loginListener init");
        System.out.println("context Params : " + textParam);
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
      System.out.println("loginListener destroy");
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
      se.getSession().getServletContext().setAttribute("numOfUsers",numOfUsers++);
      System.out.println("session created");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
      se.getSession().getServletContext().setAttribute("numOfUsers",numOfUsers--);
      System.out.println("session destroyed");
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
      System.out.println("attributedAdded:" + sbe.getName());
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
        System.out.println("attributedRemoved:" + sbe.getName());
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
        System.out.println("attributedReplaced:" + sbe.getName());
    }
}
