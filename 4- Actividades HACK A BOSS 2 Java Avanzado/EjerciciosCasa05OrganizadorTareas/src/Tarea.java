import java.util.ArrayList;
import java.util.List;

class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }
}