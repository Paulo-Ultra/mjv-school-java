package com.mjv.agualuz.notification.app;

import com.mjv.agualuz.notification.enums.TipoServico;
import com.mjv.agualuz.notification.model.Cliente;
import com.mjv.agualuz.notification.model.Contrato;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SistemaInformativo {
    public static void main(String[] args) {

        Contrato contr1 = new Contrato();
        Cliente gleyson = new Cliente();

        LocalDateTime contDay =  LocalDateTime.of(2022, 02, 21, 16, 00);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = contDay.format(formatter);
        contr1.setProtocolo(2022025687L);
        contr1.setDataHora(contDay);
        contr1.setTipoServico(TipoServico.AGUA);
        contr1.setTaxa(127.33);

        gleyson.setNome("Gleyson Sampaio");
        gleyson.setCpfCnpj("234.765.987-27");
        gleyson.setContrato(contr1);
        gleyson.setLogradouro("Rua das Marias, 243");
        gleyson.setComplemento("Ap 207, Bloco C");
        gleyson.setBairro("Santo Antonio");
        gleyson.setCidade("São Paulo / SP");
        gleyson.setCep("27.310-657");

        System.out.println("Senhor(a) " + gleyson.getNome() +  " cpf de número " + gleyson.getCpfCnpj() + ", Informamos que conforme contrato com protocolo de número "
                + contr1.getProtocolo() + " está agendado para a data/hora " + dataFormatada + "h a instalação do serviço de " + TipoServico.AGUA + " com taxa de valor R$ "
                + contr1.getTaxa() + " em sua residência localizada no endereço abaixo: ");
        System.out.println("Logradouro: " + gleyson.getLogradouro());
        System.out.println("Complemento: " + gleyson.getComplemento());
        System.out.println("Bairro: " + gleyson.getBairro());
        System.out.println("Cidade: " + gleyson.getCidade());
        System.out.println("Cep: " + gleyson.getCep());
    }
}
