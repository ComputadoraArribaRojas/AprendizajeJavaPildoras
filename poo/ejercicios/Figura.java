package poo.ejercicios;

public class Figura {

    public void calcularArea(){

        System.out.println("No has introducido ninguna figura, no se puede calcular.");

    }

}

class Circulo extends Figura{

    private double radio;

    public Circulo(double radio){

        this.radio = radio;

    }

    @Override
    public void calcularArea() {

        double resultado = Math.PI*(Math.pow(radio,2));
        System.out.printf("El area de tu circulo es de: %.2f%n", resultado);

    }
}

class Rectangulo extends Figura{

    private double largo,ancho;

    public Rectangulo(double largo, double ancho){

        this.largo = largo;
        this.ancho = ancho;

    }

    @Override
    public void calcularArea() {

        double resultado = largo*ancho;
        System.out.println("El area de tu rectangulo es de: " + resultado);

    }
}

class Triangulo extends Figura{

    private double base, altura;

    public Triangulo(double base, double altura){

        this.base = base;
        this.altura = altura;

    }

    @Override
    public void calcularArea() {

        double resultado = (base*altura)/2;
        System.out.println("El area de tu triangulo es de: " + resultado);

    }
}

class Main{

    public static void main(String[] args) {

        Figura miFigura;

        miFigura = new Circulo(5);
        miFigura.calcularArea();

        miFigura = new Rectangulo(10,10);
        miFigura.calcularArea();

        miFigura = new Triangulo(10,5);
        miFigura.calcularArea();

    }

}
