package poo.ejerciciosexcepciones;

import java.util.Scanner;

class SaldoInsuficienteException2 extends Exception{

    public SaldoInsuficienteException2(String mensaje){

        super(mensaje);

    }

}

class Cajero{

    private double saldo;

    public Cajero(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) throws SaldoInsuficienteException2{

        if(saldo>=monto) {
            saldo -= monto;
        }else{

            throw new SaldoInsuficienteException2("Error: Saldo insuficiente. No puedes retirar ");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese el saldo inicial: ");
        double monto = miScanner.nextDouble();

        Cajero miCajero = new Cajero(monto);

        System.out.println("Ingrese la cantidad a retirar: ");
        double retiro;
        retiro = miScanner.nextDouble();
        try {

            miCajero.retirar(retiro);
            System.out.println("Retiro exitoso de: $" + retiro);
            System.out.println("Saldo restante: $" + miCajero.getSaldo());
        }catch (SaldoInsuficienteException2 e){

            System.out.println(e.getMessage() + retiro);

        }finally {
            System.out.println("Operacion finalizada");
            miScanner.close();
        }


    }

}

