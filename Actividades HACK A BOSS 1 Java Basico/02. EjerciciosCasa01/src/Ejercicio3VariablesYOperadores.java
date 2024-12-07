import java.util.Scanner;

public class Ejercicio3VariablesYOperadores {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca base:");
        double base = leer.nextDouble();
        System.out.println("Introduzca altura:");
        double altura = leer.nextDouble();

        double areaTriangulo = (base*altura)/2;

        System.out.println("El área del triangulo es: " +areaTriangulo);
    }
}
