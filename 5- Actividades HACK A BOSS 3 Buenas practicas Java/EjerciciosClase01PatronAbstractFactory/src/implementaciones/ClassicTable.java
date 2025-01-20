package implementaciones;

import interfaces.Table;
// Implementaciones concretas de mesa
public class ClassicTable implements Table {

    @Override
    public void putOn() {
        System.out.println("Colocando objetos en una mesa clásica");
    }
}
