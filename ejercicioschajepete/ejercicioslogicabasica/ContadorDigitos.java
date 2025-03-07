package ejercicioschajepete.ejercicioslogicabasica;

public class ContadorDigitos {

    public static void main(String[] args) {

        contar(1);

    }

    public static void contar(int numero){

        int contador = 0;

        int division = 0;

        if(numero == 0){

            contador++;

        }

        while(numero!=0){


            division = (int) numero/10;

            numero/=10;

            contador++;
        }

        System.out.println("El numero tiene " + contador + " digito(s).");

    }

}
