package enums;

enum DiaSemana{

    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO

}

public class EnumDiaSemana {

    public static void main(String[] args) {


        for(DiaSemana dia : DiaSemana.values()){

            System.out.println("El dia " + (dia.ordinal() + 1) + " es " + dia);

        }

    }

}
