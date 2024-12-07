import modelo.entidad.Persona;

public class Ejercicio2Poo {

    public static void main(String[] args) {

        //a)
        Persona[] personas = new Persona[5];

        personas[0] = new Persona(1, "Goku", 42, "Calle 1", "655 555 555");
        personas[1] = new Persona(2, "Vegeta", 45, "Calle 2", "677 777 777");
        personas[2] = new Persona(3, "Gohan", 22, "Calle 3", "688 888 888");
        personas[3] = new Persona(4, "Piccolo", 30, "Calle 4", "699 999 999");
        personas[4] = new Persona(5, "Bulma", 44, "Calle 5", "700 000 000");

        //b)
        System.out.println("Datos del array");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

        //c)
        System.out.println("Antes del cambio:");
        System.out.println("Persona 4: " + personas[3].getNombre());
        System.out.println("Persona 5: " + personas[4].getNombre());

        personas[3].setNombre("Trunks");
        personas[4].setNombre("Krilin");

        // Mostrar después del cambio
        System.out.println("\nDespués del cambio:");
        System.out.println("Persona 4: " + personas[3].getNombre());
        System.out.println("Persona 5: " + personas[4].getNombre());

        //d)
        System.out.println("\nPersonas mayores de 30 años:");
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
        }
    }
}
