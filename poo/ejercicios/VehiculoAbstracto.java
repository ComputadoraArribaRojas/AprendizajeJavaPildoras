package poo.ejercicios;

public abstract class VehiculoAbstracto {

    private String marca;

    public VehiculoAbstracto(String marca){

        this.marca = marca;

    }

    public final String mostrarMarca(){

        return marca;

    }

    public abstract void arrancar();

}

class AutoAb extends VehiculoAbstracto{

    public AutoAb(String marca){

        super(marca);

    }

    @Override
    public void arrancar() {

        System.out.println("El auto arranca girando la llave.");

    }
}

class MotoAb extends VehiculoAbstracto{

    public MotoAb(String marca){

        super(marca);

    }

    @Override
    public void arrancar() {

        System.out.println("La moto arranca presionando el botón de encendido.");

    }
}

class VehiculoAbstractoMain{

    public static void main(String[] args) {

        VehiculoAbstracto miVehiculo = new AutoAb("Porsche");
        System.out.println("Marca: " + miVehiculo.mostrarMarca());
        miVehiculo.arrancar();

        miVehiculo = new MotoAb("BMW");
        System.out.println("Marca: " + miVehiculo.mostrarMarca());
        miVehiculo.arrancar();


    }

}
