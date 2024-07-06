package hus.example.communicate1.user;

public class user {

    private String id;
    private String username;
    private String fullname;
    private String img;
    private String bio;
    public user(String id,String username,String fullname,String img,String bio){
        this.id=id;
        this.username=username;
        this.bio=bio;
        this.fullname=fullname;
        this.img=img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
