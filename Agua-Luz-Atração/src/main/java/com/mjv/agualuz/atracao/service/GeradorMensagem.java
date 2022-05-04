package com.mjv.agualuz.atracao.service;

import com.mjv.agualuz.atracao.model.Cadastro;
import com.mjv.agualuz.atracao.model.Contrato;
import com.mjv.agualuz.atracao.model.Endereco;
import com.mjv.agualuz.atracao.util.FormatadorUtil;

import java.time.format.DateTimeFormatter;

public class GeradorMensagem {
    public void gerar(Contrato contrato) {
        StringBuilder sb = new StringBuilder();
        Cadastro cliente = contrato.getCliente();
        Endereco endereco = cliente.getEndereco();

        String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
        String formatarData = FormatadorUtil.formatarData(contrato.getData());
        String formatarHora = FormatadorUtil.formatarHora(contrato.getHora());
        sb.append("Senhor(a) " + cliente.getNome() + " cpf de número " + cliente.getCpf());
        sb.append(String.format("Senhor(a) %s cpf de número %s, ", cliente.getNome(), cpfFormatado));
        sb.append(String.format("Informamos que conforme contrato com protocolo de número %d", contrato.getProtocolo()));
        sb.append(String.format(" está agendado para a data/hora %sh a instalação do serviço de %s", contrato.getData()
                        .format(DateTimeFormatter.ofPattern(formatarData)), contrato.getHora().format(DateTimeFormatter.ofPattern(formatarHora)),
                contrato.getTipoServico()));
        sb.append(String.format(" com taxa de valor " +
                        "R$%.2f em sua residência localizada no endereço abaixo: \n" +
                        "    Logradouro: %s,%s\n" +
                        "    Complemento: %s\n" +
                        "    Bairro: %s\n" +
                        "    Cidade: %s\n" +
                        "    Cep: %s\n",
                contrato.getTipoServico().getValor(), endereco.getLogradouro(), endereco.getNumero(), endereco.getComplemento(), endereco.getBairro(), endereco.getCidade(), endereco.getCep()));
        System.out.println(sb.toString());
    }
}