package observador.concreto;

import observador.Observable;
import observador.Observador;

import java.util.ArrayList;
import java.util.List;

public class Subasta implements Observable {

    private double montoEnPesos;
    private List<Observador> observadores;

    public Subasta(double montoInicial) {
        this.montoEnPesos = montoInicial;
        this.observadores = new ArrayList<>();
    }

    public void setMontoEnPesos(double montoEnPesos) {
        this.montoEnPesos = montoEnPesos;
        notificarATodos(); // Cada vez que cambia el monto, se notifica a los oferentes
    }

    public double getMontoEnPesos() {
        return montoEnPesos;
    }

    @Override
    public void agregar(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminar(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarATodos() {
        for (Observador o : observadores) {
            o.actualizar(this);
        }
    }

    public void ejecutar() {
        double ofertaAnterior = 0;
        while(ofertaAnterior != montoEnPesos) {
            ofertaAnterior = montoEnPesos;
            notificarATodos();
        }

    }


}
