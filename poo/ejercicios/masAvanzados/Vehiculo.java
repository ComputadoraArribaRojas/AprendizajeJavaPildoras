package poo.ejercicios.masAvanzados;

import java.util.Scanner;

public class Vehiculo {

    private String nombre;
    private int velocidadMaxima;
    private int distanciaRecorrida = 0;
    private int distanciaTotal = 0;

    public Vehiculo(String nombre, int velocidadMaxima) {
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void avanzar() {
        int distanciaAvanzada = (int) (Math.random() * (velocidadMaxima + 1));
        distanciaRecorrida += distanciaAvanzada;
    }

    public int getDistanciaTotal(){

         distanciaTotal += distanciaRecorrida;

         return distanciaTotal;

    }
}

class Formula1 {

    private Vehiculo[] misVehiculos;
    private int distanciaGanadora = 1500;

    public Formula1() {
        misVehiculos = new Vehiculo[3]; // Inicializar el array de vehículos
    }

    public void configurarVehiculos() {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Simulador de Carrera de Autos!");

        for (int i = 0; i < misVehiculos.length; i++) {
            System.out.println("\nAuto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = miScanner.nextLine();
            System.out.print("Velocidad máxima (km/h): ");
            int velocidadMax = miScanner.nextInt();
            miScanner.nextLine(); // Consumir el salto de línea pendiente

            misVehiculos[i] = new Vehiculo(nombre, velocidadMax);
        }
    }

    public void comenzarCarrera() {
        System.out.println("\n¡Comienza la carrera!");

        boolean carreraTerminada = false;
        int turno = 1;
        while (!carreraTerminada) {
            System.out.println("\nTurno " + turno + ":");

            for (Vehiculo vehiculo : misVehiculos) {
                vehiculo.avanzar();
                System.out.println(vehiculo.getNombre() + " ha avanzado " +
                        vehiculo.getDistanciaRecorrida() + " km. Distancia total: " + vehiculo.getDistanciaTotal());

                if (vehiculo.getDistanciaTotal() >= distanciaGanadora) {
                    System.out.println("\n¡" + vehiculo.getNombre() + " ha ganado la carrera!");
                    carreraTerminada = true;
                    break;
                }
            }

            turno++;
        }
    }

    public static void main(String[] args) {
        Formula1 carrera = new Formula1();
        carrera.configurarVehiculos();
        carrera.comenzarCarrera();
    }
}