package poo.empleados;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleados {

    public static void main(String[] args) {

        Empleados miEmpleado = new Empleados("Uriel", 15000, 2005, 9, 15);

        System.out.println("Nombre: " + miEmpleado.getNombre() + ", sueldo: " + miEmpleado.getSueldo() +
                ", fecha de alta: " + miEmpleado.getAltaContrato());
    }

}

class Empleados{

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleados(String nombre, double sueldo, int ano, int mes, int dia){

        this.nombre = nombre;
        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
        altaContrato = calendario.getTime();
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
