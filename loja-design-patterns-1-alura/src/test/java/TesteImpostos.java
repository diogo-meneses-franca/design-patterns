import org.example.imposto.CalculadoraDeDescontos;
import org.example.imposto.CalculadoraDeImpostos;
import org.example.imposto.ISS;
import org.example.orcamento.Orcamento;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TesteImpostos {

    @Test
    public void testeCalculoISS(){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        ISS iss = new ISS();
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        BigDecimal resultado = calculadoraDeImpostos.calcular(orcamento, iss);
        BigDecimal esperado = new BigDecimal("6.00");
        Assert.assertEquals(esperado, resultado);

    }

    @Test
    public void testeDescontos(){
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        BigDecimal resultado = calculadoraDeDescontos.calcular(orcamento);
        BigDecimal resultadoEsperado = new BigDecimal("20.0");
        Assert.assertEquals(resultadoEsperado, resultado);
    }

}
