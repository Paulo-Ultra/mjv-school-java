package com.mjv.openbanking;

import java.math.BigDecimal;
import java.time.LocalDate;

//lombok
public class Movimentacao {
    //classe
    private LocalDate data;
    private BigDecimal valor;
    private String cpfCnpj;
    private String nomeCliente;
    private Boolean estornada;
    private TipoMovimentacao tipo;

    //java beans = getter e setters

    //retorna o valor do atributo do objeto
    public LocalDate getData() {
        return data;
    }

    //define um valor para um atributo do objeto
    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Boolean getEstornada() {
        return estornada;
    }

    public void setEstornada(Boolean estornada) {
        this.estornada = estornada;
    }

    public TipoMovimentacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimentacao tipo) {
        this.tipo = tipo;
    }
}
