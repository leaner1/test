package utl.DBUTIL.action;

import utl.DBUTIL.dao.UserDao;
import utl.DBUTIL.model.User;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by husiq on 12/16/2016.
 */
public class UserAction {
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
        ud.addUser(user);
        user.setId(ud.getIdByName(user.getName()));
        //update the user
        user.setName("SusieHu");



        ud.updateUser(user);


        List<User> us = ud.query("select * from user;");
        for (User u : us){
            System.out.println(u.toString());
        }
        ud.removeUser(user.getId());
        ud.removeUser(5);

    }
}
