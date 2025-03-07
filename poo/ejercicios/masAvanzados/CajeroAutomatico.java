package poo.ejercicios.masAvanzados;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CajeroAutomatico {

    private double saldo;

    ArrayList<Double> misDepositos = new ArrayList<>();
    ArrayList<Double> misRetiros = new ArrayList<>();

    public void historialTransacciones() {

        System.out.println("---- HISTORIAL DE TRANSACCIONES ---");

        System.out.println("Depositos: ");
        for (Double e : misDepositos) {

            System.out.print(" + $" + e + ", ");

        }

        System.out.println();
        System.out.println("Retiros: ");
        for (Double e : misRetiros) {

            System.out.print(" - $" + e + ", ");

        }

        System.out.println("--------------------------------");

    }

    public void setDineroInicial(double monto) {

        saldo += monto;

    }

    public void retirarDinero(double monto) {



        if (monto < saldo) {

            saldo -= monto;
            misRetiros.add(monto);
            System.out.println("Has retirado: $" + monto);

        } else {

            System.out.println("No tienes suficientes fondos");

        }
    }

    public void depositarDinero(double monto) {
        saldo += monto;
        misDepositos.add(monto);
        System.out.println("Has depositado: $" + monto);

    }


    public double getSaldo() {

        return saldo;

    }

}

class OperacionesMenu extends CajeroAutomatico {

    public void menu() {

        System.out.println("Bienvenido al Cajero Automatico.");
        System.out.println("1. Consultar saldo\n2. Depositar dinero\n3. Retirar dinero \n4. Historial \n5. Salir");
        System.out.print("Seleccione una opcion: ");

        boolean validacion = false;

        while (!validacion) {

            System.out.print("Seleccione una opcion: ");

            try {

                Scanner miScanner = new Scanner(System.in);
                byte decision = miScanner.nextByte();
                double monto;

                switch (decision) {

                    case 1:

                        System.out.println("Su saldo es de: " + getSaldo());
                        break;

                    case 2:

                        System.out.println("Ingrese cantidad a depositar: ");
                        monto = miScanner.nextDouble();
                        depositarDinero(monto);
                        break;

                    case 3:

                        System.out.println("Ingrese cantidad a retirar: ");
                        monto = miScanner.nextDouble();
                        retirarDinero(monto);
                        break;
                    case 4:

                        historialTransacciones();
                        break;

                    case 5:

                        System.out.println("Saliendo del programa.....");
                        validacion = true;
                        miScanner.close();
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {

                System.out.println("Ingresa un numero valido");
            }

        }

    }


}

class EjecucionCajeroAutomatico {

    public static void main(String[] args) {

        OperacionesMenu misOperaciones = new OperacionesMenu();

        misOperaciones.setDineroInicial(12000);

        misOperaciones.menu();


    }

}
