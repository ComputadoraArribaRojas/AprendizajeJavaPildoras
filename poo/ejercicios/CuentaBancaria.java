package poo.ejercicios;

import javax.swing.*;

public class CuentaBancaria {
    public static void main(String[] args) {
        int saldoInicial = 25000;
        String numeroCuenta = "SDF8ASD66R723";
        String nombre = JOptionPane.showInputDialog("Introduce el nombre de tu cuenta");

        miCuentaBancaria miCuenta = new miCuentaBancaria(numeroCuenta, saldoInicial, nombre);

        miCuenta.mostrarDatos();

        miCuenta.depositarCantidad(5000);
        miCuenta.mostrarDatos();
    }
}

class miCuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private final String titular;

    public miCuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void mostrarDatos() {
        System.out.println("La cuenta " + numeroCuenta + " está a nombre de " + titular + " y tiene un saldo de " + saldo + " dólares.");
    }

    public void depositarCantidad(int cantidad) {
        saldo += cantidad;
        System.out.println("Has depositado " + cantidad + " dólares.");
    }

    public void retirarCantidad(int cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Has retirado " + cantidad + " dólares.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Tu saldo en la cuenta es de " + saldo + " dólares.");
    }
}
