package com.mjv.agualuz.atracao.enums;

public enum Pais {
    BRASIL ("BR"),
    ALEMANHA ("DE"),
    CANADA ("CA");

        private String siglaPais;
        private Pais (String siglaPais){
            this.siglaPais = siglaPais;
        }
        
       
    public void setSiglaPais(String siglaPais) {
			this.siglaPais = siglaPais;
		}


	public String getSiglaPais() {
        return siglaPais;
    }
    
    public static Pais getPaisPorSigla(String sigla) {
    	for(Pais p : Pais.values()) {
    		if(p.getSiglaPais().equals(sigla))
    			return p;
    	}
    	return null;
    }
}
