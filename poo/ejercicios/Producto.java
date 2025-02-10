package poo.ejercicios;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){

        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    public void agregarStock(int cantidad){

        if(cantidad > 0) {

            stock += cantidad;

        }else{

            System.out.println("Has introducido un valor negativo al stock");

        }

    }

    public void vender(int cantidad){

        if(cantidad > stock){

            System.out.println("No hay suficiente stock");

        }else{

            stock-=cantidad;

            System.out.println("Has vendido " + cantidad + " unidade(s) de " + nombre +
                    ". Stock restante: " + stock);

        }

    }

    public void mostrarDatos(){

        System.out.println("El producto " + nombre + " cuesta " + precio +
                " pesos y hay "+ stock + " en stock");

    }


}

class MainProducto {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Arroz", 1200, 5);

        producto1.vender(2);
        producto1.vender(5);

        producto1.agregarStock(5);

        producto1.mostrarDatos();

    }

}
