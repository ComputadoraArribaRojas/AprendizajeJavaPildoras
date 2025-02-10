package ejercicioschajepete;

public class Vehiculo {

    private String marca,modelo;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(){

        System.out.println("El vehiculo esta acelerando");

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehículo: " + marca + "\nModelo: " + modelo + "\nVelocidad máxima: " + velocidadMaxima + " km/h";
    }
}

class Auto extends Vehiculo{

    public Auto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }
    @Override
    public void acelerar(){

        System.out.println("El auto " + getMarca() + " " + getModelo() + " está acelerando. Incrementa su velocidad en 20 km/h.");

    }

}

class Motocicleta extends Vehiculo{

    public Motocicleta(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar(){

        System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " está acelerando. Incrementa su velocidad en 10 km/h.");

    }

}

class EjecucionVehiculo{

    public static void main(String[] args) {

        Vehiculo miVehiculo[] = new Vehiculo[4];

        miVehiculo [0] = new Auto("Porsche", "911 turbo s", 330);
        miVehiculo [1] = new Auto("Koenigsegg", "Regera", 385);

        miVehiculo [2] = new Motocicleta("Kawasaki", "H2R", 410);
        miVehiculo [3] = new Motocicleta("Yamaha", "MT09", 245);

        for(Vehiculo e: miVehiculo){

            System.out.println(e.toString());
            e.acelerar();
            System.out.println("---------------------");

        }

    }
}