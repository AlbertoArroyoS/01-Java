import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        System.out.println("Introduzca peso en kg: ");
        double peso = leer.nextDouble();

        System.out.println("Introduzca altura en cm: ");
        int altura = leer.nextInt();

        double alturaEnMetros = altura / 100.0; //Pasamos la altura en metros
        double imc = peso / (alturaEnMetros * alturaEnMetros);

        // Mostramos el resultado
        System.out.println("El IMC es: " + imc);
        System.out.printf("El IMC redondeado con 2 decimales es: %.2f%n", imc);

    }
}
