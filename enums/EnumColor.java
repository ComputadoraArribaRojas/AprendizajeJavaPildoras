package enums;

enum Color{

    ROJO("#FF0000"),
    VERDE("#00FF00"),
    AZUL("#0000FF");

    private String codigoHex;

    Color(String codigoHex) {

        this.codigoHex = codigoHex;

    }

    public String getCodigoHex() {

        return codigoHex;

    }

}

public class EnumColor {

    public static void main(String[] args) {

        Color miColor = Color.AZUL;

        System.out.println("Color: " + miColor.name() + ", codigo HEX: " + miColor.getCodigoHex());
    }

}
