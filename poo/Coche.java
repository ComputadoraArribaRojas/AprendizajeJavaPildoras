package poo;

public class Coche {

   private final byte ruedas;
   private int largo, ancho, motor, pesoPlataforma, pesoTotal;
   private String color;
   private boolean aireAcondicionado, asientosCuero;

    public Coche() {//Metodo constructor

        ruedas = 4;
        largo = 300;
        ancho = 100;
        motor = 1600;
        pesoPlataforma = 500;

    }

    public String getDatos(){

        return "El vehiculo es de: " + ruedas + " ruedas. Mide " + largo + " centimetros con un ancho"+
                " de " + ancho + " cm y un peso de plataforma de " + pesoPlataforma + " kg.";

    }

    public void setColor(String color) {

        this.color = color;

    }

    public String getColor(){

        return "El color de tu coche es: " + color;

    }

    public void setAsientosCuero(boolean asientosCuero){

        if(asientosCuero){

            this.asientosCuero = true;

        }else{

            this.asientosCuero = false;
        }

    }

    public String getAsientosCuero(){

        if(asientosCuero){

            return "El coche tiene asientos de cuero";

        }else{

            return "El coche tiene asientos de serie";

        }

    }

    public void setAireAcondicionado(boolean aireAcondicionado){

        if(aireAcondicionado){

            this.aireAcondicionado = true;

        }else{

            this.aireAcondicionado = false;

        }

    }

    public String getAireAcondicionado(){

        if(aireAcondicionado){

            return "El coche viene con aire acondicionado";

        }else{

        return "El coche no viene con aire acondicionado";

        }

    }

    //Metodo Set y Get
    public String getPesoCoche(){

        int pesoCarroceria = 500;

        pesoTotal = pesoPlataforma+pesoCarroceria;

        if(asientosCuero){

            pesoTotal +=50;
        }

        if(aireAcondicionado){

            pesoTotal+=20;

        }

        return "El peso del coche es: " + pesoTotal;

    }

    public int getPrecioCoche(){

        int precioFinal = 10000;

        if(asientosCuero){

            precioFinal+=2000;

        }

        if(aireAcondicionado){

            precioFinal+=1500;

        }

        return precioFinal;

    }

}
