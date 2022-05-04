package javaexplorer.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List nomes = new ArrayList<>(); //1.4 versão Java não tinha o tipo para colocar " <> "
        nomes.add("Paulo");
        nomes.add("Mjv School");

        for(Object nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------------------------");


        List<String> nomes1 = new ArrayList<>(16);//Pode definir o tamanho da capacidade da lista
        nomes1.add("Paulo");
        nomes1.add("Mjv School");

        for(String nome : nomes1) {
            System.out.println(nome);
        }

        System.out.println("----------------------------");
        for(int i = 0; i < nomes.size(); i++) {// Não há length, se usa o size
            System.out.println(nomes.get(i));
        }


    }
}
