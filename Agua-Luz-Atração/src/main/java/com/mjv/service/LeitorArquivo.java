package com.mjv.service;

import com.mjv.model.Cadastro;
import com.mjv.model.Contrato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LeitorArquivo {

    public List<Contrato> lerContratosTxt(){
        List<String> conteudo = ler("agua-luz-contratos.txt");
        List<Contrato> contratos = new ArrayList<>();
        for (String linha : conteudo) {
            Contrato c = new Contrato();
            Cadastro cad = new Cadastro();
            cad.setCpf(linha.substring(0, 11));
            cad.setRg(linha.substring(11, 21));
            cad.setNome(linha.substring(21, 51));

            c.setCliente(cad);

            contratos.add(c);
        }
        return contratos;
    }
    public List<Contrato> lerContratosCsv(){
        List<String> conteudo = ler("agua-luz-contratos.csv");
        List<Contrato> contratos = new ArrayList<>();
        for (String linha : conteudo) {
            Contrato c = new Contrato();
            String[] campos = linha.split(";");
            Cadastro cad = new Cadastro();
            cad.setCpf(campos[0]);

            c.setCliente(cad);

            contratos.add(c);
        }
        return contratos;
    }

    private List<String> ler(String nomeArquivo) {
        Path filePath = Paths.get("/Users/55619/OneDrive/Documentos/MJV School - Java/Agua-Luz-Atração/agua-luz-output", nomeArquivo);
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
