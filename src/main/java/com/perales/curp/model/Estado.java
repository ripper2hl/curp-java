package com.perales.curp.model;

import lombok.Getter;

public enum Estado {
    AGUASCALIENTES("AS"),
    BAJA_CALIFORNIA("BC"),
    BAJA_CALIFORNIA_SUR("BS"),
    CAMPECHE("CC"),
    COAHUILA("CL"),
    COLIMA("CM"),
    CHIAPAS("CS"),
    CHIHUAHUA("CH"),
    DISTRITO_FEDERAL("DF"),
    CDMX("DF"),
    DURANGO("DG"),
    GUANAJUATO("GT"),
    GUERRERO("GR"),
    HIDALGO("HG"),
    JALISCO("JC"),
    ESTADO_DE_MEXICO("MC"),
    NO_ESPECIFICADO( "NE"),
    MICHOACAN("MN"),
    MORELOS("MS"),
    NAYARIT("NT"),
    NUEVO_LEON("NL"),
    OAXACA("OC"),
    PUEBLA("PL"),
    QUERETARO("QT"),
    QUINTANA_ROO("QR"),
    SAN_LUIS_POTOSI("SP"),
    SINALOA("SL"),
    SONORA("SR"),
    TABASCO("TC"),
    TAMAULIPAS("TS"),
    TLAXCALA("TL"),
    VERACRUZ("VZ"),
    YUCATAN("YN"),
    ZACATECAS("ZS");

    @Getter
    private final String value;
    
    Estado(String value) {
        this.value = value;
    }
}
