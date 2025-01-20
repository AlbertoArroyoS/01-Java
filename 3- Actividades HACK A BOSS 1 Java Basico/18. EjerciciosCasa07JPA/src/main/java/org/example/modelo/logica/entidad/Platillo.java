package org.example.modelo.logica.entidad;

import javax.persistence.*;

@Entity
@Table(name = "platillo")
public class Platillo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(length = 500)
    private String receta;

    @Column(nullable = false)
    private double precio;

    // Constructores
    public Platillo() {}

    public Platillo(String nombre, String receta, double precio) {
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
    }

    // Getters y setters


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

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Platillo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", receta='" + receta + '\'' +
                ", precio=" + precio +
                '}';
    }
}