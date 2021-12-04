package test;

import model.Respository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RespositoryTest {

    Respository respository;

    @BeforeEach
    public void init(){
        respository =  new Respository("Práctica-Java");
        this.respository.setCommit("Cambios en la Interfaz");
    }

    @Test
    void getCommit() {
        String expected = "Respository:Práctica-Java Commit:Cambios en la Interfaz";
        assertEquals(expected,this.respository.getCommit());
    }

    @Test
    void setCommit() {
        this.respository.setCommit("Modificaciones en la configuracion");
        String expected = "Respository:Práctica-Java Commit:Modificaciones en la configuracion";
        assertEquals(expected,this.respository.getCommit());
    }
}