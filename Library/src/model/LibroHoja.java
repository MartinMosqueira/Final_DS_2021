package model;

import java.util.ArrayList;
import java.util.List;

public class LibroHoja extends Librería{
    private String autor;
    private List<String> idiomas;
    private String editorial;
    private Long edicion;
    private List<String> género;


    public LibroHoja(String nombre, String autor, List<String> idiomas, String editorial, Long edicion, List<String> género) {
        super(nombre);
        this.autor=autor;
        this.idiomas=new ArrayList<String>();
        this.editorial=editorial;
        this.edicion=edicion;
        this.género= new ArrayList<String>();
    }

    public String getAutor() {
        return autor;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public String getEditorial() {
        return editorial;
    }

    public Long getEdicion() {
        return edicion;
    }

    public List<String> getGénero() {
        return género;
    }

    @Override
    public void add(Librería l) {
        throw new UnsupportedOperationException("Operacion no soportada");
    }

    @Override
    public void remove(Librería l) {
    }

    @Override
    public String toStringLibrería() {
        return "Libro:"+this.getNombre()+"\n"+
                "Autor:"+this.getAutor()+"\n"+
                "Idiomas:"+this.getIdiomas()+"\n"+
                "Editorial:"+this.getEditorial()+"\n"+
                "Edicion:"+this.getEdicion()+"\n"+
                "Género:"+this.getGénero();
    }

    @Override
    public String viewLibrería() {
        return this.toStringLibrería();
    }
}
