import java.util.Scanner;

/*
Ejercicio Nº 3 - Arreglos: Vectores - Individual
Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
calcule la temperatura máxima promedio que hubo.
Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado
por pantalla.
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Crear un vector para almacenar las temperaturas de la semana
        double[] temperaturas = new double[7];

        // Variable para acumular la suma de las temperaturas
        double suma = 0.0;

        // Pedir al usuario que ingrese las temperaturas
        System.out.println("Ingrese las temperaturas máximas de la última semana:");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Día %d: ", i + 1);
            temperaturas[i] = leer.nextDouble();
            suma += temperaturas[i]; // Sumar la temperatura ingresada
        }

        // Calcular el promedio
        double promedio = suma / temperaturas.length;

        // Mostrar el promedio de las temperaturas
        System.out.printf("La temperatura máxima promedio de la última semana es: %.2f°C%n", promedio);

        // Cerrar el Scanner
        leer.close();
    }
}
