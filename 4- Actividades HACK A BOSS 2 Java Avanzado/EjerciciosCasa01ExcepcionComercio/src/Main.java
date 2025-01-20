import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Producto> inventario = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nGestión de Inventarios:");
                System.out.println("1. Agregar producto");
                System.out.println("2. Mostrar inventario");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Ingrese el precio del producto: ");
                        double precio = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Ingrese la cantidad del producto: ");
                        int cantidad = scanner.nextInt();

                        agregarProducto(nombre, precio, cantidad);
                        break;

                    case 2:
                        mostrarInventario();
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

    public static void agregarProducto(String nombre, double precio, int cantidad) {
        try {
            Producto producto = new Producto(nombre, precio, cantidad);
            inventario.add(producto);
            System.out.println("Producto agregado exitosamente: " + producto);
        } catch (InventarioInvalidoException e) {
            System.err.println("Error al agregar el producto: " + e.getMessage());
        }
    }

    public static void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario actual:");
            for (Producto producto : inventario) {
                System.out.println(producto);
            }
        }
    }
}