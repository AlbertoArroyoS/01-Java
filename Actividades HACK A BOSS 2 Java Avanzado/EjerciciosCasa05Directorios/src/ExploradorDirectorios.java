import java.util.List;

class ExploradorDirectorios {

    // Método recursivo para explorar un directorio y mostrar su contenido
    public void explorarDirectorio(Directorio directorio, String indentacion) {
        // Mostrar el nombre del directorio
        System.out.println(indentacion + "Directorio: " + directorio.getNombre());

        // Mostrar los archivos en el directorio, recursivamente
        mostrarArchivos(directorio.getArchivos(), indentacion);

        // Llamada recursiva para explorar los subdirectorios, uno por uno
        explorarSubdirectorios(directorio.getSubdirectorios(), indentacion);
    }

    // Método recursivo para mostrar los archivos de un directorio
    private void mostrarArchivos(List<String> archivos, String indentacion) {
        if (archivos.isEmpty()) {
            return; // Si no hay archivos, termina la recursión
        }

        // Mostrar el primer archivo
        System.out.println(indentacion + "    Archivo: " + archivos.get(0));

        // Llamada recursiva para mostrar el siguiente archivo
        mostrarArchivos(archivos.subList(1, archivos.size()), indentacion);
    }

    // Método recursivo para explorar los subdirectorios de un directorio
    private void explorarSubdirectorios(List<Directorio> subdirectorios, String indentacion) {
        if (subdirectorios.isEmpty()) {
            return; // Caso base: si no hay más subdirectorios, termina la recursión
        }

        // Explorar el primer subdirectorio
        explorarDirectorio(subdirectorios.get(0), indentacion + "    ");

        // Llamada recursiva para explorar el siguiente subdirectorio
        explorarSubdirectorios(subdirectorios.subList(1, subdirectorios.size()), indentacion);
    }
}
