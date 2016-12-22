import utl.DBUTIL.dao.UserDao;
import utl.DBUTIL.model.User;

import java.util.List;

/**
 * Created by husiq on 12/16/2016.
 */
public class test {
    public static void main(String[] args) throws java.sql.SQLException{
        UserDao ud = new UserDao();
        List<User> us = ud.query("select * from user;");
        for (User u : us){
            System.out.println(u.toString());
        }
    }

}
