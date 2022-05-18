package com.mjv.projetofinal.services;

import com.mjv.projetofinal.model.Equipamento;
import com.mjv.projetofinal.model.Locacao;
import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.EquipamentoRepository;
import com.mjv.projetofinal.repository.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class LocacaoService {
    @Autowired
    private LocacaoRepository locacaoRepository;
    @Autowired
    private EquipamentoRepository equipamentoRepository;

    @Transactional
    public void gravar(Locacao locacao) {

            Integer qtDias = calcularDias(locacao.getDataDevolucao(), locacao.getDataRetirada());

            Double vTotal = 0.0;

            for (LocacaoItem item : locacao.getItens()) {
                vTotal += item.getSubtotal()*qtDias;
                item.setQtdDiasLocacao(qtDias);
                Equipamento equi = equipamentoRepository.findById(item.getEquipamentoId()).orElse(null);
                if(equi!=null) {
                    equi.setQtdDisponivel(equi.getQtdDisponivel() - 1);
                    equipamentoRepository.save(equi);
                }
            }
            locacao.setValorFinal(vTotal);
            locacaoRepository.save(locacao);
        }

        public Integer calcularDias(LocalDate devolucao, LocalDate retirada) {
            Integer qtDias = Math.toIntExact(ChronoUnit.DAYS.between(retirada, devolucao));
            return qtDias;
        }

    }