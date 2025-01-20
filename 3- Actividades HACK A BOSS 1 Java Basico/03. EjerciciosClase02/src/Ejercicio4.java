import java.util.Scanner;
/*
Ejercicio Nº 4 - Estructuras Repetitivas
Crear un programa en Java que permita ingresar 8 números (valor entero). Utilizar la estructura repetitiva “while”.
Luego debe mostrar la suma de los números ingresados.
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int contador = 1; // Empezamos el contador en 1
        int numero;

        while (contador <= 8) {
            System.out.print("Ingrese el número " + contador + ": ");
            numero = leer.nextInt();
            suma += numero;  // acumular las sumas
            contador++;  // Incrementar el contador
        }

        System.out.println("La suma de los números introducidos es: " + suma);

        leer.close();

    }
}
