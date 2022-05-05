package javaexplorer.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    @DisplayName("Teste de método Equals")
    @Test
    void testList() {
        List nomes = new ArrayList<>(); //1.4 versão Java não tinha o tipo para colocar " <> "
        List nomes2 = new ArrayList<>(); //1.4 versão Java não tinha o tipo para colocar " <> "
        nomes.add("Paulo");
        nomes.add("Mjv School");
        nomes2.add("João");
        nomes2.add("Mjv Academy");

//        nomes.remove(0);
//        System.out.println(nomes.remove("Paulo"));//A remoção se dá por conta do Equals

        nomes.addAll(nomes2);

        for(Object nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------------------------");


        for(int i = 0; i < nomes.size(); i++) {// Não há length, se usa o size
            System.out.println(nomes.get(i));
        }

    List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

    }
}

