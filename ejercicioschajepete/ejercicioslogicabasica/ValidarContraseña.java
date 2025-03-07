package ejercicioschajepete.ejercicioslogicabasica;

import java.util.Scanner;

public class ValidarContraseña {

    public static void main(String[] args) {

        String contraseñaValida = "clave123";

        Scanner miScanner = new Scanner(System.in);

        String contraseña = " ";

        do {

            System.out.print("Ingrese la contraseña:");

            contraseña = miScanner.nextLine().trim();

            if (!contraseña.equals(contraseñaValida)) {

                System.out.println("Contraseña incorrecta. Intente nuevamente.");

            }

        } while (!contraseña.equals(contraseñaValida));

        System.out.println("Acceso concedido.");
        miScanner.close();


    }

}
