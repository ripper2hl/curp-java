package com.perales.curp;

import com.perales.curp.model.Estado;
import com.perales.curp.model.Genero;
import com.perales.curp.model.Persona;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;

import java.time.LocalDate;

public class CurpTest {
    
    private final Persona persona = new Persona();
    
    @Cuando("El nombre es {string}")
    public void el_nombre_es(String string) {
        persona.setNombre(string);
    }
    
    @Cuando("el apellido paterno es {string}")
    public void el_apellido_paterno_es(String string) {
        persona.setApellidoPaterno(string);
    }
    @Cuando("el apellido materno es {string}")
    public void el_apellido_materno_es(String string) {
        persona.setApellidoMaterno(string);
    }
    @Cuando("es una persona del genero {string}")
    public void es_una_persona_del_genero(String string) {
        Genero genero = Genero.valueOf(string);
        persona.setGenero(genero);
    }
    @Cuando("su fecha de nacimiento es el {string}")
    public void su_fecha_de_nacimiento_es_el(String string) {
        String[] fechaArreglo = string.split("-");
        persona.setFechaNacimiento(
                LocalDate.of(        Integer.parseInt(fechaArreglo[2]),
                        Integer.parseInt(fechaArreglo[1]),
                        Integer.parseInt(fechaArreglo[0]))
        );
    }
    @Cuando("nacio en el estado de {string}")
    public void nacio_en_el_estado_de(String string) {
        Estado estado = Estado.valueOf(string);
        persona.setEstado(estado);
    }
    @Entonces("el curp generado debe ser {string}")
    public void el_curp_generado_debe_ser(String string) {
        Curp curp = new Curp();
        String curpGenerado = curp.generar(persona);
        Assert.assertEquals(string, curpGenerado);
    }
    
}
