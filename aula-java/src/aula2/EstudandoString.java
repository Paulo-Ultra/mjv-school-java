package aula2;

public class EstudandoString {
    public static void main(String[] args) {
        //Usando os métodos da documentação

        String palavra = " Paulo ";
        String palavraCorrigida = palavra.trim();
        String palavraMudandoLetra = palavra.replace("P", "p");

        System.out.println(palavra);
        System.out.println(palavraCorrigida);
        System.out.println(palavraMudandoLetra);
    }
}
