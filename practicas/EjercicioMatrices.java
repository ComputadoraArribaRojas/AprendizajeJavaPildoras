package practicas;

import javax.swing.*;

public class EjercicioMatrices {

    public static void main(String[] args) {
        int miMatriz[][] = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                miMatriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Introduce un número para la matriz:\nFila: " + i + "  Columna: " + j));
            }
        }


        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(miMatriz[i][j] + "\t"); // "\t" para alinear columnas
            }
            System.out.println();
        }
    }
}
