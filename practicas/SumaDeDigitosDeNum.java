package practicas;

import javax.swing.*;

public class SumaDeDigitosDeNum {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));

        int resultado = 0;

        while (numero != 0) {
            // Sumar el último dígito
            resultado = resultado + (numero % 10);
            // Eliminar el último dígito
            numero = numero / 10;

        }

        System.out.println("La suma de todos los dígitos es: " + resultado);


    }
}