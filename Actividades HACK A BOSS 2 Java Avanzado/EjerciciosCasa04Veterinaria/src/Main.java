/*
Ejercicio 2: Veterinaria
Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se solicita la definición de una clase genérica Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o id de mascota para identificar a cada una). Crea una clase utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:


Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).


Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.


Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util para obtener el tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.


Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util para generar datos aleatorios, como nombres, edades o especies, para agregar mascotas al registro.
 */

import modelo.entidad.Mascota;
import modelo.entidad.RegistroMascotas;

public class Main {
    public static void main(String[] args) {

        // Crear registro de mascotas
        RegistroMascotas<String> registro = new RegistroMascotas<>();

        // Crear algunas mascotas
        Mascota<String> mascota1 = new Mascota<>("Max", 3, "Perro", "Golden Retriever");
        Mascota<String> mascota2 = new Mascota<>("Bella", 2, "Gato", "Siamés");
        Mascota<String> mascota3 = new Mascota<>("Luna", 5, "Perro", "Pastor Alemán");

        // Agregar mascotas al registro
        registro.agregarMascota(mascota1);
        registro.agregarMascota(mascota2);
        registro.agregarMascota(mascota3);

        // Mostrar registro
        registro.mostrarRegistro();

        // Buscar mascotas por nombre
        registro.buscarPorNombre("Max");
        registro.buscarPorNombre("Rocky");

        // Buscar mascotas por especie
        registro.buscarPorEspecie("Perro");
        registro.buscarPorEspecie("Gato");

        // Contar la cantidad total de mascotas
        System.out.println("Cantidad total de mascotas registradas: " + registro.contarMascotas());

        // Generar 5 mascotas aleatorias
        registro.generarMascotasAleatorias(5);

        // Mostrar registro actualizado
        registro.mostrarRegistro();
    }
}