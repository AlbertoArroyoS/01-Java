/*
Ejercicio Nº 4: Streams (filter, map y collect)
Crear una clase Persona con los atributos: nombre y edad, luego crear 10 objetos del tipo persona y cargarlos al listado. Una vez cargado el listado, mediante programación funcional (utilizando: Stream y Lambdas) realizar lo siguiente:
·1. Filtrar aquellas personas que sean mayores a 18 años
·2. Convertir el nombre de la persona a mayúsculas
·3. Colectar en una nueva lista
·4. Sobre la nueva lista, ordenar por edad
·5. Mostrar el nombre y la edad de las personas de la nueva lista
 */

import modelo.entidad.Persona;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {

    public static void main(String[] args) {


        // 0. Crear una lista de Personas con 10 objetos
        List<Persona> listaPersonas = Arrays.asList(
                new Persona("Juan", 15),
                new Persona("Ana", 20),
                new Persona("Carlos", 25),
                new Persona("María", 30),
                new Persona("Alberto", 35),
                new Persona("Lucía", 40),
                new Persona("Alejandro", 45),
                new Persona("Marta", 50),
                new Persona("Antonio", 55),
                new Persona("Beatriz", 60)
        );

        // Filtrar las personas mayores a 18 años
        List<Persona> listaPersonasResultado = listaPersonas.stream()
                .filter(p -> p.getEdad() > 18) // Filtrar personas mayores de 18
                .map(p -> new Persona(p.getNombre().toUpperCase(), p.getEdad())) // Convertir nombre a mayúsculas
                .collect(Collectors.toList()); // Colectar en una nueva lista

        System.out.println("****** Mostrando la lista de personas mayores a 18 años ******");
        // Mostrar el nombre y la edad de las personas de la nueva lista
        listaPersonasResultado.stream()
                //.sorted((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()))
                //.sorted((p1, p2) -> Integer.compare(p2.getEdad(), p1.getEdad())) // Ordenar de mayor a menor por edad
                .sorted(Comparator.comparingInt(Persona::getEdad)) // Con doble colon
                //.sorted(Comparator.comparingInt(Persona::getEdad).reversed()) // Ordenar de mayor a menor por edad
                .forEach(persona -> System.out.println("Nombre: " + persona.getNombre() + " - Edad: " + persona.getEdad()));

        System.out.println("****** Ordenando por el compareTo() de la clase Persona ******");
        //Ordenando por el compareTo() de la clase Persona
        listaPersonasResultado.stream()
                .sorted()
                .forEach(persona -> System.out.println("Nombre: " + persona.getNombre() + " - Edad: " + persona.getEdad()));


    }


}
