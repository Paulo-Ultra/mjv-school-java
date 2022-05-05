package com.mjv.model;

public class ItemPedido {

    private Long codigo;

    private Produto produto;

    private Double valor;

    private Integer qtd;

    private Double valorTotal = qtd * valor;

    public ItemPedido(Long codigo, Produto produto, Double valor, Integer qtd, Double valorTotal) {
        super();
        this.codigo = codigo;
        this.produto = produto;
        this.valor = valor;
        this.qtd = qtd;
        this.valorTotal = valorTotal;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "ItemPedido [codigo=" + codigo + ", produto=" + produto + ", valor=" + valor + ", qtd=" + qtd
                + ", valorTotal=" + valorTotal + "]";
    }

}
