/*
Ejercicio Nº 1: Hilo con Thread
Crear una clase hilo herando de Thread con los atributos: nombre y cantidad. Sobreescribir el método run() colocando un bucle for de 0 hasta el atributo cantidad, mostrando un mensaje: nombre concatenado con el contador del for.
En el método main, crear 2 hilos con el nombre “Hilo 1” e “Hilo 2” con distintos valores de cantidad, luego iniciar ambos hilos y observar su comportamiento.

 */

public class Main {

    public static void main(String[] args) {

        MiHilo hilo1 = new MiHilo("Hilo 1", 5);
        MiHilo hilo2 = new MiHilo("Hilo 2", 10);

        // Iniciar ambos hilos
        hilo1.start();
        //hilo1.join(); //si quieres que se ejecute el 1, termina y vuelve al principal


        hilo2.start();

        // Esperar a que ambos hilos finalicen
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fin del hilo principal.");


    }
}