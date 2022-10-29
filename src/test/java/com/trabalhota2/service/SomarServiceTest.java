package com.trabalhota2.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SomarServiceTest {

    @InjectMocks
    private SomarService somarService;

    @Test
    void somar(){
        assertEquals(Float.valueOf(4), somarService.operar(Float.valueOf(2),Float.valueOf(2)));
    }
}