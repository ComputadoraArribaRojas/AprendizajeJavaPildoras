package ejercicioschajepete.ejercicioscomplementarios;

public abstract class Empleado {

    private String nombre;
    private double salarioBase;

    public Empleado(double salarioBase, String nombre) {
        this.salarioBase = salarioBase;
        this.nombre = nombre;
    }

    public Empleado(String nombre) {

        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularSalario();

}

class EmpleadoTiempoCompleto extends Empleado {

    private double bonoExtra;

    public EmpleadoTiempoCompleto(double salarioBase, String nombre, double bonoExtra) {
        super(salarioBase, nombre);
        this.bonoExtra = bonoExtra;
    }


    @Override
    public double calcularSalario() {

        double resultado = getSalarioBase() + bonoExtra;
        return resultado;

    }
}

class EmpleadoPorHoras extends Empleado {

    private double pagoPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double pagoPorHora, int horasTrabajadas) {
        super(nombre);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }


    @Override
    public double calcularSalario() {

        return horasTrabajadas * pagoPorHora;

    }
}

class EjecucionEmpleado {

    public static void main(String[] args) {

        Empleado misEmpleados[] = new Empleado[4];

        misEmpleados[0] = new EmpleadoTiempoCompleto(15000, "Pedro", 1500);
        misEmpleados[1] = new EmpleadoPorHoras("Eugenio", 90, 248);
        misEmpleados[2] = new EmpleadoTiempoCompleto(11000, "Andrea", 2500);
        misEmpleados[3] = new EmpleadoPorHoras("Abigail", 150, 248);

        for (Empleado empleado : misEmpleados) {

            System.out.println("El empleado se llama: " + empleado.getNombre());
            System.out.println("Tiene como salario: " + empleado.calcularSalario());
            System.out.println("--------------------------");


        }

    }
}
