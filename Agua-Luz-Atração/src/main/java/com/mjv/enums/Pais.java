package com.mjv.enums;

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

    public void setSiglaPais(String siglaPais) {
        this.siglaPais = siglaPais;
    }
}
