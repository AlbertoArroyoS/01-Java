import java.util.Scanner;

public class Main {

    private static final int TAMANO_VECTOR = 10; // Tamaño fijo del vector
    private static int[] vector = new int[TAMANO_VECTOR]; // Vector para almacenar datos
    private static int contador = 0; // Contador para rastrear el número de elementos almacenados

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nGestión de Datos:");
                System.out.println("1. Agregar dato al vector");
                System.out.println("2. Acceder a un dato del vector");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el dato a almacenar: ");
                        int dato = scanner.nextInt();
                        agregarDato(dato);
                        break;

                    case 2:
                        System.out.print("Ingrese el índice del dato que desea acceder: ");
                        int indice = scanner.nextInt();
                        accederDato(indice);
                        break;

                    case 3:
                        System.out.println("Saliendo del sistema...");
                        return;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Método para agregar un dato al vector
    public static void agregarDato(int dato) {
        if (contador < TAMANO_VECTOR) {
            vector[contador] = dato;
            System.out.println("Dato agregado correctamente en la posición " + contador);
            contador++;
        } else {
            System.out.println("Error: El vector está lleno. No se pueden agregar más datos.");
        }
    }

    // Método para acceder a un dato del vector
    public static void accederDato(int indice) {
        try {
            int dato = vector[indice];
            System.out.println("El dato en la posición " + indice + " es: " + dato);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Índice fuera de rango. No se puede acceder a la posición " + indice + ".");
        }
    }
}
