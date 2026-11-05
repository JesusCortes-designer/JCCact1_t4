package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EjemploController{


@GetMapping("/detalles_info")

   public String info(Map<String, Object> modelo){
    Map<String, Object> respuesta = new HashMap<>();
    modelo.put("Titulo", "Servidor en línea");
    modelo.put("Servidor", "PrograWeb");
    modelo.put("IP", "192.168.1.120");
       
    return "detalles_info";
    }
}
