package subsistemas;

import entidades.Producto;

public class ApiProducto {

    public int descuento(Producto producto) {
        if ("lata".equalsIgnoreCase(producto.getTipo())) {
            return 10; // 10% de descuento
        }
        return 0; // Sin descuento
    }
}

