package poo.ejercicios.masAvanzados;

public abstract class Vehiculo2 {

    private double velocidad;

    public Vehiculo2(double velocidad) throws VelocidadNegativaException {

        setVelocidad(velocidad);

    }

     private void setVelocidad(double velocidad) throws VelocidadNegativaException{

        if(velocidad < 0){

            throw new VelocidadNegativaException("La velocidad no puede ser un numero negativo.");

        }else{

            this.velocidad = velocidad;

        }

    }

    public double getVelocidad() {

        return velocidad;
    }

    abstract void mover();

}

class VelocidadNegativaException extends Exception{

    public VelocidadNegativaException(String mensaje) {

        super(mensaje);

    }

}

class Coche2 extends Vehiculo2{


    public Coche2(double velocidad) throws VelocidadNegativaException {
        super(velocidad);
    }

    @Override
    void mover() {

        System.out.println("El coche se mueve a: " + getVelocidad());

    }
}

class Bicicleta2 extends Vehiculo2{

    public Bicicleta2(double velocidad) throws VelocidadNegativaException {
        super(velocidad);
    }

    @Override
    void mover() {

        System.out.println("La bicicleta se mueve a: " + getVelocidad());

    }
}

class EjecucionPrograma{

    public static void main(String[] args) {

        Vehiculo2 miVehiculo;

        try {

            miVehiculo = new Coche2(-25);
            miVehiculo.getVelocidad();
            miVehiculo.mover();

            miVehiculo = new Bicicleta2(68);
            miVehiculo.getVelocidad();
            miVehiculo.mover();


        }catch (VelocidadNegativaException e){

            System.out.println(e.getMessage());

        }
    }

}


