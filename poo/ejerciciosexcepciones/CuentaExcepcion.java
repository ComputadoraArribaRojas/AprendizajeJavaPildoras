package poo.ejerciciosexcepciones;

import java.util.ArrayList;
import java.util.Scanner;

class CuentaExcepcion extends Exception {
    public CuentaExcepcion(String mensaje) {
        super(mensaje);
    }
}

class SaldoInsuficienteExcepcion extends CuentaExcepcion {
    public SaldoInsuficienteExcepcion(String mensaje) {
        super(mensaje);
    }
}

class CuentaNoExistenteException extends CuentaExcepcion {
    public CuentaNoExistenteException(String mensaje) {
        super(mensaje);
    }
}

class EjecucionCuentaExcepcion {
    private String nombre;
    private double saldo;

    public EjecucionCuentaExcepcion(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retiroDinero(double cantidad) throws CuentaExcepcion {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteExcepcion("No tienes suficiente saldo");
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
    }

    public static void main(String[] args) {
        ArrayList<EjecucionCuentaExcepcion> cuentas = new ArrayList<>();
        cuentas.add(new EjecucionCuentaExcepcion("Ariel", 12000));
        cuentas.add(new EjecucionCuentaExcepcion("Juan", 5000));
        cuentas.add(new EjecucionCuentaExcepcion("Maria", 8000));

        Scanner miScanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de la cuenta: ");
        String nombre = miScanner.nextLine();

        EjecucionCuentaExcepcion cuentaEncontrada = null;

        for (EjecucionCuentaExcepcion cuenta : cuentas) {
            if (cuenta.getNombre().equalsIgnoreCase(nombre)) {
                cuentaEncontrada = cuenta;
                break;
            }
        }

        try {
            if (cuentaEncontrada == null) {
                throw new CuentaNoExistenteException("No existe una cuenta con ese nombre.");
            }

            System.out.println("Introduce la cantidad a retirar: ");
            double cantidad = miScanner.nextDouble();

            cuentaEncontrada.retiroDinero(cantidad);

        } catch (CuentaExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operación finalizada.");
        }

        miScanner.close();
    }
}
