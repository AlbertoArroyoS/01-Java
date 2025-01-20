/*
Ejercicio Nº 1 - Variables y Operadores
Escribir un programa que permita calcular el IMC (índice masa corporal) de una persona y luego mostrar por pantalla. La fórmula para el cálculo del IMC es: peso/(altura*altura).

 */


public class Ejercicio1 {

    public static void main(String[] args) {

        double peso = 80;
        int altura = 178; //altura en cm

        double alturaEnMetros = altura / 100.0; //Pasamos la altura en metros
        double imc = peso / (alturaEnMetros * alturaEnMetros);

        // Mostramos el resultado
        System.out.println("El IMC es: " + imc);
        System.out.printf("El IMC redondeado con 2 decimales es: %.2f%n", imc);



    }
}
