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

    public static void main(String[] args) throws java.sql.SQLException{
        UserDao ud = new UserDao();
        //create a user
        User user = new User();
        user.setName("susie");
        user.setPasswd("susie");
        user.setClient(true);
        user.setAdmin(true);
        user.setSeller(true);
        //add a user to DB
//        ud.addUser(user);
        user.setId(ud.getIdByName(user.getName()));
        //update the user
        user.setName("SusieHu");
//        ud.updateUser(user);

        List<Map<String,Object>> params = new ArrayList<Map<String, Object>>();
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("lo","and");
        param.put("key","name");
        param.put("rela","=");
        param.put("value","'susie'");
        params.add(param);
        Map<String,Object> param1 = new HashMap<String,Object>();
        param1.put("lo","or");
        param1.put("key","email");
        param1.put("rela","=");
        param1.put("value","'susie1'");
        params.add(param1);

        List<User> us = ud.query(params);
        for (User u : us){
            System.out.println(u.toString());
        }
//        ud.removeUser(user.getId());
//        ud.removeUser(5);

    }
}
