/*
Ejercicio Nº 1 - Estructuras Condicionales - Individual
a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que,
a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no
ingresar al evento.
El programa debe mostrar (según cada caso) un mensaje informando la situación.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes ingresar al recital. ¡Bienvenido!");
        } else {
            System.out.println("Lo siento, no puedes ingresar al recital. Debes ser mayor de 18 años.");
        }

        leer.close();
    }
}
