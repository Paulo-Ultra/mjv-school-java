package javaexplorer.fundamentos.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringExplorerTest {
    @DisplayName("Testando o método contains da classe String")
    @Test
    void testeContainsMethod() {
        String palavra = "paulo";
//        boolean expectativa = true;
        boolean resultado = palavra.contains("pa");
        Assertions.assertTrue(resultado);

    }

    @DisplayName("Testando o método contains da classe String 2")
    @Test
    void testeContainsMethodFalse() {
        String palavra = "paulo";
        boolean resultado = palavra.contains("ricardo");
        Assertions.assertFalse(resultado);

    }
}
