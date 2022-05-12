package test;

import model.ColecciónCompuesto;
import model.LibroHoja;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ColecciónCompuestoTest {

    List<String> idiomas;
    List<String> generos;
    ColecciónCompuesto coleccionJA;
    LibroHoja libroJA2;
    LibroHoja libroJA3;

    @BeforeEach
    public void init() {
        idiomas = new ArrayList<String>();
        idiomas.add("Español");
        generos = new ArrayList<String>();
        generos.add("Ficción utópica y distópica");
        generos.add("Ciencia ficción");
        generos.add("Drama");
        this.coleccionJA = new ColecciónCompuesto("Los Juegos del Hambre");
        this.libroJA2 = new LibroHoja("En llamas","Suzanne Collins",idiomas,
                "RBA",2014L,generos);
        this.libroJA3 = new LibroHoja("Sinsajo","Suzanne Collins",idiomas,
                "debolsillo",2017L,generos);
        this.coleccionJA.add(libroJA2);
        this.coleccionJA.add(libroJA3);
        this.coleccionJA.remove(libroJA2);

    }

    @Test
    void toStringLibrería() {
        String expected = "Colección: Los Juegos del Hambre";
        assertEquals(expected,coleccionJA.toStringLibrería());
    }

    @Test
    void viewLibrería() {
        String expected ="Libro:Sinsajo\n"+
                "Autor:Suzanne Collins\n"+
                "Idiomas:[]\n"+
                "Editorial:debolsillo\n"+
                "Edicion:2017\n"+
                "Género:[]\n";
        assertEquals(expected,this.coleccionJA.viewLibrería());
    }
}