package poo.ejercicios;

public class Furgoneta extends Coche {

    private int capacidadExtra;
    private int plazasExtra;

    public Furgoneta(int capacidadExtra, int plazasExtra){

        super();//LLama al construcor de la clase Coche y le da un estado inicial

        this.capacidadExtra = capacidadExtra;
        this.plazasExtra = plazasExtra;

    }

    public String dimeDatosFurgoneta(){

        return "La capacidad de carga es: " + capacidadExtra + " y las plazas son: " + plazasExtra;
    }

}
