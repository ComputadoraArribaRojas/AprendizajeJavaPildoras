package graficos;
import javax.swing.*;
import java.awt.*;

public class CrearMarcos {

    public static void main(String[] args) {

        miMarco marco = new miMarco();

        marco.setVisible(true);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}

class miMarco extends JFrame{

    public miMarco(){

        //setSize(500,300);

        //setLocation(800,300);

        setBounds(700,300, 250,250);

        //setResizable(false);

        //setExtendedState(Frame.MAXIMIZED_BOTH);

        setTitle("Mi ventanita");
    }

}