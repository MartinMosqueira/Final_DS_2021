package model;

public abstract class Librería {
    private String nombre;

    public Librería(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void add(Librería l);
    public abstract void remove(Librería l);
    public abstract  String toStringLibrería();

}
