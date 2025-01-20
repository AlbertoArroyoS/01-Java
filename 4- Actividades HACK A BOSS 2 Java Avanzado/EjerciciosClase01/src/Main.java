import exception.TransaccionInvalidaException;
import modelo.entidad.CuentaBancaria;
/*
Ejercicio Nº 2: “Cuenta Bancaria” – Excepción Personalizada y Tratamiento
Imagina que estás desarrollando un sistema de gestión de cuentas bancarias. Los usuarios pueden realizar depósitos y retiros de dinero desde sus cuentas. Tu tarea es implementar una función que maneje las transacciones bancarias, pero también garantice la integridad de las operaciones y el manejo de posibles errores.

Debes crear una excepción personalizada, por ejemplo, TransaccionInvalidaException, que se lance en situaciones excepcionales, como cuando un usuario intenta realizar un retiro de una cantidad mayor a su saldo actual o con un valor negativo. La excepción personalizada debe proporcionar un mensaje descriptivo sobre la causa del error.
Implementar la lógica de las transacciones bancarias, asegurándose de que se manejen adecuadamente las excepciones personalizadas, como TransaccionInvalidaException, para mantener la integridad de las cuentas bancarias.
En el método main, realizar distintas pruebas para tratar(try) y capturar(catch) correctamente la excepción cuando corresponde.

 */
public class Main {
    public static void main(String[] args) {


        CuentaBancaria cuenta1 = new CuentaBancaria(1, 1234, 1000);

        //Prueba 1: Saldo negativo
        try {
            cuenta1.retirar(-1);
        } catch (TransaccionInvalidaException e) {
            System.out.print("CuentaId: " + cuenta1.getId() + ". ");
            System.out.println(e.getMessage());
            System.out.println(e);
        }

        // Prueba 2: Saldo suficiente
        try {
            cuenta1.retirar(2500);
        } catch (TransaccionInvalidaException e) {
            System.out.print("CuentaId: " + cuenta1.getId() + ". ");
            System.out.println(e.getMessage());
            System.out.println(e);
        } finally {
            System.out.println("Saldo actual: " + cuenta1.getSaldo());
        }

        // Prueba 3: Saldo insuficiente
        CuentaBancaria cuenta2 = new CuentaBancaria(2, 5678, 1000);
        try {
            cuenta2.retirar(1500);
        } catch (TransaccionInvalidaException e) {
            System.out.print("CuentaId: " + cuenta2.getId() + ". ");
            System.out.println(e.getMessage());
            System.out.println(e);
        }finally {
            System.out.println("Saldo actual: " + cuenta2.getSaldo());
        }
    }
}