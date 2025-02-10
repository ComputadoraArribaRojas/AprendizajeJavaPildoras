package ejercicioschajepete;

public interface Figura {

    double calcularArea();

    void devolverDatos();

}


class Circulo implements Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        double area = Math.PI*(Math.pow(radio,2));
        return area;

    }

    @Override
    public void devolverDatos() {

        System.out.println("El area del Circulo es: " + calcularArea());

    }
}
class Triangulo implements Figura{

    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {

        double area = (base*altura)/2;
        return area;

    }

    @Override
    public void devolverDatos() {

        System.out.println("El area del Triangulo es: " + calcularArea());


    }
}
class Rectangulo implements Figura{

    private double base, altura;

    public Rectangulo(double base, double altura){

        this.base = base;
        this.altura = altura;

    }


    @Override
    public double calcularArea() {
        double area = base*altura;
        return area;
    }

    @Override
    public void devolverDatos() {

        System.out.println("El area del Rectangulo es: " + calcularArea());


    }
}

class EjecucionFigura{

    public static void main(String[] args) {

        Figura misFiguras[] = new Figura[6];

        misFiguras[0] = new Circulo(25);
        misFiguras[1] = new Triangulo(10, 5);
        misFiguras[2] = new Rectangulo(25, 20);
        misFiguras[3] = new Rectangulo(10, 10);
        misFiguras[4] = new Circulo(25);
        misFiguras[5] = new Triangulo(25, 20);

        for (Figura f: misFiguras){

            f.devolverDatos();

        }

    }

}
