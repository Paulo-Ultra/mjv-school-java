package com.mjv.repository;

import com.mjv.model.Contrato;

import java.util.ArrayList;
import java.util.List;

public class ContratoRepository {
    //Banco de Dados Fake
    //Variavel no plural está relacionado a uma coleção(collections)
    private List<Contrato> contratos = new ArrayList<>();

        public List<Contrato> listar() {
            Contrato contrato = new Contrato();
//            contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0));
//            contrato.setNumeroProtocolo(2022025687L);
//
//            contrato.setServico(Servico.AGUA);
//
//            Cadastro cliente = new Cadastro();
//            contrato.setCliente(cliente);
//
//            cliente.setCpf("23476598727");
//            cliente.setNome("Gleyson Sampaio");
//            cliente.setRg("87897");
//            cliente.setPais(Pais.BRASIL);
//
//            Endereco endereco = new Endereco();
//            cliente.setEndereco(endereco);
//
//            endereco.setBairro("Santo Antonio");
//            endereco.setCep("27310657");
//            endereco.setCidade("São Paulo");
//            endereco.setEstado("SP");
//            endereco.setLogradouro("Rua das Marias");
//            endereco.setNumero("243");
//            endereco.setComplemento("Bloco C");

            contratos.add(contrato);
            return contratos;
        }
}
