package chapter2.setNewPropertiesLockOne;

/**
 * @author spencercjh
 */
public class Userinfo {
    String username;
    String password;

    public Userinfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Userinfo() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
