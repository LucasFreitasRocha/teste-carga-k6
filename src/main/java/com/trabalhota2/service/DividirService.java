package com.trabalhota2.service;

import org.springframework.stereotype.Service;

@Service
public class DividirService implements OperacaoSimplesInterface {

    @Override
    public Float operar(Float numero1, Float numero2) {
        return numero1/numero2;
    }
}
