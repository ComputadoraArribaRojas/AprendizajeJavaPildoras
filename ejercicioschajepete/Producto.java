package ejercicioschajepete;

public class Producto {

    private int codigo, cantidad;
    private String nombre;
    private double precio;

    public Producto(int codigo, int cantidad, String nombre, double precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularTotal(){

        return precio*cantidad;

    }
}

class EjecucionProducto {

    public static void main(String[] args) {

        Producto misProductos[] = new Producto[3];

        misProductos[0] = new Producto(1225, 5, "Arroz", 1200);
        misProductos[1] = new Producto(1111, 7, "Semola", 1600);
        misProductos[2] = new Producto(1334, 3, "Azucar", 800);

        System.out.println("Informacion de los productos:");
        System.out.println("-------------------------------------");

        for (Producto p: misProductos){

            System.out.println("Codigo: " + p.getCodigo() + "\nNombre: " + p.getNombre() + "\nPrecio: " +
                    p.getPrecio() + "\nCantidad: " + p.getCantidad() + "\nTotal: " + p.calcularTotal()) ;
            System.out.println();

        }

    }

}
