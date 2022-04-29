package com.mjv.model;

import com.mjv.enums.Servico;
import com.mjv.enums.TipoNotificacao;
import com.mjv.enums.TipoServico;

import java.time.LocalDate;
import java.time.LocalTime;

public class Contrato {

    private Long protocolo;
    private LocalDate data;
    private LocalTime hora;
    private TipoServico tipoServico;
//    private Double valor; - Não sei se há necessidade de haver o valor sendo que já tem valores fixos
    private Cadastro cliente;
    private TipoNotificacao tipoNotificacao;
    private Servico servico;
    private Endereco endereco;

    public Long getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Long protocolo) {
        this.protocolo = protocolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

//    public Double getValor() {
//        return valor;
//    }
//
//    public void setValor(Double valor) {
//        this.valor = valor;
//    }

    public Cadastro getCliente() {
        return cliente;
    }

    public void setCliente(Cadastro cliente) {
        this.cliente = cliente;
    }

    public TipoNotificacao getTipoNotificacao() {
        return tipoNotificacao;
    }

    public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "protocolo=" + protocolo +
                ", data=" + data +
                ", hora=" + hora +
                ", tipoServico=" + tipoServico +
                ", cliente=" + cliente +
                ", tipoNotificacao=" + tipoNotificacao +
                ", servico=" + servico +
                ", endereco=" + endereco +
                '}';
    }
}
