package modelo.entidad;

import exception.FechaException;

public class Fecha {

    private int day;
    private int month;
    private int year;

    public Fecha() {
    }

    public Fecha(int day, int month, int year) throws FechaException {
        // Validar el rango del día
        if (day < 1 || day > 31) {
            throw new FechaException("El día debe estar entre 1 y 31. Día ingresado: " + day);
        }

        // Validar el rango del mes
        if (month < 1 || month > 12) {
            throw new FechaException("El mes debe estar entre 1 y 12. Mes ingresado: " + month);
        }

        // Asignar valores a los atributos si son válidos
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
