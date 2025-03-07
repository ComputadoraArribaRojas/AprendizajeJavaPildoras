package poo.ejerciciosexcepciones;

public class ExcepcionesNoComprobadas {

    private String nombre;

    public void division(int a, int b) {
        try {
            double resultado = a / b;
            System.out.println(a + " dividido por " + b + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
    }

    public String getNombre() {
        if (this.nombre == null) {
            throw new NullPointerException("Error: la variable de instancia 'nombre' no tiene valor.");
        } else {
            return nombre;
        }
    }

    public static void main(String[] args) {
        ExcepcionesNoComprobadas miExcepcion = new ExcepcionesNoComprobadas();

        // Manejo de NullPointerException al llamar getNombre()
        try {
            System.out.println("Nombre: " + miExcepcion.getNombre());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        // Prueba de la división
        miExcepcion.division(10, 2);  // Caso normal
        miExcepcion.division(5, 0);   // Caso de error (división por cero)
    }
}
