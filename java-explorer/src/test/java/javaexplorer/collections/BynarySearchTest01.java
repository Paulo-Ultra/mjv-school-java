package javaexplorer.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BynarySearchTest01 {
    @DisplayName("Teste para verificar funcionamento do ponto de inserção")
    @Test
    void bynarySearchTest() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        //(-(ponto de inserção) -1) Caso não exista
        //Index 0, 1, 2, 3
        //Value 0, 2, 3, 4

        Collections.sort(numeros);
        //É necessário que a lista esteja ordenada para usp do binarysearch
        System.out.println(Collections.binarySearch(numeros, 0));
        System.out.println(Collections.binarySearch(numeros, -1));

    }
}
