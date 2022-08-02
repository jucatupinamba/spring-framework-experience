package com.utilizandobeans.entidades;

public class Autor implements AutorLivro {

    private String autor;

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(final String autor) {
        this.autor = autor;
    }

    @Override
    public void exibirAutor(){
        System.out.println("Autor : " + autor);
    }
}
