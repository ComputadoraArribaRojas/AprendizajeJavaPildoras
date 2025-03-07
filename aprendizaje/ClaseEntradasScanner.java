package aprendizaje;

import java.util.Scanner;

public class ClaseEntradasScanner {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");

        String nombre = miScanner.nextLine();

        System.out.print("Introduce tu edad: ");

        int edad = miScanner.nextInt();

        System.out.println("Bienvenido " + nombre + ", has indicado que tienes " + edad + " años");

    }

}

