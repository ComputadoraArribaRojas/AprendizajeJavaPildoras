import javax.swing.*;
public class CondicionalesDoWhile {

    public static void main(String[] args) {

        String genero = "";

        do{

            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M");


        }while(genero.equalsIgnoreCase("h")== false && genero.equalsIgnoreCase("m") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));

        int pesoIdeal = 0;

        if(genero.equalsIgnoreCase("h")){

            pesoIdeal = altura-110;
        }else if(genero.equalsIgnoreCase("m")){

            pesoIdeal = altura-120;
        }

        System.out.println("Tu peso ideal es: " + pesoIdeal + " kg");
    }
}
