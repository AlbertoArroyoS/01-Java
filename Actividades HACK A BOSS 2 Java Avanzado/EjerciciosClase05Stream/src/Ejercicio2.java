/*
Ejercicio Nº 2: Streams (filter y reduce)
Crear una lista de Integers con de 10 números. Una vez cargado el listado, mediante programación funcional (utilizando: Stream y Lambdas) realizar lo siguiente:
·1. Filtrar los números mayores a 10
·2. Obtener la suma total de los números filtrados
·3. Mostrar la suma obtenida
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Ejercicio Nº 2: Crear una lista de Integers con 10 números
        List<Integer> numeros = Arrays.asList(5, 12, 8, 21, 14, 3, 18, 7, 25, 10);

        // Filtrar los números mayores a 10 y obtener la suma total

        //BinaryOperator<Integer> sumaBinaria = (acumulador, numero) -> acumulador + numero;
        Integer suma = numeros.stream()
                .filter(num -> num > 10) // 1. Filtrar los números mayores a 10
                //reduce recibe dos parámetros, el primero es el valor inicial del acumulador y el segundo es una lambda que recibe dos parámetros, el acumulador y el número actual
                //0 es el valor inicial del acumulador
                .reduce(0, (acumulador, numero) -> acumulador + numero); // Usar una lambda para la suma
                //.reduce(0, Integer::sum); // 2. Sumar los números filtrados

        // Mostrar la suma obtenida
        System.out.println("La suma de los números mayores a 10 es: " + suma);

        //Con un Optional
        Optional<Integer> sumaOptional = numeros.stream()
                .filter(num -> num > 10)
                //.reduce(Integer::sum);
                .reduce((a, b) -> a + b);

        System.out.println("Optional: La suma de los números mayores a 10 es: " + sumaOptional);
        System.out.println("Optional: La suma de los números mayores a 10 es: " + sumaOptional.get());

        //Con mapToInt
        int sumaMapInt = numeros.stream()
                .filter(num -> num > 10)  // Filtra los números mayores a 10
                .mapToInt(Integer::intValue) // Convierte los números a primitivos int
                .sum();  // Suma los números filtrados

        System.out.println("mapToInt: La suma de los números mayores a 10 es: " + sumaMapInt);


    }
}
