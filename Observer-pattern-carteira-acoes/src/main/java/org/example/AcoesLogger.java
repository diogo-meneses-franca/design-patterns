package org.example;

public class AcoesLogger implements Observador{

    @Override
    public void mudancaQuantidade(String acao, Integer quantidade) {
        System.out.println("Alterada a quantidade da acao: " + acao + "para a quantidade: " + quantidade);

    }
}
