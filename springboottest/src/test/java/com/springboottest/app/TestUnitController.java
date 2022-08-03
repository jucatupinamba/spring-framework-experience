package com.springboottest.app;

import com.springboottest.app.testcontroller.TesteController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {
    @Test
    public void testUnit(){
        TesteController controller = new TesteController();
        String resultado = controller.saudacao("Juca");
        assertEquals("Bem-vindo, Juca", resultado);
        //comparando saída de Strings
    }
}
