package poo.ejercicios.masAvanzados;

import java.util.Scanner;

public class AdivinaNumero {

    public static void adivinaNumero(){

        System.out.println("¡Bienvenido al juego de adivinar el número!\n" +
                "Estoy pensando en un número entre 1 y 100. ¿Puedes adivinarlo?\n Utiliza un numero negativo para rendirte");

        int numero = 0;
        int numeroRandom = (int) (Math.random()*100);
        int intentos = 0;
        int limiteIntentos = 10;
        do {

            try {

             Scanner miScanner = new Scanner(System.in);
             numero = miScanner.nextInt();

            intentos++;

                if (numero >= 0 && intentos<limiteIntentos) {

                    if (numero < numeroRandom) {

                        System.out.println("El numero es mayor");

                    } else if (numero > numeroRandom) {

                        System.out.println("El numero es menor");

                    } else {

                        System.out.println("¡Felicidades! Adivinaste el número en "  + intentos + " intentos");

                    }
                } else {
                    if(intentos==limiteIntentos){

                        System.out.println("Se te han acabado los intentos");
                        break;

                    }else {

                        System.out.println("te has rendido");
                        break;
                    }
                }

            }catch (NumberFormatException e){

                System.out.println("ERROR: Debes ingresar un numero entero positivo (0-100)");

            }

        }while(numero!=numeroRandom);

    }

    public static void main(String[] args) {

        adivinaNumero();

    }

}
