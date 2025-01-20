/*
Ejercicio Nº 1: Recursividad – Imprimir números
Crear una clase llamada Recursividad con un único método llamado: imprimir(), este método debe recibir un parámetro entero, no devolver ningún valor e imprimir desde ese número hasta 5, para esto se debe:

·        No debe utilizar ninguna estructura repetitiva.
·        El método imprimir, debe ser recursivo, es decir, que se llame a sí mismo.
·        En el método: main() crear una instancia de Recursividad e invocar al método: imprimir con distintos valores para verificar que funcione correctamente.
·        Analizar el comportamiento del método recursivo, si es necesario agregar algunos prints.
 */

public class Ejercicio1 {
    public static void main(String[] args) {

        Recursividad recursividad = new Recursividad();
        recursividad.imprimir(0);

    }
}