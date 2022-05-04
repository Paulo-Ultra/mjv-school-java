package com.mjv.agualuz.atracao.app;

import com.mjv.agualuz.atracao.model.Contrato;
import com.mjv.agualuz.atracao.service.GeradorMensagem;
import com.mjv.agualuz.atracao.service.LeitorArquivo;

import java.util.List;

public class SistemaAguaLuzNotificacao {
    public static void main(String[] args) {
        LeitorArquivo la = new LeitorArquivo();

        List<Contrato> contratosVindoCsv =  la.lerContratosCsv();

        GeradorMensagem gm = new GeradorMensagem();
        for(Contrato c : contratosVindoCsv) {
            gm.gerar(c);
        }

//
//        List<Contrato> contratosVindoTxt =  la.lerContratosTxt();


    }


}
