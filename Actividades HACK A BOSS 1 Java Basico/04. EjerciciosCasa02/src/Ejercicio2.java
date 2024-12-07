import java.util.Scanner;

/*
Ejercicio Nº 2 - Estructuras Repetitivas - Individual
a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos
comprados por un cliente.
Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar.
Luego, muestra el total de la compra que debe abonar.
Pista: Recuerda que existen dos tipos de bucles, los controlados por un contador (cuando sabemos un número exacto de productos
por ejemplo) o por centinela (cuando no sabemos cuántos productos va a comprar el cliente).
En este caso debes aplicar un “centinela”. Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Variable para almacenar el precio del producto y el total de la compra
        double precio;
        double total = 0.0;
        boolean condicion = true;

        System.out.println("Ingrese el precio de los productos. Para finalizar, ingrese 0 o un número negativo.");

        // Bucle controlado por centinela
        while (condicion) {
            System.out.print("Ingrese el precio del producto: ");
            precio = leer.nextDouble();

            // Verificar si el precio es 0 o negativo
            if (precio <= 0) {
                condicion = false;
            }

            // Sumar el precio al total
            total += precio;
        }

        // Mostrar el total de la compra
        System.out.printf("El total de la compra es: %.2f€%n", total);

        leer.close();
    }
}
