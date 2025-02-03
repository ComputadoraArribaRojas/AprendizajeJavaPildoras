package poo;

import javax.swing.*;

public class UsoCoche {
    public static void main(String[] args) {

        Coche miCoche = new Coche();//Instanciar una clase, Ejemplarizar una clase

        System.out.println(miCoche.getDatos());

        miCoche.setColor(JOptionPane.showInputDialog("Introduce el color de tu coche"));
        System.out.println(miCoche.getColor());

        miCoche.setAsientosCuero(true);
        System.out.println(miCoche.getAsientosCuero());

        miCoche.setAireAcondicionado(true);
        System.out.println(miCoche.getAireAcondicionado());

        System.out.println(miCoche.getPesoCoche());

        System.out.println("El precio final del coche es: " + miCoche.getPrecioCoche());

    }

}
