package ui.main;

import java.io.Serializable;

public class UsersDetails implements Serializable {

    private String email;
    private String username;
    private String password;

    public UsersDetails(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public UsersDetails() {

    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
