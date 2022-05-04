package com.mjv.agualuz.atracao.model;

import com.mjv.agualuz.atracao.enums.TipoServico;
import com.mjv.agualuz.atracao.enums.TipoNotificacao;

import java.time.LocalDate;
import java.time.LocalTime;

public class Contrato {

    private Long protocolo;
    private LocalDate data;
    private LocalTime hora;
    private TipoServico tipoServico;
    private Double valor;
    private Cadastro cliente;
    private TipoNotificacao tipoNotificacao;


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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

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

    @Override
    public String toString() {
        return "Contrato{" +
                "protocolo=" + protocolo +
                ", data=" + data +
                ", hora=" + hora +
                ", tipoServico=" + tipoServico +
                ", cliente=" + cliente +
                ", tipoNotificacao=" + tipoNotificacao +
                '}';
    }
}
