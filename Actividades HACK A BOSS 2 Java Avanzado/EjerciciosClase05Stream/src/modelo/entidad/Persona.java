package modelo.entidad;

import java.util.Objects;

public class Persona implements Comparable{
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Ejercicio3{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    // Cuando uso .sorted() en el stream, se usa el compareTo para ordenar segun el criterio
    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        return nombre.compareTo(p.getNombre());
    }

}
