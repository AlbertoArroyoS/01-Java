import java.util.Scanner;

public class Ejercicio1SintaxisBasica {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca nombre:");
        String nombre = leer.nextLine();
        System.out.println("Hola "+ nombre +", bienvenido al sistema ");

    }
}
