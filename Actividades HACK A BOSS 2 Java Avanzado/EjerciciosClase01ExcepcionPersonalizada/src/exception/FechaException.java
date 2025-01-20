package exception;

public class FechaException extends Exception {

    public FechaException() {
        super("Fecha inválida");
    }

    public FechaException(String message) {
        super(message);
    }
}
