package implementaciones;

import interfaces.Chair;
// Implementaciones concretas de silla
public class ClassicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentándose en una silla clásica");
    }
}
