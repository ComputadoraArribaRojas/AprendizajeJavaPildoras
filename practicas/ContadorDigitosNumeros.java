package practicas;

import javax.swing.*;

public class ContadorDigitosNumeros {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero positivo"));

        int digitos = 0;

        if(numero == 0){

            digitos = 1;

        }else {

            do {

                numero = numero / 10;

                digitos++;

            } while (numero != 0);

        }

        System.out.println("Tu numero contiene " + digitos + " digitos");

    }

}
