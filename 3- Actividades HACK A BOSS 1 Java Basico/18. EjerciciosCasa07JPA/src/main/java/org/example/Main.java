package org.example;

import org.example.modelo.logica.entidad.Platillo;
import org.example.modelo.persistencia.controlador.ControladoraPersistencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ControladoraPersistencia controlPersis = new ControladoraPersistencia();

        // Crear platillos
        Platillo platillo1 = new Platillo("Sopa", "receta1", 15.0);
        Platillo platillo2 = new Platillo("Tostada", "receta2", 12.0);
        Platillo platillo3 = new Platillo("Carne", "receta 3", 14.0);

        // Mostrar el platillo antes de guardarlo
        System.out.println(platillo1);

        // Crear platillos en la base de datos
        controlPersis.crearPlatillo(platillo2);
        controlPersis.crearPlatillo(platillo3);

        // Modificar un platillo
        platillo2.setPrecio(13.0);  // Modificamos el precio
        controlPersis.editarPlatillo(platillo2);

        // Eliminar un platillo por su ID
        controlPersis.eliminarPlatillo(3); // Suponiendo que el ID es 3

        // Obtener y mostrar todos los platillos de la base de datos
        List<Platillo> listaPlatillos = controlPersis.obtenerTodos();

        // Usando for-each para recorrer la lista de platillos
        System.out.println("----Lista de platillos----");
        for (Platillo platillo : listaPlatillos) {
            System.out.println(platillo.toString());
        }
    }
}