package com.mjv.agualuz.atracao.repository;

import com.mjv.agualuz.atracao.enums.Pais;
import com.mjv.agualuz.atracao.enums.TipoNotificacao;
import com.mjv.agualuz.atracao.enums.TipoServico;
import com.mjv.agualuz.atracao.model.Cadastro;
import com.mjv.agualuz.atracao.model.Contrato;
import com.mjv.agualuz.atracao.model.Endereco;
import com.sun.source.tree.UsesTree;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ContratoRepository {
    //Banco de Dados Fake
    //Variavel no plural está relacionado a uma coleção(collections)
    private List<Contrato> contratos = new ArrayList<>();

        public List<Contrato> listar() {
            Contrato contrato = new Contrato();

            contrato.setData(LocalDate.of(2022, 2, 21));
            contrato.setHora(LocalTime.of(15,21));
            contrato.setProtocolo(2022025687L);

            contrato.setTipoServico(TipoServico.AGUA);
            contrato.setTipoNotificacao(TipoNotificacao.WHATSAPP);
            Cadastro cliente = new Cadastro();
            contrato.setCliente(cliente);

            cliente.setCpf("234.765.987-27");
            cliente.setNome("Raimundo Nonato Loureiro Castelo Branco");
            cliente.setRg("33765-5");
            cliente.setCelular("(11)99768-1515");

            Endereco endereco = new Endereco();
            cliente.setEndereco(endereco);

            endereco.setBairro("Santo Antonio");
            endereco.setCep("27.310-657");
            endereco.setCidade("São Paulo");
            endereco.setEstado("SP");
            endereco.setLogradouro("Rua das Marias");
            endereco.setNumero("37");
            endereco.setComplemento("Bloco C");
            endereco.setPais(Pais.BRASIL);

            contratos.add(contrato);
            return contratos;
        }
}
