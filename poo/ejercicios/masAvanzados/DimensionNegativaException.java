package poo.ejercicios.masAvanzados;

public final class DimensionNegativaException extends Exception {

    public DimensionNegativaException(String mensaje) {

        super(mensaje);

    }

}

abstract class Figura implements Describible {

    abstract double calcularArea();

    abstract double calcularPerimetro();

}

interface Describible {

    void mostrarDatos();

}

class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) throws DimensionNegativaException {

        if (radio < 0) {

            throw new DimensionNegativaException("ERROR: Has introducido un numero negativo.");

        } else {

            this.radio = radio;

        }

    }

    @Override
    double calcularArea() {

        return Math.PI * (Math.pow(radio, 2));

    }

    @Override
    double calcularPerimetro() {
        return 2 * (radio * Math.PI);
    }

    @Override
    public void mostrarDatos() {

        System.out.println("La figura es un circulo, su area es: " + calcularArea() +
                " y su perimetro es: " + calcularPerimetro());

    }
}

class Rectangulo extends Figura {

    private double base, altura;

    public Rectangulo(double base, double altura) throws DimensionNegativaException {

        if (base < 0 || altura < 0) {

            throw new DimensionNegativaException("ERROR: Has introducido un numero negativo.");

        } else {

            this.altura = altura;
            this.base = base;

        }

    }

    @Override
    double calcularArea() {

        return base * altura;

    }

    @Override
    double calcularPerimetro() {

        return (2 * base) + (2 * altura);
    }

    @Override
    public void mostrarDatos() {

        System.out.println("La figura es un rectangulo, su area es: " + calcularArea() +
                " y su perimetro es: " + calcularPerimetro());

    }
}

class Triangulo extends Figura {

    private double base, altura;

    public Triangulo(double base, double altura) throws DimensionNegativaException {

        if (base < 0 || altura < 0) {

            throw new DimensionNegativaException("ERROR: Has introducido un numero negativo.");

        } else {

            this.base = base;
            this.altura = altura;

        }

    }

    @Override
    double calcularArea() {

        return (base * altura) / 2;

    }

    @Override
    double calcularPerimetro() {

        double hipotenusa = Math.sqrt((Math.pow(base, 2)) + (Math.pow(altura, 2)));

        return base + altura + hipotenusa;

    }

    @Override
    public void mostrarDatos() {

        System.out.println("La figura es un triangulo, su area es: " + calcularArea() +
                " y su perimetro es: " + calcularPerimetro());

    }
}

class TestFiguras {

    public static void main(String[] args) {

        Figura miFigura;

        try {

            miFigura = new Circulo(25);
            System.out.println("El area de tu ciruclo es: " + miFigura.calcularArea());
            System.out.println(miFigura.calcularPerimetro());
            miFigura.mostrarDatos();

            miFigura = new Rectangulo(10, 10);
            System.out.println("El area de tu rectangulo es: " + miFigura.calcularArea());
            System.out.println(miFigura.calcularPerimetro());
            miFigura.mostrarDatos();

            miFigura = new Triangulo(10, 15);
            System.out.println("El area de tu triangulo es: " + miFigura.calcularArea());
            System.out.println(miFigura.calcularPerimetro());
            miFigura.mostrarDatos();

        } catch (DimensionNegativaException e) {

            System.out.println(e.getMessage());

        }


    }

}