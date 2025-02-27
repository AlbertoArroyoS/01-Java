import java.util.*;
import java.util.stream.*;

//public class Vehiculo implements Comparable{
public class Vehiculo {

    private String marca;
    private String modelo;
    private double costo;

    public Vehiculo(String marca, String modelo, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", costo=" + costo +
                '}';
    }
    /*
    // compareTo para ordenar por marca
    @Override
    public int compareTo(Object o) {
        Vehiculo v = (Vehiculo) o;
        return marca.compareTo(v.getMarca());
    }
     */

}
