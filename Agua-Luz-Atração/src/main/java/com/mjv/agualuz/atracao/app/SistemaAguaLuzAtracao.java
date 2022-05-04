package com.mjv.agualuz.atracao.app;

import com.mjv.agualuz.atracao.model.Contrato;
import com.mjv.agualuz.atracao.repository.ContratoRepository;
import com.mjv.agualuz.atracao.service.GeradorArquivo;
import com.mjv.agualuz.atracao.service.GeradorMensagem;

import java.util.List;


public class SistemaAguaLuzAtracao {
    public static void main(String[] args) {
        ContratoRepository repository = new ContratoRepository();

        Contrato contrato = repository.listar().get(0);

        GeradorMensagem gm = new GeradorMensagem();
        gm.gerar(contrato);

        ContratoRepository rep = new ContratoRepository();
        List<Contrato> contratos = rep.listar();


        GeradorArquivo ga = new GeradorArquivo();
        ga.csv(contratos);
        ga.txt(contratos);


    }
}
