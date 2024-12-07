package modelo.entidad;

import modelo.interfaz.Combustion;

import java.time.Year;

public class Moto extends Vehiculo implements Combustion {
    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int anio, double costo,
                int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public int calcularAntiguedad() {
        return Year.now().getValue() - this.anio;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la moto...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada + "cc, Tipo Motor: " + tipoMotor;
    }
}
