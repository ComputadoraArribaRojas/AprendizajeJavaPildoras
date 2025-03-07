package ejercicioschajepete.ejercicioslogicabasica;

public class ContadorVocales {
    public static void main(String[] args) {
        Palabra palabra = Palabra.ELEFANTE; // Cambia la palabra para probar otras

        int cantidadVocales = palabra.contarVocales();
        System.out.println("La palabra '" + palabra + "' tiene " + cantidadVocales + " vocal(es).");
    }
}

enum Palabra {
    PERRO, GATO, ELEFANTE, LEON, TIGRE, CRN; // CRN no tiene vocales

    // Método para contar las vocales en la palabra
    public int contarVocales() {
        String palabra = this.name().toLowerCase(); // Convertimos a minúsculas
        String vocales = "aeiou"; // Conjunto de vocales
        int contador = 0;

        for (char letra : palabra.toCharArray()) {
            if (vocales.indexOf(letra) != -1) { // Si es vocal
                contador++;
            }
        }
        return contador;
    }
}
