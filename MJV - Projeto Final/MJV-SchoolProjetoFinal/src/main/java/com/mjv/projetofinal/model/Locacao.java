package com.mjv.projetofinal.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
@Entity
@Table(name = "locacao")
public class Locacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@JoinColumn(name = "cliente_id", referencedColumnName="id")
	private Integer cliente;
	@Column(name = "data_retirada")
	private LocalDate dataRetirada;
	@Column(name = "data_devolucao")
	private LocalDate dataDevolucao;
	@NotNull
	@Column(name = "valor_final", columnDefinition = "decimal(7, 2) default 0")
	private Double valorFinal;
	@OneToMany
	@JoinColumn(name = "locacao_item_id")
	private List<LocacaoItem> itens;
}
