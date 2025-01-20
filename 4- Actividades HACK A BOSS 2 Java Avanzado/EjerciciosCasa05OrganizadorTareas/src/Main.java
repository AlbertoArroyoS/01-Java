import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrganizadorTareas organizador = new OrganizadorTareas();

        // Pidiendo el nombre del proyecto
        System.out.print("Introduce el nombre del proyecto: ");
        String nombreProyecto = scanner.nextLine();

        // Agregar tareas y subtareas
        System.out.println("Comienza a agregar las tareas para el proyecto: " + nombreProyecto);
        Tarea tareaPrincipal = organizador.agregarTareasRecursivamente();

        // Mostrar estructura de tareas
        System.out.println("\nEstructura de tareas:");
        organizador.mostrarTareas(nombreProyecto, tareaPrincipal);
    }
}