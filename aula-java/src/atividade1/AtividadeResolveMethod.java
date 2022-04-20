package atividade1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AtividadeResolveMethod {
    public static void main(String[] args) {
        Path dir = Paths.get("atividade1\\mjvschool");
        Path arquivo = Paths.get("mjvschool\\diretorioextra\\Teste.txt");
        Path result = dir.resolve(arquivo);
        System.out.println(result);
    }
}
