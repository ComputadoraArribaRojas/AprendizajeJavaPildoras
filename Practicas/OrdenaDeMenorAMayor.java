package Practicas;

import javax.swing.*;

public class OrdenaDeMenorAMayor {

    public static void main(String[] args) {
        int numero;
        int mayor, menor;

        // Pedimos el primer número fuera del bucle para inicializar mayor y menor
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número (-1 para salir):"));

        // Si el usuario ingresa -1 de inmediato, terminamos el programa
        if (numero == -1) {
            System.out.println("No ingresaste ningún número.");
            return;
        }

        // Inicializamos mayor y menor con el primer número ingresado
        mayor = numero;
        menor = numero;

        // Bucle para seguir pidiendo números hasta que el usuario ingrese -1
        while (true) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número (-1 para salir):"));

            if (numero == -1) {
                break; // Salimos del bucle si el usuario ingresa -1
            }

            // Comparar y actualizar el mayor y menor si es necesario
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Mostrar el resultado final
        System.out.println("El número mayor ingresado es: " + mayor);
        System.out.println("El número menor ingresado es: " + menor);
    }
}

