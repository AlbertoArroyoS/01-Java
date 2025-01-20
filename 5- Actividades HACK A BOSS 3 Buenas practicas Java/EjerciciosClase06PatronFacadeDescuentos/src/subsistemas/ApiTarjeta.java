package subsistemas;

import entidades.Tarjeta;

public class ApiTarjeta {

    public int descuento(Tarjeta tarjeta) {
        if ("Star Bank".equalsIgnoreCase(tarjeta.getBanco())) {
            return 20; // 20% de descuento
        }
        return 0; // Sin descuento
    }
}

