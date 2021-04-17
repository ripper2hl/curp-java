# language: es

Característica: Obtener el curp
  Escenario: Debería obtener el CURP correcto de una persona
    Cuando : El nombre es "Felipe"
    Y : el apellido paterno es "Calderon"
    Y : el apellido materno es "Hinojosa"
    Y : es una persona del genero "MASCULINO"
    Y : su fecha de nacimiento es el "06-09-1992"
    Y : nacio en el estado de "NUEVO_LEON"
    Entonces : el curp generado debe ser "CAHF620818HMNLNL09"