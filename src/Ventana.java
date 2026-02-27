import javax.swing.BorderFactory;
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
import javax.swing.border.Border;

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
        login_container.setLayout(null);
        this.add(login_container);
        
        
        //TITULO
        JLabel tag_title = new JLabel();
        tag_title.setText("BIENVENIDO");
        tag_title.setBounds(100, -30, 200, 200);
        tag_title.setBackground(Color.white);
        tag_title.setOpaque(false);
        tag_title.setFont(new Font("Arial",Font.BOLD,22));
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

        JLabel olv_text = new JLabel("¿Olvido su contraseña?");
        olv_text.setBounds(200, 446, 150, 30);
        login_container.add(olv_text);
        
        
        //CUADRO DE TEXTO
        JTextField email_input = new JTextField();
        email_input.setSize(280, 40);
        email_input.setLocation(65, 300);
        email_input.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        email_input.setBackground(Color.LIGHT_GRAY);
        login_container.add(email_input);
        
        JPasswordField password_input = new JPasswordField();
        password_input.setSize(280, 40);
        password_input.setLocation(65, 400);
        password_input.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        password_input.setBackground(Color.LIGHT_GRAY);
        login_container.add(password_input);
        
        
        //BOTON
        JButton access_btn = new JButton("Acceder");
        access_btn.setBounds(105, 540, 200, 40);
        access_btn.setFont(new Font("Arial", Font.BOLD, 20));
        access_btn.setBackground(Color.DARK_GRAY);
        access_btn.setForeground(Color.white);
        login_container.add(access_btn);

        //CHECK
        JCheckBox rememberme = new JCheckBox("Recordarme");
        rememberme.setBounds(65, 446, 150, 30);
        rememberme.setOpaque(false);
        login_container.add(rememberme);


        //REGISTRO
        
        //PANEL
        JPanel rgstr_container = new JPanel();
        rgstr_container.setBounds(500, 50, 400, 600);
        rgstr_container.setOpaque(true);
        rgstr_container.setLayout(null);
        this.add(rgstr_container);
        
        //TITLE
        JLabel rgstr_tag = new JLabel("REGISTRO");
        rgstr_tag.setBounds(50, 50, 300, 40);
        rgstr_tag.setHorizontalAlignment(JLabel.CENTER);
        rgstr_tag.setOpaque(false);
        rgstr_tag.setFont(new Font("Arial", Font.BOLD, 22));
        rgstr_container.add(rgstr_tag);

        //TEXTO
        JLabel term_text = new JLabel("TERMINOS");
        term_text.setBounds(50, 425, 300, 35);
        term_text.setHorizontalAlignment(JLabel.CENTER);
        term_text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        term_text.setOpaque(true);
        rgstr_container.add(term_text);

        JLabel pref_text = new JLabel("PREFERENCIAS");
        pref_text.setBounds(50, 350, 300, 30);
        pref_text.setFont(new Font("Arial", Font.BOLD, 12));
        pref_text.setHorizontalAlignment(JLabel.CENTER);
        rgstr_container.add(pref_text);

        JLabel bio_tag = new JLabel("BIO");
        bio_tag.setBounds(50, 223, 300, 30);
        bio_tag.setHorizontalAlignment(JLabel.CENTER);
        bio_tag.setBackground(Color.GRAY);
        bio_tag.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bio_tag.setForeground(Color.WHITE);
        bio_tag.setOpaque(true);
        rgstr_container.add(bio_tag);

        JLabel name_tag = new JLabel("NOMBRE DE USUARIO");
        name_tag.setBounds(50, 140, 300, 25);
        name_tag.setHorizontalAlignment(JLabel.CENTER);
        name_tag.setBackground(Color.GRAY);
        name_tag.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        name_tag.setForeground(Color.WHITE);
        name_tag.setOpaque(true);
        rgstr_container.add(name_tag);

        //CUADRO DE TEXTO
        JTextField name_text = new JTextField();
        name_text.setBounds(50, 175, 300, 40);
        name_text.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
        name_text.setBackground(Color.LIGHT_GRAY);  
        rgstr_container.add(name_text);

        //AREA DE TEXTO
        JTextArea bio_text = new JTextArea();
        bio_text.setBounds(50, 260, 300, 80);
        bio_text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bio_text.setBackground(Color.LIGHT_GRAY);
        rgstr_container.add(bio_text);
        
        //CHECK
        JCheckBox opt_sweet = new JCheckBox("Dulce");
        opt_sweet.setBounds(50, 385, 100, 20);
        opt_sweet.setOpaque(false);
        rgstr_container.add(opt_sweet);
        
        JCheckBox opt_salty = new JCheckBox("Salado");
        opt_salty.setBounds(150, 385, 100, 20);
        opt_salty.setOpaque(false);
        rgstr_container.add(opt_salty);
        
        JCheckBox opt_healty = new JCheckBox("Saludable");
        opt_healty.setBounds(250, 385, 100, 20);
        opt_healty.setOpaque(false);
        rgstr_container.add(opt_healty);
        
        //LABEL TERMS
        JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
        accept_terms.setBounds(50, 470, 150, 20);
        accept_terms.setOpaque(false);
        rgstr_container.add(accept_terms);
        
        JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
        reject_terms.setBounds(200, 470, 150, 20);
        reject_terms.setOpaque(false);
        rgstr_container.add(reject_terms);
        
        //BOTONES
        JButton register_btn = new JButton("Crear cuenta");
        register_btn.setBounds(50, 540, 300, 40);
        register_btn.setFont(new Font("Arial", Font.BOLD, 20));
        register_btn.setBackground(Color.DARK_GRAY);
        register_btn.setForeground(Color.WHITE);
        rgstr_container.add(register_btn);
        
        //GRUPO DE BOTONES
        ButtonGroup terms = new ButtonGroup();
        terms.add(accept_terms);
        terms.add(reject_terms);
        
        //COMBO
        String [] colonias = {"Parfum","Eau de Toilette","Aua Fraiche","Perfume fougère"};
        JComboBox colonias_combo = new JComboBox<>(colonias);
        colonias_combo.setBounds(50, 500, 300, 30);
        rgstr_container.add(colonias_combo);
        
        

        this.repaint();
    }
}
