package modelo.entidad;

import modelo.interfaz.Combustion;

import java.time.Year;

public class Camioneta extends Vehiculo implements Combustion {

    private double capacidadTanque; // en litros
    private double consumoCombustible; // litros por km

    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo,
                     double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public int calcularAntiguedad() {
        return Year.now().getValue() - this.anio;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la camioneta...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad Tanque: " + capacidadTanque + "L, Consumo: " + consumoCombustible + "L/km";
    }
}

