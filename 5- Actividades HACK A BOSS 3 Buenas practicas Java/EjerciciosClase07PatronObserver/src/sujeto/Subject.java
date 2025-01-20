package sujeto;


import observador.Observer;

//1 Sujeto: Define una interfaz para agregar, eliminar y notificar observadores
public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

