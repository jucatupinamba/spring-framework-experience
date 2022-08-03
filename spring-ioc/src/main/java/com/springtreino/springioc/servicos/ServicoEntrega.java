package com.springtreino.springioc.servicos;

import org.springframework.stereotype.Service;

@Service
public class ServicoEntrega {

    public double entrega(String estado){
        if("SP".equalsIgnoreCase(estado)){
            return 10.0;
        }
            return 20.0;
    }
}
