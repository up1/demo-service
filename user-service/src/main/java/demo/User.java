package demo;


public class User {
    private long id;
    private String firstname;
    private String lastname;

    public User(int id) {
        this.id = id;
        this.firstname = "Firstname";
        this.lastname = "Lastname";
    }

    public User() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
