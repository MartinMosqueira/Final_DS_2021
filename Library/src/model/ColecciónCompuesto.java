package model;

import java.util.ArrayList;
import java.util.List;

public class ColecciónCompuesto extends Librería{
    private List<Librería> listLibros;

    public ColecciónCompuesto(String nombre) {
        super(nombre);
        this.listLibros= new ArrayList<Librería>();
    }

    @Override
    public void add(Librería l) {
        listLibros.add(l);
    }

    @Override
    public void remove(Librería l) {
        listLibros.remove(l);
    }

    @Override
    public String toStringLibrería() {
        return "Colección: "+this.getNombre();
    }

    @Override
    public String viewLibrería() {
        String libros = "";
        for(Librería item : listLibros){
            libros+=item.toStringLibrería()+"\n";
        }
        return libros;
    }

}
