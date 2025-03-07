package poo.ejercicios;

import javax.swing.*;

public class CalculoPromedioEntradaNumeros {

    public static void main(String[] args) {

        int numero = 0;
        int cantidadNumeros = 0;



        do{

             numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero, -1 para cancelar"));

             cantidadNumeros++;




        }while(numero!=-1);

    }

}
