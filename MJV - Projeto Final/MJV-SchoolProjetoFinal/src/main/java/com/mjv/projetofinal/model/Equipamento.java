package com.mjv.projetofinal.model;

import com.mjv.projetofinal.enums.TipoEquipamento;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "equipamento")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_equipamento")
    private TipoEquipamento tipoEquipamento;
    private String fabricacao;
    private String marca;
    private String grupo;
    @Column(name = "qtd_disponivel")
    private Integer qtdDisponivel;
    @Column(name = "valor_locacao")
    private Double valorLocacao;

}
