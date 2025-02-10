package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {

    public static void main(String[] args) {

        MarcoCentrado miMarcoCentrado = new MarcoCentrado();

        miMarcoCentrado.setVisible(true);
        miMarcoCentrado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoCentrado extends JFrame{

    public MarcoCentrado(){

        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        Dimension miDimension = miPantalla.getScreenSize();

        int alturaPantalla = miDimension.height;
        int anchoPantalla = miDimension.width;

        setSize(anchoPantalla/2, alturaPantalla/2);

        setLocation(anchoPantalla/4, alturaPantalla/4);

        setTitle("Mishi centrado");

    }

}
