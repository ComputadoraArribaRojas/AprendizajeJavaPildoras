package poo.ejercicios;

public class Estudiante {

    public static void main(String[] args) {

        Estudiante miEstudiante = new Estudiante("Adolfo", 21, 8.3);

        System.out.println("La edad del estudiante es: " + miEstudiante.getEdad());
        System.out.println("El nombre del estudate es " + miEstudiante.getNombre());
        System.out.println("La clasificacion final del estudiante es: " + miEstudiante.getClasificacionFinal());
        miEstudiante.mostrarDatos();

    }

    private String nombre;
    private int edad;
    private double clasificacionFinal;

    public Estudiante(String nombre, int edad, double clasificacionFinal){

        this.nombre = nombre;
        this.edad = edad;
        this.clasificacionFinal = clasificacionFinal;

    }

    public void mostrarDatos(){

        System.out.println("El estudiante se llama " + nombre + " tiene la edad de " + edad + " años " +
                "y su clasificacion es de " + clasificacionFinal);

    }

    public void setClasificacionFinal(double clasificacionFinal) {

        if(clasificacionFinal <= 10 && clasificacionFinal >=0){

            this.clasificacionFinal = clasificacionFinal;

        }else{

            System.out.println("Valor de clasificacion no valido");

        }

    }

    public double getClasificacionFinal(){

        return clasificacionFinal;

    }

    public void setEdad(int edad){

        this.edad = edad;

    }

    public int getEdad(){

        return edad;

    }

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public String getNombre(){

        return nombre;

    }
}

