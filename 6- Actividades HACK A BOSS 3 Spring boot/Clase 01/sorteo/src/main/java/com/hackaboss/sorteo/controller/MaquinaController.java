package com.hackaboss.sorteo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MaquinaController {

    @GetMapping("/sorteo1")
    public String realizarSorteo() {
        int numeroRandom = (int)(Math.random() * 100) + 1;
        return "El número sorteado es: " + numeroRandom;
    }

    //Que devuelva 10 números aleatorios en un array
    @GetMapping("/sorteo2")
    public String realizarSorteo2() {
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int)(Math.random() * 100) + 1;
        }
        return "Los números sorteados son: " + Arrays.toString(numeros);
    }

    // Concatenando los números en un String
    @GetMapping("/sorteo3")
    public String realizarSorteo3() {
        String numeros = "";
        for (int i = 0; i < 10; i++) {
            int numeroRandom = (int)(Math.random() * 100) + 1;
            numeros += numeroRandom + ", ";
        }
        return "Los números sorteados son: " + numeros;
    }

}
