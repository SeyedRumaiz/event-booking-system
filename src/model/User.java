package model;

public class User {
    private final int ID;
    private String name;
    private final int age;
    private String email;

    public User(int ID, String name, int age, String email) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void book(Event event) {

    }
}
