import javax.swing.*;

public class CondicionalesFor {

    public static void main(String[] args) {

        int arroba = 0;

        boolean punto = false;

        String email = JOptionPane.showInputDialog("Introduce tu email");

        for(int i =0; i<email.length(); i++){

            if(email.charAt(i) == '@'){

                arroba ++;

            }
            if(email.charAt(i) == '.'){

                punto = true;
            }

        }

        if(arroba == 1 && punto == true){

            System.out.println("Email valido");

        }else{

            System.out.println("El Email es invalido");

        }

        int resultado = 1;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

        for(int i = numero; i > 0 ; i--){

            resultado = resultado*i;

        }

        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}
