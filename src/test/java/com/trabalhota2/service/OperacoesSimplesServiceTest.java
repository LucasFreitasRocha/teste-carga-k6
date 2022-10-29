package com.trabalhota2.service;

import com.trabalhota2.dto.in.OperacaoDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OperacoesSimplesServiceTest {

    @InjectMocks
    private OperacoesSimplesService service;

    @Mock
    private MultiplicarService multiplicarService;

    @Mock
    private SomarService somarService;

    @Mock
    private DividirService dividirService;

    @Mock
    private  SubtrairService subtrairService;

    OperacaoDTO getOperacaoDto(float numero1, float numero2){
        OperacaoDTO operacaoDTO = new OperacaoDTO();
        operacaoDTO.setNumero1(numero1);
        operacaoDTO.setNumero2(numero2);
        return  operacaoDTO;
    }
    @Test
    void somar() {
        when(somarService.operar(Float.valueOf(1),Float.valueOf(1) )).thenReturn(Float.valueOf(2));
        assertEquals("2.0" , service.somar(getOperacaoDto(Float.valueOf(1), Float.valueOf(1))).getResultado());
    }

    @Test
    void multiplicar() {
        when(multiplicarService.operar(Float.valueOf(2),Float.valueOf(2) )).thenReturn(Float.valueOf(4));
        assertEquals("4.0" , service.multiplicar(getOperacaoDto(Float.valueOf(2), Float.valueOf(2))).getResultado());
    }

    @Test
    void dividir() {
        when(dividirService.operar(Float.valueOf(8),Float.valueOf(2) )).thenReturn(Float.valueOf(4));
        assertEquals("4.0" , service.dividir(getOperacaoDto(Float.valueOf(8), Float.valueOf(2))).getResultado());
    }

    @Test
    void subtrair() {
        when(subtrairService.operar(Float.valueOf(8),Float.valueOf(4) )).thenReturn(Float.valueOf(4));
        assertEquals("4.0" , service.subtrair(getOperacaoDto(Float.valueOf(8), Float.valueOf(4))).getResultado());

    }
}