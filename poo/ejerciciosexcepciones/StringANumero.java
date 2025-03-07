package poo.ejerciciosexcepciones;

import java.util.Scanner;

public class StringANumero {

    public static void convertirAInt(String valor){

        try {

            Integer.parseInt(valor);

            System.out.println("Conversion exitosa.");

        }catch (NumberFormatException e){

            System.out.println("Flaco no pusiste un entero");

        }finally {

            System.out.println("Programa finalizado.");

        }

    }

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para convertirlo a entero: ");
        String valor = miScanner.nextLine();
        convertirAInt(valor);

    }

}
