package clasesabstractasyinterfaces;

/*Ejercicio 1: Dispositivos Inteligentes 🏠
Imagina que estás desarrollando un sistema para controlar dispositivos inteligentes en una casa, como luces, ventiladores y televisores.

Requerimientos:
🔹 Todos los dispositivos deben poder encenderse y apagarse.
🔹 Algunos dispositivos pueden regular su intensidad (ejemplo: luces con dimmer).
🔹 Otros pueden cambiar de canal (ejemplo: TV).

Instrucciones:
1️⃣ Define una interfaz Controlable con métodos encender() y apagar().
2️⃣ Define una interfaz Ajustable con un método ajustar(int nivel).
3️⃣ Define una interfaz Cambiable con un método cambiarCanal(int canal).
4️⃣ Crea las clases Luz, Ventilador y Televisor que implementen las interfaces correspondientes.
5️⃣ Implementa un main() donde se creen instancias de estos dispositivos y se prueben los métodos.*/

public class Dispositivo {

    public static void main(String[] args) {

        Luz miLuz = new Luz();
        Ventilador miVentildor = new Ventilador();
        Televisor miTV = new Televisor();

        miLuz.encender();
        miLuz.ajustar(25);
        miLuz.apagar();

        miVentildor.encender();
        miVentildor.ajustar(25);
        miVentildor.apagar();

        miTV.encender();
        miTV.cambiarCanal(26);
        miTV.apagar();

    }

}

interface  Controlable{

    default void encender(){

        System.out.println("El dispositivo se ha encendido");

    }

    default void apagar(){

        System.out.println("El dispositivo se ha apagado");

    }

}

interface Ajustable {

    void ajustar(int nivel);

}

interface Cambiable{

    void cambiarCanal(int canal);

}

class Luz implements Controlable, Ajustable{

    @Override
    public void ajustar(int nivel) {

        System.out.println("Se ha bajado la intensidad de la luz en un: " + nivel);

    }
}

class Ventilador implements Controlable, Ajustable{


    @Override
    public void ajustar(int nivel) {

        System.out.println("Se ha bajado la velocidad del ventilador en un: " + nivel);

    }
}

class Televisor implements Controlable, Cambiable{

    @Override
    public void cambiarCanal(int canal) {

        System.out.println("El televisor ha cambiado al canal: " + canal);

    }
}