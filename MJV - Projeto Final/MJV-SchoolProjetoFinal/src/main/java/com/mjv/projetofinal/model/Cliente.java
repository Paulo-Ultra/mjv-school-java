package com.mjv.projetofinal.model;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cpf;
	@Column(name = "nome_completo")
	private String nomeCompleto;
	private String telefone;
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

}
