package poo.ejercicios;

public class Empleado {

    private final String nombre;
    private double salario;

    public Empleado(String nombre, double salario){

        this.nombre = nombre;
        this.salario = salario;

    }

    public void aumentarSalario(double porcentaje){

        double aumento = salario*(porcentaje/100);
        salario+=aumento;
    }

    public void mostrarInformacion(){

        System.out.println("El nombre del empleado es: " + nombre + " y su salario es de $" + salario);

    }

    public double getSalario(){

        return salario;

    }

    public String getNombre() {

        return nombre;
    }

}

class Gerente extends Empleado{

    private double bonoAnual;

    public Gerente(String nombre, double salario, double bonoAnual){

        super(nombre,salario);
        this.bonoAnual = bonoAnual;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("El nombre del empleado es: " + getNombre() + " y su salario es de $" + calcularSalario());


    }

    public double calcularSalario(){

        double salarioTotal = getSalario()+bonoAnual;
        return salarioTotal;

    }
}

class Empresa{

    public static void main(String[] args) {

        Empleado miEmpleado1 = new Empleado("Pedro", 100000);
        miEmpleado1.aumentarSalario(100);
        miEmpleado1.mostrarInformacion();


        Gerente miEmpleado2 = new Gerente("Eugenio", 150000, 25000);
        miEmpleado2.aumentarSalario(100);
        miEmpleado2.calcularSalario();
        miEmpleado2.mostrarInformacion();
    }

}
