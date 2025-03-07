package ejercicioschajepete.ejercicioscomplementarios;

import javax.swing.*;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {

        System.out.println("Se ha creado la cuenta de " + titular + " con un saldo inical de: $" + saldo);

        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {

        saldo += cantidad;

        System.out.println("Has depositado: $" + cantidad + ". Saldo disponible: " + saldo);

    }

    public void retirar(double cantidad) {

        if (cantidad < saldo) {

            saldo -= cantidad;

            System.out.println("Has retirado: $" + cantidad + ". Saldo restante: $" + saldo);

        } else {

            System.out.println("No tienes suficientes fondos para retirar $" + cantidad);

        }

    }

    public void mostrarInformacion() {

        System.out.println("El titular de la cuenta es: " + titular + " y cuenta con un saldo de: $" +
                saldo);

    }

}

class EjecucionCuentaBancaria {

    public static void main(String[] args) {

        try {

            String titular = JOptionPane.showInputDialog("Introduce el nombre del titular: ");
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce saldo del titular: "));
            CuentaBancaria miCuenta = new CuentaBancaria(titular, saldo);

            miCuenta.depositar(15000);
            miCuenta.retirar(20000);
            miCuenta.mostrarInformacion();

        } catch (NumberFormatException e) {

            System.out.println("Has ingresado un valor incorrecto");

        } finally {

            System.out.println("Programa finalizado.");

        }

    }

}
