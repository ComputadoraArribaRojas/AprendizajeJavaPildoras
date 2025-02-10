package poo.ejercicios;

public class Vehiculo {

    private final String marca, modelo;
    private final int ano;

    public Vehiculo(String marca, String modelo, int ano){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public void mostrarDetalles(){

        System.out.println("mi vehiculo es un " + marca + " modelo " + modelo + " del ano " + ano);

    }

    public String getMarca(){

        return marca;

    }

    public String getModelo() {

        return modelo;

    }

    public int getAno() {

        return ano;

    }

}

class Auto extends Vehiculo{

    public Auto(String marca, String modelo, int ano){

        super(marca,modelo,ano);

    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Mi auto es un " + getMarca() + " modelo " + getModelo() + " del año " + getAno());

    }

}

class Moto extends Vehiculo{

    public Moto(String marca, String modelo, int ano){

        super(marca, modelo, ano);

    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Mi moto es un " + getMarca() + " modelo " + getModelo() + " del año " + getAno());

    }
}
class Bicicleta extends Vehiculo{

    public Bicicleta(String marca, String modelo, int ano){

        super(marca, modelo, ano);

    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Mi bicicleta es un " + getMarca() + " modelo " + getModelo() + " del año " + getAno());

    }

}

class Programa{

    public static void main(String[] args) {

        Vehiculo miVehiculo;

        miVehiculo = new Auto("Porsche","panamera",2024);
        miVehiculo.mostrarDetalles();

        miVehiculo = new Moto("Kawasaki","ZH2", 2024);
        miVehiculo.mostrarDetalles();

        miVehiculo = new Bicicleta("Specialized","V10",2024);
        miVehiculo.mostrarDetalles();

    }

}
