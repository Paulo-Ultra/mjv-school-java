package com.mjv.util;

import com.mjv.model.Cadastro;
import com.mjv.model.Contrato;
import com.mjv.model.Endereco;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class GeradorConteudo {
    public String gerarDadosCliente (Cadastro cliente){

        Endereco endereco = cliente.getEndereco();
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%011d", Long.valueOf(cliente.getCpf().replaceAll("\\D", ""))) );

        String rg = cliente.getRg();

        if(rg.length() >= 10){
            sb.append(rg.substring(0, 10));
        } else {
            sb.append(String.format("%-10s", rg));
        }
        sb.append(String.format("%010d", Long.valueOf(cliente.getRg().replaceAll("\\D", ""))) );


        String nome = cliente.getNome().toUpperCase(Locale.ROOT);

        if(nome.length() >= 30) {
            sb.append(nome.substring(0,30));
    }else {
            sb.append(String.format("%-30s", nome));
        }

        sb.append(String.format("%11d", Long.valueOf(cliente.getCelular().replaceAll("\\D", ""))));

        String logradouro = endereco.getLogradouro().toUpperCase(Locale.ROOT);

        if(logradouro.length() >= 20){
            sb.append(logradouro.substring(0,20));
        }else {
            sb.append(String.format("%-20s", logradouro));
        }

        sb.append(String.format("%06d", endereco.getNumero()));

        String complemento = endereco.getComplemento().toUpperCase(Locale.ROOT);

        if(complemento.length() >= 10){
            sb.append(complemento.substring(0, 10));
        } else {
            sb.append(String.format("%-10s", complemento));
        }

        String bairro = endereco.getBairro().toUpperCase(Locale.ROOT);

        if(bairro.length() >= 15){
            sb.append(bairro.substring(0, 15));
        } else{
            sb.append(String.format("%-15s", bairro));
        }

        String cidade = endereco.getCidade().toUpperCase(Locale.ROOT);

        if(cidade.length() >= 30){
            sb.append(cidade.substring(0, 30));
        } else{
            sb.append(String.format("%-30s", cidade));
        }

        sb.append(String.format("%-2s", endereco.getEstado().toUpperCase(Locale.ROOT)));

        sb.append(String.format("%08d", Long.valueOf(endereco.getCep().replaceAll("\\D", ""))));

        sb.append(endereco.getPais().getSiglaPais());


        return sb.toString();
    }

    public String gerarDadosNotificacao (Contrato notificacao){

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%010d", notificacao.getProtocolo()));
        DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder();

        dtfb.append(DateTimeFormatter.ofPattern(String.format("%8s", String.valueOf(notificacao.getData()))));

        sb.append(String.format("%8s", String.valueOf(notificacao.getData().toString().replace("-", ""))));

        sb.append(String.format("%4s", String.valueOf(notificacao.getHora().toString().replace(":", ""))));

        sb.append(notificacao.getTipoServico().getSiglaTipoServico());

//        sb.append(notificacao.getValor().toString().replace(".", ""));

        sb.append(notificacao.getTipoNotificacao().getSiglaTipoNotificacao());


        return sb.toString();
    }
}
