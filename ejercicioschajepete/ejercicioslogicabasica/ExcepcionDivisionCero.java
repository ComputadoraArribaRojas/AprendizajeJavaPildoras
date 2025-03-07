package ejercicioschajepete.ejercicioslogicabasica;

import java.io.IOException;

public class ExcepcionDivisionCero {

    public static void main(String[] args) {


        try {
            hacerDivision(25,2);
        } catch (Exception e) {

            System.out.println("Clase de error: " + e.getClass());

        }
    }

    public static void hacerDivision(int numero1, int numero2) throws Exception {

        System.out.println("El resultado de tu division es: " + (double)(numero1/numero2));

    }


}
