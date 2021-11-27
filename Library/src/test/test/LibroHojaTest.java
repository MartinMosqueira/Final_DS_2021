package test;

import model.ColecciónCompuesto;
import model.LibroHoja;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibroHojaTest {
    List<String> idiomas;
    List<String> generos;
    LibroHoja libroGoT1;

    @BeforeEach
    public void init(){
        idiomas=new ArrayList<String>();
        idiomas.add("Ingles");
        idiomas.add("Español");
        generos=new ArrayList<String>();
        generos.add("drama");
        this.libroGoT1 = new LibroHoja("Cancion de hilo y fuego","George R. R. Martin",idiomas,
                "debolsillo",2019L,generos);
    }

    @Test
    void add() {
        var coleccion1 = new ColecciónCompuesto("Game of Thrones");
        assertThrows(UnsupportedOperationException.class,()->{this.libroGoT1.add(coleccion1);});
    }

    @Test
    void remove() {
    }

    @Test
    void toStringLibrería() {
        String expected ="Libro:Cancion de hilo y fuego\n"+
                "Autor:George R. R. Martin\n"+
                "Idiomas:[]\n"+
                "Editorial:debolsillo\n"+
                "Edicion:2019\n"+
                "Género:[]\n";
        assertEquals(expected,this.libroGoT1.toStringLibrería());
    }
}