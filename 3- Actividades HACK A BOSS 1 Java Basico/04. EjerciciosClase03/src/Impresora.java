/*
Ejercicio Nº 2 - POO
Crear una clase Impresora, que tenga los siguientes atributos: modelo, tipo de conexión, fecha de fabricación y hojas disponibles (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

a)     En el método main: Crear un vector de tipo Impresora de tres posiciones. Crear tres impresoras y guardarlas en él.
b)     En el método main: Recorrer el vector creado y mostrar por pantalla el modelo y tipo de conexión de cada impresora almacenada.
 */

public class Impresora {

    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int hojasDisponibles;

    public Impresora() {
    }

    public Impresora(String modelo, String tipoConexion, String fechaFabricacion, int hojasDisponibles) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }
}
