import observador.concreto.Oferente;
import observador.concreto.Subasta;

public class Main {
    public static void main(String[] args) {

        // Crear una subasta con monto inicial
        Subasta subasta1 = new Subasta(500);
        System.out.println("Inicia la Subasta con el monto inicial: $" + subasta1.getMontoEnPesos());

        // Crear oferentes con nombres y montos tope
        Oferente oferente1 = new Oferente("Alberto", 1000);
        subasta1.agregar(oferente1);
        Oferente oferente2 = new Oferente("Erika", 600);
        subasta1.agregar(oferente2);
        Oferente oferente3 = new Oferente("Isabel", 800);
        subasta1.agregar(oferente3);

        // Ejecutar la subasta (proceso automático de notificación y actualización)
        System.out.println("\n--- Comienza la subasta ---");
        subasta1.ejecutar();

    }
}