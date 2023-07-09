package org.example.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private int quantidadeDeItens;
    private BigDecimal valor;

    public Orcamento(BigDecimal valor, int quantidadeDeItens){
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public BigDecimal getValor(){
        return this.valor;
    }

    public int getQuantidadeDeItens(){
        return quantidadeDeItens;
    }

    public void setValor(BigDecimal valo){
        this.valor = valor;
    }
}
