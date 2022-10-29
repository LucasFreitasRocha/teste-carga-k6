package com.trabalhota2.dto.in;

import io.swagger.annotations.ApiModelProperty;

public class OperacaoDTO {
    @ApiModelProperty(name = "5" , value = "5")
    private Float numero1;
    @ApiModelProperty(name = "5" , value = "5")
    private Float numero2;

    public OperacaoDTO() {
    }

    public Float getNumero1() {
        return numero1;
    }

    public void setNumero1(Float numero1) {
        this.numero1 = numero1;
    }

    public Float getNumero2() {
        return numero2;
    }

    public void setNumero2(Float numero2) {
        this.numero2 = numero2;
    }
}
