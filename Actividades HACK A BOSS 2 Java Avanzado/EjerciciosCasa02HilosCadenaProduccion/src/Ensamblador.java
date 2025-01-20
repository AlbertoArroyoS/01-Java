import java.util.Queue;

class Ensamblador implements Runnable {
    private final Queue<String> productosEnProceso;

    public Ensamblador(Queue<String> productosEnProceso) {
        this.productosEnProceso = productosEnProceso;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                String producto = "Producto #" + i;
                synchronized (productosEnProceso) {
                    productosEnProceso.offer(producto); // Añadir un nuevo producto a la cola
                    System.out.println("Ensamblador produjo " + producto);
                }
                Thread.sleep((long) (Math.random() * 3000 + 1000)); // Simula el tiempo de ensamblaje
            }
        } catch (InterruptedException e) {
            System.err.println("Ensamblador fue interrumpido.");
        }
    }
}