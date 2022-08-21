package com.utilizandobeans;

import com.utilizandobeans.AppConfig.AppConfig;
import com.utilizandobeans.entidades.Autor;
import com.utilizandobeans.entidades.Livro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        Autor autor = factory.getBean(Autor.class);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Livro");
        livro.setNome(sc.nextLine());
        System.out.println("Digite o nome do autor: ");
        autor.setAutor(sc.nextLine());
        System.out.println("Insira a descrição do livro: ");
        livro.setDescrição(sc.nextLine());
        System.out.println("Insira o códico do livro: ");
        livro.setCodigo(sc.nextLine());

        livro.exibir();

        ((AbstractApplicationContext) factory).close();
    }
}
