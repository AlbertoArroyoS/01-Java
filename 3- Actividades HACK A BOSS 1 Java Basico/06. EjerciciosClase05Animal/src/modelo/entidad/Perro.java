package modelo.entidad;

public class Perro extends Animal{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    public void ladrar (){
        System.out.println(nombre + " está ladrando.");
    }

    @Override
    public void comer(){
        System.out.println(nombre + " está comiendo jamón.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guauu Guauu");
    }

}
