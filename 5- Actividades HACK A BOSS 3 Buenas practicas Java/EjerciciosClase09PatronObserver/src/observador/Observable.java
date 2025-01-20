package observador;

public interface Observable {

    public void agregar(Observador o);
    public void eliminar(Observador o);
    public void notificarATodos();
}
