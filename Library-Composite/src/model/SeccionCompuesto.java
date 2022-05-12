package model;

import java.util.ArrayList;
import java.util.List;

public class SeccionCompuesto extends Librería{
    private List<Librería> listSeccion;

    public SeccionCompuesto(String nombre) {
        super(nombre);
        this.listSeccion= new ArrayList<Librería>();
    }

    @Override
    public void add(Librería l) {
        listSeccion.add(l);
    }

    @Override
    public void remove(Librería l) {
        listSeccion.remove(l);
    }

    @Override
    public String toStringLibrería() {
        return "Seccion: "+this.getNombre();
    }

    @Override
    public String viewLibrería() {
        String coleccion = "";
        for(Librería item : listSeccion){
            coleccion+=item.toStringLibrería()+"\n";
        }
        return coleccion;
    }
}
