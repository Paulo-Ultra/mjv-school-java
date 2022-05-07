package com.mvj.agualuznotificacao.app;


import com.mjv.agualuz.atracao.model.Contrato;
import com.mjv.agualuz.atracao.service.GeradorMensagem;
import com.mjv.agualuz.atracao.service.LeitorArquivo;
import com.mvj.agualuznotificacao.repository.ContratoCsvRepository;
import com.mvj.agualuznotificacao.repository.ContratoTxtRepository;

import java.util.Collections;
import java.util.List;

public class SistemaAguaLuzNotificacao {
	public static void main(String[] args) {
//		LeitorArquivo la = new LeitorArquivo();
		ContratoTxtRepository rep = new ContratoTxtRepository();
		ContratoCsvRepository repository = new ContratoCsvRepository();
		rep.buscar();
		repository.buscar();
//		repository.lerContratosCsv();

		Contrato contratosVindoTxt = rep.buscar();
		Contrato contratosVindoCsv = repository.buscar();
//		Contrato contratosVindoCsv = (Contrato) repository.lerContratosCsv();

		GeradorMensagem gm = new GeradorMensagem();
			gm.gerar(contratosVindoTxt);
			gm.gerar(contratosVindoCsv);
		}
//
//		List<Contrato> contratosVindoTxt= la.lerContratosTxt();
//
//

}
