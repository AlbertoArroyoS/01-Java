package com.hackaboss.ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio2Controller {

    // Endpoint 1: Hola Mundo + nombre
    //http://localhost:8080/saludo/alberto
    @GetMapping("/saludo/{nombre}")
    public String sayHello(@PathVariable String nombre) {
        return "Hola Mundo " + nombre;
    }

    // Endpoint 2: Hola Mundo + nombre + edad
    //http://localhost:8080/saludo/alberto/40
    @GetMapping("/saludo/{nombre}/{edad}")
    public String sayHelloWithAge(@PathVariable String nombre, @PathVariable int edad) {
        return "Hola Mundo " + nombre + ", edad: " + edad;
    }

    // Endpoint 3: Hola Mundo + nombre + edad + profesión
    //http://localhost:8080/saludo/alberto/40/programador
    @GetMapping("/saludo/{nombre}/{edad}/{profesion}")
    public String sayHelloWithProfession(@PathVariable String nombre,
                                         @PathVariable int edad,
                                         @PathVariable String profesion) {
        return "Hola Mundo " + nombre + ", edad: " + edad + ", profesión: " + profesion;
    }

    // Endpoint 4 : Hola Mundo + nombre
    //http://localhost:8080/saludo-nombre?nombre=Alberto
    @GetMapping("/saludo-nombre")
    public String sayHello2(@RequestParam String nombre) {
        return "Hola Mundo " + nombre;
    }

    // Endpoint 5: Hola Mundo + nombre + edad
    //http://localhost:8080/saludo-nombre-edad?nombre=Alberto&edad=40
    @GetMapping("/saludo-nombre-edad")
    public String sayHelloWithAge2(@RequestParam String nombre, @RequestParam int edad) {
        return "Hola Mundo " + nombre + ", edad: " + edad;
    }

    // Endpoint 6: Hola Mundo + nombre + edad + profesión
    //http://localhost:8080/saludo-edad-profesion?nombre=Alberto&edad=40&profesion=programador
    @GetMapping("/saludo-edad-profesion")
    public String sayHelloWithProfession2(@RequestParam String nombre,
                                         @RequestParam int edad,
                                         @RequestParam String profesion) {
        return "Hola Mundo " + nombre + ", edad: " + edad + ", profesión: " + profesion;
    }
}

