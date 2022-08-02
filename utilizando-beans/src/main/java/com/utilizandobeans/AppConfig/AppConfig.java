package com.utilizandobeans.AppConfig;

import com.utilizandobeans.entidades.Autor;
import com.utilizandobeans.entidades.AutorLivro;
import com.utilizandobeans.entidades.Livro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro(){
        return new Livro();
    }

    @Bean
    public AutorLivro getAutor(){
        return new Autor();
    }
}
