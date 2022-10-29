package com.trabalhota2.service;

import com.trabalhota2.dto.in.OperacaoDTO;
import com.trabalhota2.dto.out.ResultadoDTO;
import org.springframework.stereotype.Service;

@Service
public class OperacoesComplexasService {
    public ResultadoDTO raizQuadrada(Float numero) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        resultadoDTO.setResultado(String.valueOf(
                Math.sqrt(numero)));
        return resultadoDTO;
    }

    public ResultadoDTO potenciacao(OperacaoDTO operacaoDTO) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        resultadoDTO.setResultado(String.valueOf(
                Math.pow(operacaoDTO.getNumero1(), operacaoDTO.getNumero2())));
        return resultadoDTO;
    }
}
