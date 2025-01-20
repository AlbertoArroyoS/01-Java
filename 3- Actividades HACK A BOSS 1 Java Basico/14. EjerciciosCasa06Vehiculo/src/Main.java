import modelo.entidad.Auto;
import modelo.entidad.Camioneta;
import modelo.entidad.Moto;
import modelo.entidad.Vehiculo;
import modelo.interfaz.Combustion;
import modelo.interfaz.Electrico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear lista de vehículos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Crear instancias de vehículos
        vehiculos.add(new Auto(1, "ABC123", "Tesla", "Model 3", 2020, 50000, 75000, 10));
        vehiculos.add(new Camioneta(2, "DEF456", "Ford", "Ranger", 2018, 30000, 80, 0.12));
        vehiculos.add(new Moto(3, "GHI789", "Yamaha", "R3", 2021, 6000, 321, "Gasolina"));

        // Recorrer y mostrar información de cada vehículo

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años");

            // Llamar a métodos específicos según el tipo haciendo casting del vehiculo generico a especifico
            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            }
            if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }

            System.out.println();
        }
    }
}
