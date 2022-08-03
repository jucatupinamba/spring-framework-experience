package com.springtreino.springioc.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoPagamento {
    @Autowired
    private TaxaDeServico taxaDeServico;
    @Autowired
    private ServicoEntrega servicoEntrega;
}
