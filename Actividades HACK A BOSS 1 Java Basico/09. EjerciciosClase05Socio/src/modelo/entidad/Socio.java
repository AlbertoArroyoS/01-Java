package modelo.entidad;

import java.util.Objects;

public class Socio {

    protected int numeroSocio;
    protected String nombre;
    protected double cuotaMensual;
    protected String actividad;

    public Socio(int numeroSocio, String nombre, double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public double costoMensual() {
        return this.cuotaMensual;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "numeroSocio=" + numeroSocio +
                ", nombre='" + nombre + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", actividad='" + actividad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return numeroSocio == socio.numeroSocio && Double.compare(cuotaMensual, socio.cuotaMensual) == 0 && Objects.equals(nombre, socio.nombre) && Objects.equals(actividad, socio.actividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroSocio, nombre, cuotaMensual, actividad);
    }
}
