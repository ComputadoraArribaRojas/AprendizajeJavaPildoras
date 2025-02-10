package graficos;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class PruebaDibujo {

    public static void main(String[] args) {

        MarcoConDibujos miMarco = new MarcoConDibujos();

        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConDibujos extends JFrame{

    public MarcoConDibujos() {

        setTitle("Prueba con dibujo");

        setSize(400,400);

        LaminaConFigura miLamina = new LaminaConFigura();

        add(miLamina);

    }

}

class LaminaConFigura extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.drawRect(50,50,200,200);
        g.drawLine(100,100,50,50);
        g.drawArc(100,100,100,100,360,360);

        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);

        g2.draw(rectangulo);

    }


}