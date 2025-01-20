/*
Ejercio 2: Hilo con runnable
Igual que el ejercicio 1, pero en lugar de extender de Thread, implementar la interfaz Runnable.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {


        // Primera forma, creando el objeto Thread y pasando el Runnable como argumento
        Thread hilo1 = new Thread(new MiHiloRunnable("Hilo 1", 5));
        Thread hilo2 = new Thread(new MiHiloRunnable("Hilo 2", 10));

    /*
    //Segunda forma, creando Runnable y pasando a Thread
        Runnable miRunnable1 = new MiHilo("Hilo 1", 5);
        Runnable miRunnable2 = new MiHilo("Hilo 2", 10);

        Thread hilo1 = new Thread(miRunnable1);
        Thread hilo2 = new Thread(miRunnable2);
*/

        // Iniciar ambos hilos
        hilo1.start();
        //hilo1.join(); //si quieres que se ejecute el 1, termina y vuelve al principal


        hilo2.start();

        // Esperar a que ambos hilos finalicen
        hilo1.join();
        hilo2.join();
        System.out.println("Fin del hilo principal.");

    }
}