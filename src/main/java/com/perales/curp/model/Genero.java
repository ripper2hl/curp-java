package com.perales.curp.model;

public enum Genero {
    FEMENINO("M"),
    MASCULINO("H");

    private final String value;
    
    Genero(String h) {
        this.value = h;
    }

    public String getValue() {
        return value;
    }
}
