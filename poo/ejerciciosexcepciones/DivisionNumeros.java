package poo.ejerciciosexcepciones;

public class DivisionNumeros {

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (double) a / b; // Hacemos un casting para que la división sea decimal
    }

    public static void main(String[] args) {
        DivisionNumeros miDivision = new DivisionNumeros();

        try {
            System.out.println("Resultado: " + miDivision.dividir(25, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
