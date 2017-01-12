package servlet;

import utl.DBUTIL.action.UserAction;
import utl.DBUTIL.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import static java.lang.System.out;

/**
 * Created by husiq on 12/22/2016.
 */
public class UserVerify extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        out.println("this is UserVerify");
        out.println("hi this is UserVerify");

        User user = new User();
        user.setName(request.getParameter("userName"));
        user.setPasswd(request.getParameter("password"));
        out.println("hh User: " + user.getName() + "---" + user.getPasswd());



        UserAction ua = new UserAction();
        Boolean vResult = false;
        try {
            vResult = ua.verifyUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        out.println(vResult);

//        try
//        {
//            Thread.sleep(10000);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }

        if(vResult){
            try {
                request.getSession().setAttribute("user",ua.get(user.getName()));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("go to main page" + request.getContextPath()+"/view/mainPage.jsp");
            response.sendRedirect(request.getContextPath()+"/view/mainPage.jsp");
        }else{
            System.out.println("go to error page" + request.getContextPath()+"/view/errorPage.jsp");
            response.sendRedirect(request.getContextPath()+"/view/errorPage.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
