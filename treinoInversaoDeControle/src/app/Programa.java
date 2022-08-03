package app;

import app.servicos.ServicoEntrega;
import app.servicos.ServicoPagamento;
import app.servicos.TaxaDeServico;

public class Programa {

    public static void main(String[] args) {

        TaxaDeServico taxaDeServico = new TaxaDeServico();
        ServicoEntrega servicoEntrega = new ServicoEntrega();
        //essa estratégia implanta a inversão de controle - facilitando também o descoplamento e troca de classes;
        ServicoPagamento servicoPagamento = new ServicoPagamento(taxaDeServico, servicoEntrega);

        System.out.println("Resultado = " + servicoPagamento.precoFinal(300.0, "SP"));
    }
}
