package observador.concreto;

import observador.Observer;

//4 Observador Concreto: Implementa la interfaz de observador para recibir notificaciones y realizar acciones específicas
public class Display implements Observer {
    private String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("DisplayNormal "+ name + " - Temperature: " + temperature +
                " Humidity: " + humidity + " Pressure: " + pressure);
    }
}

