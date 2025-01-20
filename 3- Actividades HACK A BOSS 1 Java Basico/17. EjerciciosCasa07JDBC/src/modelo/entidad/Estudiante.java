package modelo.entidad;

public class Estudiante {
    private int id;
    private String nombre;
    private int edad;
    private double calificacion;

    // Constructores
    public Estudiante(int id, String nombre, int edad, double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", calificacion=" + calificacion +
                '}';
    }
}
