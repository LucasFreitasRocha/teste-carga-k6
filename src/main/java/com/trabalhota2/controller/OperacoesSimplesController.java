package com.trabalhota2.controller;

import com.trabalhota2.dto.in.OperacaoDTO;
import com.trabalhota2.dto.out.ResultadoDTO;
import com.trabalhota2.service.OperacoesSimplesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operacoes-simples")
public class OperacoesSimplesController {

    @Autowired private OperacoesSimplesService service;

    @PostMapping("/somar")
    public ResponseEntity<ResultadoDTO> somar(@RequestBody OperacaoDTO operacaoDTO){
       return ResponseEntity.ok(service.somar(operacaoDTO));
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<ResultadoDTO> multiplicar(@RequestBody OperacaoDTO operacaoDTO){
        return ResponseEntity.ok(service.multiplicar(operacaoDTO));
    }
    @PostMapping("/dividir")
    public ResponseEntity<ResultadoDTO> dividir(@RequestBody OperacaoDTO operacaoDTO){
        return ResponseEntity.ok(service.dividir(operacaoDTO));
    }

    @PostMapping("/subtrair")
    public ResponseEntity<ResultadoDTO> subtrair(@RequestBody OperacaoDTO operacaoDTO){
        return ResponseEntity.ok(service.subtrair(operacaoDTO));
    }
}
