public class EjemploSynchronized {
    private int contador = 0;

    // Método sincronizado
    public synchronized void incrementar() {
        contador++;
    }

    public synchronized int obtenerContador() {
        return contador;
    }

}
