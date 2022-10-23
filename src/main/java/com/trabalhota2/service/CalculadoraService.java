package com.trabalhota2.service;

import com.trabalhota2.dto.in.OperacaoSimplesDTO;
import com.trabalhota2.dto.out.ResultadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    @Autowired private SomarService somarService;






    public ResultadoDTO somar(OperacaoSimplesDTO operacaoSimplesDTO) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        resultadoDTO.setResultado(String.valueOf(
                somarService.somar(
                        operacaoSimplesDTO.getNumero1(),
                        operacaoSimplesDTO.getNumero2()
                        )));
        return resultadoDTO;
    }
}
