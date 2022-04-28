package com.mjv.agualuz.notification.app;

import com.mjv.agualuz.notification.enums.TipoServico;
import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.service.GeradorMensagem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SistemaInformativo {
    public static void main(String[] args) {

        Contrato contr1 = new Contrato();
        Cadastro gleyson = new Cadastro();
        Endereco end = new Endereco();

        LocalDateTime contDay =  LocalDateTime.of(2022, 02, 21, 16, 00);
        contr1.setCliente(gleyson);
        contr1.setProtocolo(2022025687L);
        contr1.setDataHora(contDay);
        contr1.setTipoServico(TipoServico.AGUA);
        contr1.setTaxa(127.33);

        end.setLogradouro("Rua das Marias,");
        end.setNumero("243");
        end.setComplemento("Ap 207, Bloco C");
        end.setBairro("Santo Antonio");
        end.setCidade("São Paulo / SP");
        end.setCep("27.310-657");

        gleyson.setNome("Gleyson Sampaio");
        gleyson.setCpfCnpj("23476598727");
        gleyson.setEndereco(end);
        gleyson.setContrato(contr1);

        GeradorMensagem gm = new GeradorMensagem();
        gm.gerar(contr1);

//        System.out.println("Senhor(a) " + gleyson.getNome() +  " cpf de número " + gleyson.getCpfCnpj() + ", Informamos que conforme contrato com protocolo de número "
//                + contr1.getProtocolo() + " está agendado para a data/hora " + dataFormatada + "h a instalação do serviço de " + TipoServico.AGUA + " com taxa de valor R$ "
//                + contr1.getTaxa() + " em sua residência localizada no endereço abaixo: ");
//        System.out.println("Logradouro: " + end.getLogradouro() + end.getNumero());
//        System.out.println("Complemento: " + end.getComplemento());
//        System.out.println("Bairro: " + end.getBairro());
//        System.out.println("Cidade: " + end.getCidade());
//        System.out.println("Cep: " + end.getCep());
    }
}
