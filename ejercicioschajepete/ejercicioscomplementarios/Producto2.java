package ejercicioschajepete.ejercicioscomplementarios;

public class Producto2 {

    private String nombre;
    private double precio;
    private int stock;

    private static final double IMPUESTO = 0.21;

    public Producto2(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double calcularPrecioFinal(){

        return precio+(precio*IMPUESTO);

    }

    public void vender(int cantidad){

        if (cantidad<stock) {

            stock -= cantidad;

            System.out.println("Has vendido: " + cantidad + ". Stock restante: " + stock);

        }else{

            System.out.println("No hay suficiente stock.");

        }

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

class EjecucionProducto2{

    public static void main(String[] args) {

        Producto2[] misProductos = new Producto2[5];

        misProductos[0] = new Producto2("Arroz", 1200, 8);
        misProductos[1] = new Producto2("Lavandina", 2200, 4);
        misProductos[2] = new Producto2("Azucar", 800, 10);
        misProductos[3] = new Producto2("Alfajor", 300, 15);
        misProductos[4] = new Producto2("Leche", 1500, 15);

        for(Producto2 e: misProductos){

            System.out.println("Nombre del producto: " + e.getNombre() + ". Cantidad en stock: " +
                    e.getStock() + ". Precio final: $" + e.calcularPrecioFinal());

        }

        misProductos[2].vender(11);

    }

}