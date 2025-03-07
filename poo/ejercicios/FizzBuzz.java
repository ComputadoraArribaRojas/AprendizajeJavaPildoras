package poo.ejercicios;

public class FizzBuzz {

    public static void main(String[] args) {



        for(int i = 1; i<100; i++) {

            int divisblePorTres = i%3;
            int divisblePorCinco = i%5;

            if(divisblePorTres == 0 && divisblePorCinco == 0){

                System.out.println("Fizzbuzz");

            }else if(divisblePorTres == 0){

                System.out.println("fizz");

            } else if (divisblePorCinco == 0) {

                System.out.println("buzz");

            }else{

                System.out.println(i);

            }


        }



    }

}
