package subsistemas;

public class ApiCantidad {

    public int descuento(int cantidad) {
        if (cantidad > 12) {
            return 15; // 15% de descuento
        }
        return 0; // Sin descuento
    }
}

