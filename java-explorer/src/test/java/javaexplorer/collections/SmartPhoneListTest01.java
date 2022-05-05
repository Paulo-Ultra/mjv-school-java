package javaexplorer.collections;

import javaexplorer.collections.dominio.Smartphone;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
//        smartphones.clear();
        for(Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("22222", "Pixel");
        //Mesma coisa
        System.out.println(s4.equals(s2));
        System.out.println(smartphones.contains(s4));

        int indexSmartphone4 = smartphones.indexOf(s4);
        //Se não encontrar ele retorna -1
        System.out.println(smartphones.get(indexSmartphone4));

    }
}
