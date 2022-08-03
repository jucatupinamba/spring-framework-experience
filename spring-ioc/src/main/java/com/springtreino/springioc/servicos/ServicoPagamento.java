package com.springtreino.springioc.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoPagamento {
    @Autowired
    private TaxaDeServico taxaDeServico;
    @Autowired
    private ServicoEntrega servicoEntrega;

    public double precoFinal(double custo, String estado){
        return custo + servicoEntrega.entrega(estado) + taxaDeServico.taxa(custo);
    }
}
