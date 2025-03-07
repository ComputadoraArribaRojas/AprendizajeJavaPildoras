package ejercicioschajepete.ejercicioslogicabasica;

import java.util.Scanner;

public class ConversionTipos {

    public static void main(String[] args) {

        System.out.print("Ingresa un numero decimal: ");

        Scanner miScanner = new Scanner(System.in);

        String entrada = miScanner.nextLine();

        double numero = Double.parseDouble(entrada);

        System.out.printf("%1.2f%n", numero);

    }

}
