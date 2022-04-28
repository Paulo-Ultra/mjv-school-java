package com.mjv.agualuz.notification.enums;

public enum TipoServico {
    AGUA ("Água"),
    LUZ ("Luz");

    private String siglaTipoServico;

    public String getSiglaTipoServico() {
        return siglaTipoServico;
    }

    public void setSiglaTipoServico(String siglaTipoServico) {
        this.siglaTipoServico = siglaTipoServico;
    }

    private TipoServico (String siglaTipoServico){
        this.siglaTipoServico = siglaTipoServico;


    }
}
