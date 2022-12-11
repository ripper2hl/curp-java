# language: es

Característica: Obtener el curp
  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "Felipe de Jesús"
    Y el apellido paterno es "Calderón"
    Y el apellido materno es "Hinojosa"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "18-08-1962"
    Y nacio en el estado de "MICHOACAN"
    Entonces el curp generado debe ser "CAHF620818HMNLNL09"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "Enrique"
    Y el apellido paterno es "Peña"
    Y el apellido materno es "Nieto"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "20-07-1966"
    Y nacio en el estado de "ESTADO_DE_MEXICO"
    Entonces el curp generado debe ser "PXNE660720HMCXTN06"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "Andrés Manuel"
    Y el apellido paterno es "López"
    Y el apellido materno es "Obrador"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "13-11-1953"
    Y nacio en el estado de "TABASCO"
    Entonces el curp generado debe ser "LOOA531113HTCPBN07"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "Oscar"
    Y el apellido paterno es "Sanchez"
    Y el apellido materno es "Santos"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "09-09-1975"
    Y nacio en el estado de "CDMX"
    Entonces el curp generado debe ser "SASO750909HDFNNS05"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "Luis"
    Y el apellido paterno es "Perez"
    Y el apellido materno es " "
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "09-09-1975"
    Y nacio en el estado de "CDMX"
    Entonces el curp generado debe ser "PEXL750909HDFRXS02"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "Luis"
    Y el apellido paterno es "Perez"
    Y el apellido materno es "Piedra"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "09-09-2000"
    Y nacio en el estado de "NUEVO_LEON"
    Entonces el curp generado debe ser "PEPL000909HNLRDSA1"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "Maria Del Carmen"
    Y el apellido paterno es "Loredo"
    Y el apellido materno es "Caballero"
    Y es una persona del genero "FEMENINO"
    Y su fecha de nacimiento es el "27-06-1990"
    Y nacio en el estado de "SAN_LUIS_POTOSI"
    Entonces el curp generado debe ser "LOCC900627MSPRBR07"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "MARIA GILA"
    Y el apellido paterno es "HURTADO"
    Y el apellido materno es "HERRERA"
    Y es una persona del genero "FEMENINO"
    Y su fecha de nacimiento es el "01-09-1920"
    Y nacio en el estado de "SAN_LUIS_POTOSI"
    Entonces el curp generado debe ser "HUHG200901MSPRRL09"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "MARIA DEL ROSARIO"
    Y el apellido paterno es "MARTINEZ"
    Y el apellido materno es "RIVAS"
    Y es una persona del genero "FEMENINO"
    Y su fecha de nacimiento es el "08-09-1981"
    Y nacio en el estado de "SAN_LUIS_POTOSI"
    Entonces el curp generado debe ser "MARR810908MSPRVS00"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "ONDREJ JUAN"
    Y el apellido paterno es "HERNANDEZ"
    Y el apellido materno es "LOPEZ"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "01-05-1999"
    Y nacio en el estado de "VERACRUZ"
    Entonces el curp generado debe ser "HELO990501HVZRPN09"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "IRMA LETICIA"
    Y el apellido paterno es "MAR"
    Y el apellido materno es "SOLIS"
    Y es una persona del genero "FEMENINO"
    Y su fecha de nacimiento es el "05-08-2005"
    Y nacio en el estado de "VERACRUZ"
    Entonces el curp generado debe ser "MASI050805MVZRLRA8"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "MARIA ERNESTINA RAFAELA"
    Y el apellido paterno es "CONTRERAS"
    Y el apellido materno es "MORALES"
    Y es una persona del genero "FEMENINO"
    Y su fecha de nacimiento es el "10-11-1972"
    Y nacio en el estado de "VERACRUZ"
    Entonces el curp generado debe ser "COME721110MVZNRR03"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "MARIA"
    Y el apellido paterno es "VILLA"
    Y el apellido materno es "TRUJILLO"
    Y es una persona del genero "FEMENINO"
    Y su fecha de nacimiento es el "06-09-1982"
    Y nacio en el estado de "VERACRUZ"
    Entonces el curp generado debe ser "VITM820906MVZLRR00"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "JOSE MARIA"
    Y el apellido paterno es "TEZOCO"
    Y el apellido materno es "APALE"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "22-06-1947"
    Y nacio en el estado de "VERACRUZ"
    Entonces el curp generado debe ser "TEAM470622HVZZPR07"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "JOSE SAUL"
    Y el apellido paterno es "GALVAN"
    Y el apellido materno es "DEL RIO"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "23-09-1970"
    Y nacio en el estado de "SAN_LUIS_POTOSI"
    Entonces el curp generado debe ser "GARS700923HSPLXL06"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "ALBERTO"
    Y el apellido paterno es "ÑANDO"
    Y el apellido materno es "RODRIGUEZ"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "09-09-1975"
    Y nacio en el estado de "CDMX"
    Entonces el curp generado debe ser "XARA750909HDFNDL00"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "ALBERTO"
    Y el apellido paterno es "RODRIGUEZ"
    Y el apellido materno es "ÑANDO"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "09-09-1975"
    Y nacio en el estado de "CDMX"
    Entonces el curp generado debe ser "ROXA750909HDFDNL07"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "ANDRÉS"
    Y el apellido paterno es "ICH"
    Y el apellido materno es "RODRIGUEZ"
    Y es una persona del genero "MASCULINO"
    Y su fecha de nacimiento es el "09-09-1975"
    Y nacio en el estado de "CDMX"
    Entonces el curp generado debe ser "IXRA750909HDFCDN09"

  Escenario: Debería obtener el CURP correcto de una persona
    Cuando El nombre es "ANGELINE"
    Y el apellido paterno es "ZULEYKA"
    Y el apellido materno es "NETAN"
    Y es una persona del genero "FEMENINO"
    Y su fecha de nacimiento es el "08-03-1954"
    Y nacio en el estado de "NO_ESPECIFICADO"
    Entonces el curp generado debe ser "ZUNA540308MNELTN05"
