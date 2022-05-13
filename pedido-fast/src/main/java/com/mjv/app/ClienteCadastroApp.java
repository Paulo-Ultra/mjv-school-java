package com.mjv.app;

import com.mjv.model.cadastro.Cliente;
import com.mjv.repository.ClienteJDBCRepository;

public class ClienteCadastroApp {
    public static void main(String[] args) {

        //SCANNER
        //INTERFACE GRAFICO DO SISTEMAA
        //APP - API REST

        Cliente paulo = new Cliente();
        paulo.setCpf("999.999.999-99");
        paulo.setNome("Paulo Ricardo");
        paulo.setWhatsapp(6198948622L);


        ClienteJDBCRepository repository = new ClienteJDBCRepository();
        repository.incluir(paulo);
    }

}
