package javaexplorer.util.test;

import javaexplorer.util.FormatadorUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FormatadorUtilTest {
    @DisplayName("Testando o método de formatação de cep")
    @Test
    public void formatacaoValidaCepTest () {
        String parametro = "44915000";
        String resultado = FormatadorUtil.formatarCep(parametro);
        //É o que precisamos prever, imaginar, deduzir...
        String expectativa = "44.915-000";

        Assertions.assertEquals(expectativa, resultado);

    }

    @DisplayName("Testando o método de formatação de cep")
    @Test
    public void formatacaoCepSemOsOitoDigitos () {

        String parametro = "4915000";

        String resultado = FormatadorUtil.formatarCep(parametro);
        //É o que precisamos prever, imaginar, deduzir...
        String expectativa = "04.915-000";

        Assertions.assertEquals(expectativa, resultado);

    }
}
