package atividade1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Atividade {
    public static void main(String[] args) {
        String diretorioProjeto = "MJV School - Java\\aula-java\\atividade1\\mjvschool\\diretorioextra";
        String testeTxt = "\\..\\Teste.txt";
        Path p1 = Paths.get(diretorioProjeto, testeTxt);

        System.out.println(p1);
        System.out.println(p1.normalize());

        Path p2 = Paths.get("a/./b/./c");
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}
