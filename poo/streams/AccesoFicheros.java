package poo.streams;

import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheros {

    public static void main(String[] args) {

        LeerFichero acceder = new LeerFichero();

        acceder.leer();

    }

}

class LeerFichero{

    public void leer(){

        try{

            FileReader entrada = new FileReader("C:/Users/MISHI/OneDrive/Escritorio/mishibonito.txt");

            int c = 0;

            while(c!=-1){

                c= entrada.read();

                char letra = (char) c;

                System.out.print(letra);

            }

            entrada.close();

        }catch (IOException e){

            System.out.println("No se ha encontrado el archivo");

        }

    }

}
