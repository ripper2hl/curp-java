package com.perales.curp.model;

import lombok.Getter;

public enum Genero {
    FEMENINO("M"),
    MASCULINO("H");

    @Getter
    private final String value;
    
    Genero(String h) {
        this.value = h;
    }
}
