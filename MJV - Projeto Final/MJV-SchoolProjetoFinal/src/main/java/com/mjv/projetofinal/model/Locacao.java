package com.mjv.projetofinal.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "locacao")
public class Locacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column (name="data_retirada")
	private LocalDate dataRetirada;
	@Column (name="data_devolucao")
	private LocalDate dataDevolucao;
	@JoinColumn(name="cliente_id")
	private Integer clienteId;
	@Column (name="valor_final")
	private Double valorFinal;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "locacao_id")
	private List<LocacaoItem> itens;
}