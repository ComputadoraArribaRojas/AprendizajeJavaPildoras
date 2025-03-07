package ejercicioschajepete.ejercicioslogicabasica;

import javax.swing.*;

public class BuscarNombreArray{

    static String[] arrayNombres;

    public static void main(String[] args) {

        almacenarNombres();

        preguntarNombre();

    }

    public static void almacenarNombres(){

       arrayNombres = new String[10];

        for(int i = 0; i<arrayNombres.length;i++) {

            String nombre = JOptionPane.showInputDialog("Introduce el nombre: " + (i+1));

            arrayNombres[i] = nombre;

        }

        JOptionPane.showMessageDialog(null, "Nombres agregados correctamente");

    }

    public static void preguntarNombre(){

        String nombre = JOptionPane.showInputDialog("Introduce el nombre que quieres buscar");

        boolean encontrado = false;

        for(int i = 0; i<arrayNombres.length; i++){

            if(nombre.equalsIgnoreCase(arrayNombres[i])){

                encontrado = true;

                break;

            }


        }

        if (encontrado){

            JOptionPane.showMessageDialog(null,"Nombre encontrado!");

        }else{

            JOptionPane.showMessageDialog(null,"No se encontro el nombre!");

        }


    }

}
