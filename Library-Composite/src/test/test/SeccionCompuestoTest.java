package test;

import model.ColecciónCompuesto;
import model.SeccionCompuesto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeccionCompuestoTest {

    SeccionCompuesto seccionF;
    ColecciónCompuesto colecciónRK;
    ColecciónCompuesto colecciónWB;
    ColecciónCompuesto colecciónAK;

    @BeforeEach
    void init() {
        this.seccionF = new SeccionCompuesto("Finanzas");
        this.colecciónRK = new ColecciónCompuesto("Robert Kiyosaki");
        this.colecciónWB = new ColecciónCompuesto("Warren Buffett");
        this.colecciónAK = new ColecciónCompuesto("André Kostolany");
        this.seccionF.add(colecciónAK);
        this.seccionF.add(colecciónWB);
        this.seccionF.remove(colecciónAK);
        this.seccionF.add(colecciónRK);
    }

    @Test
    void toStringLibrería() {
        String expected = "Seccion: Finanzas";
        assertEquals(expected,seccionF.toStringLibrería());
    }

    @Test
    void viewLibrería() {
        String expected ="Colección: Warren Buffett\n"+
                "Colección: Robert Kiyosaki\n";
        assertEquals(expected,this.seccionF.viewLibrería());
    }
}