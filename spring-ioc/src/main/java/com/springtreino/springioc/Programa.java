package com.springtreino.springioc;

import com.springtreino.springioc.servicos.ServicoPagamento;

public class Programa {
    public static void main(String[] args) {

        ServicoPagamento servicoPagamento = new ServicoPagamento();

        System.out.println("Resultado = " + servicoPagamento.precoFinal(300.0, "SP"));
    }
}
