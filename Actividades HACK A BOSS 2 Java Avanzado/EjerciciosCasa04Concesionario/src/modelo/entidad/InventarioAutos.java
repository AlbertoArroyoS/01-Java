package modelo.entidad;

import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {
    private List<T> autos;

    public InventarioAutos() {
        this.autos = new ArrayList<>();
    }

    // Agregar autos al inventario
    public void agregarAuto(T auto) {
        autos.add(auto);
        System.out.println("Auto agregado: " + auto);
    }

    // Buscar autos por marca
    public void buscarPorMarca(String marca) {
        System.out.println("Autos de la marca: " + marca);
        boolean encontrado = false;
        for (T auto : autos) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(auto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron autos de esta marca.");
        }
    }

    // Buscar autos por año
    public void buscarPorAño(int año) {
        System.out.println("Autos del año: " + año);
        boolean encontrado = false;
        for (T auto : autos) {
            if (auto.getAño() == año) {
                System.out.println(auto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron autos de este año.");
        }
    }

    // Calcular el valor total del inventario
    public double calcularValorTotal() {
        double total = 0;
        for (T auto : autos) {
            total += auto.getPrecio();
        }
        return total;
    }
}
