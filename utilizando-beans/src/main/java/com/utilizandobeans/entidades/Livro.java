package com.utilizandobeans.entidades;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    private String nome;
    private String descrição;
    private String codigo;
    @Autowired
    AutorLivro autorLivro;

    public AutorLivro getAutorLivro() {
        return this.autorLivro;
    }

    public void setAutorLivro(final AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return this.descrição;
    }

    public void setDescrição(final String descrição) {
        this.descrição = descrição;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(final String codigo) {
        this.codigo = codigo;
    }

    public void exibir(){
        autorLivro.exibirAutor();
        System.out.println("Livro: " + nome + '\n' +
                "Descrição: " + descrição + '\n' +
                "Codigo: " + codigo);
    }
}
