package model;

public class User implements  GitUser{
    private String nombre;
    private Respository userState;

    public User(String nombre, Respository userState) {
        this.nombre = nombre;
        this.userState = userState;
    }

    @Override
    public String pull() {
        //git pull...
        return userState.getCommit();
    }
}
