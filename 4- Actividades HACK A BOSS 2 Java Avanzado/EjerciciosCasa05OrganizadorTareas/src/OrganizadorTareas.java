import java.util.List;
import java.util.Scanner;

class OrganizadorTareas {

    private Scanner scanner = new Scanner(System.in);

    // Método para agregar tareas y subtareas
    public Tarea agregarTareasRecursivamente() {
        System.out.print("Introduce el nombre de la tarea: ");
        String nombreTarea = scanner.nextLine().trim();
        Tarea tarea = new Tarea(nombreTarea);

        System.out.print("¿La tarea '" + nombreTarea + "' tiene subtareas? (0 No/1 Si): ");
        Integer respuesta = scanner.nextInt();
        scanner.nextLine();

        if (respuesta==1) {
            agregarSubtareasRecursivamente(tarea);
        }

        return tarea;
    }

    // Recursividad para agregar subtareas
    private void agregarSubtareasRecursivamente(Tarea tarea) {
        while (true) {
            System.out.print("Introduce el nombre de la subtarea: ");
            String nombreSubtarea = scanner.nextLine().trim();
            Tarea subtarea = new Tarea(nombreSubtarea);
            tarea.agregarSubtarea(subtarea);

            System.out.print("¿La subtarea '" + nombreSubtarea + "' tiene más subtareas? (0 No/1 Si): ");
            Integer respuesta = scanner.nextInt();
            scanner.nextLine();

            if (respuesta==1) {
                agregarSubtareasRecursivamente(subtarea);
            }else{
                break;
            }
        }
    }

    // Método para mostrar las tareas
    public void mostrarTareas(String nombreProyecto, Tarea tarea) {
        System.out.println("Proyecto: " + nombreProyecto);
        mostrarTareasRecursivamente(tarea, "    ");
    }

    // Recursividad para mostrar subtareas
    private void mostrarTareasRecursivamente(Tarea tarea, String indentacion) {
        System.out.println(indentacion + "|-- Tarea Principal: " + tarea.getNombre());
        mostrarSubtareasRecursivamente(tarea.getSubtareas(), indentacion + "    ");
    }

    private void mostrarSubtareasRecursivamente(List<Tarea> subtareas, String indentacion) {
        for (Tarea subtarea : subtareas) {
            System.out.println(indentacion + "|-- Subtarea: " + subtarea.getNombre());
            mostrarSubtareasRecursivamente(subtarea.getSubtareas(), indentacion + "    ");
        }
    }
}