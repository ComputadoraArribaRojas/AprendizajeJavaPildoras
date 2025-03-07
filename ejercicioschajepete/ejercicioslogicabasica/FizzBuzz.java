package ejercicioschajepete.ejercicioslogicabasica;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        System.out.print("Ingresa un numero para comenzar el juego: ");

        int entrada = miScanner.nextInt();

        juego(entrada);

    }

    public static void juego(int numero){

        int contador = 1;

        while(contador<=numero){

            if(contador%3==0 && contador%5==0){

                System.out.println("FizzBuzz");

            } else if (contador%3==0) {

                System.out.println("Fizz");

            } else if (contador%5==0) {

                System.out.println("Buzz");

            }else{

                System.out.println(contador);

            }

            contador++;

        }

    }

}
