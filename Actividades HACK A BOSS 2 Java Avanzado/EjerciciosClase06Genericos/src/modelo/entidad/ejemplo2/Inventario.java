package modelo.entidad.ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends Producto> {
    private List<T> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
        System.out.println("Producto agregado al inventario: " + producto.getNombre());
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (T producto : productos) {
            System.out.println(producto.getNombre() + " - €" + producto.getPrecio());
        }
    }

    // Otros métodos relacionados con la gestión del inventario

    // Metodo para imprimir los productos de un tipo específico
    public void imprimirProductosPorTipo(String nombreTipo) {
        System.out.println("Productos del tipo " + nombreTipo + ":");

        boolean encontrado = false; // Para manejar el caso en que no haya productos del tipo
        for (T producto : productos) {
            if (producto.getClass().getSimpleName().equalsIgnoreCase(nombreTipo)) {
                System.out.println("- " + producto.getNombre() + " (€" + producto.getPrecio() + ")");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay productos de este tipo en el inventario.");
        }
    }

}
