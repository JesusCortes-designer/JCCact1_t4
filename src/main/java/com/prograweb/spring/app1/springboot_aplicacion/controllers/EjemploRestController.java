package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploRestController {

    // a) Identifica de quién es la instancia
    @GetMapping("/nombre")
    public String nombre() {
        return "Proyecto JCCact1_t4 - Jesús Cortés";
    }

    // c) Objeto simple (JSON)
    @GetMapping("/detalles_info2")
    public Map<String, Object> detallesInfo2() {
        Map<String, Object> respuesta = new LinkedHashMap<>();
        respuesta.put("Titulo", "Servidor en línea");
        respuesta.put("Servidor", "PrograWeb");
        respuesta.put("Autor", "JCC");
        return respuesta;
    }
}