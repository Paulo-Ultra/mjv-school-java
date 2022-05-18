package com.mjv.projetofinal.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "locacao_item")
public class LocacaoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name="equipamento_id")
    private Integer equipamentoId;
    @Column (name="qtd_dias_locacao")
    private Integer qtdDiasLocacao;
    private Double subtotal;
}
