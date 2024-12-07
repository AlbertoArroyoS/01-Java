import java.util.Scanner;
/*
Ejercicio Nº 3 - Operaciones de Lectura, Variables y Operadores
Escribir un programa que pida al usuario que ingrese por teclado: 5 números enteros.
Luego mostrar por pantalla/consola lo siguiente: La suma total de los números ingresados y el promedio de estos.
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca numero 1: ");
        int numero1 = leer.nextInt();
        System.out.println("Introduzca numero 2: ");
        int numero2 = leer.nextInt();
        System.out.println("Introduzca numero 3: ");
        int numero3 = leer.nextInt();
        System.out.println("Introduzca numero 4: ");
        int numero4 = leer.nextInt();
        System.out.println("Introduzca numero 5: ");
        int numero5 = leer.nextInt();

        int suma = numero1+numero2+numero3+numero4+numero5;
        System.out.println("La suma total es :  " + suma);

        double promedio = (double) suma/5;
        System.out.println("El promedio es :  " + promedio);


    }
}
