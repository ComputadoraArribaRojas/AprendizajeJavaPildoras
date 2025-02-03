package practicas;

import javax.swing.*;

public class ContadorDeNumerosParImpar {

    public static void main(String[] args) {

        int numero = 0;

        int contadorPar = 0;
        int contadorImpar = 0;

        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

            if (numero != 0) {
                if (numero % 2 == 0) {

                    contadorPar++;

                } else {

                    contadorImpar++;

                }
            }

            }
            while (numero != 0) ;

            System.out.println("Has ingresado " + contadorPar + " numeros pares " +
                    " y " + contadorImpar + " numeros impares");

    }

}
