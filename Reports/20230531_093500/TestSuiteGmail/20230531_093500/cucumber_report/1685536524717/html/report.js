$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/git/DemoPresentacion/Include/features/Archivo.feature");
formatter.feature({
  "name": "Flujo de trabajo",
  "description": "",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Dar de alta registro de emppleado",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@Escenario1"
    }
  ]
});
formatter.step({
  "name": "que el usuario ingresa al sitio web",
  "keyword": "Dado "
});
formatter.step({
  "name": "el usuario ingresa sus credenciales de manera correcta usuario y clave \u003cusuario\u003e, \u003cclave\u003e",
  "keyword": "Y "
});
formatter.step({
  "name": "quiero agregar un nuevo empleado al registro",
  "keyword": "Cuando "
});
formatter.step({
  "name": "ingreso los datos \u003cnombre\u003e, \u003capellido\u003e y \u003cidEmpleado\u003e",
  "keyword": "Y "
});
formatter.step({
  "name": "presiono el boton guardar",
  "keyword": "Y "
});
formatter.step({
  "name": "Se verifica que se agrego el empleado de forma correcta",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "usuario",
        "clave",
        "nombre",
        "apellido",
        "idEmpleado"
      ]
    },
    {
      "cells": [
        "Admin",
        "hUKwJTbofgPU9eVlw/CnDQ\u003d\u003d",
        "Juan",
        "Mouhape",
        "1111"
      ]
    },
    {
      "cells": [
        "Admin",
        "hUKwJTbofgPU9eVlw/CnDQ\u003d\u003d",
        "Juan",
        "Rodriguez",
        "2222"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Dar de alta registro de emppleado",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Escenario1"
    }
  ]
});
formatter.step({
  "name": "que el usuario ingresa al sitio web",
  "keyword": "Dado "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.que_el_usuario_ingresa_al_sitio_web()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ingresa sus credenciales de manera correcta usuario y clave Admin, hUKwJTbofgPU9eVlw/CnDQ\u003d\u003d",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.el_usuario_ingresa_sus_credenciales_de_manera_correcta_y(Object,Object)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quiero agregar un nuevo empleado al registro",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.quiero_agregar_un_nuevo_empleado_al_registro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso los datos Juan, Mouhape y 1111",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.ingreso_los_datos_del_nuevo_empleado(Object,Object,Object)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiono el boton guardar",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.presiono_el_boton_guardar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se verifica que se agrego el empleado de forma correcta",
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.se_verifica_que_se_agrego_el_empleado_de_forma_correcta()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Dar de alta registro de emppleado",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Escenario1"
    }
  ]
});
formatter.step({
  "name": "que el usuario ingresa al sitio web",
  "keyword": "Dado "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.que_el_usuario_ingresa_al_sitio_web()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ingresa sus credenciales de manera correcta usuario y clave Admin, hUKwJTbofgPU9eVlw/CnDQ\u003d\u003d",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.el_usuario_ingresa_sus_credenciales_de_manera_correcta_y(Object,Object)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quiero agregar un nuevo empleado al registro",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.quiero_agregar_un_nuevo_empleado_al_registro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso los datos Juan, Rodriguez y 2222",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.ingreso_los_datos_del_nuevo_empleado(Object,Object,Object)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiono el boton guardar",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.presiono_el_boton_guardar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Se verifica que se agrego el empleado de forma correcta",
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarEmpleadoStepDefs.se_verifica_que_se_agrego_el_empleado_de_forma_correcta()"
});
formatter.result({
  "status": "passed"
});
});