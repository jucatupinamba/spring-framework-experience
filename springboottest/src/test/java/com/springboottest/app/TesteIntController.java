package com.springboottest.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TesteIntController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testInt ()throws Exception{

        RequestBuilder requisicao = get("/test");
        MvcResult resultado = mockMvc.perform(requisicao).andReturn();
        assertEquals("Bem-vindo, Juca", resultado.getResponse().getContentAsString());
    }

    @Test
    public void testIntComArgumento() throws Exception{
        mockMvc.perform(get("/test?nome=Juca"))
                .andExpect(content().string("Bem-vindo, Juca"));
    }
}
