package com.trabalhota2.service;

import com.trabalhota2.dto.in.OperacaoDTO;
import com.trabalhota2.dto.out.ResultadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperacoesSimplesService {

    @Autowired private SomarService somarService;
    @Autowired private MultiplicarService multiplicarService;
    @Autowired private DividirService dividirService;
    @Autowired private SubtrairService subtrairService;





    public ResultadoDTO somar(OperacaoDTO operacaoDTO) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        resultadoDTO.setResultado(String.valueOf(
                somarService.operar(
                        operacaoDTO.getNumero1(),
                        operacaoDTO.getNumero2()
                        )));
        return resultadoDTO;
    }

    public ResultadoDTO multiplicar(OperacaoDTO operacaoDTO) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        resultadoDTO.setResultado(String.valueOf(
                multiplicarService.operar(
                        operacaoDTO.getNumero1(),
                        operacaoDTO.getNumero2()
                )));
        return resultadoDTO;
    }

    public ResultadoDTO dividir(OperacaoDTO operacaoDTO) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        resultadoDTO.setResultado(String.valueOf(
                dividirService.operar(
                        operacaoDTO.getNumero1(),
                        operacaoDTO.getNumero2()
                )));
        return resultadoDTO;
    }

    public ResultadoDTO subtrair(OperacaoDTO operacaoDTO) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        resultadoDTO.setResultado(String.valueOf(
                subtrairService.operar(
                        operacaoDTO.getNumero1(),
                        operacaoDTO.getNumero2()
                )));
        return resultadoDTO;
    }
}
