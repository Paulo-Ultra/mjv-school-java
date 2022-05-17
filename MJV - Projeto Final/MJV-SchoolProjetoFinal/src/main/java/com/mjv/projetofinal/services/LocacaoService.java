package com.mjv.projetofinal.services;

import com.mjv.projetofinal.model.Locacao;
import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    public  void calcularLocacao(Locacao locacao) {

        Integer qtDias = calcularDias(locacao.getDataDevolucao(), locacao.getDataRetirada());


        Double vTotal = 0.0;

        for (LocacaoItem it : locacao.getItens()) {
            vTotal += it.getSubtotal()*qtDias;
            it.setQtdDiasLocacao(qtDias);
        }
        locacao.setValorFinal(vTotal);
        locacaoRepository.save(locacao);
    }

    public Integer calcularDias(LocalDate devolucao, LocalDate retirada) {

        Integer qtDias = Math.toIntExact(ChronoUnit.DAYS.between(retirada, devolucao));

        return qtDias;
    }
}
