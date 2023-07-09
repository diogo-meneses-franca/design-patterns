package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AcoesLogger acoesLogger = new AcoesLogger();
        CarteiraAcoes carteiraAcoes  =  new CarteiraAcoes();
        carteiraAcoes.addObservador(acoesLogger);

        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("ITAUSA", 200);
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("Petrobras", 300);
        Thread.sleep(2000);
        carteiraAcoes.adicionaAcoes("Bradesco", 100);


    }
}