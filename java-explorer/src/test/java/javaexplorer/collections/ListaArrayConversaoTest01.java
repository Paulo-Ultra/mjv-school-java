package javaexplorer.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    @DisplayName("Teste de converssão de array em lista e vice versa")
    @Test
    void ListArrayTest() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
//        Integer[] lisToArray = numeros.toArray(new Integer[numeros.size()]);
        //Usando 0 no array ao inves do "size" o Java vai puxar o tamanho por refletion e com uma performance melhor
        Integer[] lisToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(lisToArray));
        System.out.println("------------------------------------");
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0, 12);
        //Tentando adicionar um valor haverá um Unsupported Exception
//        arrayToList.add(19);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("---------------------------");

        //Assim se quebra o vínculo do Array.asList com o objeto
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        List<String> strings = Arrays.asList("1", "2");
        //A partir da versão 11 do java
        List.of("1", "2");
    }
}
