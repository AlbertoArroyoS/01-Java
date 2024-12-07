import modelo.entidad.Animal;
import modelo.entidad.Gato;
import modelo.entidad.Perro;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio0 {
    public static void main(String[] args) {

        Perro miPerro = new Perro("Perro1", 15);
        Gato miGato = new Gato("Gato1",5);
        Animal miAnimal = new Animal("Animal1", 8 );

        miPerro.comer();
        miPerro.ladrar();
        miPerro.emitirSonido();

        miGato.comer();
        miGato.maullar();
        miGato.emitirSonido();

        miAnimal.comer();
        miAnimal.emitirSonido();

        System.out.println("\n*******Array de animales*******\n");
        // Crear un array de tipo Animal
        Animal[] animales = {miPerro, miGato, miAnimal};

        // Recorrer el array y llamar a métodos
        for (Animal animal : animales) {
            System.out.print("Nombre: "+animal.getNombre()+", ");
            System.out.print("Edad: "+ animal.getEdad()+ ", ");
            animal.comer();
            animal.emitirSonido();
            System.out.println();
        }

        //Lista de animales y que me saque los que son de cada tipo
        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(miPerro);
        listaAnimales.add(miGato);
        listaAnimales.add(miAnimal);

        // Identificar tipos instanceof
        System.out.println("*****Identificar tipos de animales *********");
        for (Animal animal : listaAnimales) {
            if (animal instanceof Perro) {
                System.out.println(animal.getNombre() + " es un Perro.");
            } else if (animal instanceof Gato) {
                System.out.println(animal.getNombre() + " es un Gato.");
            } else if (animal instanceof Animal) {
                System.out.println(animal.getNombre() + " es un Animal genérico.");
            }
        }

    }
}