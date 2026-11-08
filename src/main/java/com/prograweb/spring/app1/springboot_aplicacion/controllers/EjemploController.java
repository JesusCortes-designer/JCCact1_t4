package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prograweb.spring.app1.springboot_aplicacion.models.Materia;

@RestController
@RequestMapping("/api")
public class EjemploController {

   

    @GetMapping("/materias")
    public List<Materia> materias() {
        return List.of(
            new Materia(1, "Programación Web", 8),
            new Materia(2, "Bases de Datos", 7),
            new Materia(3, "Redes", 6)
        );
    }

    // Objeto con el puerto en el que corre
    @GetMapping("/detalles_info")
    public Map<String, Object> info() {
        Map<String, Object> respuesta = new LinkedHashMap<>();
        respuesta.put("Titulo", "Servidor en línea");
        respuesta.put("Servidor", "PrograWeb");
        respuesta.put("IP", "192.168.1.1");
        return respuesta;
    }
}