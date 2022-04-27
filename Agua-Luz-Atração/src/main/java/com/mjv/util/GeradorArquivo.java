package com.mjv.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeradorArquivo {
    public static void arquivoTxt (String conteudoGeradoCliente, String conteudoGeradoNotificacao){
    String nomeArquivo = "agua-luz-contratos.txt";
    try {
        File diretorio = new File("C:\\Users\\55619\\OneDrive\\Documentos\\MJV School - Java\\Agua-Luz-Atração\\agua-luz-output");
        if(!diretorio.exists())
            diretorio.mkdirs();

        Path path = Paths.get(diretorio.getAbsolutePath(), nomeArquivo);

        Files.write(path, conteudoGeradoCliente.getBytes(StandardCharsets.UTF_8));
        Files.write(path, conteudoGeradoNotificacao.getBytes(StandardCharsets.UTF_8));
    } catch(IOException e) {
        e.printStackTrace();
    }
    }
    public static void arquivoCsv (String conteudoGeradoCliente, String conteudoGeradoNotificacao){
        String nomeArquivo = "agua-luz-contratos.csv";
        try {
            File diretorio = new File("C:\\Users\\55619\\OneDrive\\Documentos\\MJV School - Java\\Agua-Luz-Atração\\agua-luz-output");
            if(!diretorio.exists())
                diretorio.mkdirs();

            Path path = Paths.get(diretorio.getAbsolutePath(), nomeArquivo);

            Files.write(path, conteudoGeradoCliente.getBytes(StandardCharsets.UTF_8));
            Files.write(path, conteudoGeradoNotificacao.getBytes(StandardCharsets.UTF_8));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
