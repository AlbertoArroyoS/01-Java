import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Ejercicio Nº 1: Streams (filter, map y collect)
Crear una lista de Strings con de 10 nombres. Una vez cargado el listado, mediante programación funcional (utilizando: Stream y Lambdas) realizar lo siguiente:
·1. Convertir a mayúsculas
·2. Filtrar aquellos nombres que comiencen con la letra “A”
·3. Colectar en una nueva lista y mostrar la lista de nombres resultantes
·4. Sobre la nueva lista, filtrar los nombres que tienen más de 5 letras y ordenar.
·5. Mostrar la lista de nombres resultantes

 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // 0. Crear una lista de Strings con 10 nombres
        List<String> nombres = Arrays.asList(
                "Ana", "Andrés", "Carlos", "María", "Alberto",
                "Lucía", "Alejandro", "Marta", "Antonio", "Beatriz"
        );


        List<String> listaNombresConA = nombres.stream()
                .map(String::toUpperCase) // 1. Convertir a mayúsculas
                //.map(aux -> aux.toUpperCase()) // 1. Convertir a mayúsculas
                .filter(nombre -> nombre.startsWith("A")) // 2. Filtrar por nombres que comiencen con "A"
                .collect(Collectors.toList()); // 3. Colectar en una nueva lista primera forma
                //.toList(); // 3. Colectar en una nueva lista forma abreviada


        // Mostrar la lista resultante
        //System.out.println("Nombres que comienzan con 'A': " + listaNombresConA);
        System.out.println("Nombres que comienzan con 'A'");
        listaNombresConA.forEach(nombre -> System.out.println("Nombre: " + nombre));


        // Filtrar los nombres con más de 5 letras y ordenar, version corta sin crear otra lista

        listaNombresConA.stream()
                .filter(nombre -> nombre.length() > 5) //4. Filtrar nombres con más de 5 letras
                .sorted() // 4. Ordenar alfabéticamente
                //.forEach(System.out::println); // 5. Mostrar la lista resultante
                .forEach(nombre -> System.out.println("Nombre: " + nombre));


        // Filtrar los nombres con más de 5 letras y ordenar version larga creando otra lista

        List<String> nombresFiltradosYOrdenados = listaNombresConA.stream()
                .filter(nombre -> nombre.length() > 5) //4. Filtrar nombres con más de 5 letras
                //.sorted(Comparator.reverseOrder()) // Ordena los elementos en orden descendente
                .sorted() // 4. Ordenar alfabéticamente
                //.collect(Collectors.toList()); // Colectar en una nueva lista
                .toList(); // Colectar en una nueva lista forma abreviada

        // 5. Mostrar la lista resultante
        //Imprimiendo la lista de nombres con más de 5 letras y ordenados
        System.out.println("****** Imprimiento la lista normal ******");
        System.out.println("Nombres con más de 5 letras, ordenados: " + nombresFiltradosYOrdenados);

        //Mostrando los nombres con un forEach y una expresión lambda
        System.out.println("****** Imprimiento la lista con un forEach y una expresión lambda ******");
        nombresFiltradosYOrdenados.forEach(nombre -> System.out.println("Nombre: " + nombre));
        //Doble colon
        System.out.println("****** Imprimiento la lista con un forEach y doble colon ******");
        nombresFiltradosYOrdenados.forEach(System.out::println);


    }
}