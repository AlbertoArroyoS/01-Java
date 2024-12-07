import modelo.entidad.Producto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // a) Crear 10 objetos de tipo Producto
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("P001", "Teléfono", "Samsung", "Electrónica", 300, 500, 15));
        productos.add(new Producto("P002", "Portatil", "HP", "Computadora", 600, 1000, 10));
        productos.add(new Producto("P003", "Auriculares", "Sony", "Audio", 50, 100, 25));
        productos.add(new Producto("P004", "Cargador", "Anker", "Accesorios", 10, 25, 50));
        productos.add(new Producto("P005", "Tablet", "Apple", "Electrónica", 400, 800, 8));
        productos.add(new Producto("P006", "Monitor", "LG", "Electrónica", 200, 300, 20));
        productos.add(new Producto("P007", "Teclado", "Logitech", "Accesorios", 20, 40, 30));
        productos.add(new Producto("P008", "Mouse", "Razer", "Accesorios", 30, 60, 40));
        productos.add(new Producto("P009", "Impresora", "Epson", "Electrónica", 150, 250, 5));
        productos.add(new Producto("P010", "Altavoces", "JBL", "Audio", 70, 120, 18));

        // b) Guardar estos objetos creados en un ArrayList
        System.out.println("Productos cargados en el inventario.\n");

        // c) Determinar el producto con el mayor precio de venta
        Producto productoMayorPrecio = productos.get(0);//inicializo el objero con el que hay en la posicion 0 de la lista
        for (Producto producto : productos) {
            if (producto.getPrecioVenta() > productoMayorPrecio.getPrecioVenta()) {
                productoMayorPrecio = producto;
            }
        }
        System.out.println("Producto con el mayor precio de venta: " + productoMayorPrecio + "\n");

        // d) Determinar el producto con el menor precio de costo
        Producto productoMenorCosto = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getPrecioCosto() < productoMenorCosto.getPrecioCosto()) {
                productoMenorCosto = producto;
            }
        }
        System.out.println("Producto con el menor precio de costo: " + productoMenorCosto + "\n");

        // e) Borrar el producto que se encuentre en la posición 5 del ArrayList
        if (productos.size() > 5) {
            Producto eliminado = productos.remove(5);
            System.out.println("Producto eliminado en la posición 5: " + eliminado + "\n");
        }

        // f) Determinar el producto con la mayor cantidad en stock
        Producto productoMayorStock = productos.get(0);
        for (Producto producto : productos) {
            if (producto.getCantidadStock() > productoMayorStock.getCantidadStock()) {
                productoMayorStock = producto;
            }
        }
        System.out.println("Producto con mayor cantidad en stock antes del descuento: " + productoMayorStock);

        // Descontar 3 unidades de stock
        productoMayorStock.setCantidadStock(productoMayorStock.getCantidadStock() - 3);
        System.out.println("Producto con mayor cantidad en stock después del descuento: " + productoMayorStock + "\n");

        // g) Mostrar información de todos los productos
        System.out.println("Listado actualizado de productos:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
