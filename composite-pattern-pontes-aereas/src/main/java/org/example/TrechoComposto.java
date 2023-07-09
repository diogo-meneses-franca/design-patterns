package org.example;

public class TrechoComposto implements TrechoAereo{

    private TrechoAereo primeiro;
    private TrechoAereo segundo;

    private double taxaConexao;

    public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo, Double taxaConexao){
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.taxaConexao = taxaConexao;
        if(primeiro.getDestino() != segundo.getOrigem())
            throw new RuntimeException("O destino do" + primeiro.getDestino() + " não é igual a origem do " + segundo.getOrigem());
    }

    
}
