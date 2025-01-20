class MiHilo extends Thread {
    private String nombre;
    private int cantidad;

    // Constructor para inicializar los atributos
    public MiHilo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Método sincronizado para imprimir el nombre y contador de forma segura
    public synchronized void mostrarMensaje(int contador) {
        System.out.println(nombre + " - Contador: " + contador);
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidad; i++) {
            mostrarMensaje(i); // Llamamos al método sincronizado para mostrar el mensaje
            try {
                Thread.sleep(1); // Simulamos un pequeño retraso para observar el comportamiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
