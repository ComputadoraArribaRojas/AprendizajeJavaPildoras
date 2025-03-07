package practicas;

public class InversionDePalabra {

    public static void main(String[] args) {

        invertir("Eugenio y martin se fueron a comer");

    }

    public static void invertir(String palabra){

        for(int i = palabra.length()-1; i>=0; i--){

            char palabraInvertida = palabra.charAt(i);

            System.out.print(palabraInvertida);

        }

    }

}
