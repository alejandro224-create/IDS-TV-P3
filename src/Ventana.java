import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Ventana extends JFrame {
    public Ventana() {
        this.setVisible(true);
        this.setSize(800 ,750);
        this.setLocation (200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setMinimumSize(new Dimension(200, 200));
        //this.setMaximumSize(new Dimension(800, 800));
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana de Prueba");
        this.setLayout(null);
        this.getContentPane().setBackground((Color.black));

        //PANEL
        JPanel login_container = new JPanel();
        login_container.setSize(400,600);
        login_container.setLocation(200, 50);
        login_container.setBackground(Color.gray);
        login_container.setLayout(null);
        this.add(login_container);



        //AÑADIENDO ELEMENTOS
        JLabel tag_title = new JLabel();
        tag_title.setText("Bienvenido");
        tag_title.setSize(200, 200);
        tag_title.setLocation(100,120);
        tag_title.setBackground(Color.white);
        tag_title.setOpaque(false);
        tag_title.setFont(new Font("Arial",Font.BOLD,22));
        tag_title.setForeground(Color.WHITE);
        tag_title.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(tag_title);

        JLabel email_text = new JLabel();
        email_text.setText("Ingrese un correo");
        email_text.setSize(150, 30);
        email_text.setLocation(80, 270);
        login_container.add(email_text);

        JLabel password_text = new JLabel();
        password_text.setText("Ingrese una contraseña");
        password_text.setSize(150, 30);
        password_text.setLocation(80, 370);
        login_container.add(password_text);

        
        //CUADRO DE TEXTO
        JTextField email_input = new JTextField();
        email_input.setSize(280, 40);
        email_input.setLocation(60, 300);
        login_container.add(email_input);

        JTextField password_input = new JTextField();
        password_input.setSize(280, 40);
        password_input.setLocation(60, 400);
        login_container.add(password_input);

        //BOTON
        JButton access_btn = new JButton();
        access_btn.setText("Acceder");
        access_btn.setLocation(110, 540);
        access_btn.setSize(200, 40);
        access_btn.setFont(new Font("Arial", Font.ITALIC, 18));
        login_container.add(access_btn);

        //CHECK
        JCheckBox rememberme = new JCheckBox("Recordarme");
        rememberme.setSize(140, 40);
        rememberme.setLocation(60, 450);
        rememberme.setOpaque(false);
        login_container.add(rememberme);

        this.repaint();
    }
}
