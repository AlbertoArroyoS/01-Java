package modelo.entidad;

import java.time.Year;

public abstract class Vehiculo {

    protected int id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double costo;

    public Vehiculo(int id, String placa, String marca, String modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    public abstract int calcularAntiguedad();

    @Override
    public String toString() {
        return "ID: " + id + ", Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo +
                ", Año: " + anio + ", Costo: $" + costo;
    }
}
