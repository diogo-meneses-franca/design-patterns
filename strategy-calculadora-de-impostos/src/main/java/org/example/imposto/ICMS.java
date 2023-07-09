package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements CalculaImposto {

    private BigDecimal aliquota = new BigDecimal("0.10");

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return null;
    }
}
