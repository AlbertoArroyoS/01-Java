package observador.concreto;

import observador.Observable;
import observador.Observador;

public class Oferente implements Observador {

    private String nombre;
    private double montoTope;

    public Oferente(String nombre, double montoTope) {
        this.nombre = nombre;
        this.montoTope = montoTope;
    }

    @Override
    public void actualizar(Observable observable) {
        Subasta subasta = (Subasta)observable;
        System.out.println("Oferente: "+nombre+" -> Fué notificado");

        //if(subasta.getUltimoOferente() != this && subasta.getUltimoMontoOfertado() + 10 <= montoTope)
        //	subasta.ofertar(subasta.getUltimoMontoOfertado()+ 10,this);
    }


    public void setMontoTope(double montoTope) {
        this.montoTope = montoTope;
    }

    public double getMontoTope() {
        return montoTope;
    }

}
