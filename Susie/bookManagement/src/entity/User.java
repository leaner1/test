package entity;

/**
 * Created by husiq on 12/15/2016.
 */
public class User {
    private String name;
    private String passwd;
    private String[] roles;

    public User(String name, String passwd, String[] roles) {
        this.name = name;
        this.passwd = passwd;
        this.roles = roles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getName() {

        return name;
    }

    public String getPasswd() {
        return passwd;
    }

    public String[] getRoles() {
        return roles;
    }
}
