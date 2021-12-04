package test;

import model.Respository;
import model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    Respository respository;
    User user1;
    User user2;

    @BeforeEach
    public void init(){
        respository = new Respository("Proyecto-Spring");
        user1 = new User("Luke Skywalker",respository);
        user2 = new User("Anakin Skywalker", respository);
        respository.ForkRepository(user1);
        respository.ForkRepository(user2);
        respository.setCommit("Nuevas rutas de productos");
    }

    @Test
    void pull() {
        String expected = "Respository:Proyecto-Spring Commit:Nuevas rutas de productos";
        assertEquals(expected,this.user1.pull());
    }

    @Test
    void DeleteRepo() {
        respository.DeleteRepository(user2);
        respository.DeleteRepository(user1);
        String expected = "";
        assertEquals(expected,user2.pull());
    }
}