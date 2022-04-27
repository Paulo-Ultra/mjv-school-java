package com.mjv;

public enum Pais {
    BRASIL ("BR"),
    ALEMANHA ("DE"),
    ARGENTINA ("AR"),
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
