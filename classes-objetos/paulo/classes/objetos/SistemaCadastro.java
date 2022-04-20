package paulo.classes.objetos;

public class SistemaCadastro {
    public static void main(String[] args) {

        //criamos uma pessoa no sistema
        Pessoa paulo = new Pessoa("000.000.000-00", "Paulo Ricardo Freire Ultra");

        System.out.println(paulo.endereco);
    }
}

