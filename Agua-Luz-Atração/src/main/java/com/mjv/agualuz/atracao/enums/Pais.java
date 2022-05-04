package com.mjv.agualuz.atracao.enums;

public enum Pais {
    BRASIL ("BR"),
    ALEMANHA ("DE"),
    CANADA ("CA");

        private String siglaPais;
        private Pais (String siglaPais){
            this.siglaPais = siglaPais;
        }

    public String getSiglaPais() {
        return siglaPais;
    }

}
