package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribiendoMarco {
    public static void main(String[] args) {
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame {
    public MarcoConTexto() {
        setTitle("Ventana con Texto");
        setSize(600, 450);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        Lamina miLamina = new Lamina(); // Se crea la lámina
        add(miLamina); // Se agrega antes de hacer visible la ventana

        setVisible(true); // Ahora sí se hace visible correctamente
    }
}

class Lamina extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Mishi", 100, 100); // Dibuja el texto en la posición correcta
    }
}
