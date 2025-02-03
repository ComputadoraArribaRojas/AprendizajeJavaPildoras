package practicas;

import javax.swing.*;

public class InvertirNumero {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero positivo"));

        int invertido = 0;

        for (; numero != 0; numero /= 10) {
            int digito = numero % 10;  // Extraemos el último dígito
            invertido = invertido * 10 + digito;  // Construimos el número invertido
        }

        System.out.println("Número invertido: " + invertido);
    }
}
