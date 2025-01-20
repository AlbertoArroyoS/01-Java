import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Ejercicio Nº 1 - Simulación de un centro de atención al cliente


Crea una simulación de un centro de atención al cliente en la que varios agentes de soporte pueden atender llamadas telefónicas concurrentemente.


Cada agente se representa como un hilo independiente.


Los agentes deben recibir llamadas de clientes, resolver consultas y registrar información sobre cada llamada. Utiliza hilos para simular la atención concurrente de múltiples llamadas y garantizar que los agentes puedan manejarlas de manera eficiente.


Asegúrate de controlar la concurrencia para evitar conflictos en la asignación de llamadas a los agentes.
 */
public class Main {
    public static void main(String[] args) {
        // Lista sincronizada para llamadas
        List<String> llamadas = Collections.synchronizedList(new ArrayList<>());

        // Llenar la lista con llamadas simuladas
        for (int i = 1; i <= 20; i++) {
            llamadas.add("Llamada #" + i);
        }

        // Crear y arrancar 5 agentes (hilos)
        int numAgentes = 5;
        for (int i = 1; i <= numAgentes; i++) {
            new Thread(new Agente(i, llamadas)).start();
        }
    }
}