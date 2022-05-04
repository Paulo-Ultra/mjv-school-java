package javaexplorer.arrays;

import java.util.*;

public class ArraysExplorer {
    public static void main(String[] args) {

//        String[] alunos = new String[50];
//        alunos[0] = "Zezinho";
//        alunos[33] = "Pedrinho";
//
//        System.out.println(alunos.length);
//        List<String> alunos = new ArrayList<>()
        Set<String> alunos = new HashSet<String>();

        System.out.println(alunos.add("Paulo"));
        alunos.add("Gleyson");
        alunos.add("Ricardo");

        //Por ser set aqui imprimi false
        System.out.println(alunos.size());

        alunos.remove(0);

//        for (int x = 0; x < alunos.size(); x++){
//            System.out.println(alunos.get());
//        }

        for(String aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println(alunos.size());

        alunos.add("Marcos");
        alunos.add("Julia");
        System.out.println(alunos.add("Paulo"));

        for(String aluno : alunos) {
            System.out.println(aluno);
        }
//        List<String> itens = Arrays.asList(alunos);
//
//        itens.forEach(item-> System.out.println(item));
    }
}
