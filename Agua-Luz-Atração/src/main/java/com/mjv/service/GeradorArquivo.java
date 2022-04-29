package com.mjv.service;

import com.mjv.model.Cadastro;
import com.mjv.model.Contrato;
import com.mjv.util.TextoUtil;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class GeradorArquivo {
    public void csv(List<Contrato> contratos) {
        StringBuilder sb = new StringBuilder();

        for(Contrato c : contratos) {
            Cadastro cad = c.getCliente();
            sb.append(cad.getCpf()).append(";");
            sb.append(cad.getRg()).append(";");
            sb.append(cad.getNome()).append(";");
        }
        System.out.println(sb.toString());

        escrever(sb.toString(), "agua-luz-contratos.csv");

    }

    public void txt(List<Contrato> contratos) {
        StringBuilder sb = new StringBuilder();

        for(Contrato c : contratos) {
            Cadastro cad = c.getCliente();
            sb.append(cad.getCpf().replaceAll("\\D", ""));//remover os caracteres especiais
            sb.append(cad.getRg());// incluir espaços em branco ate 10 e alinhar a equerda
            sb.append(TextoUtil.ajustar(cad.getNome(),30));//cortar o nome para no máximo 30c e colocar maiusculo.
        }
        System.out.println(sb.toString());
        escrever(sb.toString(), "agua-luz-contratos.txt");

    }
    private void escrever(String conteudo, String nomeArquivo) {
        File dir = new File("/Users/55619/OneDrive/Documentos/MJV School - Java/Agua-Luz-Atração/agua-luz-output");
        dir.mkdirs();

        Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

        try {
            Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}