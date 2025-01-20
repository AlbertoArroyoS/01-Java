/*
Patrón de Diseño Singleton
Ejercicio Nº 2: Registro de eventos en un edificio
Vamos a considerar un escenario de una aplicación de registro de eventos en un sistema de monitoreo de sensores en un edificio.
Queremos garantizar que solo haya una instancia del registro de eventos para evitar duplicación y para que todos los eventos se registren en un único lugar.

 */

public class Main {

    public static void main(String[] args) {
        // Acceder al registro de eventos desde diferentes sensores
        EventLogger loggerSensor1 = EventLogger.getInstance();
        EventLogger loggerSensor2 = EventLogger.getInstance();

        // Ambas referencias deberían apuntar a la misma instancia
        System.out.println(loggerSensor1 == loggerSensor2); // Debería imprimir true

        // Registrar eventos desde diferentes sensores
        loggerSensor1.logEvent("Sensor 1 - Detección de movimiento");
        loggerSensor2.logEvent("Sensor 2 - Temperatura elevada");
    }

}