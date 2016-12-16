package utl.DBUTIL.model;

/**
 * Created by husiq on 12/16/2016.
 */
public class User {
    private int id;
    private String name;
    private String passwd;
    private Boolean client;
    private Boolean admin;
    private Boolean seller;
    private String email;

    @Override
    public String toString(){
        return "id: " + this.getId() + "     " +
                "name: " + this.getName()  + "     " +
                "passwd: " + this.getPasswd()  + "     " +
                "email: " + this.getPasswd()  + "     " +
                "isClient: " + this.getClient()  + "     " +
                "isAdmin: " + this.getAdmin() + "     " +
                "isSeller: " + this.getSeller() + "     " + "\n";
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }

    public Boolean getClient() {
        return client;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public Boolean getSeller() {
        return seller;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setClient(Boolean client) {
        this.client = client;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public void setSeller(Boolean seller) {
        this.seller = seller;
    }
}
