package modelo.entidad;

import java.util.Date;

public class ImpresoraCannon extends Impresora{
    public ImpresoraCannon(String modelo, String tipoConexion, Date fechaFabricacion, int hojasDisponibles, int porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimiendo en impresora Cannon\n");
    }
}
