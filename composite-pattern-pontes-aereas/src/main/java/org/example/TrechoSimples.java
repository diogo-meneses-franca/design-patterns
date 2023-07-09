package org.example;

public class TrechoSimples implements TrechoAereo{

    private String origem;
    private String destino;
    private double preco;

    public TrechoSimples(String origem, String destino, double preco){
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getOrigem(){
        return this.origem;
    }

    public String getDestino(){
        return this.destino;

    }


}
