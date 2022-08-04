package com.springboottest.app.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
        @GetMapping("/test")
        public String saudacao(@RequestParam(name="nome", defaultValue = "Juca") String nome){
            return String.format("Bem-vindo, %s", nome);
        }
}
