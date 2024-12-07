import modelo.entidad.Animal;
import modelo.entidad.Ave;
import modelo.entidad.Mamifero;
import modelo.entidad.Reptil;

public class Main {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero(1, "Tigre", 5, "Pelaje", "Carnívoro", 4, "Vivíparo", "Naranja con rayas", "Selva");
        Ave ave = new Ave(2, "Águila", 3, "Plumas", "Carnívoro", 2.5, "Planeador", "Marrón", "Curvado");
        Reptil reptil = new Reptil(3, "Cobra", 2, "Escamas", "Carnívoro", 1.8, "Lisas", "Neurotóxico", "Desierto");

        // Probar métodos
        Animal[] animales = {mamifero, ave, reptil};
        for (Animal animal : animales) {
            animal.saludar();
            System.out.println(animal);
        }

        Animal animal = mamifero;
        // Intentar acceder a un atributo exclusivo de Mamifero
        // animal.getNumeroPatas(); // Error: No es accesible desde una referencia de tipo Animal

        System.out.println("Animal: " +animal);
        animal.saludar();
    }
}