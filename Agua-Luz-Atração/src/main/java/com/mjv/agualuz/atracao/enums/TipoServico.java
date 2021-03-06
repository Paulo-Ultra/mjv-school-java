package com.mjv.agualuz.atracao.enums;

public enum TipoServico {
    AGUA ("Água", 137.21, "A"),
    LUZ ("Energia", 132.15, "L");

    private String descricao;
    private  Double valor;
    private String sigla;

    TipoServico(String descricao, Double valor, String sigla) {
        this.descricao = descricao;
        this.valor = valor;
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public String getSigla(){
        return name().substring(0,1);
    }
    
    public static TipoServico getServicoPorSigla(String sigla) {
    	for(TipoServico s : TipoServico.values()) {
    		if(s.getSigla().equals(sigla))
    			return s;
    	}
    	return null;
    }

}
