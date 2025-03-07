package ejercicioschajepete.ejercicioslogicabasica;

import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");

        String texto = miScanner.nextLine();

        for(int i = texto.length()-1; i>=0; i--){

            System.out.print(texto.charAt(i));

        }

    }

}
