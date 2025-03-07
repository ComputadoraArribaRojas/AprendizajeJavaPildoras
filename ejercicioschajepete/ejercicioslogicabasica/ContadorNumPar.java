package ejercicioschajepete.ejercicioslogicabasica;

import java.util.Scanner;

public class ContadorNumPar {

    public static void main(String[] args) {

        System.out.print("Ingrese un número: ");

        Scanner miScanner = new Scanner(System.in);

        int entrada = miScanner.nextInt();

        for(int i = 1; i<=entrada; i++){

            if(i%2==0){

                System.out.print(i + " ");

            }

        }

        miScanner.close();

    }

}
