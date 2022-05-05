package com.mjv.model;

public class Produto {

    private Long codigo;

    private String nomeProduto;

    private String descricao;

    private Double valor;

    public Produto(Long codigo, String nomeProduto, String descricao, Double valor) {
        super();
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nomeProduto=" + nomeProduto + ", descricao=" + descricao + ", valor="
                + valor + "]";
    }

}