package com.mjv.repository;

import com.mjv.model.Contrato;

import java.util.ArrayList;
import java.util.List;

public class ContratoRepository {
    //Banco de Dados Fake
    //Variavel no plural está relacionado a uma coleção(collections)
    private List<Contrato> contratos = new ArrayList<>();

    public void listar(Contrato contrato) {

        contratos.add(contrato);
    }
}
