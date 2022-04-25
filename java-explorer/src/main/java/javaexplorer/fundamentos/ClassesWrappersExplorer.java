package javaexplorer.fundamentos;

public class ClassesWrappersExplorer {
    public static void main(String[] args) {

        ClassesWrappersExplorer.converterStringEmNumeros();

    }
    static void converterStringEmNumeros() {
        //convertendo uma String em Integer;
        Integer numero = Integer.valueOf("123");

        //convertendo uma String em Double
        Double numeroDuplo = Double.valueOf("123.45");

        System.out.println(numero);
        System.out.println(numeroDuplo);
    }
}
