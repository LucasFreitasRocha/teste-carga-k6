package com.trabalhota2.service;

import com.ezylang.evalex.EvaluationException;
import com.ezylang.evalex.Expression;
import com.ezylang.evalex.parser.ParseException;
import com.trabalhota2.dto.in.ExpressaoDTO;
import com.trabalhota2.dto.out.ResultadoDTO;
import com.trabalhota2.exception.BadCustomizeException;
import org.springframework.stereotype.Service;

@Service
public class ExpressaoService {
    private Float resultado;
    public ResultadoDTO resolver(ExpressaoDTO expressaoDTO) {
        Expression expression = new Expression(expressaoDTO.getExpressao());
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        try {
            resultadoDTO.setResultado(expression.evaluate().getStringValue());
        }catch (Exception e) {
            throw new BadCustomizeException(e.getMessage());
        }

        return  resultadoDTO;
    }
}
