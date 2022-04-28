package com.mjv.agualuz.notification.model;

public class Cadastro {
    private String nome;
    private String cpfCnpj;
    private Endereco endereco;
    private Contrato contrato;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                ", endereco=" + endereco +
                ", contrato=" + contrato +
                '}';
    }
}
