import java.util.ArrayList;
import java.util.List;

class Directorio {
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    // Constructor para inicializar el nombre, lista de subdirectorios y lista de archivos
    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    // Método para agregar un subdirectorio
    public void agregarSubdirectorio(Directorio subdirectorio) {
        subdirectorios.add(subdirectorio);
    }

    // Método para agregar un archivo
    public void agregarArchivo(String archivo) {
        archivos.add(archivo);
    }

    // Método para obtener el nombre del directorio
    public String getNombre() {
        return nombre;
    }

    // Método para obtener los subdirectorios
    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    // Método para obtener los archivos
    public List<String> getArchivos() {
        return archivos;
    }
}
