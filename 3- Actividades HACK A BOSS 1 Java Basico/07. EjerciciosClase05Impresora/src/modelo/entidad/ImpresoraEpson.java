package modelo.entidad;

import java.util.Date;

public class ImpresoraEpson extends Impresora{
    public ImpresoraEpson(String modelo, String tipoConexion, Date fechaFabricacion, int hojasDisponibles, int porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimiendo en impresora Epson\n");
    }
}
