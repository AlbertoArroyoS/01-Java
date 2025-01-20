package modelo.entidad;

import exception.TransaccionInvalidaException;

public class CuentaBancaria {

    private int id;
    private int numero;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int id, int numero, double saldo) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void retirar(double cantidadSacar) throws TransaccionInvalidaException {

        if(cantidadSacar > this.saldo) {
            throw new TransaccionInvalidaException("Saldo insuficiente");
        }
        if (cantidadSacar < 0) {
            throw new TransaccionInvalidaException("Cantidad a retirar inválida");
        }
        this.saldo -= cantidadSacar;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
