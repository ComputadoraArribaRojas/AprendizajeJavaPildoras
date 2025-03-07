package ejercicioschajepete.ejercicioslogicabasica;

import java.util.Scanner;

public class BuscarNumArray {

    public static void main(String[] args) {

        int[] arrayAleatorio = new int[10];

        Scanner miScanner = new Scanner(System.in);

        for (int i = 0; i < arrayAleatorio.length; i++) {

            arrayAleatorio[i] = (int) (Math.random() * 100);

        }

        System.out.print("Numeros en el array: ");

        for (int i : arrayAleatorio) {

            System.out.print(i + " ");

        }

        System.out.println();
        System.out.print("Ingrese numero a buscar: ");
        int numero = miScanner.nextInt();

        boolean encontrado = false;

        for(int k = 0; k<arrayAleatorio.length; k++){

            if(numero == arrayAleatorio[k]){

                encontrado = true;

            }

        }

        if(encontrado){

            System.out.println("Se ha encontrado el numero " + numero + " en el array");

        }else{

            System.out.println("El numero no se ha encontrado dentro del array.");

        }

    }
}
