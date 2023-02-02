package uz.pdp.Instagram.model;

public class User extends BaseModel {
    private String username;
    private String password;
    private String phoneNumber;
private String fullName;
private String Bio;
private String gmail;

    public User(String username, String password, String phoneNumber, String fullName, String bio, String gmail) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        Bio = bio;
        this.gmail = gmail;
    }

    public User(String username, String password, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
