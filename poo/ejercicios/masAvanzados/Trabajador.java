package poo.ejercicios.masAvanzados;

import java.util.ArrayList;

public interface Trabajador {

    void trabajar();
    void cobrarSueldo();

}

abstract class Empleado implements Trabajador{

    private String nombre;
    private int edad;
    private double sueldoBase;

    public Empleado(String nombre, int edad, double sueldoBase){

        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBase = sueldoBase;

    }

    public abstract double calcularSueldo();

    public void trabajar(){

        System.out.println(nombre + " esta trabajando");

    }

    public double getSueldoBase(){

        return sueldoBase;

    }

    public void dameSueldo(){

        System.out.println("Sueldo total: " + calcularSueldo());

    }

    public void cobrarSueldo(){

        System.out.println(nombre + " ha cobrado su sueldo de: " + calcularSueldo() );

    }

    public void dameNombre(){

        System.out.println("Nombre: " + nombre);

    }
    public void dameEdad(){

        System.out.println("Edad: " + edad);

    }

    public abstract void dameCargo();



}

class Gerente extends Empleado{

    private double bonoExtra;

    public Gerente(String nombre, int edad, double sueldoBase, double bonoExtra){

        super(nombre, edad, sueldoBase);
        this.bonoExtra = bonoExtra;

    }

    @Override
    public double calcularSueldo() {

        return getSueldoBase() + bonoExtra;

    }

    @Override
    public void dameCargo() {

        System.out.println("Cargo: Gerente");

    }

}

class Programador extends Empleado{

    private int codigo;
    private double extra;

    public Programador(String nombre, int edad, double sueldoBase, int codigo ,  double extra){

        super(nombre, edad, sueldoBase);

        this.extra = extra;
        this.codigo = codigo;

    }

    @Override
    public double calcularSueldo() {

        return getSueldoBase() + (codigo*extra);

    }

    @Override
    public void dameCargo() {

        System.out.println("Cargo: Programador");

    }

}

class EjecucionTrabajador{

    public static void main(String[] args) {

        ArrayList<Empleado> misEmpleados = new ArrayList<>();

        misEmpleados.add(new Gerente("Juan", 25, 25000, 2500));
        misEmpleados.add(new Gerente("Eugenio", 35, 35000, 4500));

        misEmpleados.add(new Programador("Fito", 21, 35000, 34, 13));
        misEmpleados.add(new Programador("Mile", 19, 27000, 14, 10));

        for(Empleado e: misEmpleados){

            e.dameNombre();
            e.dameEdad();
            e.dameCargo();
            e.dameSueldo();
            e.trabajar();
            e.cobrarSueldo();
            System.out.println();

        }

    }
}
