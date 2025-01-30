import javax.swing.*;
public class ClaseEntradasJOption {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));

        System.out.println("Hola " + nombre + " tu edad es de " + edad + " años");

    }

}
