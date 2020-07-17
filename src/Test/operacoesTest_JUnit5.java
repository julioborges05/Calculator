package Test;

import Main.operacoes;
import org.testng.annotations.AfterTest;

import static org.junit.jupiter.api.Assertions.*;

class operacoesTest_JUnit5 {
    operacoes valor = new operacoes();

    @org.junit.jupiter.api.Test
    void soma() {
        assertEquals(4, valor.soma(1,3));
    }

    @org.junit.jupiter.api.Test
    void subtracao() {
        assertEquals(10, valor.subtracao(115,105));
    }

    @org.junit.jupiter.api.Test
    void multiplicacao() {
        assertEquals(10, valor.multiplicacao(2,5));
    }

    @org.junit.jupiter.api.Test
    void divisao() {
        assertEquals(5, valor.divisao(50,10));
    }
}