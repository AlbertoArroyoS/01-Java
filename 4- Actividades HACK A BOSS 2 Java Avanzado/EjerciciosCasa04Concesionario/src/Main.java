/*
Generics y Utils

Ejercicio 1: Concesionaria de autos
Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:


Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.


Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.


Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario.
 */

import modelo.entidad.Auto;
import modelo.entidad.InventarioAutos;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 15000);
        Auto auto2 = new Auto("Honda", "Civic", 2021, 18000);
        Auto auto3 = new Auto("Ford", "Mustang", 2020, 25000);
        Auto auto4 = new Auto("Toyota", "Camry", 2021, 22000);

        // Crear inventario de autos
        InventarioAutos<Auto> inventario = new InventarioAutos<>();

        // Agregar autos al inventario
        inventario.agregarAuto(auto1);
        inventario.agregarAuto(auto2);
        inventario.agregarAuto(auto3);
        inventario.agregarAuto(auto4);

        // Buscar autos por marca
        inventario.buscarPorMarca("Toyota");
        inventario.buscarPorMarca("Ford");

        // Buscar autos por año
        inventario.buscarPorAño(2020);
        inventario.buscarPorAño(2021);

        // Calcular el valor total del inventario
        double valorTotal = inventario.calcularValorTotal();
        System.out.println("Valor total del inventario: €" + valorTotal);
    }
}