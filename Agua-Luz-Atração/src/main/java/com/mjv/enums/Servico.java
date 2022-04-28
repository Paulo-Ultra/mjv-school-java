package com.mjv.enums;

public enum Servico {
    AGUA ("Água", 137.21),
    LUZ ("Energia", 132.15);

    private String descricao;
    private  Double valor;

    Servico(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getSigla(){
        return name().substring(0,1);
    }

}
