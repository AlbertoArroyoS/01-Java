package modelo.entidad;

import modelo.interfaz.Electrico;

import java.time.Year;

public class Auto extends Vehiculo implements Electrico {
    private int capacidadBateria; // en mAh
    private int autonomia; // en horas

    public Auto(int id, String placa, String marca, String modelo, int anio, double costo,
                int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public int calcularAntiguedad() {
        return Year.now().getValue() - this.anio;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Cargando la batería del coche eléctrico...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad Batería: " + capacidadBateria + "mAh, Autonomía: " + autonomia + " horas";
    }
}