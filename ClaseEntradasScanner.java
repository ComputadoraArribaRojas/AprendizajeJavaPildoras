import java.util.Scanner;

public class ClaseEntradasScanner {

    public static void main(String[] args) {

        Scanner miEscanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre desde consola");

        String nombre = miEscanner.nextLine();

        int edad = miEscanner.nextInt();

        System.out.println("Bienvenido " + nombre + ", has indicado que tienes " + edad + " años");

    }

}

