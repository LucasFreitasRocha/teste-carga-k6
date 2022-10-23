package com.trabalhota2.controller;

import com.trabalhota2.dto.in.OperacaoSimplesDTO;
import com.trabalhota2.dto.out.ResultadoDTO;
import com.trabalhota2.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calcular")
public class CalculadoraController {

    @Autowired private CalculadoraService service;

    @PostMapping("/somar")
    public ResponseEntity<ResultadoDTO> somar(@RequestBody OperacaoSimplesDTO operacaoSimplesDTO){
       return ResponseEntity.ok(service.somar(operacaoSimplesDTO));
    }
}
