package javaexplorer.controledefluxo;

import java.util.Scanner;

public class CondicaoTernaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o Dia ");
        System.out.println(" 1 - Domingo  ");
        System.out.println(" 2 - 2ª Feira ");
        System.out.println(" 3 - 3ª Feira ");
        System.out.println(" 4 - 4ª Feira ");
        System.out.println(" 5 - 5ª Feira ");
        System.out.println(" 6 - 6ª Feira ");
        System.out.println(" 7 - Sábado   ");

        int calendario = sc.nextInt();

        String dia = calendario == 7 ? "Sábado" : "Que dia é hoje?";
        System.out.println(dia);

        sc.close();

    }
}
