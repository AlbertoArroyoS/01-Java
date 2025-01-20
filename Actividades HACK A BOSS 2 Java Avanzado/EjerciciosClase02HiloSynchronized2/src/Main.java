public class Main {
    public static void main(String[] args) {
        // Crear las instancias de los hilos con diferentes valores de "cantidad"
        MiHilo hilo1 = new MiHilo("Hilo 1", 5);
        MiHilo hilo2 = new MiHilo("Hilo 2", 10);

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();

        try {
            // Esperar a que ambos hilos terminen
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fin del hilo principal.");
    }
}