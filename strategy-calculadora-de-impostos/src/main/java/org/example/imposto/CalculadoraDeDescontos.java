package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getQuantidadeDeItens() > 5){
            return orcamento.getValor().multiply((new BigDecimal("0.1")));
        }
        return BigDecimal.ZERO;

    }
}
