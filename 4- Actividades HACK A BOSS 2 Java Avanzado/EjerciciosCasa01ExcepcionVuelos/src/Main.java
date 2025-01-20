import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear un vuelo de ejemplo
        Vuelo vuelo = new Vuelo("Madrid", "2024-12-25", 10);

        try {
            System.out.println("Bienvenido al sistema de reservas de vuelos.");
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la cantidad de asientos a reservar: ");
            int cantidadAsientos = scanner.nextInt();

            realizarReserva(vuelo, nombre, cantidadAsientos);

            System.out.println("Asientos restantes en el vuelo: " + vuelo.getAsientosDisponibles());
        } catch (ReservaInvalidaException e) {
            System.err.println("Error en la reserva: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void realizarReserva(Vuelo vuelo, String nombre, int cantidadAsientos) throws ReservaInvalidaException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new ReservaInvalidaException("El nombre del pasajero no puede estar vacío.");
        }
        if (cantidadAsientos <= 0) {
            throw new ReservaInvalidaException("La cantidad de asientos debe ser mayor que cero.");
        }
        vuelo.reservarAsientos(cantidadAsientos);
        System.out.println("Reserva realizada con éxito para " + nombre + ". Asientos reservados: " + cantidadAsientos);
    }
}