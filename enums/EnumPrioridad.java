package enums;

enum Prioridad {
    BAJA(1), MEDIA(2), ALTA(3);

    private int nivelPrioridad;

    Prioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }
}

public class EnumPrioridad {
    String tarea = "Aprender Programación";
    Prioridad prioridad = Prioridad.ALTA;

    public static void main(String[] args) {
        EnumPrioridad miPrioridad = new EnumPrioridad();

        System.out.println(miPrioridad.tarea + " tiene prioridad " +
                miPrioridad.prioridad.name() + " (Nivel " +
                miPrioridad.prioridad.getNivelPrioridad() + ")");
    }
}
