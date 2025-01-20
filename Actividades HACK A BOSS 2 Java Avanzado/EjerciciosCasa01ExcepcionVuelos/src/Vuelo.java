public class Vuelo {
    private String destino;
    private String fecha;
    private int asientosDisponibles;

    public Vuelo(String destino, String fecha, int asientosDisponibles) {
        this.destino = destino;
        this.fecha = fecha;
        this.asientosDisponibles = asientosDisponibles;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void reservarAsientos(int cantidad) throws ReservaInvalidaException {
        if (cantidad > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles. Disponibles: " + asientosDisponibles);
        }
        asientosDisponibles -= cantidad;
    }
}