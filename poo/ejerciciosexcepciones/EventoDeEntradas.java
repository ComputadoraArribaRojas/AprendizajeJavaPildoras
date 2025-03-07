package poo.ejerciciosexcepciones;

import java.util.Scanner;

public class EventoDeEntradas {


    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad total de entradas disponibles: ");
        int cantidad = miScanner.nextInt();

        EventoDeEntradas miEvento = new EventoDeEntradas(cantidad);

        while(miEvento.getCantidadEntradasRestantes() != 0) {

            try {
                System.out.println("Ingrese la cantidad de entradas a comprar: ");
                cantidad = miScanner.nextInt();
                miEvento.comprarEntradas(cantidad);
                System.out.println("Compra exitosa. Entradas restantes: " + miEvento.getCantidadEntradasRestantes());
            } catch (EntradasInsuficientesException e) {

                System.out.println(e.getMessage());

            } finally {
                if (miEvento.getCantidadEntradasRestantes()==0) {
                    System.out.println("Programa finalizado");
                    miScanner.close();
                }else{

                    System.out.println();

                }
            }

        }


    }



    private int cantidadEntradas;

    public EventoDeEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public void comprarEntradas(int cantidad) throws EntradasInsuficientesException {

         int numeroMax = 5;

         if(cantidad>numeroMax){

            throw new EntradasInsuficientesException("No puedes comprar tantas entradas");

         }else if(cantidad<=0){

            throw new EntradasInsuficientesException("Introduce una cantidad valida");

         }else{

             System.out.println("Has comprado " + cantidad + " entradas");
             cantidadEntradas-=cantidad;

         }

    }

    public int getCantidadEntradasRestantes(){

        return cantidadEntradas;

    }

}

class EntradasInsuficientesException extends Exception{

    public EntradasInsuficientesException(String mensaje){
        super(mensaje);

    }

}