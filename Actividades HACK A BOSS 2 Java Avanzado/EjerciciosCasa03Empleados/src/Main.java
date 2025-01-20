/*
Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals:


Filtra los empleados cuyo salario sea mayor a cierto valor específico.


Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.


Encuentra al empleado con el salario más alto utilizando Optionals.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Lista de empleados
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Juan", 5000, "Desarrollador"),
                new Empleado("Ana", 7000, "Desarrollador"),
                new Empleado("Luis", 4500, "Analista"),
                new Empleado("Marta", 5500, "Analista"),
                new Empleado("Carlos", 10000, "Gerente"),
                new Empleado("Lucia", 9000, "Gerente")
        );

        // Operación 1: Filtrar empleados cuyo salario sea mayor a cierto valor
        double salarioFiltro = 6000;
        List<Empleado> empleadosFiltrados = empleados.stream()
                .filter(e -> e.getSalario() > salarioFiltro)
                .collect(Collectors.toList());

        System.out.println("Empleados con salario mayor a " + salarioFiltro + ":");
        empleadosFiltrados.forEach(System.out::println);

        // Operación 2: Agrupar empleados por categoría y calcular el salario promedio
        Map<String, Double> salarioPromedioPorCategoria = empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)
                ));

        System.out.println("\nSalario promedio por categoría:");
        salarioPromedioPorCategoria.forEach((categoria, promedio) ->
                System.out.println(categoria + ": " + promedio));

        // Operación 3: Encontrar al empleado con el salario más alto
        Optional<Empleado> empleadoConSalarioMaximo = empleados.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));

        System.out.println("\nEmpleado con el salario más alto:");
        empleadoConSalarioMaximo.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No hay empleados en la lista.")
        );
    }
}