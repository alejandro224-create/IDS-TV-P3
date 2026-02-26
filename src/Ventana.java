import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Ventana extends JFrame {
    public Ventana() {
        this.setVisible(true);
        this.setSize(1000 ,750);
        this.setLocation (200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(200, 200));
        this.setMaximumSize(new Dimension(1000, 800));
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana de Prueba");
        this.setLayout(null);
        this.getContentPane().setBackground((Color.black));
        
        //PANELS
        JPanel login_container = new JPanel();
        login_container.setSize(400,600);
        login_container.setLocation(80, 50);
        login_container.setBackground(Color.gray);
        login_container.setLayout(null);
        this.add(login_container);
        
        JPanel rgstr_container = new JPanel();
        rgstr_container.setBounds(500, 50, 400, 600);
        rgstr_container.setOpaque(true);
        rgstr_container.setBackground(Color.GRAY);
        rgstr_container.setLayout(null);
        this.add(rgstr_container);
        
        //TITULO
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


        //Texto
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

        JPasswordField password_input = new JPasswordField();
        password_input.setSize(280, 40);
        password_input.setLocation(60, 400);
        login_container.add(password_input);

        //AREA DE TEXTO
        JTextArea bio_text = new JTextArea();
        bio_text.setLocation(50, 100);
        bio_text.setSize(300, 80);
        rgstr_container.add(bio_text);

        //BOTON
        JButton access_btn = new JButton();
        access_btn.setText("Acceder");
        access_btn.setBounds(110, 540, 200, 40);
        access_btn.setFont(new Font("Arial", Font.BOLD, 20));
        login_container.add(access_btn);

        JButton register_btn = new JButton("Crear cuenta");
        register_btn.setBounds(110, 540, 200, 40);
        register_btn.setFont(new Font("Arial", Font.BOLD, 20));
        rgstr_container.add(register_btn);

        //CHECK
        JCheckBox rememberme = new JCheckBox("Recordarme");
        rememberme.setSize(140, 40);
        rememberme.setLocation(60, 450);
        rememberme.setOpaque(false);
        login_container.add(rememberme);

        JCheckBox opt_sweet = new JCheckBox("Dulce");
        opt_sweet.setBounds(50, 200, 100, 40);
        opt_sweet.setOpaque(false);
        rgstr_container.add(opt_sweet);

        JCheckBox opt_salty = new JCheckBox("Salado");
        opt_salty.setBounds(150, 200, 100, 40);
        opt_salty.setOpaque(false);
        rgstr_container.add(opt_salty);

        JCheckBox opt_healty = new JCheckBox("Saludable");
        opt_healty.setBounds(250, 200, 100, 40);
        opt_healty.setOpaque(false);
        rgstr_container.add(opt_healty);

        //BIO
        JLabel bio_tag = new JLabel("BIO");
        bio_tag.setBounds(50, 50, 300, 40);
        bio_tag.setHorizontalAlignment(JLabel.CENTER);
        bio_tag.setOpaque(false);
        bio_tag.setFont(new Font("Arial", Font.BOLD, 22));
        rgstr_container.add(bio_tag);

        //LABEL TERMS
        JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
        accept_terms.setBounds(50, 260, 200, 40);
        accept_terms.setOpaque(false);
        rgstr_container.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
        reject_terms.setBounds(200, 260, 200, 40);
        reject_terms.setOpaque(false);
        rgstr_container.add(reject_terms);

        //GRUPO DE BOTONES
        ButtonGroup terms = new ButtonGroup();
        terms.add(accept_terms);
        terms.add(reject_terms);

        //COMBO
        String [] colonias = {"Camino real","Arcoiris"};
        JComboBox colonias_combo = new JComboBox<>(colonias);
        colonias_combo.setBounds(50, 310, 300, 30);
        rgstr_container.add(colonias_combo);



        this.repaint();
    }
}
