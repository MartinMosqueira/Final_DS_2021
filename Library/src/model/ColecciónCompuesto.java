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
        //TODO: hay que ver como hacer para que esta función solo pueda añadir libros y no colecciónes.
    }

    @Override
    public void remove(Librería l) {
        listLibros.remove(l);
    }

    @Override
    public String toStringLibrería() {
        return "Colección: "+this.getNombre();
    }

    public String listColección(){
       String libros = "";
       for(Librería item : listLibros){
           libros+=item.toStringLibrería()+"\n";
       }
       return libros;
    }

}
