/**
 * @author Trevor Hartman
 * @author MK Ripley
 *
 * @since Version 1.0
 * 4/07/2023
 **/
public class User {
    private String username;
    private String passHash;

    public User(String username, String passHash){

        this.username = username;
        this.passHash = passHash;
    }
    public String getPassHash() {
        return passHash;
    }

    public String getUsername() {
        return username;
    }
}
