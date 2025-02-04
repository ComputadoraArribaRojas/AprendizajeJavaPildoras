package poo.empleados;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleados {

    public static void main(String[] args) {

        Jefatura jefeRRHH = new Jefatura("Ana", 21000, 2005, 01,12);

        jefeRRHH.setIncentivo(1200);
        System.out.println(jefeRRHH.getSueldo());

        Empleados jefeRecursos = jefeRRHH;//Polimorfismo
        Empleados miEmpleado = new Empleados("Uriel", 15000, 2005, 9, 15);
        Empleados miEmpleado2 = new Empleados("Mishi");

        System.out.println("Nombre: " + miEmpleado.getNombre() + ", sueldo: " + miEmpleado.getSueldo() +
                ", fecha de alta: " + miEmpleado.getAltaContrato());

        System.out.println("Nombre: " + miEmpleado2.getNombre() + ", sueldo: " + miEmpleado2.getSueldo() +
                ", fecha de alta: " + miEmpleado2.getAltaContrato());

    }

}

class Empleados{

    private final String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleados(String nombre, double sueldo, int ano, int mes, int dia){

        this.nombre = nombre;
        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
        altaContrato = calendario.getTime();
    }
    public Empleados(String nombre){

        this(nombre, 30000, 2000,01,01);//Llama al otro constructor y almacena los valores

    }



    public String getNombre(){

        return nombre;

    }

    public double getSueldo(){

        return sueldo;

    }

    public Date getAltaContrato(){

        return altaContrato;

    }

    public void subeSueldo(double porcentaje){

        double aumento = sueldo*porcentaje/100;

        sueldo+=aumento;

    }
}

class Jefatura extends Empleados{

    private double incentivo;

    public Jefatura(String nombre, double sueldo, int ano, int mes, int dia){

        super( nombre,  sueldo,  ano,  mes,  dia);

    }

    public void setIncentivo(double incentivo){

        this.incentivo = incentivo;

    }

    public double getSueldo(){

        double sueldoJefe = super.getSueldo();

        return sueldoJefe+incentivo;

    }

}
