package poo.ejercicios;

public class MetodoPago {

    public void procesarPago(double monto){

        System.out.println("Mensaje por defecto, no se ingreso nada");

    }

}

class TarjetaCredito extends MetodoPago{

    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta){

        this.numeroTarjeta = numeroTarjeta;

    }

    @Override
    public void procesarPago(double monto) {

        if(numeroTarjeta.matches("\\d{16}")){

            System.out.println("Procesando pago con tarjeta de crédito...");
            System.out.println("monto: $" + monto);
            System.out.println("Pago aprobado con tarjeta: ****"+ numeroTarjeta);

        }else{

            System.out.println("Tarjeta rechazada, verificar numero de tarjeta");

        }

    }
}

class PayPal extends MetodoPago{

   private String correoElectronico;

   public PayPal(String correoElectronico){

       this.correoElectronico = correoElectronico;

   }

    @Override
    public void procesarPago(double monto) {

        if (correoElectronico.contains("@") && correoElectronico.contains(".")) {

            System.out.println("PayPal validó la compra.");
            System.out.println("Monto gastado: $" + monto);

        } else {

            System.out.println("PayPal rechazó la compra, corrobore su Email.");

        }

    }
}

class TransferenciaBancaria extends MetodoPago{

    private String numeroCuenta;

    public TransferenciaBancaria(String numeroCuenta){

        this.numeroCuenta = numeroCuenta;

    }

    @Override
    public void procesarPago(double monto) {

        if(numeroCuenta.matches("\\d{10}")){

            System.out.println("Procesando pago por transferencia bancaria....");
            System.out.println("monto: $"+ monto);
            System.out.println("Pago aprobado con cuenta número: " + numeroCuenta);

        }else{

            System.out.println("Transferencia rechazada, verificar numero de cuenta");

        }


    }
}

class Ejecucion {


    public static void main(String[] args) {

        MetodoPago miMetodo;

        miMetodo = new TarjetaCredito("1234567891123451");
        miMetodo.procesarPago(500);

        miMetodo = new PayPal("soyfito12@gmail.com");
        miMetodo.procesarPago(500);

        miMetodo = new TransferenciaBancaria("1234567810");
        miMetodo.procesarPago(500);


    }

}
