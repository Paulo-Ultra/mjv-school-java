package com.mjv;

import com.mjv.model.Cliente;
import com.mjv.model.Notificacao;
import com.mjv.util.GeradorArquivo;
import com.mjv.util.GeradorConteudo;
import com.mjv.enums.Pais;
import com.mjv.enums.TipoNotificacao;
import com.mjv.enums.TipoServico;

import java.time.LocalDate;
import java.time.LocalTime;

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


        notificacao.setProtocolo(1984365l);
        notificacao.setData(LocalDate.of(2022, 05, 07));
        notificacao.setHora(LocalTime.of(15, 21));
        notificacao.setTipoServico(TipoServico.AGUA);
        notificacao.setValor(127.35);
        notificacao.setTipoNotificacao(TipoNotificacao.SMS);


        GeradorConteudo gc = new GeradorConteudo();
        String conteudoGeradoCliente = gc.gerarDadosCliente(cliente);
        String conteudoGeradoNotificacao = gc.gerarDadosNotificacao(notificacao);

        GeradorArquivo ga = new GeradorArquivo();
        ga.arquivoTxt(conteudoGeradoCliente, conteudoGeradoNotificacao);

    }
}
