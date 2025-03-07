package poo.ejercicios;

public class SumaNumerosNaturales {

    public static void main(String[] args) {

        int numeroNatural = 30;
        int suma = 0;

        for(int i = 1; i<numeroNatural;i++){

            suma+=i;


        }

        System.out.println("Suma de los primeros numeros naturales: " +
                suma);

    }

}
