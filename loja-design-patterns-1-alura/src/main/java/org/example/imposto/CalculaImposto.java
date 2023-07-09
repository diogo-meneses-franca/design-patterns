package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public interface CalculaImposto {

    BigDecimal calcular(Orcamento orcamento);
}
