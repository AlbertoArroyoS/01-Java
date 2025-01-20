import java.util.Queue;

class Trabajador implements Runnable {
    private final int id;
    private final Queue<String> productosEnProceso;

    public Trabajador(int id, Queue<String> productosEnProceso) {
        this.id = id;
        this.productosEnProceso = productosEnProceso;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (productosEnProceso) {
                    if (productosEnProceso.isEmpty()) {
                        break; // Salir si no hay productos para procesar
                    }
                    String producto = productosEnProceso.poll(); // Sacamos un producto de la cola

                    // Realizar la tarea correspondiente (Control de calidad o embalaje)
                    System.out.println("Trabajador " + id + " procesando " + producto);
                    Thread.sleep((long) (Math.random() * 3000 + 1000)); // Simula el tiempo de procesamiento
                    System.out.println("Trabajador " + id + " terminó con " + producto);
                }
            }
        } catch (InterruptedException e) {
            System.err.println("Trabajador " + id + " fue interrumpido.");
        }
    }
}