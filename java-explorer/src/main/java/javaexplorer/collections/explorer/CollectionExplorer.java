package javaexplorer.collections.explorer;

import java.util.*;

public class CollectionExplorer {
    public static void main(String[] args) {
        faseAtracao();
        ordemApresentacao();
        ranking();
    }
    static void faseAtracao(){

        /*
         * Vamos imaginar que iniciou a fase de inscrição pelo site da MJV
         */

        //PESQUISA A DIFERENÇA ENTRE
        //ArrayList e Vector
        List<String> inscritos = new ArrayList<>();
        inscritos.add("Paulo Ricardo");
        inscritos.add("Auri Martins");
        inscritos.add("Davy Lucas");
        inscritos.add("Priscila Passaro");
        inscritos.add("Renato Gonçalves");

        //Renato por segurança se inscreveu duas vezes
        inscritos.add("Renato Gonçalves");
        //A Nicole foi e pediu para o time de TI a Lista de inscritos
        imprimirColecao(inscritos);

        //A Nicole se deparou com problemas
        //1 A Lista não está "classificada"
        //Isso é um trabalho para a classe utilitária Collections
//        Collections.sort(inscritos);
        System.out.println("\nImprimindo a lista ordenada\n");
        imprimirColecao(inscritos);

        //2 o cadastro de renato está duplicado
        /*
         * esse desenvolvedor back não imaginou que alguém
         * poderia se cadastrar mais de uma vez
         * para fazer alguma validação
         * mas a linguagem por ela ser TOP DAS GALAXIAS tem um solução
         * SET Power.
         */
        setPower(inscritos);
    }

    static void setPower(List<String> inscritos) {
        //pesquisa sobre HashSet e TreeSet
        Set<String> inscritosArrumado = new TreeSet();
        for(String inscrito: inscritos) {

            boolean adicionei = inscritosArrumado.add(inscrito);
            String adicionou = adicionei?"Adicionei": "NÃO Adicionei";
            System.out.println(adicionou + " o inscrito " + inscrito);
        }
        System.out.println("\nimprimindo os inscritos sem repetição\n");
        imprimirColecao(inscritosArrumado);

    }

    static void ordemApresentacao(){
        //PriorityQueue -> Estudar
        //tempos se passaram e chegou o grande dia
        //a apresentação, dai a Nicole foi e pediu
        //para os alunos mencionarem quem vai apresentar
        //dai a ordem será definida pelo chat no discord
        Queue<String> alunos = new LinkedList<>();

        alunos.add("Paulo Ricardo");
        alunos.add("Auri Martins");
        alunos.add("Davy Lucas");
        alunos.add("Priscila Passaro");
        alunos.add("Renato Gonçalves");

        imprimirColecao(alunos);

        System.out.println("Chamando próximo da fila para a apresentação");
        String selecionado = alunos.poll();
        System.out.println( selecionado + " foi selecionado para a apresetação");

        System.out.println("Gleyson pergunta para a Nicole quantos ainda faltam");
        imprimirColecao(alunos);

        System.out.println("Gleyson pergunta para a Nicole quem é o próximo da fila");
        System.out.println( alunos.peek() + " é o próximo da fila");

        alunos.add("Diego Cardoso");
        imprimirColecao(alunos);

        //veja a diferença da interface Queue para Deque
    }

    static void ranking() {
        //chegou a hora da verdade
        //a Nicole me pediu para definir o Ranking dos alunos que apresentaram o projeto
        //como eu não gostaria de criar um objeto somente devido +1 atributo
        //eu resolvi o recurso do map para este finalidade

        Map<Integer, String> ranking = new HashMap<>();
        ranking.put(1,"Paulo Ricardo");
        ranking.put(5,"Auri Martins");
        ranking.put(3,"Priscila Passaro");
        ranking.put(2,"Renato Gonçalves");
        ranking.put(4,"Davy Lucas");

        //Imprimindo a lstagem do conteúdo ranking
        for (Map.Entry<Integer, String> entry : ranking.entrySet()){
            System.out.println("Ranking: " + entry.getKey() + "º - Aluno: " + entry.getValue());
        }

        //Agora quando o time de recrutamento precisar localizar um aluno
        //basta informar a sua posição no ranking
        String alunoRanking2 = ranking.get(2);
        System.out.println(alunoRanking2);
    }

    static void imprimirColecao(Collection colecao) {
        for(Object itemColecao : colecao) {
            System.out.println(itemColecao);
        }
    }
}
