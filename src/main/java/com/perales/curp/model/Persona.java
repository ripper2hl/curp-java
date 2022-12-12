package com.perales.curp.model;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Genero genero;
    private LocalDate fechaNacimiento;
    private Estado estado;

    public Persona() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre) && apellidoPaterno.equals(persona.apellidoPaterno) && apellidoMaterno.equals(persona.apellidoMaterno) && genero == persona.genero && fechaNacimiento.equals(persona.fechaNacimiento) && estado == persona.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidoPaterno, apellidoMaterno, genero, fechaNacimiento, estado);
    }
}
