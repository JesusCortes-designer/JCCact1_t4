package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EjemploRestController{


@GetMapping("/detalles_info2")

   public Map<String, Object> detalles_info2() {
    Map<String, Object> respuesta = new HashMap<>();
    respuesta.put("Titulo", "Servidor en línea");
    respuesta.put("Servidor", "PrograWeb");
    respuesta.put("IP", "192.168.1.120");
       
    return respuesta;
    }
}
