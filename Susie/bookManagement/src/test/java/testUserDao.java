import servlet.UserVerify;
import utl.DBUTIL.action.UserAction;
import utl.DBUTIL.dao.UserDao;
import utl.DBUTIL.model.User;

import java.sql.SQLException;

/**
 * Created by husiq on 12/22/2016.
 */
public class testUserDao {
    public static void main(String[] args) {
        UserDao ud = new UserDao();
        User user = new User();
        user.setName("123");
        user.setPasswd("1234");
        Boolean vResult = false;
        try {
            vResult = ud.verifyUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(vResult);
        UserAction ua = new UserAction();
        try {
            vResult = ua.verifyUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(vResult);

    }
}
