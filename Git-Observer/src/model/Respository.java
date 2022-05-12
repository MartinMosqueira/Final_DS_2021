package model;

public class Respository extends NewRepository{

    private String repositoryState;
    private String nombre;

    public Respository(String nombre) {
        super();
        this.repositoryState = "";
        this.nombre = nombre;
    }

    public String getCommit() {
        return "Respository:"+nombre+" Commit:"+repositoryState;
    }

    public void setCommit(String repositoryState) {
        this.repositoryState = repositoryState;

        notifyCommit();
    }

}
