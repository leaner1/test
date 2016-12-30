package utl.DBUTIL.action;

import utl.DBUTIL.dao.UserDao;
import utl.DBUTIL.model.User;

import java.util.*;

/**
 * Created by husiq on 12/16/2016.
 */
public class UserAction {

    public void add(User user) throws java.sql.SQLException{
        UserDao ud = new UserDao();
        ud.addUser(user);
    }
    public void del(Integer id) throws java.sql.SQLException{
        UserDao ud = new UserDao();
        ud.deleteUser(id);
    }
    public void edit(User user) throws java.sql.SQLException{
        UserDao ud = new UserDao();
        ud.updateUser(user);
    }
    public List<User> query() throws java.sql.SQLException{
        UserDao ud = new UserDao();
        return ud.query();
    }
    public List<User> query( List<Map<String,Object>> params) throws java.sql.SQLException{
        UserDao ud = new UserDao();
        return ud.query(params);
    }
    public User get(Integer id) throws java.sql.SQLException{
        UserDao ud = new UserDao();
        return ud.getUserById(id);
    }
    public User get(String name) throws java.sql.SQLException{
        UserDao ud = new UserDao();
        return ud.getUserByName(name);
    }
    public Boolean verifyUser(User user)throws java.sql.SQLException{
        UserDao ud = new UserDao();
        return ud.verifyUser(user);
    }
}
