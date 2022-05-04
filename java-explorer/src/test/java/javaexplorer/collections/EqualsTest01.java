package javaexplorer.collections;

import javaexplorer.collections.dominio.Smartphone;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EqualsTest01 {

    @DisplayName("Teste de método Equals")
    @Test
    void testEquals() {
        String nome = "Paulo Ricardo";
        String nome2 = "Paulo Ricardo";
        //Vai retornar true
        System.out.println(nome == nome2);

        String nome3 = "Paulo Ricardo";
        String nome4 = new String("Paulo Ricardo");
        //Retorna false
        System.out.println(nome3 == nome4);

        String nome5 = "Paulo Ricardo";
        String nome6 = new String("Paulo Ricardo");
        //Método Equals compara o parâmetro passado mais o objeto
        System.out.println(nome5.equals(nome6));


        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        //Como fazem referências a dois objetos distintos o resultado será false
        //Com a sobrescrita do método o valor se transforma em true, pois a comparação será do this com o obj,
        // No caso serialNumber com o obj passado no parâmetro serialNumber
        System.out.println(s1.equals(s2));

        Smartphone s3 = new Smartphone("1ABC1", "iPhone");
        Smartphone s4 = s3;
        //Aqui será true porque a comparação a referência é sobre o mesmo objeto
        System.out.println(s3.equals(s4));

    }
}

