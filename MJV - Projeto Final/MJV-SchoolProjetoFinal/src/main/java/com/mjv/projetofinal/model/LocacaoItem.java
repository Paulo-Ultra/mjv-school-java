package com.mjv.projetofinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

import java.time.temporal.ChronoUnit;


@Data
@Entity
@Table(name = "locacao_item")
public class LocacaoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "qtd_dias_locacao")
    private Integer qtdDiasLocacao;
    private Double subtotal;
    @Column(name = "equipamento_id")
    private Integer equipamentoId;

}
