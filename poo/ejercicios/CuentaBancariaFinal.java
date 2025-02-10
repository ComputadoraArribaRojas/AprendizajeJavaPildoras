package poo.ejercicios;

public class CuentaBancariaFinal {

    private double saldo;

    public CuentaBancariaFinal(double saldo){

        this.saldo = saldo;

    }

    public final void retirar(double monto){

        if(monto>saldo){

            System.out.println("Operacion rechazada, no cuentas con saldo suficiente");

        }else{

            saldo-=monto;
            System.out.println("Operacion exitosa");

        }

    }

    public void mostrarSaldo(){

        System.out.println("El saldo actual de tu cuenta es: $" + saldo);

    }

}

class CuentaAhorro extends CuentaBancariaFinal{

    public CuentaAhorro(double monto){

        super(monto);

    }

}

class EjecucionCuentaBancariaFinal{

    public static void main(String[] args) {

        CuentaBancariaFinal miCuenta = new CuentaBancariaFinal(1500);
        miCuenta.retirar(1700);
        miCuenta.mostrarSaldo();

        miCuenta = new CuentaAhorro(15000);
        miCuenta.retirar(10000);
        miCuenta.mostrarSaldo();


    }

}