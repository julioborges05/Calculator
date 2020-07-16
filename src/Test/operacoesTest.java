package Test;

import Main.operacoes;
import org.junit.Assert;

import static org.junit.Assert.*;

public class operacoesTest {
    operacoes valor = new operacoes();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void soma() {
        int inteiro;
        inteiro = (int)valor.soma(4,2);

        assertEquals(6, inteiro);
    }

    @org.junit.Test
    public void subtracao() {
        int inteiro;
        inteiro = (int)valor.subtracao(4,2);

        assertEquals(2, inteiro);
    }

    @org.junit.Test
    public void multiplicacao() {
        int inteiro;
        inteiro = (int)valor.multiplicacao(4,2);

        assertEquals(8, inteiro);
    }

    @org.junit.Test
    public void divisao() {
        int inteiro;
        inteiro = (int)valor.divisao(4,2);

        assertEquals(2, inteiro);
    }
}