package com.mjv.agualuz.atracao.enums;

public enum TipoNotificacao {
    SMS ("S"),
    WHATSAPP ("W");

    private String siglaTipoNotificacao;
    private TipoNotificacao (String siglaTipoNotificacao){
        this.siglaTipoNotificacao = siglaTipoNotificacao;
    }

    public String getSiglaTipoNotificacao() {
        return siglaTipoNotificacao;
    }

    public void setSiglaTipoNotificacao(String siglaTipoNotificacao) {
        this.siglaTipoNotificacao = siglaTipoNotificacao;
    }
}
