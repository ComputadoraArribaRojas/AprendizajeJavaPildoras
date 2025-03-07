package ejercicioschajepete.ejercicioslogicabasica;

import java.util.Scanner;

public class PromedioNumerosEnteros {

    public static void main(String[] args) {

        funcion();

    }

    public static void funcion() {

        System.out.println("A continuacion te pedire que ingreses 10 numeros enteros, pueden ser negativos o positivos.");

        Scanner miScanner = new Scanner(System.in);

        int promedioPositivo = 0, promedioNegativo = 0;
        double sumaNegativa = 0, sumaPositiva = 0;
        int cantidadCeros = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            int numero = miScanner.nextInt();

            if (numero != 0) {

                if (numero < 0) {

                    promedioNegativo++;

                    sumaNegativa += numero;

                } else {

                    promedioPositivo++;

                    sumaPositiva += numero;

                }

            } else {

                cantidadCeros++;

            }
        }

        System.out.println("Promedio de numeros negativos: " + sumaNegativa / promedioNegativo);
        System.out.println("Promedio de numeros positivos: " + sumaPositiva / promedioPositivo);
        System.out.println("Cantidad de ceros ingresados: " + cantidadCeros);

        miScanner.close();


    }

}
