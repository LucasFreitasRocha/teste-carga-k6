package com.trabalhota2.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MultiplicarServiceTest {

    @InjectMocks
    private MultiplicarService multiplicarService;


    @Test
    void multiplicar(){
        assertEquals(Float.valueOf(4), multiplicarService.operar(Float.valueOf(2),Float.valueOf(2)));
    }
}