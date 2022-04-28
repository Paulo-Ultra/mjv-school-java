package com.mjv.app;

import com.mjv.enums.Servico;
import com.mjv.model.Cadastro;
import com.mjv.model.Contrato;
import com.mjv.model.Endereco;
import com.mjv.repository.ContratoRepository;
import com.mjv.service.GeradorArquivo;
import com.mjv.service.GeradorMensagem;
import com.mjv.util.GeradorConteudo;
import com.mjv.enums.Pais;
import com.mjv.enums.TipoNotificacao;
import com.mjv.enums.TipoServico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        Cadastro cliente = new Cadastro();
        Contrato notificacao = new Contrato();
        Endereco endereco = new Endereco();


        cliente.setCpf("007.324.223-21");
        cliente.setRg("33765-5");
        cliente.setNome("Raimundo Nonato Loureiro Castelo Branco");
        cliente.setCelular("(11)99768-1515");


        endereco.setLogradouro("Rua Sebastião Firmino");
        endereco.setNumero("123");
        endereco.setComplemento("AP 210 BL CENTAURO");
        endereco.setBairro("São Sebastião");
        endereco.setCidade("São Raimundo Nonato");
        endereco.setEstado("Sp");
        endereco.setCep("07.210.715");
        endereco.setPais(Pais.BRASIL);


        notificacao.setProtocolo(1984365l);
        notificacao.setData(LocalDate.of(2022, 05, 07));
        notificacao.setHora(LocalTime.of(15, 21));
        notificacao.setTipoServico(TipoServico.AGUA);
        notificacao.setServico(Servico.AGUA);
//        notificacao.setValor(127.35);
        notificacao.setTipoNotificacao(TipoNotificacao.SMS);

        GeradorMensagem gm = new GeradorMensagem();
        gm.gerar(notificacao);


//        GeradorConteudo gc = new GeradorConteudo();
//        String conteudoGeradoCliente = gc.gerarDadosCliente(cliente);
//        String conteudoGeradoNotificacao = gc.gerarDadosNotificacao(notificacao);
//
//        ContratoRepository rep = new ContratoRepository();
//        List<Contrato> contratos = rep.listar();
//        GeradorArquivo ga = new GeradorArquivo();
//        ga.csv(contratos);


    }
}
