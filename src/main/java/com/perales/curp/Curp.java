package com.perales.curp;

import com.perales.curp.model.Estado;
import com.perales.curp.model.Genero;
import com.perales.curp.model.Persona;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Curp {

    public String generar(Persona persona) {
        String curpTemporal = "";

        String posicionUnoCuatro = obtenerPosicionesUnoCuatroCurp(persona);

        String posicionCatorceDieciseis = obtenerPosicionesCatorceDieciseis(persona);

        curpTemporal = String.join("",
        posicionUnoCuatro,
                zeropad(2,persona.getFechaNacimiento().getYear()),
                zeropad(2,persona.getFechaNacimiento().getMonthValue()),
                zeropad(2,persona.getFechaNacimiento().getDayOfMonth()),
                persona.getGenero().getValue(),
                persona.getEstado().getValue(),
                posicionCatorceDieciseis
                );
        curpTemporal += getSpecialChar(Integer.toString(persona.getFechaNacimiento().getYear()));
        curpTemporal += agregaDigitoVerificador(curpTemporal);
        return curpTemporal;
    }

    private String primerConsonante(String str) {
        // Quita los espacios al principio y al final del string
        str = str.trim();

        // Si el string está vacío, devuelve X
        if (str.length() == 0) {
            return "X";
        }

        // Obtiene la subcadena a partir del primer caracter
        str = str.substring(1);

        // Reemplaza todas las vocales por nada
        str = str.replaceAll("[AEIOU]", "");

        // Obtiene la subcadena a partir del primer caracter
        if (str.length() == 0) {
            return "X";
        }
        str = str.substring(0, 1);

        // Si el string está vacío o contiene la letra Ñ, devuelve X
        // En caso contrario, devuelve el primer caracter del string
        return str.equals("Ñ") ? "X" : str;
    }


    private static final List<Pattern> COMPUESTOS = Stream.of(
                    "DA", "DAS", "DE", "DEL", "DER", "DI", "DIE", "DD", "EL", "LA", "LOS", "LAS", "LE", "LES", "MAC", "MC", "VAN", "VON", "Y"
            ).map(pat -> Pattern.compile("\\b" + pat + "\\b", Pattern.CASE_INSENSITIVE))
            .collect(Collectors.toList());

    private String ajustaCompuesto(String str) {
        for (Pattern compuesto : COMPUESTOS) {
            str = compuesto.matcher(str).replaceAll("");
        }
        return str;
    }

    String normalizaString(String str) {
        return str.replaceAll("['ÃÀÁÄÂ]", "A")
                .replaceAll("[ÉÈÊË]", "E")
                .replaceAll("[ÍÌÎÏ]", "I")
                .replaceAll("[ÓÒÔÖ]", "O")
                .replaceAll("[ÚÙÛÜ]", "U");
    }

    List<String> comunes = Arrays.asList(
            "MARIA DEL ",
            "MARIA DE LOS ",
            "MARIA ",
            "JOSE DE ",
            "JOSE ",
            "MA. ",
            "MA ",
            "M. ",
            "J. ",
            "J "
    );

    private String obtenerNombreUsar(String nombre) {
        String[] nombres = nombre.trim().split("\\s+");
        if (nombres.length == 1) return nombres[0];

        boolean esNombreComun = comunes.stream()
                .anyMatch(nombreComun -> nombre.indexOf(nombreComun) == 0);

        if (esNombreComun) return nombres[1];
        return nombres[0];
    }

    private static String removerMalasPalabras(String palabra) {
        Map<String, String> malasPalabras = new HashMap<>();
        malasPalabras.put("BACA", "BXCA");
        malasPalabras.put("BAKA", "BXKA");
        malasPalabras.put("BUEI", "BXEI");
        malasPalabras.put("BUEY", "BXEY");
        malasPalabras.put("CACA","CXCA");
        malasPalabras.put("CACO","CXCO");
        malasPalabras.put("CAGA","CXGA");
        malasPalabras.put("CAGO","CXGO");
        malasPalabras.put("CAKA","CXKA");
        malasPalabras.put("CAKO","CXKO");
        malasPalabras.put("COGE","CXGE");
        malasPalabras.put("COGI","CXGI");
        malasPalabras.put("COJA","CXJA");
        malasPalabras.put("COJE","CXJE");
        malasPalabras.put("COJI","CXJI");
        malasPalabras.put("COJO","CXJO");
        malasPalabras.put("COLA","CXLA");
        malasPalabras.put("CULO","CXLO");
        malasPalabras.put("FALO","FXLO");
        malasPalabras.put("FETO","FXTO");
        malasPalabras.put("GETA","GXTA");
        malasPalabras.put("GUEI","GXEI");
        malasPalabras.put("GUEY","GXEY");
        malasPalabras.put("JETA","JXTA");
        malasPalabras.put("JOTO","JXTO");
        malasPalabras.put("KACA","KXCA");
        malasPalabras.put("KACO","KXCO");
        malasPalabras.put("KAGA","KXGA");
        malasPalabras.put("KAGO","KXGO");
        malasPalabras.put("KAKA","KXKA");
        malasPalabras.put("KAKO","KXKO");
        malasPalabras.put("KOGE","KXGE");
        malasPalabras.put("KOGI","KXGI");
        malasPalabras.put("KOJA","KXJA");
        malasPalabras.put("KOJE","KXJE");
        malasPalabras.put("KOJI","KXJI");
        malasPalabras.put("KOJO","KXJO");
        malasPalabras.put("KOLA","KXLA");
        malasPalabras.put("KULO","KXLO");
        malasPalabras.put("LILO","LXLO");
        malasPalabras.put("LOCA","LXCA");
        malasPalabras.put("LOCO","LXCO");
        malasPalabras.put("LOKA","LXKA");
        malasPalabras.put("LOKO","LXKO");
        malasPalabras.put("MAME","MXME");
        malasPalabras.put("MAMO","MXMO");
        malasPalabras.put("MEAR","MXAR");
        malasPalabras.put("MEAS","MXAS");
        malasPalabras.put("MEON","MXON");
        malasPalabras.put("MIAR","MXAR");
        malasPalabras.put("MION","MXON");
        malasPalabras.put("MOCO","MXCO");
        malasPalabras.put("MOKO","MXKO");
        malasPalabras.put("MULA","MXLA");
        malasPalabras.put("MULO","MXLO");
        malasPalabras.put("NACA","NXCA");
        malasPalabras.put("NACO","NXCO");
        malasPalabras.put("PEDA","PXDA");
        malasPalabras.put("PEDO","PXDO");
        malasPalabras.put("PENE","PXNE");
        malasPalabras.put("PIPI","PXPI");
        malasPalabras.put("PITO","PXTO");
        malasPalabras.put("POPO","PXPO");
        malasPalabras.put("PUTA","PXTA");
        malasPalabras.put("PUTO","PXTO");
        malasPalabras.put("QULO","QXLO");
        malasPalabras.put("RATA","RXTA");
        malasPalabras.put("ROBA","RXBA");
        malasPalabras.put("ROBE","RXBE");
        malasPalabras.put("ROBO","RXBO");
        malasPalabras.put("RUIN","RXIN");
        malasPalabras.put("SENO","SXNO");
        malasPalabras.put("TETA","TXTA");
        malasPalabras.put("VACA","VXCA");
        malasPalabras.put("VAGA","VXGA");
        malasPalabras.put("VAGO","VXGO");
        malasPalabras.put("VAKA","VXKA");
        malasPalabras.put("VUEI","VXEI");
        malasPalabras.put("VUEY","VXEY");
        malasPalabras.put("WUEI","WXEI");
        malasPalabras.put("WUEY","WXEY");
        if (malasPalabras.containsKey(palabra)) {
            return malasPalabras.get(palabra);
        }
        return palabra;
    }

    private static String filtraCaracteres(String str) {
        // convierte la cadena a mayúsculas
        str = str.toUpperCase();
        // elimina los caracteres especificados en la expresión regular
        str = str.replaceAll("[\\d_\\-./\\\\,]", "X");
        return str;
    }

    private static String zeropad(int ancho, int num) {
        // crea una cadena de ceros de la longitud deseada
        String pad = String.format("%0" + ancho + "d", 0);
        // concatena el número al final de la cadena de ceros
        String resultado = pad + num;
        // devuelve sólo la parte de la cadena que corresponde al ancho deseado
        return resultado.substring(resultado.length() - ancho);
    }

    private static String getSpecialChar(String bornYear) {
        // si el primer carácter de bornYear es "1"
        if (bornYear.charAt(0) == '1') {
            return "0";
        }
        // en otro caso
        return "A";
    }

    private int agregaDigitoVerificador(String incompleteCurp) {
        // diccionario de caracteres permitidos en un CURP
        String dictionary = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        double lnSum = 0.0;
        double lnDigt = 0.0;
        // para cada carácter en incompleteCurp
        for (int i = 0; i < 17; i++) {
            // obtiene el índice del carácter en el diccionario
            int index = dictionary.indexOf(incompleteCurp.charAt(i));
            // suma el índice multiplicado por (18 - i)
            lnSum += index * (18 - i);
        }
        // calcula el dígito verificador como 10 - (lnSum % 10)
        lnDigt = 10 - (lnSum % 10);
        // si el dígito verificador es igual a 10, lo convierte en 0
        if (lnDigt == 10) return 0;
        // devuelve el dígito verificador
        return (int) lnDigt;
    }

    private String obtenerPosicionesUnoCuatroCurp(Persona persona){
        String nombre = ajustaCompuesto(
                normalizaString(persona.getNombre().toUpperCase())
        ).trim();

        String apellidoPaterno = ajustaCompuesto(
                normalizaString(persona.getApellidoPaterno().toUpperCase())
        ).trim();
        String apellidoMaterno = null;
        if(persona.getApellidoMaterno() != null){
            apellidoMaterno = ajustaCompuesto(
                    normalizaString(persona.getApellidoMaterno().toUpperCase())
            ).trim();
        }else {
            apellidoMaterno = "X";
        }

        String nombreUsar = obtenerNombreUsar(nombre);
        String inicialNombre = nombreUsar.substring(0, 1);

        String vocalApellido = apellidoPaterno
                .trim()
                .substring(1)
                .replaceAll("[BCDFGHJKLMNÑPQRSTVWXYZ]", "");
        if(vocalApellido.length() > 0){
            vocalApellido = vocalApellido.substring(0, 1);
        }

        vocalApellido = vocalApellido.isEmpty() ? "X" : vocalApellido;

        String primeraLetraPaterno = apellidoPaterno.substring(0, 1);
        primeraLetraPaterno = primeraLetraPaterno.equals("Ñ") ? "X" : primeraLetraPaterno;

        String primeraLetraMaterno = "";
        if (apellidoMaterno.isEmpty()) {
            primeraLetraMaterno = "X";
        } else {
            primeraLetraMaterno = apellidoMaterno.substring(0, 1);
            primeraLetraMaterno =
                    primeraLetraMaterno.equals("Ñ") ? "X" : primeraLetraMaterno;
        }

        String posicionUnoCuatro = primeraLetraPaterno + vocalApellido + primeraLetraMaterno + inicialNombre;

        posicionUnoCuatro = removerMalasPalabras(filtraCaracteres( posicionUnoCuatro ));
        return posicionUnoCuatro;
    }

    private String obtenerPosicionesCatorceDieciseis(Persona persona) {
        String nombre = ajustaCompuesto(
                normalizaString(persona.getNombre().toUpperCase())
        ).trim();

        String apellidoPaterno = ajustaCompuesto(
                normalizaString(persona.getApellidoPaterno().toUpperCase())
        ).trim();
        String apellidoMaterno = null;
        if(persona.getApellidoMaterno() != null){
            apellidoMaterno = ajustaCompuesto(
                    normalizaString(persona.getApellidoMaterno().toUpperCase())
            ).trim();
        }else {
            apellidoMaterno = "X";
        }
        String nombreUsar = obtenerNombreUsar(nombre);
        String posicionCatorceDieciseis = String.join("",
                primerConsonante(apellidoPaterno),
                primerConsonante(apellidoMaterno),
                primerConsonante(nombreUsar)
        );
        return posicionCatorceDieciseis;
    }

}
