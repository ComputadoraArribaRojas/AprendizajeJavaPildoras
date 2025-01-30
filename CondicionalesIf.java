import java.util.Scanner;

public class CondicionalesIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad");

        int edad = entrada.nextInt();

        if(edad>=18 && edad<=40){

            System.out.println("Eres mayor de edad");

        }else if(edad>=41 && edad<=64){

            System.out.println("Eres viejito");

        }else if(edad>65){

            System.out.println("Cuidate causa");

        }else{

            System.out.println("Eres menor de edad");

        }

    }
}
