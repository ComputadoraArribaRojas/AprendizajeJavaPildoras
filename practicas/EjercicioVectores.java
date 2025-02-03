package practicas;

import javax.swing.*;

public class EjercicioVectores {

    public static void main(String[] args) {

        int miVector [] = new int[5];

        for(int i = 0 ; i<5 ; i++) {

            int numeros = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para la posicion " +
                    (i+1)));

            miVector[i] = numeros;

        }

        for (int j = 0; j<5 ; j++){

            System.out.println("El numero " + miVector[j] + " esta en la posicion " + (j+1));

        }


    }

}
