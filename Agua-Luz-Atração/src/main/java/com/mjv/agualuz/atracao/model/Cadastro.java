package com.mjv.agualuz.atracao.model;

public class Cadastro {

    private String cpf;
    private String rg;
    private String nome;
    private String celular;
    private Contrato contrato;
    private Endereco endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", nome='" + nome + '\'' +
                ", celular='" + celular + '\'' +
                ", contrato=" + contrato +
                ", endereco=" + endereco +
                '}';
    }
}
