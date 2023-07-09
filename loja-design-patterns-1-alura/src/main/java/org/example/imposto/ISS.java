package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements CalculaImposto {

    private BigDecimal aliquota = new BigDecimal("0.06");
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(aliquota);
    }
}
