import java.util.Scanner;
/*
Ejercicio Nº 2 - Operaciones de Lectura
Escribir un programa que pida al usuario que ingrese por teclado: nombre, apellido y edad.
Luego mostrar por pantalla/consola en un SOLO mensaje, de la siguiente forma:

Su nombre y apellido es: XXXXX  XXXXX y tiene XX años.
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca su edad: ");
        int edad = leer.nextInt();
        leer.nextLine(); // *** Limpiar el Scanner despues de pedir el entero

        System.out.println("Introduzca su nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Introduzca sus apellidos: ");
        String apellidos = leer.nextLine();
        //System.out.println("Introduzca su edad: ");
        //int edad = leer.nextInt();

        System.out.println("Su nombre y apellidos es " + nombre + " " + apellidos + " y tiene " + edad+ " años");



    }
}
