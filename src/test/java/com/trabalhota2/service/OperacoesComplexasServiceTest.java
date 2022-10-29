package com.trabalhota2.service;

import com.trabalhota2.dto.in.OperacaoDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OperacoesComplexasServiceTest {

    @InjectMocks
    private OperacoesComplexasService service;

    OperacaoDTO getOperacaoDto(float numero1, float numero2){
        OperacaoDTO operacaoDTO = new OperacaoDTO();
        operacaoDTO.setNumero1(numero1);
        operacaoDTO.setNumero2(numero2);
        return  operacaoDTO;
    }

    @Test
    void raizQuadrada(){
        assertEquals("5.0", service.raizQuadrada(Float.valueOf(25)).getResultado());
    }

    @Test
    void potenciacao(){
        assertEquals("1024.0", service.potenciacao(
                getOperacaoDto(Float.valueOf(2),Float.valueOf(10)) ).getResultado());
    }
}