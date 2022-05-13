package com.mjv.model.cadastro;

public class Cliente {

    private Integer id;
    private String cpf;
    private String nome;
    private Long whatsapp;
    private Endereco endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(Long whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}