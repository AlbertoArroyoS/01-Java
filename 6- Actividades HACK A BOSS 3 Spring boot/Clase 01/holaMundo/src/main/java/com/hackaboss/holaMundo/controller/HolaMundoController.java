package com.hackaboss.holaMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping
    public String holaMundo(){
        return "Hola mundo desde Spring Boot, soy Alberto Arroyo";
    }
}
