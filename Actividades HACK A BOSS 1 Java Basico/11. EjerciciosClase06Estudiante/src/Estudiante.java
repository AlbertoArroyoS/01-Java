public class Estudiante {

    private int id;
    private String nombre;
    private double notas;

    public Estudiante(int id, String nombre, double notas) {
        this.id = id;
        this.nombre = nombre;
        this.notas = notas;
    }

    public Estudiante() {
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nota=" + notas +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
}
