import modelo.entidad.ejemplo2.*;

import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Crear inventario para electrónicos
        Inventario<Electronico> inventarioElectronico = new Inventario<>();
        inventarioElectronico.agregarProducto(new Electronico("Laptop", 1200.0, "MarcaX"));
        inventarioElectronico.agregarProducto(new Electronico("Smartphone", 800.0, "MarcaY"));

        // Crear inventario para ropa
        // Crear inventario para ropa
        Inventario<Ropa> inventarioRopa = new Inventario<>();
        inventarioRopa.agregarProducto(new Ropa("Camiseta", 20.0, "M", "Algodón"));
        inventarioRopa.agregarProducto(new Ropa("Jeans", 50.0, "32", "Denim"));

        // Crear inventario para libros
        Inventario<Libro> inventarioLibros = new Inventario<>();
        inventarioLibros.agregarProducto(new Libro("Java 101", 29.99, "John Doe"));
        inventarioLibros.agregarProducto(new Libro("Historia del Arte", 39.99, "Jane Smith"));

        // Mostrar inventarios
        inventarioElectronico.mostrarInventario();
        inventarioRopa.mostrarInventario();
        inventarioLibros.mostrarInventario();



        // Crear inventario para productos genéricos
        Inventario<Producto> inventarioGeneral = new Inventario<>();
        inventarioGeneral.agregarProducto(new Electronico("Laptop", 1200.0, "MarcaX"));
        inventarioGeneral.agregarProducto(new Electronico("Smartphone", 800.0, "MarcaY"));
        inventarioGeneral.agregarProducto(new Ropa("Camiseta", 20.0, "M", "Algodón"));
        inventarioGeneral.agregarProducto(new Ropa("Jeans", 50.0, "32", "Denim"));
        inventarioGeneral.agregarProducto(new Libro("Java 101", 29.99, "John Doe"));
        inventarioGeneral.agregarProducto(new Libro("Historia del Arte", 39.99, "Jane Smith"));

        // Imprimir productos del tipo deseado
        inventarioGeneral.imprimirProductosPorTipo("Ropa");
        inventarioGeneral.imprimirProductosPorTipo("Electronico");
        inventarioGeneral.imprimirProductosPorTipo("Libro");
        inventarioGeneral.imprimirProductosPorTipo("X"); // No existe en el inventario

    }

}
