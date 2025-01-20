package entidades;

public class EmpleadoContratado extends Empleado {
    private double importePorHora;
    private double retencionImpuesto;

    public EmpleadoContratado() {
        super();
    }

    public EmpleadoContratado(String nombre, String apellido, int legajo, double importePorHora, double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    public void setImportePorHora(double importePorHora) {
        this.importePorHora = importePorHora;
    }

    public void setRetencionImpuesto(double retencionImpuesto) {
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias) {
        return importePorHora * 8 * dias;
    }

    @Override
    public String toString() {
        return "EmpleadoContratado{" +
                "importePorHora=" + importePorHora +
                ", retencionImpuesto=" + retencionImpuesto +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}

