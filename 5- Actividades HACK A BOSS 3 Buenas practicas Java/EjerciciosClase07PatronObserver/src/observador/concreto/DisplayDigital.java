package observador.concreto;

import observador.Observer;

//5 Observador Concreto: Implementa la interfaz de observador para recibir notificaciones y realizar acciones específicas
public class DisplayDigital implements Observer {
    private String name;

    public DisplayDigital (String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("DisplayDigital "+ name + " - Temperature: " + temperature +
                " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
