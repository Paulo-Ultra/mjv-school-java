package aula2;

public class TiposPrimitivos {
    static int numero;
    static boolean simNao;
    static char cchar;

    public static void main(String[] args) {
//        pq varival local de metodo precisa ser inicilizada?

        //Variáveis de classe numérica recebe 0;
//        byte vbyte = 1; Não se usa mais normalmente
        int vint = 1;
        long vlong = 1;

        double vdouble = 12.5; //Aceita número inteiro mesmo sem o ponto

//        char vchar = 'a'; Não se usa mais normalmente

        //variável de classe boolean é false
        boolean vboolean = true;

        System.out.println(numero);
        System.out.println(simNao);
        System.out.println(cchar);

        int cepInt = 012351511;
        String cepString = "012351511"; //Se for colocar um número que comece com zero, o certo é colocar a variável como String
                                    // Para que não ocorra erro ou perda de informação
        System.out.println(cepInt);
        System.out.println(cepString);

    }
}
