import java.util.Scanner;
/*
Ejercicio Nº 7 - Arreglos: Vectores
Realizar lo mismo que en el ejercicio 4, pero utilizando un vector para guardar los números ingresados.
Una vez almacenados los números, deberá recorrer el vector, realizar la suma y luego mostrar por pantalla.
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int contador = 0;
        int numero;
        int[] numeros = new int[8];

        //Almacenar en el array
        /*
        while (contador < 8) {
            System.out.print("Ingrese el número " + (contador+1) + ": ");
            numero = leer.nextInt();
            numeros[contador] = numero; // Almacenamos el número en el vector
            contador++; // Incrementamos el contador (índice del vector)
        }*/

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numero = leer.nextInt();
            numeros[i] = numero; // Almacenamos el número en la posición i del vector
        }

        //Recorrer el array
        System.out.println("Datos del vector");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("|Posicion:"+i+" Valor:"+ numeros[i]+"|");
            suma += numeros[i];
        }

        System.out.println("\nLa suma de los números introducidos es: " + suma);

        leer.close();

    }
}
