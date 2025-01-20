/*
Ejercicio Nº 2: Recursividad – Sumar números
En la misma clase Recursividad del punto anterior, crear un método llamado: sumar(), este método debe recibir un parámetro entero n y realizar la suma de los números naturales hasta n (el número pasado por parámetro) y devolver ese valor.

·        No debe utilizar ninguna estructura repetitiva.
·        El método sumar, debe ser recursivo, es decir, que se llame a sí mismo.
·        En el método: main() invocar al método: sumar con distintos valores para verificar que funcione correctamente.
·        Ejemplos: Si se pasa 6 devolver 21, si se pasa 5 debe devolver 15.
·        Analizar el comportamiento del método recursivo, si es necesario agregar algunos prints.
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Recursividad recursividad = new Recursividad();


        int resultado1 = recursividad.sumar(6); // Debe devolver 21
        System.out.println("La suma de los números hasta 6 es: " + resultado1+ "\n");

        int resultado2 = recursividad.sumar(5); // Debe devolver 15
        System.out.println("La suma de los números hasta 5 es: " + resultado2+ "\n");

        int resultado3 = recursividad.sumar(10); // Debe devolver 55
        System.out.println("La suma de los números hasta 10 es: " + resultado3+ "\n");
    }
}
