package modelo.entidad;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Impresora {

    protected String modelo;
    protected String tipoConexion;
    protected Date fechaFabricacion;
    protected int hojasDisponibles;
    protected int porcentajeTinta;

    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion, int hojasDisponibles, int porcentajeTinta) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }

    public void imprimir(){
        System.out.println("Imprimiendo en impresora genérica\n");
    }

    @Override
    public String toString() {
        // Formatear la fecha a dd/MM/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = dateFormat.format(fechaFabricacion);

        // Construir la representación en texto
        return "Impresora{" +
                "modelo='" + modelo + '\'' +
                ", tipoConexion='" + tipoConexion + '\'' +
                ", fechaFabricacion=" + fechaFormateada +
                ", hojasDisponibles=" + hojasDisponibles +
                ", porcentajeTinta=" + porcentajeTinta + "%}";
    }
}
