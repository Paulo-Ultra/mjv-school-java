package com.mjv.enums;

public enum TipoServico {
    AGUA ("A"),
    LUZ ("L");

    private String siglaTipoServico;
    private TipoServico (String siglaTipoServico){
        this.siglaTipoServico = siglaTipoServico;
    }

    public String getSiglaTipoServico() {
        return siglaTipoServico;
    }

    public void setSiglaTipoServico(String siglaTipoServico) {
        this.siglaTipoServico = siglaTipoServico;
    }
}