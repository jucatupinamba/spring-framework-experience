package com.springtreino.springioc.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxaDeServico {
    @Autowired
    public double taxa(double value){
        return value * 0.1;
    }
}
