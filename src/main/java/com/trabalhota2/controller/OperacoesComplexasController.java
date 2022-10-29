package com.trabalhota2.controller;

import com.trabalhota2.dto.in.OperacaoDTO;
import com.trabalhota2.dto.out.ResultadoDTO;
import com.trabalhota2.service.OperacoesComplexasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/operacoes-complexas")
public class OperacoesComplexasController {

    @Autowired private OperacoesComplexasService service;

    @GetMapping("/raiz-quadrada/{numero}")
    public ResponseEntity<ResultadoDTO> raizQuadrada(@PathVariable Float numero){
        return ResponseEntity.ok(service.raizQuadrada(numero));
    }

    @PostMapping("/potenciacao")
    public ResponseEntity<ResultadoDTO> potenciacao(@RequestBody OperacaoDTO operacaoDTO){
        return ResponseEntity.ok(service.potenciacao(operacaoDTO));
    }
}
