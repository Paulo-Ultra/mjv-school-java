package com.mjv.agualuz.atracao.service;

import com.mjv.agualuz.atracao.model.Cadastro;
import com.mjv.agualuz.atracao.model.Contrato;
import com.mjv.agualuz.atracao.model.Endereco;
import com.mjv.agualuz.atracao.util.TextoUtil;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GeradorArquivo {
    public void csv(List<Contrato> contratos) {
        StringBuilder sb = new StringBuilder();

        for (Contrato c : contratos) {
            Cadastro cad = c.getCliente();
            Endereco endereco = cad.getEndereco();
            sb.append(cad.getCpf().replaceAll("\\D", "")).append(";");
            sb.append(cad.getRg()).append(";");
            sb.append(cad.getNome()).append(";");
            sb.append(cad.getCelular()).append(";");
            sb.append(endereco.getLogradouro()).append(";");
            sb.append(endereco.getNumero()).append(";");
            sb.append(endereco.getComplemento()).append(";");
            sb.append(endereco.getBairro()).append(";");
            sb.append(endereco.getCidade()).append(";");
            sb.append(endereco.getEstado()).append(";");
            sb.append(endereco.getCep()).append(";");
            sb.append(endereco.getPais().getSiglaPais()).append(";");
            String protocolo = TextoUtil.completarZeroEsquerda(c.getProtocolo(), 10);
            sb.append(protocolo).append(";");
            sb.append(c.getData().toString()).append(";");
            sb.append(c.getHora().toString()).append(";");
            sb.append(c.getTipoServico().getSigla()).append(";");
//            String valor = TextoUtil.removerCaracteresEspeciais(c.getValor().toString());
//            valor = TextoUtil.completarZeroEsquerda(Long.valueOf(valor), 8);
//            sb.append(valor);

            sb.append(c.getTipoNotificacao().getSiglaTipoNotificacao()).append(";");

        }
        System.out.println(sb.toString());

        escrever(sb.toString(), "agua-luz-contratos.csv");

    }




    public void txt(List<Contrato> contratos) {
        StringBuilder sb = new StringBuilder();

        for (Contrato c : contratos) {
            Cadastro cadastro = c.getCliente();

            Endereco endereco = cadastro.getEndereco();

            sb.append(TextoUtil.removerCaracteresEspeciais(cadastro.getCpf()));
            sb.append(TextoUtil.ajustar(cadastro.getRg(), 10));
            sb.append(TextoUtil.ajustar(cadastro.getNome(), 30));
            sb.append(TextoUtil.removerCaracteresEspeciais(cadastro.getCelular()));
            sb.append(TextoUtil.ajustar(endereco.getLogradouro(), 20));
            sb.append(TextoUtil.completarZeroEsquerda(Integer.valueOf(endereco.getNumero()), 6));
            sb.append(TextoUtil.ajustar(endereco.getComplemento(), 10));
            sb.append(TextoUtil.ajustar(endereco.getBairro(), 15));
            sb.append(TextoUtil.ajustar(endereco.getCidade(), 30));
            sb.append(TextoUtil.ajustar(endereco.getEstado(), 2));
            String cep = TextoUtil.removerCaracteresEspeciais(endereco.getCep());
            sb.append(TextoUtil.ajustar(cep.replaceAll("\\D", ""), 8));
            sb.append(endereco.getPais().getSiglaPais());
            sb.append(TextoUtil.completarZeroEsquerda(c.getProtocolo(), 10));
            sb.append(TextoUtil.removerCaracteresEspeciais(c.getData().toString()));
            sb.append(TextoUtil.removerCaracteresEspeciais(c.getHora().toString()));
            sb.append(c.getTipoServico().getSigla());
//            String valor = TextoUtil.removerCaracteresEspeciais(c.getValor().toString());
//            valor = TextoUtil.completarZeroEsquerda(Long.valueOf(valor), 8);
//            sb.append(valor);

            sb.append(c.getTipoNotificacao().getSiglaTipoNotificacao());

            System.out.println(sb.toString());

            escrever(sb.toString(), "agua-luz-contratos.txt");
        }
    }

        private void escrever (String conteudo, String nomeArquivo){
            File dir = new File("C:\\Users\\55619\\OneDrive\\Documentos\\MJV School - Java\\agua-luz-output");
            dir.mkdirs();

            Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

            try {
                Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


