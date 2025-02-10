package poo.ejercicios.masAvanzados;

import java.util.ArrayList;

public interface SerVivo {
    void nacer();
    void crecer();
    void morir();
}

abstract class Animal implements SerVivo {
    private String nombre, tipoAlimentacion, sonido, movimiento;

    public Animal(String nombre, String tipoAlimentacion, String sonido, String movimiento) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.sonido = sonido;
        this.movimiento = movimiento;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: " + sonido);
    }

    public void moverse() {
        System.out.println(nombre + " se mueve " + movimiento);
    }

    public void alimentarse() {
        System.out.println(nombre + " se alimenta de " + tipoAlimentacion);
    }

    @Override
    public void nacer() {
        System.out.println(nombre + " ha nacido.");
    }

    @Override
    public void crecer() {
        System.out.println(nombre + " está creciendo.");
    }

    @Override
    public void morir() {
        System.out.println(nombre + " ha muerto.");
    }
}

class Perro extends Animal {
    public Perro(String nombre, String tipoAlimentacion, String sonido, String movimiento) {
        super(nombre, tipoAlimentacion, sonido, movimiento);
    }
}

class Gato extends Animal {
    public Gato(String nombre, String tipoAlimentacion, String sonido, String movimiento) {
        super(nombre, tipoAlimentacion, sonido, movimiento);
    }
}

class Pajaro extends Animal {
    public Pajaro(String nombre, String tipoAlimentacion, String sonido, String movimiento) {
        super(nombre, tipoAlimentacion, sonido, movimiento);
    }
}

class EjecucionAnimales {
    public static void main(String[] args) {
        ArrayList<Animal> misAnimales = new ArrayList<>();
        misAnimales.add(new Perro("Rex", "croquetas", "Guau Guau", "corriendo"));
        misAnimales.add(new Gato("Michi", "pescado", "Miau", "saltando"));
        misAnimales.add(new Pajaro("Tweety", "semillas", "Pío Pío", "volando"));

        for (Animal e : misAnimales) {
            e.nacer();
            e.crecer();
            e.alimentarse();
            e.hacerSonido();
            e.moverse();
            e.morir();
            System.out.println();
        }
    }
}
