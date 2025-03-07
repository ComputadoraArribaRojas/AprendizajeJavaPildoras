package ejercicioschajepete.ejercicioscomplementarios;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Introduce el número 1: ");
        int a = miScanner.nextInt();

        int b = 0;
        boolean divisorValido = false;

        while (!divisorValido) {
            System.out.println("Introduce el número 2 (no puede ser cero): ");
            b = miScanner.nextInt();

            if (b == 0) {
                System.out.println("Error: El divisor no puede ser cero. Inténtalo de nuevo.");
            } else {
                divisorValido = true;
            }
        }

        try {
            int resultado = dividir(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            miScanner.close();
        }
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return a / b;
    }
}