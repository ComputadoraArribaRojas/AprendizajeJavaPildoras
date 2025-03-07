package ejercicioschajepete.ejercicioscomplementarios;

public class Dispositivo {

    private String marca,modelo;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo;
    }

    class Bateria{

        private int capacidad, porcentaje;

        public Bateria(int capacidad, int porcentaje) {
            this.capacidad = capacidad;
            this.porcentaje = porcentaje;
        }

        public void consumirBateria(int cantidad){

            if (porcentaje - cantidad <=0){

                System.out.println("Ya no tienes bateria restante");

            }else{

                System.out.println("Haz consumido %" + cantidad + " de bateria");

                porcentaje -= cantidad;

            }

        }

        public void mostrarEstado(){

            System.out.println("Capacidad de la bateria: " + capacidad + "\nPorcentaje de la bateria: " +
                    porcentaje);

        }
    }

}

class EjecucionDispositivo{

    public static void main(String[] args) {

        Dispositivo miDispositivo = new Dispositivo("Samsung", "A15");

        Dispositivo.Bateria miBateria = miDispositivo.new Bateria(70, 100);

        System.out.println(miDispositivo.toString());
        miBateria.mostrarEstado();
        miBateria.consumirBateria(55);
        miBateria.mostrarEstado();
        miBateria.consumirBateria(44);
        miBateria.mostrarEstado();
    }

}