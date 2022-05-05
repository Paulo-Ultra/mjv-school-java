package com.mjv.model;

public class Cliente {

    private Long codigo;

    private String nome;

    private String Rg;

    private String dataNascimento;

    public Cliente(Long codigo, String nome, String rg, String dataNascimento) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        Rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String rg) {
        Rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nome=" + nome + ", Rg=" + Rg + ", dataNascimento=" + dataNascimento
                + "]";
    }

}