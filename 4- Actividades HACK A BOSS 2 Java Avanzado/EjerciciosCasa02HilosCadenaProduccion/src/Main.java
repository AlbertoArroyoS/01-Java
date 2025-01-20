import java.util.LinkedList;
import java.util.Queue;
/*
Ejercicio Nº 2 - Simulación de cadena de producción


Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar tareas concurrentemente.


Cada trabajador se representa como un hilo independiente.


Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.


Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.


Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación entre las tareas.
 */
public class Main {

    public static void main(String[] args) {
        // Crear una cola compartida para los productos en la cadena de producción
        Queue<String> productosEnProceso = new LinkedList<>();

        // Crear y arrancar los trabajadores (hilos)
        int numTrabajadores = 3;
        for (int i = 1; i <= numTrabajadores; i++) {
            new Thread(new Trabajador(i, productosEnProceso)).start();
        }

        // Simular el ensamblaje de productos por un trabajador inicial
        new Thread(new Ensamblador(productosEnProceso)).start();
    }
}