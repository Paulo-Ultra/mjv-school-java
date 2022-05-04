package com.mjv.agualuz.atracao.util;

import java.util.Locale;

public class TextoUtil {
    //JUnit - Testes
    public static void main(String[] args){

        String[] contratos = {"Paulo Ricardo", "Raimundo Nonato Loureiro Castelo Branco"};
        for (String contrato : contratos){

            System.out.println(ajustar(contrato, 30));
        }
//        String palavra = "Paulo";
//        String novaPalavra = completar(palavra, 10);
//        System.out.println(novaPalavra);
//
//        String nome = "Raimundo Nonato";
//        String nomeCortado = cortar(nome, 30);
//        System.out.println(nomeCortado);
    }

    public static String removerCaracteresEspeciais(String texto) {
        return texto.replaceAll("\\D", "");
    }

    public static String ajustar(String textoOriginal, int tamanhoMaximo){
        String textoAjustado = completar(textoOriginal, tamanhoMaximo);
        textoAjustado = cortar(textoAjustado, tamanhoMaximo);
        return textoAjustado;
    }
    public static String completar(String textoOriginal, int tamanhoMaximo){

        String formato = "%-" + tamanhoMaximo + "s";
        String textoFormatado = String.format(formato, textoOriginal);
        return textoFormatado;
    }

    public static String cortar(String textoOriginal, int tamanhoMaximo) {
        int max = Math.min(tamanhoMaximo, textoOriginal.length());
        return textoOriginal.substring(0, max);
    }

    public static String completarZeroEsquerda (Number numero, int tamanhoMaximo) {
        String formato = "%0" + tamanhoMaximo + "d";
        String textoFormatado = String.format(formato, numero);
        return textoFormatado;
    }
}
