package com.perales.curp.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Genero genero;
    private LocalDate fechaNacimiento;
    private Estado estado;
}
