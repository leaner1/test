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
        user.setName("test1");
        user.setPasswd("test");
        Boolean vResult = false;

        UserAction ua = new UserAction();
        try {
            vResult = ua.verifyUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(vResult);
    }
}
