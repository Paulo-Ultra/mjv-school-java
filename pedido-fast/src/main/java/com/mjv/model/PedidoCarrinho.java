package com.mjv.model;

public class PedidoCarrinho {

    private Long codigo;

    private ItemPedido itemPedido;

    private Double valorTotal;

    private Double frete;

    private Double subTotal = valorTotal - frete;

    public PedidoCarrinho(Long codigo, ItemPedido itemPedido, Double valorTotal, Double frete, Double subTotal) {
        super();
        this.codigo = codigo;
        this.itemPedido = itemPedido;
        this.valorTotal = valorTotal;
        this.frete = frete;
        this.subTotal = subTotal;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "PedidoCarrinho [codigo=" + codigo + ", itemPedido=" + itemPedido + ", valorTotal=" + valorTotal
                + ", frete=" + frete + ", subTotal=" + subTotal + "]";
    }

}
