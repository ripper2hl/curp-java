package com.perales.curp.model;
import lombok.Data;

import java.util.Date;

@Data
public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Genero genero;
    private Date fechaNacimiento;
    private Estado estado;
}