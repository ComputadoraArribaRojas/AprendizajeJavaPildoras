package poo.ejerciciosexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeteccionArray {

    public static void main(String[] args) {

        int miArray[] = {25,71,89,1123,543};

        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingresa un valor para ver el contenido del array");

        try{
            int numero = miScanner.nextInt();

            System.out.println("El contenido del numero " + numero + " es: " + miArray[numero]);

        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e){

            System.out.println("Capo tenes un error en: " + e);

        }finally {

            System.out.println("Programa finalizado");
            miScanner.close();
        }



    }

}
