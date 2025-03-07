package practicas;

import java.util.Scanner;

public class DescuentoCantidad {

    public static void main(String[] args) {

        comprar();

    }

    public static void comprar() {

        System.out.println("Bienvenido a la tienda, cada hamburguesa te sale 6000, si compras 50 o mas te saldra a " +
                "5500 cada una, y si compras mas de 100 te saldra a 5000 cada una.");

        Scanner miScanner = new Scanner(System.in);

        System.out.print("Ingrese cantidad a comprar: ");

        int cantidad = miScanner.nextInt();
        int totalAPagar = 0;

        if (cantidad > 0) {
            if (cantidad >= 50) {

                if (cantidad < 100) {

                    totalAPagar = cantidad * 5500;

                } else {

                    totalAPagar = cantidad * 5000;

                }

            } else {

                totalAPagar = cantidad * 6000;

            }

            System.out.println("Has comprado: " + cantidad + "\nTotal a pagar: $" + totalAPagar);

        }else{

            System.out.println("No has comprado nada :(");

        }

        miScanner.close();

    }

}
