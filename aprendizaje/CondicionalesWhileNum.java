package aprendizaje;

import java.util.*;
public class CondicionalesWhileNum {

    public static void main(String[] args) {

        int aleatorio = (int) (Math.random()*100);

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        int intentos = 0;

        while(numero != aleatorio){

            intentos++;
            System.out.print("Introduce un numero: ");

            numero = entrada.nextInt();

            if(aleatorio<numero){

                System.out.println("El numero debe de ser mas bajo");

            }else if(aleatorio>numero){

                System.out.println("El numero debe de ser mas alto");

            }

        }
        System.out.println("Numero correcto. Haz tardado " + intentos + " intentos");

    }
}
