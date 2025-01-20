package modelo.entidad;

import java.util.*;

public class RegistroMascotas<T> {
    private List<Mascota<T>> registro;

    public RegistroMascotas() {
        this.registro = new ArrayList<>();
    }

    // Agregar mascota al registro
    public void agregarMascota(Mascota<T> mascota) {
        registro.add(mascota);
        System.out.println("Mascota agregada: " + mascota);
    }

    // Buscar mascotas por nombre
    public void buscarPorNombre(String nombre) {
        System.out.println("Buscando mascota(s) con el nombre: " + nombre);
        boolean encontrado = false;
        for (Mascota<T> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(mascota);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ninguna mascota con el nombre: " + nombre);
        }
    }

    // Buscar mascotas por especie
    public void buscarPorEspecie(String especie) {
        System.out.println("Buscando mascota(s) de la especie: " + especie);
        boolean encontrado = false;
        for (Mascota<T> mascota : registro) {
            if (mascota.getEspecie().equalsIgnoreCase(especie)) {
                System.out.println(mascota);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ninguna mascota de la especie: " + especie);
        }
    }

    // Contar la cantidad total de mascotas
    public int contarMascotas() {
        return registro.size();
    }

    // Generar datos aleatorios para agregar mascotas
    public void generarMascotasAleatorias(int cantidad) {
        Random rand = new Random();
        String[] nombres = {"Max", "Bella", "Luna", "Rocky", "Simba"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        for (int i = 0; i < cantidad; i++) {
            String nombreAleatorio = nombres[rand.nextInt(nombres.length)];
            int edadAleatoria = rand.nextInt(15) + 1; // Edad entre 1 y 15 años
            String especieAleatoria = especies[rand.nextInt(especies.length)];
            Mascota<String> mascota = new Mascota<>(nombreAleatorio, edadAleatoria, especieAleatoria, "Detalles específicos");
            agregarMascota((Mascota<T>) mascota);
        }
    }

    // Mostrar todas las mascotas
    public void mostrarRegistro() {
        System.out.println("Registro de mascotas:");
        for (Mascota<T> mascota : registro) {
            System.out.println(mascota);
        }
    }
}
