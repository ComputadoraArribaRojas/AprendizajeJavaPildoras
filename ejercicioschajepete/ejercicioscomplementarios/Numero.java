package ejercicioschajepete.ejercicioscomplementarios;

import javax.swing.*;

public class Numero {

    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public boolean esPrimo(int valor){

        if(this.valor%valor==0){

            return true;

        }else{

            return false;

        }

    }

}

class ejecucionNumero{

    public static void main(String[] args) {

        Numero miNumero = new Numero(250);

        try {

            int valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

            if (miNumero.esPrimo(valor)) {

                System.out.println("El numero es primo.");

            } else {

                System.out.println("El numero NO es primo.");

            }

        }catch(NumberFormatException e){

            System.out.println("Has introducido algo distinto a un numero entero positivo.");

        }finally {

            System.out.println("Programa finalizado.");

        }
    }

}
