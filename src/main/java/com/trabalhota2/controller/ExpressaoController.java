package com.trabalhota2.controller;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.parser.ParseException;
import com.trabalhota2.dto.in.ExpressaoDTO;
import com.trabalhota2.dto.out.ResultadoDTO;
import com.trabalhota2.service.ExpressaoService;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expressao")
public class ExpressaoController {

    @Autowired
    private ExpressaoService expressaoService;

    @PostMapping
    public ResponseEntity<ResultadoDTO> expressao(@RequestBody ExpressaoDTO expressaoDTO) {
        return  ResponseEntity.ok(expressaoService.resolver(expressaoDTO));
    }
}
