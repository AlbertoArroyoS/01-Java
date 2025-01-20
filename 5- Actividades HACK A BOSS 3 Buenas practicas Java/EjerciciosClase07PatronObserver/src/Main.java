import observador.Observer;
import observador.concreto.Display;
import observador.concreto.DisplayDigital;
import sujeto.concreto.WeatherStation;

//6 Cliente: Utiliza el patrón Observer
public class Main {
    public static void main(String[] args) {
        // Se crea el sujeto (WeatherStation)
        WeatherStation weatherStation = new WeatherStation();

        // Se crean dos displays como observadores
        Observer display1 = new Display("Display1");
        Observer display2 = new Display("Display2");
        Observer display3 = new DisplayDigital("Display3");

        // Se añaden los observadores al sujeto (WeatherStation)
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);
        weatherStation.addObserver(display3);

        // Se actualizan los datos meteorológicos, lo que notificará a los observadores
        weatherStation.setWeatherData(25.0f, 60.0f, 1012.0f);

        weatherStation.setWeatherData(29.0f, 65.0f, 1020.0f);

        weatherStation.setWeatherData(30.0f, 69.0f, 1030.0f);
    }

}