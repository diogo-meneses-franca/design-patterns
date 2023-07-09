package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, CalculaImposto imposto){
        return imposto.calcular(orcamento);
    }
}
