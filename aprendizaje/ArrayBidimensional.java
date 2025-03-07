package aprendizaje;

public class ArrayBidimensional {

    public static void main(String[] args) {

        int miMatriz [][] = {

                {125, 250, 25, 100, 21},
                {199, 234, 123, 533, 0},
                {12, 55, 645, 77, 0},
                {675, 234, 567, 123, 0},
                {123, 1234, 1235, 243, 0}

        };

        for(int []resultado: miMatriz){

            System.out.println();

            for(int z: resultado) {

                System.out.print(z + " ");

            }

        }

    }

}
