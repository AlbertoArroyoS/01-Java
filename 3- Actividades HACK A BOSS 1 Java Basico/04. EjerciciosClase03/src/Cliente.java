public class Cliente {

    private int numeroCliente;
    private String nombre;
    private double deuda;

    public Cliente() {
    }

    public Cliente(int numeroCliente, String nombre, double deuda) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = deuda;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
}
