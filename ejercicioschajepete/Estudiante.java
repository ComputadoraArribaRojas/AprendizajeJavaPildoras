package ejercicioschajepete;

public class Estudiante {

    private int id, edad;
    private String nombre;
    private double notaFinal;

    public Estudiante(int id, String nombre, double notaFinal, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.notaFinal = notaFinal;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public boolean esAprobado(){

        return notaFinal >=6;

    }
}

class EjecucionEstudiante{

    public static void main(String[] args) {

        Estudiante misEstudiantes[] = new Estudiante[5];

        misEstudiantes[0] = new Estudiante(1,"Marcos",6.5, 19);
        misEstudiantes[1] = new Estudiante(2,"Eugenio",9, 17);
        misEstudiantes[2] = new Estudiante(3,"Victoria",10, 17);
        misEstudiantes[3] = new Estudiante(4,"Valentina",8, 19);
        misEstudiantes[4] = new Estudiante(5,"Pedro",5, 16);

        for(Estudiante e: misEstudiantes){

            System.out.println("Estudiante: " + e.getNombre());
            System.out.println("ID: " + e.getId());
            System.out.println("Edad: " + e.getEdad());
            if(e.esAprobado()) {

                System.out.println("Nota final: " + e.getNotaFinal() + ", felicidades aprobó la materia");
            }else{

                System.out.println("Nota final: " + e.getNotaFinal() + ", no aprobó");
            }
            System.out.println("---------------------");
            }




        }

    }

