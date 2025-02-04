package poo.ejercicios;

public class MainProducto {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Arroz", 1200, 5);

        producto1.vender(2);
        producto1.vender(5);

        producto1.agregarStock(5);

        producto1.mostrarDatos();






    }

}
