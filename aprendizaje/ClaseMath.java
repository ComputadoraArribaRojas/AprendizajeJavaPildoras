package aprendizaje;

public class ClaseMath {

    public static void main(String[] args) {

        //double raiz = Math.sqrt(9); //Saca la raiz de un numero

        double numero = 5.75;

        int resultadoRound = (int) Math.round(numero);

        System.out.println(resultadoRound);

        double base = 2;

        double exponente = 2;

        double resultadoPow = (int) Math.pow(base, exponente);

        System.out.println(resultadoPow);
    }

}