package poo.ejercicios;

import java.util.ArrayList;

class ProductoStatic {

    private static int contador = 0;

    public ProductoStatic() {

        contador++;

    }

    public static int getTotalProductos() {

        return contador;

    }

}

class Conversor {


    public static double kmToMiles(double km) {

        return km * 0.621371;
    }

    public static double celsiusToFahrenheit(double celsius) {

        return ((celsius * 9) / 5) + 32;

    }

}

class UsuarioID {

    private static int ultimoID = 0;
    private final int id;

    public UsuarioID() {

        ultimoID++;
        this.id = ultimoID;

    }

    public void mostrarInfo() {

        System.out.println("ID: " + id);

    }

}

class Banco {

    private static String nombreBanco;
    private static double saldoTotal;
    private static int totalCuentas;

    private static ArrayList<String> misTransacciones = new ArrayList<>();

    public Banco() {

        totalCuentas++;

        System.out.println("Cuenta #" + totalCuentas + " creada.");

    }

    public static double calcularInteres(double monto, double tasa, int años) {

        return monto * Math.pow(1 + tasa, años);

    }

    public static void depositar(double monto) {

        saldoTotal += monto;
        misTransacciones.add("Deposito de: $" + monto);
        System.out.println("Deposito exitoso de $" + monto);

    }

    public static void retirar(double monto) {

        if (monto < saldoTotal) {

            saldoTotal -= monto;

            misTransacciones.add("Retiro de: $" + monto);

            System.out.println("Retiro exitoso de: $" + monto);

        } else {

            System.out.println("Error: Fondos insuficientes o monto invalido.");

        }

    }

    public static double getSaldoTotal() {

        return saldoTotal;

    }

    public static int getTotalCuentas() {

        return totalCuentas;

    }

    public static void mostrarHistorial() {

        System.out.println("Historial de Transacciones: ");

        for (String m : misTransacciones) {

            System.out.println(m);

        }

    }

    public static String getNombreBanco() {

        return nombreBanco;

    }

    public static void cambiarNombreBanco(String nuevoNombre) {

        nombreBanco = nuevoNombre;

    }

}

public class MetodosAtributosStatic {

    public static void main(String[] args) {

        ProductoStatic p1 = new ProductoStatic();
        ProductoStatic p2 = new ProductoStatic();
        ProductoStatic p3 = new ProductoStatic();

        System.out.println(ProductoStatic.getTotalProductos());

        System.out.println("--------------------");

        double millas = Conversor.kmToMiles(10);
        System.out.println(millas);

        double fahrenheit = Conversor.celsiusToFahrenheit(25);
        System.out.println(fahrenheit);

        System.out.println("-------------------");

        UsuarioID u1 = new UsuarioID();
        UsuarioID u2 = new UsuarioID();
        UsuarioID u3 = new UsuarioID();

        u1.mostrarInfo();
        u2.mostrarInfo();
        u3.mostrarInfo();

        System.out.println("-------------------");

        double montoFinal = Banco.calcularInteres(1000, 0.05, 3);
        System.out.println(montoFinal);

        System.out.println("Bienvenidos a Banco Central");
        Banco miCuenta1 = new Banco();
        Banco miCuenta2 = new Banco();
        Banco miCuenta3 = new Banco();

        Banco.depositar(1000);
        Banco.depositar(500);

        Banco.retirar(300);
        Banco.retirar(200);


        Banco.retirar(1500);


        System.out.println("\n💰 Saldo total en el banco: $" + Banco.getSaldoTotal());

        System.out.println("🏦 Total de cuentas creadas: " + Banco.getTotalCuentas());

        Banco.mostrarHistorial();

        Banco.cambiarNombreBanco("Banco Santander");
        System.out.println("\nEl banco ahora se llama: " + Banco.getNombreBanco());
    }
}

