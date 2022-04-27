package com.mjv.agualuz.notification.model;

import com.mjv.agualuz.notification.enums.TipoServico;

import java.time.LocalDateTime;

public class Contrato {
    private Long protocolo;
    private LocalDateTime dataHora;
    private Double taxa;
    private TipoServico tipoServico;

    public Long getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Long protocolo) {
        this.protocolo = protocolo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "protocolo=" + protocolo +
                ", dataHora=" + dataHora +
                ", taxa=" + taxa +
                ", tipoServico=" + tipoServico +
                '}';
    }
}
