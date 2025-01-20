package exception;

public class TransaccionInvalidaException extends Exception {

    public TransaccionInvalidaException() {
        super("Transacción inválida");
    }

    public TransaccionInvalidaException(String message) {
        super(message);
    }


}
