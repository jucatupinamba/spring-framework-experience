package com.springtreino.springioc.servicos;

import org.springframework.stereotype.Service;

@Service
public class TaxaDeServico {

    public double taxa(double value){
        return value * 0.1;
    }
}
