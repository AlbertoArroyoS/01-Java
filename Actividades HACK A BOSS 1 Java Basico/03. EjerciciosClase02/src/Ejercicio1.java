import java.util.Scanner;
/*
Crear un programa en Java que permita ingresar dos números enteros,
determine y muestre por pantalla cuál de los dos es mayor o si son iguales.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca el primer número entero: ");
        int numero1 = leer.nextInt();

        System.out.print("Introduzca el segundo número entero: ");
        int numero2 = leer.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número " + numero1 + " es mayor que el segundo número" + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El segundo número " + numero2 + " es mayor que el primer número" + numero1);
        } else {
            System.out.println("Los dos números son iguales");
        }

        leer.close();
    }
}
