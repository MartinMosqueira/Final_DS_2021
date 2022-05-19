package model;

public class User extends System {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void enter_log(String name, String password){
        this.name=name;
        this.password=password;
        notifySystem();
    }
}
