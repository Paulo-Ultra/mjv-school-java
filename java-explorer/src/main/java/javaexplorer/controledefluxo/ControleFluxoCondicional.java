package javaexplorer.controledefluxo;

public class ControleFluxoCondicional {
    public static void main(String[] args) {

        ControleFluxoCondicional.simuladorCaixaEletronicoFluxoSimples(25.0, 17.0);
        //Por já estar na classe não é necessário chamar a classe para chamar o método
        simuladorNotaEscolarFluxoComposto(6);
        simuladorNotaEscolarFluxoComposto(8);

    }

    static void simuladorCaixaEletronicoFluxoSimples(double saldo, double valorSolicitado){

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
//        System.out.println(saldo);
        System.out.println("fim");
    }
    static void simuladorNotaEscolarFluxoComposto(double nota) {
        //Estrutura de fluxo condicional composta
        if(nota >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
