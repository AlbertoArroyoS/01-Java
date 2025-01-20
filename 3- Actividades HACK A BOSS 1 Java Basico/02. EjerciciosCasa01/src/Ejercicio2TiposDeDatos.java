import java.util.Scanner;

public class Ejercicio2TiposDeDatos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroEntero;
        double numeroDecimal;
        boolean condicion;
        String cadena;

        /*
        //ERROR java: incompatible types, cannot be converted to java.lang. Tipo de dato
        No error cuando un double es entero

        int numeroEntero = 1 ;
        double numeroDecimal = 2.5;
        boolean condicion = true;
        String cadena = " ";
         */

        //Error Exception in thread "main" java.util.InputMismatchException

        // Pedir un número entero
        while (true) {
            try {
                System.out.println("Introduzca un numero entero:");
                numeroEntero = leer.nextInt();
                leer.nextLine();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println(e);
                System.out.println("Error: Debe introducir un número entero. Inténtelo de nuevo.");
                leer.nextLine();
            }
        }

        // Pedir un número decimal
        while (true) {
            try {
                System.out.println("Introduzca un numero decimal:(n,nn)");
                numeroDecimal = leer.nextDouble();
                leer.nextLine();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println(e);
                System.out.println("Error: Debe introducir un número decimal. Inténtelo de nuevo.");
                leer.nextLine();
            }
        }

        // Pedir un valor booleano
        while (true) {
            try {
                System.out.println("Introduzca un valor booleano (true/false):");
                condicion = leer.nextBoolean();
                leer.nextLine();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println(e);
                System.out.println("Error: Debe introducir un valor booleano (true/false). Inténtelo de nuevo.");
                leer.nextLine();
            }
        }

        // Pedir una cadena de texto
        System.out.println("Introduzca una cadena de texto:");
        cadena = leer.nextLine();

        // Mostrar los valores introducidos
        System.out.println("El valor del numero entero es: " + numeroEntero);
        System.out.println("El valor del numero decimal es: " + numeroDecimal);
        System.out.println("El valor del booleano es: " + condicion);
        System.out.println("El valor de la cadena es: " + cadena);


    }
}
