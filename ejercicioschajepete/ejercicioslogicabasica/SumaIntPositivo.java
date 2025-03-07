package ejercicioschajepete.ejercicioslogicabasica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaIntPositivo {

    public static void main(String[] args) {

        System.out.println("Ingresa numeros enteros positivos para que los sumemos.");

        Scanner miScanner = new Scanner(System.in);

        int entrada = 0;

        int sumatoria = 0;

        while (entrada >= 0) {

            System.out.print("Ingrese un número: ");

            try {

                entrada = miScanner.nextInt();

                if (entrada >= 0) {

                    sumatoria += entrada;

                }

            } catch (InputMismatchException e) {

                System.out.println("Ingresaste una entrada invalida");

            }

        }

        System.out.println("Suma total: " + sumatoria);

    }

}
