package ejercicioschajepete.ejercicioslogicabasica;

import java.util.Scanner;

public class PromedioCalificaciones {

    public static void main(String[] args) {

        int calificaciones[] = new int[5];

        Scanner miScanner = new Scanner(System.in);

        int suma = 0;
        double promedio = 0;

        for(int i = 0; i<calificaciones.length; i++){

            System.out.print("Ingrese la calificaion del estudiante " + (i+1) + ": ");

            calificaciones[i] = miScanner.nextInt();

        }

        for(int j = 0; j<calificaciones.length; j++){

            suma+=calificaciones[j];


        }

        promedio = (double) suma /calificaciones.length;
        System.out.print("El promedio de calificaciones es: " + promedio);
        miScanner.close();



    }

}
