package ejercicioschajepete.ejercicioslogicabasica;

import java.util.Scanner;

public class BidimensionalMultiplicacion {

    int[][] bidimensionalNums = new int[3][3];

    public static void main(String[] args) {

        BidimensionalMultiplicacion miMatriz = new BidimensionalMultiplicacion();

        miMatriz.almacenarMatriz();

        miMatriz.multiplicarMatriz();


    }

    public void almacenarMatriz(){

        System.out.println("-----------Rellenando Matriz-----------");

        Scanner miScanner = new Scanner(System.in);

        for(int i = 0; i<3;i++){

            for (int j = 0; j<3; j++){

                System.out.print("Introduce el numero para la fila " + (i+1) + " y la columna " + (j+1) + ": ");

                int numero = miScanner.nextInt();

                bidimensionalNums[i][j] = numero;

            }

            System.out.println();
            

        }

        System.out.println("-----------Matriz Rellenado-----------");

        for(int z = 0; z<3; z++){

            for(int x = 0; x<3; x++){

                System.out.print(bidimensionalNums[z][x] + " ");

            }

            System.out.println();

        }

    }

    public void multiplicarMatriz(){

        System.out.println("-----------Multiplicando Matriz-----------");

        final int numeroMultiplicacion = 2;

        for(int i = 0; i<3;i++){

            System.out.println();

            for (int j = 0; j<3; j++){

                System.out.print((bidimensionalNums[i][j]*=numeroMultiplicacion) + " ");

            }

        }
    }

}
