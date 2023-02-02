package uz.pdp.Instagram.model;

import java.util.UUID;

public class Followers extends BaseModel{
private UUID userId;
private String username;
private String post;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Followers(UUID userId, String username, String post) {
        this.userId = userId;
        this.username = username;
        this.post = post;
    }
}
