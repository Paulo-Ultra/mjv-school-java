package com.mvj.agualuznotificacao.repository;

import com.mjv.agualuz.atracao.enums.Pais;
import com.mjv.agualuz.atracao.enums.TipoNotificacao;
import com.mjv.agualuz.atracao.enums.TipoServico;
import com.mjv.agualuz.atracao.model.Cadastro;
import com.mjv.agualuz.atracao.model.Contrato;
import com.mjv.agualuz.atracao.model.Endereco;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ContratoCsvRepository {
//    public List<Contrato> lerContratosCsv(){
//        List<String> conteudo = ler("agua-luz-contratos.csv");
//        List<Contrato> contratos = new ArrayList<>();
//        for (String linha : conteudo) {
//            String[] campos = linha.split(";");
//
//            Endereco end = new Endereco();
//            Contrato c = new Contrato();
//            Cadastro cad = new Cadastro();
//            cad.setCpf(campos[0]);
//            cad.setRg(campos[1]);
//            cad.setNome(campos[2]);
//            cad.setCelular(campos[3]);
//            end.setLogradouro(campos[4]);
//            end.setNumero(campos[5]);
//            end.setComplemento(campos[6]);
//            end.setBairro(campos[7]);
//            end.setCidade(campos[8]);
//            end.setEstado(campos[9]);
//            end.setCep(campos[10]);
//            end.setPais(Pais.valueOf(campos[11]));
//            c.setProtocolo(Long.valueOf(campos[12]));
//            c.setData(LocalDate.parse(campos[13]));
//            c.setHora(LocalTime.parse(campos[14]));
//            c.setTipoServico(TipoServico.valueOf(campos[15]));
//            c.setValor(Double.valueOf(campos[16]));
//            c.setTipoNotificacao(TipoNotificacao.valueOf(campos[17]));
//
//
//            c.setCliente(cad);
//            contratos.add(c);
//            cad.setEndereco(end);
//        }
//        return lerContratosCsv();
//    }
//
//    private List<String> ler(String nomeArquivo) {
//        Path filePath = Paths.get("Documentos/MJV School - Java/Agua-Luz-Atração/agua-luz-output", nomeArquivo);
//        try {
//            List<String> lines = Files.readAllLines(filePath);
//            return lines;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
    public Contrato buscar() {
        Contrato contrato = new Contrato();
        try {
            byte[] bytes = Files.readAllBytes(Paths.get("C:\\Users\\55619\\OneDrive\\Documentos\\MJV School - Java\\agua-luz-output", "agua-luz-contratos.csv"));
            String conteudo = new String(bytes);
            Cadastro cli = new Cadastro();
            Endereco end = new Endereco();
            cli.setCpf(conteudo.substring(0, 11));
            cli.setRg(conteudo.substring(11, 21).trim());
            cli.setNome(conteudo.substring(21, 51).trim());
            cli.setCelular(conteudo.substring(51, 62).trim());
            end.setLogradouro(conteudo.substring(62, 82).trim());
            end.setNumero(conteudo.substring(82, 88).trim());
            end.setComplemento(conteudo.substring(88, 98).trim());
            end.setBairro(conteudo.substring(98, 113).trim());
            end.setCidade(conteudo.substring(113, 143).trim());
            end.setEstado(conteudo.substring(143, 145).trim());
            end.setCep(conteudo.substring(145, 153).trim());
//            end.setPais(Pais.getPaisPorSigla(conteudo.substring(153, 155)));
            contrato.setProtocolo(Long.valueOf(conteudo.substring(155, 165).trim()));
            DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            LocalDate data = LocalDate.parse(conteudo.substring(165,173), dataFormatter);
            contrato.setData(data);
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HHmm");
            LocalTime hora = LocalTime.parse(conteudo.substring(173, 177), timeFormatter);
            contrato.setHora(hora);
//            contrato.setTipoServico(TipoServico.getServicoPorSigla(conteudo.substring(177,178)));
            Double valor = Double.valueOf(conteudo.substring(178, 186)) / 100;
            contrato.setValor(valor);
//            contrato.setTipoNotificacao(TipoNotificacao.valueOf(conteudo.substring(186, 187)));

            cli.setEndereco(end);
            contrato.setCliente(cli);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(contrato);
//        return (List<Contrato>) contrato;
        return contrato;
    }
}

