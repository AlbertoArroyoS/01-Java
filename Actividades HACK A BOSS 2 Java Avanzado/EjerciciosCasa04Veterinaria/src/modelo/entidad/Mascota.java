package modelo.entidad;

public class Mascota<T> {

    private static int contador = 1; // Contador para generar ID único
    private int id;
    private String nombre;
    private int edad;
    private String especie;
    private T detallesEspecificos; // Puede ser un tipo específico como "Perro", "Gato", etc.

    public Mascota(String nombre, int edad, String especie, T detallesEspecificos) {
        this.id = contador++;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.detallesEspecificos = detallesEspecificos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public T getDetallesEspecificos() {
        return detallesEspecificos;
    }

    public void setDetallesEspecificos(T detallesEspecificos) {
        this.detallesEspecificos = detallesEspecificos;
    }

    @Override
    public String toString() {
        return "Mascota[ID=" + id + ", Nombre=" + nombre + ", Edad=" + edad + ", Especie=" + especie + "]";
    }
}
