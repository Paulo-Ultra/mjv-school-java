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
    private Double valor;
    private TipoNotificacao tipoNotificacao;
    private Servico servico;

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

    @Override
    public String toString() {
        return "Contrato{" +
                "protocolo=" + protocolo +
                ", data=" + data +
                ", hora=" + hora +
                ", tipoServico=" + tipoServico +
                ", valor=" + valor +
                ", tipoNotificacao=" + tipoNotificacao +
                ", servico=" + servico +
                '}';
    }
}
