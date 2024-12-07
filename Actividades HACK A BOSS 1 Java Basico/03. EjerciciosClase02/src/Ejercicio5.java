import java.util.Scanner;
/*
Crear un programa en Java que permita ingresar una serie de notas de un alumno (valor entero).
Utiliza una estructura repetitiva para continuar pidiendo notas hasta que el usuario decida finalizar.
Luego, muestra el promedio de las notas ingresadas.
Pista: Recuerda que existen dos tipos de bucles, los controlados por un contador (cuando sabemos un número exacto de notas, por ejemplo)
o por centinela (cuando no sabemos cuántos notas va a ingresar el usuario). En este caso debes aplicar un “centinela”.
Un ejemplo podría ser, si se ingresa un número negativo o un cero.
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int sumaNotas = 0;
        int contadorNotas = 0;
        int nota;

        // Ingreso de notas con centinela (valor 0 o negativo termina la entrada)
        do {
            System.out.print("Ingrese una nota (valor entero) o 0/negativo para finalizar: ");
            nota = leer.nextInt();

            if (nota > 0) { // Solo se suman las notas positivas
                sumaNotas += nota;
                contadorNotas++;
            }

        } while (nota > 0);

        // Calcular el promedio si se ingresaron notas
        if (contadorNotas > 0) {
            double promedio = (double) sumaNotas / contadorNotas;
            System.out.println("El promedio de las notas ingresadas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }

        // Cerrar el scanner
        leer.close();
    }
}
