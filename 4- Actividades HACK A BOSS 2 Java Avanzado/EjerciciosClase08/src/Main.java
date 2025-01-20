import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
El objetivo de esta guía práctica es que podamos profundizar el uso de diferentes colecciones de datos y de la Api Stream de Java para el manejo de la programación funcional junto con las expresiones lambda.
Consigna:
1. Inicia creando una clase Vehículo con los atributos modelo, marca y costo, luego crea una lista de vehículos. Crea además los constructores de las clases y los métodos Setter y Getter.
2. Crea una clase con el método main para representar un escenario donde se crea una lista de vehículos según la siguiente tabla:
3. Haciendo uso del método sort en la lista de Vehículos con expresiones lambda, obtén una lista de vehículos ordenados por precio de menor a mayor, imprime por pantalla el resultado.
4. De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
5. Se desea extraer una lista de vehículos con precio no mayor a 1000, luego otra con precios mayor o igual 1000 y por último, obtén el promedio total de precios de toda la lista de vehículos.


 */
public class Main {
    public static void main(String[] args) {

        //2. Crear la lista de vehículos

        List<Vehiculo> vehiculos = Arrays.asList(
                new Vehiculo("Ford", "Fiesta", 1000),
                new Vehiculo("Ford", "Focus", 1200),
                new Vehiculo("Ford", "Explorer", 2500),
                new Vehiculo("Fiat", "Uno", 500),
                new Vehiculo("Fiat", "Cronos", 1000),
                new Vehiculo("Fiat", "Torino", 1250),
                new Vehiculo("Chevrolet", "Aveo", 1250),
                new Vehiculo("Chevrolet", "Spin", 2500),
                new Vehiculo("Toyota", "Corolla", 1200),
                new Vehiculo("Toyota", "Fortuner", 3000),
                new Vehiculo("Renault", "Logan", 950)
        );

        List<Vehiculo> vehiculos2 = new ArrayList<>();


        //3. Ordenar por precio de menor a mayor
        List<Vehiculo> ordenadosPorPrecio = vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());
        System.out.println("Lista de vehículos ordenados por precio:");
        ordenadosPorPrecio.forEach(System.out::println);

        //Otra forma de ordenar
        vehiculos.sort(Comparator.comparingDouble(Vehiculo::getCosto));
        //Ordenar de mayor a menor
        vehiculos.sort(Comparator.comparingDouble(Vehiculo::getCosto).reversed());

        //4. Ordenar por marca y luego por precio
        List<Vehiculo> ordenadosPorMarcaYPrecio = vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                        .thenComparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());
        System.out.println("\nLista de vehículos ordenados por marca y luego por precio:");
        ordenadosPorMarcaYPrecio.forEach(System.out::println);

        //Otra forma de ordenar
        vehiculos.sort(Comparator.comparing(Vehiculo::getMarca)
                .thenComparingDouble(Vehiculo::getCosto));

        //5.1 Filtrar vehículos con precio menor a 1000
        List<Vehiculo> precioMenor1000 = vehiculos.stream()
                .filter(v -> v.getCosto() < 1000)
                .collect(Collectors.toList());
        System.out.println("\nLista de vehículos con precio menor a 1000:");
        precioMenor1000.forEach(System.out::println);

        //5.2 Filtrar vehículos con precio mayor o igual a 1000
        List<Vehiculo> precioMayorIgual1000 = vehiculos.stream()
                .filter(v -> v.getCosto() >= 1000)
                .collect(Collectors.toList());
        System.out.println("\nLista de vehículos con precio mayor o igual a 1000:");
        precioMayorIgual1000.forEach(System.out::println);

        //5.3 Calcular el promedio de precios
        double promedioPrecios = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                //.orElse(0);
                .orElseThrow(() -> new RuntimeException("Lista vacía"));
        System.out.println("\nPromedio total de precios: " + promedioPrecios);

        //primero obtener la suma, luego obtener la cantidad y luego calcular el promedio
        double sumaPrecios = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .sum();
        long cantidadVehiculos = vehiculos.stream().count();
        double promedioPrecios2 = sumaPrecios / cantidadVehiculos;

        System.out.println("\nSuma total de precios: " + sumaPrecios);
        System.out.println("Cantidad total de vehículos: " + cantidadVehiculos);
        System.out.println("Promedio total de precios: " + promedioPrecios2);

        //Si tiene elementos que devuelva el promedio si no dice que la lista esta vacia
        double promedioPrecios3 = vehiculos2.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElseThrow(() -> new RuntimeException("Lista vacía"));
        System.out.println("\nPromedio total de precios: " + promedioPrecios3);

        //Otra forma
        if (vehiculos2 == null || vehiculos2.isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            double promedioPrecios4 = vehiculos2.stream()
                    .mapToDouble(Vehiculo::getCosto)
                    .average()
                    .orElse(0); // Puedes poner 0 o cualquier valor predeterminado
            System.out.println("\nPromedio total de precios: " + promedioPrecios4);
        }
        
        //Otra forma
        vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .ifPresentOrElse(
                        promedio -> System.out.println("Promedio total de precios: " + promedio),
                        () -> System.out.println("Lista vacía")
                );

    }
}