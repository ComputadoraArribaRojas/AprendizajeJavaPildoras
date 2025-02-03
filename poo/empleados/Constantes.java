package poo.empleados;

public class Constantes {

    public static void main(String[] args) {

        Empleado trabajador1 = new Empleado("Eugenio");
        Empleado trabajador2 = new Empleado("Pedro");
        Empleado trabajador3 = new Empleado("Maria");

        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
        System.out.println(trabajador3.getDatos());

        trabajador1.setNuevaSeccion("RRHH");
        System.out.println(trabajador1.getDatos());

        System.out.println(Empleado.getIdSiguiente());

    }

}

class Empleado{

    private final String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente=1;

    public Empleado(String nombre){

        this.nombre = nombre;
        this.seccion = "Administracion";
        id = idSiguiente;
        idSiguiente++;
    }

    public void setNuevaSeccion(String seccion){

        this.seccion = seccion;

    }

    public String getDatos() {

        return "El nombre es: " + nombre + " y la seccion es: " + seccion+ " y el id es: " + id;

    }

    public static String getIdSiguiente(){

        return "El id siguiente es: " + idSiguiente;

    }

}