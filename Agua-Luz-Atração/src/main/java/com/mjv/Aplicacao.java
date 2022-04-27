package com.mjv;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;

public class Aplicacao {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Notificacao notificacao = new Notificacao();


        cliente.setCpf("007.324.223-21");
        cliente.setRg("33765-5");
        cliente.setNome("Raimundo Nonato Loureiro Castelo Branco");
        cliente.setCelular("(11)99768-1515");
        cliente.setLogradouro("Rua Sebastião Firmino");
        cliente.setNumero(123);
        cliente.setComplemento("AP 210 BL CENTAURO");
        cliente.setBairro("São Sebastião");
        cliente.setCidade("São Raimundo Nonato");
        cliente.setUf("Sp");
        cliente.setCep("07.210.715");
        cliente.setPais(Pais.BRASIL);


        LocalDate data = LocalDate.of(2022, 05, 07);
        Date date = Date.valueOf(data);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada =  formatter.format(date);
        LocalTime hora = LocalTime.of(15,21);
        String horaFormatada = String.valueOf(hora);
        notificacao.setProtocolo(1984365l);
//        notificacao.setData(LocalDate.parse(dataFormatada));
//        notificacao.setHora(LocalTime.parse(horaFormatada));
        notificacao.setTipoServico(TipoServico.AGUA);
        notificacao.setValor(127.35);
        notificacao.setTipoNotificacao(TipoNotificacao.SMS);


        GeradorConteudo gc = new GeradorConteudo();
        String conteudoGeradoCliente = gc.gerarDadosCliente(cliente);
        String conteudoGeradoNotificacao = gc.gerarDadosNotificacao(notificacao);

        System.out.println(conteudoGeradoCliente);
        System.out.println(conteudoGeradoNotificacao);

    }
}
