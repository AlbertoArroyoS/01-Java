package modelo.entidad;

public class Gato extends Animal{

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void maullar (){
        System.out.println(nombre + " está maullando.");
    }

    @Override
    public void comer(){
        System.out.println(nombre + " está comiendo pescado.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miauuuuuu");
    }


}
