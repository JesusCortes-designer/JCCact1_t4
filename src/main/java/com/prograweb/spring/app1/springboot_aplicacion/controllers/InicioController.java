package com.prograweb.spring.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping(value = "/", produces = "text/html; charset=UTF-8")
    public String inicio() {
        return """
            <html>
            <head><meta charset="UTF-8"><title>JCCact1_t4</title></head>
            <body>
                <h1>Proyecto JCCact1_t4</h1>
                <p>Jesús Cortés Cruz - Instituto Tecnológico de Oaxaca - Programación Web</p>
                <h2>Endpoints disponibles</h2>
                <ul>
                    <li><a href="/api/materias">/api/materias</a></li>
                    <li><a href="/api/nombre">/api/nombre</a></li>
                    <li><a href="/api/detalles_info">/api/detalles_info</a></li>
                    <li><a href="/api/detalles_info2">/api/detalles_info2</a></li>
                </ul>
            </body>
            </html>
            """;
    }
}