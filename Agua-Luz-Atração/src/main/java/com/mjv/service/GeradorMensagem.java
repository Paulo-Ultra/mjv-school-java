package com.mjv.service;

import com.mjv.model.Cadastro;
import com.mjv.model.Contrato;
import com.mjv.model.Endereco;
import com.mjv.util.FormatadorUtil;

public class GeradorMensagem {
    public void gerar(Contrato contrato) {
        StringBuilder sb = new StringBuilder();
        Cadastro cliente = contrato.getCliente();
        Endereco endereco = cliente.getEndereco();

        String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
        String formatarData = FormatadorUtil.formatarData(contrato.getData());
        String formatarHora = FormatadorUtil.formatarHora(contrato.getHora());
//        sb.append("Senhor(a) " + cad.getNome() + " cpf de número " + cad.getCpfCnpj());
        sb.append(String.format("Senhor(a) %s cpf de número %s, ", cliente.getNome(), cpfFormatado));
        sb.append(String.format("Informamos que conforme contrato com protocolo de número %d" +
                        " está agendado para a data/hora %sh a instalação do serviço de %s com taxa de valor " +
                        "R$%.2f em sua residência localizada no endereço abaixo: \n" +
                        "    Logradouro: %s,%s\n" +
                        "    Complemento: %s\n" +
                        "    Bairro: %s\n" +
                        "    Cidade: %s\n" +
                        "    Cep: %s\n",
                contrato.getProtocolo(), formatarData, formatarHora, contrato.getTipoServico().getSiglaTipoServico(), contrato.getServico(),
                endereco.getLogradouro(), endereco.getNumero(), endereco.getComplemento(), endereco.getBairro(), endereco.getCidade(), endereco.getCep()));
        System.out.println(sb.toString());
    }
}