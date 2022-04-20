package paulo.classes.objetos;

public class Pessoa {

        String nome;
        String cpf;
        String endereco;

        Pessoa (String cpf, String nome, String endereco){
                this.cpf = cpf;
                this.nome = nome;
                this.endereco = endereco;
        }

        Pessoa (String cpf, String nome) {
                this(cpf, nome, "Não Informado");
        }

        Pessoa (){
        }

}
