package dto;

public class UserDTOWith {
    String email;
    String password;

    public UserDTOWith() {
    }

    public UserDTOWith(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDTOWith withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserDTOWith withPassword(String password) {
        this.password = password;
        return this;
    }
}