import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Ventana extends JFrame {
    public Ventana() {
        this.setVisible(true);
        this.setSize(500 ,500);
        this.setLocation (200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setMinimumSize(new Dimension(200, 200));
        //this.setMaximumSize(new Dimension(800, 800));

        this.setLocationRelativeTo(null);
        this.setTitle("Ventana de Prueba");

        this.setLayout(null);

        this.getContentPane().setBackground((Color.black));

        //AÑADIENDO ELEMENTOS
        JLabel tag_title = new JLabel();
        tag_title.setText("Bienvenido");
        tag_title.setSize(150, 40);
        tag_title.setLocation(170,20);
        tag_title.setBackground(Color.white);
        tag_title.setOpaque(true);
        tag_title.setFont(new Font("Arial",Font.BOLD,22));
        tag_title.setHorizontalAlignment(JLabel.CENTER);
        this.add(tag_title);
    }
}
