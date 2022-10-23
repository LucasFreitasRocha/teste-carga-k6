package com.trabalhota2.service;

import com.trabalhota2.dto.in.OperacaoSimplesDTO;
import com.trabalhota2.dto.out.ResultadoDTO;
import org.springframework.stereotype.Service;

@Service
public class SomarService {

    public Float somar(Float numero1, Float numero2) {
        return  numero1 + numero2;
    }
}
