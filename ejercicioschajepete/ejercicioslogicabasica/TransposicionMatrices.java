package ejercicioschajepete.ejercicioslogicabasica;

public class TransposicionMatrices {

    int[][] matrizNormal = new int[2][3];

    int[][] matrizTranspuesta = new int[3][2];

    public static void main(String[] args) {

        TransposicionMatrices miMatriz = new TransposicionMatrices();

        miMatriz.rellenarMatrizNormal();

        miMatriz.matrizTranspuesta();

    }

    public void rellenarMatrizNormal() {

        for(int i = 0; i<2; i++){

            for(int j = 0; j<3;j++){

                int numeroRandom = (int) (Math.random()*100);

                matrizNormal[i][j] = numeroRandom;

            }

        }

        System.out.println("----------Matriz Normal----------");

        for(int z = 0; z<2;z++){

            for(int x = 0; x<3;x++){

                System.out.print(matrizNormal[z][x] + " ");

            }

            System.out.println();

        }

    }

    public void matrizTranspuesta(){

        for(int i = 0;i<3;i++){

            for(int j = 0; j<2; j++){

                matrizTranspuesta[i][j] = matrizNormal[j][i];

            }

        }

        System.out.println("-----------Matriz Transpuesta-----------");

        for(int z = 0; z<3;z++){

            for(int x = 0; x<2;x++){

                System.out.print(matrizTranspuesta[z][x] + " ");

            }

            System.out.println();

        }

    }

}
