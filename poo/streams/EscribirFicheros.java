package poo.streams;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheros {

    public static void main(String[] args) {

        Escribe miEscritura = new Escribe();

        miEscritura.escribir();

    }

    }

class Escribe{

    public void escribir(){

        String frase = "Jose";

        try {

            FileWriter escritura = new FileWriter("C:/Users/MISHI/OneDrive/Escritorio/mishibonito.txt", true);

            for(int i = 0; i<frase.length(); i++){

                escritura.write(frase.charAt(i));


            }

            escritura.close();

        }catch (IOException e){

            System.out.println("no causa ga causa");

        }
    }

}