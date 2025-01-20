public class MiHiloRunnable implements Runnable{

    private String nombre;
    private int cantidad;

    public MiHiloRunnable(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public MiHiloRunnable() {
    }

    @Override
    public void run() {
        for (int i = 0; i <= cantidad; i++) {
            System.out.println(nombre + " - Contador: " + i);
            try {
                // Pausa para simular un trabajo en el hilo
                Thread.sleep(500); // 500 milisegundos
            } catch (InterruptedException e) {
                System.out.println(nombre + " interrumpido.");
                break;
            }
        }
        System.out.println(nombre + " finalizó.");
    }
}
