import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ventana extends JFrame {
    public Ventana() {
        // CONFIGURACIONES BASICAS
        this.setBounds(0, 0, 1000, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ventana de Prueba");
        this.setLayout(null);
        this.getContentPane().setBackground((Color.black));

        // CAMBIO DE ICONO
        try {
            Image iconImage = ImageIO.read(getClass().getResource("/imagenes/perro.png"));

            this.setIconImage(iconImage);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // MENU
        JMenuBar barra = new JMenuBar();
        this.setJMenuBar(barra);

        JMenu menu1 = new JMenu("File");
        barra.add(menu1);

        JMenu menu2 = new JMenu("Edit");
        barra.add(menu2);

        JMenuItem file_m1 = new JMenuItem("New");
        menu1.add(file_m1);

        JMenuItem file_m2 = new JMenuItem("Open");
        menu1.add(file_m2);

        JMenuItem file_m3 = new JMenuItem("Close");
        menu1.add(file_m3);

        menu1.addSeparator();

        JMenu sub_menu2 = new JMenu("Save");
        menu1.add(sub_menu2);

        JMenuItem file_4 = new JMenuItem("Save");
        sub_menu2.add(file_4);

        JMenuItem file_5 = new JMenuItem("Save As...");
        sub_menu2.add(file_5);

        // SUMMONS
        // this.login();
        // this.registro();
        // this.users();
        // this.calculadora();
        // this.calculadora_layaout();
        // this.interes();
        // this.pintar();
        // this.RegistroUsuario();
        this.casa();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.repaint();
    }

    public void login() {
        // PANELS
        JPanel login_container = new JPanel();
        login_container.setBounds(285, 30, 200, 800);
        login_container.setLayout(null);
        this.add(login_container);

        // TITULO
        /*
         * JLabel tag_title = new JLabel();
         * tag_title.setText("BIENVENIDO");
         * tag_title.setBounds(100, -30, 200, 200);
         * tag_title.setBackground(Color.white);
         * tag_title.setOpaque(false);
         * tag_title.setFont(new Font("Arial", Font.BOLD, 22));
         * tag_title.setHorizontalAlignment(JLabel.CENTER);
         * login_container.add(tag_title);
         */

        // IMAGENES

        // ICONOS

        // TEXTO
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

        // CUADRO DE TEXTO
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

        // BOTON
        JButton access_btn = new JButton("Acceder");
        access_btn.setBounds(105, 540, 200, 40);
        access_btn.setFont(new Font("Arial", Font.BOLD, 20));
        access_btn.setBackground(Color.DARK_GRAY);
        access_btn.setForeground(Color.white);
        login_container.add(access_btn);

        // CHECK
        JCheckBox rememberme = new JCheckBox("Recordarme");
        rememberme.setBounds(65, 446, 150, 30);
        rememberme.setOpaque(false);
        login_container.add(rememberme);
    }

    public void registro() {
        // REGISTRO

        // PANEL
        JPanel rgstr_container = new JPanel();
        rgstr_container.setBounds(500, 50, 400, 600);
        rgstr_container.setOpaque(true);
        rgstr_container.setLayout(null);
        this.add(rgstr_container);

        // TITLE
        JLabel rgstr_tag = new JLabel("REGISTRO");
        rgstr_tag.setBounds(50, 50, 300, 40);
        rgstr_tag.setHorizontalAlignment(JLabel.CENTER);
        rgstr_tag.setOpaque(false);
        rgstr_tag.setFont(new Font("Arial", Font.BOLD, 22));
        rgstr_container.add(rgstr_tag);

        // TEXTO
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

        // CUADRO DE TEXTO
        JTextField name_text = new JTextField();
        name_text.setBounds(50, 175, 300, 40);
        name_text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        name_text.setBackground(Color.LIGHT_GRAY);
        rgstr_container.add(name_text);

        // AREA DE TEXTO
        JTextArea bio_text = new JTextArea();
        bio_text.setBounds(50, 260, 300, 80);
        bio_text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        bio_text.setBackground(Color.LIGHT_GRAY);
        rgstr_container.add(bio_text);

        // CHECK
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

        // LABEL TERMS
        JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
        accept_terms.setBounds(50, 470, 150, 20);
        accept_terms.setOpaque(false);
        rgstr_container.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
        reject_terms.setBounds(200, 470, 150, 20);
        reject_terms.setOpaque(false);
        rgstr_container.add(reject_terms);

        // BOTONES
        JButton register_btn = new JButton("Crear cuenta");
        register_btn.setBounds(50, 540, 300, 40);
        register_btn.setFont(new Font("Arial", Font.BOLD, 20));
        register_btn.setBackground(Color.DARK_GRAY);
        register_btn.setForeground(Color.WHITE);
        rgstr_container.add(register_btn);

        // GRUPO DE BOTONES
        ButtonGroup terms = new ButtonGroup();
        terms.add(accept_terms);
        terms.add(reject_terms);

        // COMBO
        String[] colonias = { "Parfum", "Eau de Toilette", "Aua Fraiche", "Perfume fougère" };
        JComboBox colonias_combo = new JComboBox<>(colonias);
        colonias_combo.setBounds(50, 500, 300, 30);
        rgstr_container.add(colonias_combo);
    }

    public void users() {

        // PANEL
        JPanel users_panel = new JPanel();
        users_panel.setBounds(50, 50, 900, 650);
        users_panel.setBackground(Color.WHITE);
        users_panel.setLayout(null);
        this.add(users_panel);

        // LISTA
        String[] table_head = { "No. Control", "Nombre", "Apellidos", "Correo electronico", "Semestre", "Carrera",
                "Acciones" };

        Object[][] table_body = {
                { "20451234", "Luis", "Hernández", "luis.hdz@example.com", "3", "Ingeniería en Sistemas", "Acciones" },
                { "20457891", "María", "Gómez", "maria.gmz@example.com", "5", "Arquitectura", "Acciones" },
                { "20453422", "Jorge", "Ramírez", "jorge.rz@example.com", "2", "Contaduría", "Acciones" },
                { "20458977", "Ana", "López", "ana.lp@example.com", "7", "Administración", "Acciones" },
                { "20452311", "Carlos", "Martínez", "carlos.mtz@example.com", "4", "Ingeniería Civil", "Acciones" },
                { "20455678", "Fernanda", "Soto", "fer.soto@example.com", "6", "Diseño Gráfico", "Acciones" },
                { "20459832", "Ricardo", "Pérez", "ricardo.pz@example.com", "1", "Ingeniería Mecánica", "Acciones" },
                { "20454490", "Daniela", "Vargas", "daniela.vg@example.com", "8", "Psicología", "Acciones" },
                { "20457701", "Héctor", "Castro", "hector.cs@example.com", "9", "Derecho", "Acciones" },
                { "20456642", "Sofía", "Navarro", "sofia.nv@example.com", "3", "Medicina", "Acciones" },
                { "20453387", "Miguel", "Ortega", "miguel.og@example.com", "10", "Ingeniería Industrial", "Acciones" },
                { "20451298", "Paola", "Reyes", "paola.ry@example.com", "2", "Mercadotecnia", "Acciones" },
                { "20451234", "Luis", "Hernández", "luis.hdz@example.com", "3", "Ingeniería en Sistemas", "Acciones" },
                { "20457891", "María", "Gómez", "maria.gmz@example.com", "5", "Arquitectura", "Acciones" },
                { "20453422", "Jorge", "Ramírez", "jorge.rz@example.com", "2", "Contaduría", "Acciones" },
                { "20458977", "Ana", "López", "ana.lp@example.com", "7", "Administración", "Acciones" },
                { "20452311", "Carlos", "Martínez", "carlos.mtz@example.com", "4", "Ingeniería Civil", "Acciones" },
                { "20455678", "Fernanda", "Soto", "fer.soto@example.com", "6", "Diseño Gráfico", "Acciones" },
                { "20459832", "Ricardo", "Pérez", "ricardo.pz@example.com", "1", "Ingeniería Mecánica", "Acciones" },
                { "20454490", "Daniela", "Vargas", "daniela.vg@example.com", "8", "Psicología", "Acciones" },
                { "20457701", "Héctor", "Castro", "hector.cs@example.com", "9", "Derecho", "Acciones" },
                { "20456642", "Sofía", "Navarro", "sofia.nv@example.com", "3", "Medicina", "Acciones" },
                { "20453387", "Miguel", "Ortega", "miguel.og@example.com", "10", "Ingeniería Industrial", "Acciones" },
                { "20451298", "Paola", "Reyes", "paola.ry@example.com", "2", "Mercadotecnia", "Acciones" },
                { "20451234", "Luis", "Hernández", "luis.hdz@example.com", "3", "Ingeniería en Sistemas", "Acciones" },
                { "20457891", "María", "Gómez", "maria.gmz@example.com", "5", "Arquitectura", "Acciones" },
                { "20453422", "Jorge", "Ramírez", "jorge.rz@example.com", "2", "Contaduría", "Acciones" },
                { "20458977", "Ana", "López", "ana.lp@example.com", "7", "Administración", "Acciones" },
                { "20452311", "Carlos", "Martínez", "carlos.mtz@example.com", "4", "Ingeniería Civil", "Acciones" },
                { "20455678", "Fernanda", "Soto", "fer.soto@example.com", "6", "Diseño Gráfico", "Acciones" },
                { "20459832", "Ricardo", "Pérez", "ricardo.pz@example.com", "1", "Ingeniería Mecánica", "Acciones" },
                { "20454490", "Daniela", "Vargas", "daniela.vg@example.com", "8", "Psicología", "Acciones" },
                { "20457701", "Héctor", "Castro", "hector.cs@example.com", "9", "Derecho", "Acciones" },
                { "20456642", "Sofía", "Navarro", "sofia.nv@example.com", "3", "Medicina", "Acciones" },
                { "20453387", "Miguel", "Ortega", "miguel.og@example.com", "10", "Ingeniería Industrial", "Acciones" },
                { "20451298", "Paola", "Reyes", "paola.ry@example.com", "2", "Mercadotecnia", "Acciones" }
        };

        DefaultTableModel model = new DefaultTableModel(table_body, table_head) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable students = new JTable(model);
        students.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        JScrollPane final_table = new JScrollPane(students);
        final_table.setBounds(90, 280, 740, 300);
        final_table.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        users_panel.add(final_table);

        // TEXTO
        JLabel user_text = new JLabel("Usuarios");
        user_text.setBounds(375, 30, 150, 80);
        user_text.setFont(new Font("Arial", Font.BOLD, 32));
        users_panel.add(user_text);

        JLabel cont_users = new JLabel("Usuarios");
        cont_users.setBounds(90, 170, 230, 40);
        cont_users.setFont(new Font("Arial", Font.BOLD, 28));
        cont_users.setBackground(Color.GRAY);
        cont_users.setOpaque(true);
        cont_users.setHorizontalAlignment(JLabel.CENTER);
        users_panel.add(cont_users);

        JLabel cont_num = new JLabel("36");
        cont_num.setBounds(90, 200, 230, 40);
        cont_num.setFont(new Font("Arial", Font.BOLD, 28));
        cont_num.setBackground(Color.GRAY);
        cont_num.setOpaque(true);
        cont_num.setHorizontalAlignment(JLabel.CENTER);
        users_panel.add(cont_num);

        // BOTONES
        JButton save_btn = new JButton("Guardar");
        save_btn.setBounds(650, 220, 80, 40);
        save_btn.setBackground(Color.DARK_GRAY);
        save_btn.setOpaque(true);
        save_btn.setHorizontalAlignment(JLabel.CENTER);
        save_btn.setForeground(Color.WHITE);
        users_panel.add(save_btn);

        JButton edit_btn = new JButton("Editar");
        edit_btn.setBounds(750, 220, 80, 40);
        edit_btn.setBackground(Color.DARK_GRAY);
        edit_btn.setOpaque(true);
        edit_btn.setHorizontalAlignment(JLabel.CENTER);
        edit_btn.setForeground(Color.WHITE);
        users_panel.add(edit_btn);

    }

    public void calculadora() {
        JPanel calculator_container = new JPanel();
        calculator_container.setBounds(300, 80, 350, 455);
        calculator_container.setLayout(null);
        calculator_container.setBackground(Color.DARK_GRAY);
        this.add(calculator_container);

        JLabel text_calculator = new JLabel("180.00");
        text_calculator.setBounds(10, 10, 330, 40);
        text_calculator.setOpaque(true);
        text_calculator.setBackground(Color.WHITE);
        text_calculator.setFont(new Font("Arial", Font.BOLD, 22));
        text_calculator.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        calculator_container.add(text_calculator);

        int cor_x = 25, cor_y = 60;
        String[] botones = { "CE", "", "", "", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", ".", "0",
                "=", "+" };

        for (int i = 0; i < 20; i++) {
            JButton ce = new JButton(botones[i]);
            ce.setBounds(cor_x, cor_y, 60, 60);
            ce.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            calculator_container.add(ce);

            cor_x += 80;
            calculator_container.add(ce);

            if (cor_x >= 330) {
                cor_x = 25;
                cor_y += 80;
            }
        }
    }

    public void calculadora_layaout() {
        JPanel calcu_layaout = new JPanel();
        calcu_layaout.setSize(500, 600);
        calcu_layaout.setLocation(250, 50);
        calcu_layaout.setBackground(Color.GRAY);

        BorderLayout layout1 = new BorderLayout();
        layout1.setVgap(5);

        calcu_layaout.setLayout(layout1);
        this.add(calcu_layaout);

        JLabel field = new JLabel("180.00");
        field.setOpaque(true);
        field.setBackground(Color.WHITE);
        field.setFont(new Font("Arial", Font.BOLD, 22));
        field.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        calcu_layaout.add(field, BorderLayout.NORTH);

        JPanel centro = new JPanel();
        centro.setBackground(Color.red);
        centro.setLayout(new GridLayout(4, 3));
        calcu_layaout.add(centro, BorderLayout.CENTER);

        String[] botones = { "9", "8", "7", "6", "5", "4", "3", "2", "1", "", "0", "." };

        for (int i = 0; i < botones.length; i++) {
            JButton btns = new JButton(botones[i]);
            // btns.setSize(20, 20);
            btns.setFont(new Font("Arial", Font.BOLD, 22));
            centro.add(btns);
        }

        JPanel sidebar = new JPanel();
        sidebar.setBackground(Color.LIGHT_GRAY);
        sidebar.setLayout(new GridLayout(6, 1));
        calcu_layaout.add(sidebar, BorderLayout.EAST);

        String[] botones2 = { "+", "-", "*", "/", "=", "CE" };

        for (int i = 0; i < botones2.length; i++) {

            JButton btns = new JButton();
            btns.setSize(50, 50);
            btns.setFont(new Font("Arial", Font.BOLD, 22));
            sidebar.add(btns);
        }

    }

    public void interes() {

        // PANEL PRINCIPAL
        JPanel interes_layaout = new JPanel();
        interes_layaout.setBounds(250, 200, 500, 400);
        interes_layaout.setBackground(Color.LIGHT_GRAY);
        interes_layaout.setLayout(new BorderLayout(10, 10));
        this.add(interes_layaout);

        // TITULO
        JLabel titulo = new JLabel("Interés", JLabel.LEFT);
        titulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
        titulo.setForeground(Color.BLACK);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        interes_layaout.add(titulo, BorderLayout.NORTH);

        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(4, 2, 10, 9));
        panelDatos.setBackground(Color.LIGHT_GRAY);

        panelDatos.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.DARK_GRAY, 3),
                "Calcular Interés"));

        JLabel capitalLabel = new JLabel("Capital:");
        capitalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        JTextField capitalField = new JTextField();

        JLabel tiempoLabel = new JLabel("Tiempo:");
        tiempoLabel.setFont(new Font("Arial", Font.BOLD, 18));
        JTextField tiempoField = new JTextField();

        JLabel tasaLabel = new JLabel("Tasa Interés:");
        tasaLabel.setFont(new Font("Arial", Font.BOLD, 18));
        JTextField tasaField = new JTextField();

        panelDatos.add(capitalLabel);
        panelDatos.add(capitalField);
        panelDatos.add(tiempoLabel);
        panelDatos.add(tiempoField);
        panelDatos.add(tasaLabel);
        panelDatos.add(tasaField);

        // PANEL BOTONES
        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.setBackground(Color.LIGHT_GRAY);

        // BOTON CALCULAR
        JButton calcular = new JButton("Calcular");

        // Cargar y escalar icono
        ImageIcon iconoCalcular = new ImageIcon(getClass().getResource("/imagenes/guardar.jpg"));
        Image imgCalcular = iconoCalcular.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        calcular.setIcon(new ImageIcon(imgCalcular));

        // Posición texto respecto al icono
        calcular.setHorizontalTextPosition(SwingConstants.RIGHT);
        calcular.setVerticalTextPosition(SwingConstants.CENTER);

        /* BOTON CANCELAR */
        JButton cancelar = new JButton("Cancelar");

        // Cargar y escalar icono
        ImageIcon iconoCancelar = new ImageIcon(getClass().getResource("/imagenes/cancelar.jpg"));
        Image imgCancelar = iconoCancelar.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        cancelar.setIcon(new ImageIcon(imgCancelar));

        // Posición texto respecto al icono
        cancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
        cancelar.setVerticalTextPosition(SwingConstants.CENTER);

        /* AGREGAR BOTONES AL PANEL */
        panelBotones.add(calcular);
        panelBotones.add(cancelar);

        /* AGREGAR PANEL DE BOTONES */
        panelDatos.add(panelBotones);

        interes_layaout.add(panelDatos, BorderLayout.CENTER);

        /* PANEL ROJO (RESULTADOS) */
        JPanel panelResultados = new JPanel();
        panelResultados.setLayout(new GridLayout(2, 2, 10, 12));
        panelResultados.setBackground(Color.LIGHT_GRAY);

        panelResultados.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.DARK_GRAY, 3),
                "Resultados"));

        JLabel interesLabel = new JLabel("Interés:");
        JTextField interesField = new JTextField();
        interesField.setEditable(false);

        JLabel montoLabel = new JLabel("Monto:");
        JTextField montoField = new JTextField();
        montoField.setEditable(false);

        panelResultados.add(interesLabel);
        panelResultados.add(interesField);
        panelResultados.add(montoLabel);
        panelResultados.add(montoField);

        interes_layaout.add(panelResultados, BorderLayout.SOUTH);

    }

    public void pintar() {
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                // g2d.drawLine(0, 0, 1000, 700);

                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.BLUE);
                g2d.drawOval(225, 200, 150, 70);

                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.MAGENTA);
                g2d.drawPolygon(new int[] { 300, 100, 500 }, new int[] { 100, 300, 300 }, 3);

                g2d.setColor(Color.BLACK);
                g2d.drawRect(550, 200, 100, 100);

                g2d.drawRoundRect(700, 200, 100, 100, 10, 10);

                g2d.drawArc(715, 160, 70, 80, 0, 180);

                g2d.setFont(new Font("Arial", Font.BOLD, 30));
                g2d.drawString("Hola mundo", 100, 100);

                g2d.fillOval(500, 500, 150, 70);

                g2d.fillPolygon(new int[] { 300, 100, 500 }, new int[] { 400, 600, 600 }, 3);

                g2d.fillRect(550, 350, 100, 100);

                g2d.fillRoundRect(700, 350, 100, 100, 10, 10);

                g2d.fillArc(715, 310, 70, 80, 0, 180);

                BufferedImage image;
                try {
                    image = ImageIO.read(new File("src/imagenes/perro.png"));
                    g2d.drawImage(image, 0, 0, null);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };
        pane.setBounds(0, 0, 1000, 800);
        this.add(pane);
    }

    public void RegistroUsuario() {
        // PANEL CENTRAL
        JPanel panelCentral = new JPanel();
        panelCentral.setBounds(40, 20, 900, 700);
        panelCentral.setLayout(new GridLayout(2, 2, 10, 10));
        panelCentral.setBackground(Color.LIGHT_GRAY);
        panelCentral.setBorder(new TitledBorder("Registro de Usuarios"));

        this.add(panelCentral);

        // DATOS GENERALES
        JPanel Datos_generales = new JPanel();
        Datos_generales.setLayout(new GridLayout(6, 2, 5, 5));
        Datos_generales.setBorder(new TitledBorder("Datos generales"));

        Datos_generales.add(new JLabel("Nombres: "));
        Datos_generales.add(new JTextField());

        Datos_generales.add(new JLabel("Apellidos: "));
        Datos_generales.add(new JTextField());

        Datos_generales.add(new JLabel(" DNI / Identificacion: "));
        Datos_generales.add(new JTextField());

        Datos_generales.add(new JLabel("Fecha de nacimiento"));
        Datos_generales.add(new JTextField());

        Datos_generales.add(new JLabel("Email: "));
        Datos_generales.add(new JTextField());

        // BLOQUE DE SELECCION DE SEXO
        Datos_generales.add(new JLabel("Sexo"));

        JPanel panelGenero = new JPanel();
        panelGenero.setLayout(new BoxLayout(panelGenero, BoxLayout.Y_AXIS));

        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton femenino = new JRadioButton("Femenino");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(femenino);

        panelGenero.add(masculino);
        panelGenero.add(femenino);
        Datos_generales.add(panelGenero);

        panelCentral.add(Datos_generales);

        // PERFIL
        JPanel perfilUsuario = new JPanel();
        perfilUsuario.setLayout(new BoxLayout(perfilUsuario, BoxLayout.Y_AXIS));
        perfilUsuario.setBorder(new TitledBorder("Perfil del Usuario"));

        JLabel imagen = new JLabel("Imagen");
        imagen.setHorizontalAlignment(SwingConstants.CENTER);

        JCheckBox mostrarFoto = new JCheckBox("Mostrar foto de perfil");
        JCheckBox mostrarFecha = new JCheckBox("Mostrar fecha de nacimiento");

        perfilUsuario.add(imagen);
        perfilUsuario.add(Box.createVerticalStrut(20));
        perfilUsuario.add(mostrarFoto);
        perfilUsuario.add(mostrarFecha);

        panelCentral.add(perfilUsuario);

        // DATOS OPCIONALES
        JPanel datosOpcionales = new JPanel();
        datosOpcionales.setLayout(new GridLayout(1, 2, 10, 10));
        datosOpcionales.setBorder(new TitledBorder("Datos Opcionales"));

        JTextArea descripcion = new JTextArea();
        JScrollPane scrollDescripcion = new JScrollPane(descripcion);

        String[] preferencias = { "Cantar", "Escuchar música", "Leer", "Deportes", "Otros" };
        JList<String> listaPreferencias = new JList<>(preferencias);
        JScrollPane scrollLista = new JScrollPane(listaPreferencias);

        datosOpcionales.add(scrollDescripcion);
        datosOpcionales.add(scrollLista);

        panelCentral.add(datosOpcionales);

        // BOTONES
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));

        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guadrar");
        JButton btnSalir = new JButton("Salir");

        panelBotones.add(btnNuevo);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnSalir);

        panelCentral.add(panelBotones);
    }

    public void casa() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                // CIELO
                g.setColor(new Color(0, 180, 220));
                g.fillRect(0, 0, 900, 400);

                //PARTE TRACERA CERCA
                g.setColor(Color.decode("#CC9945"));
                g.fillRect(160, 340, 600, 40);

                // PASTO
                g.setColor(new Color(90, 140, 40));
                g.fillRect(0, 400, 900, 60);

                // TIERRA
                g.setColor(new Color(110, 80, 40));
                g.fillRect(0, 460, 900, 140);

                // BASE DE LA CASA
                g.setColor(Color.GRAY);
                g.fillRect(294, 370, 300, 30);

                // CUERPO DE LA CASA
                g.setColor(new Color(235, 200, 120));
                g.fillRect(320, 260, 260, 110);

                //SOMBRA TECHO
                int xSombra[] = {320, 580, 580};
                int ySombra[] = {260, 290, 260};

                g.setColor(new Color(189, 157, 83));
                g.fillPolygon(xSombra, ySombra, 3);

                //SOMBRA VENTANA
                

                // LINEAS DE MADERA
                g.setColor(new Color(114, 95, 49));
                for (int y = 270; y < 360; y += 15) {
                    g.drawLine(320, y, 580, y);
                }

                // TECHO GRANDE
                int xTecho[] = { 280, 400, 620 };
                int yTecho[] = { 260, 130, 260 };

                g.setColor(new Color(170, 30, 30));
                g.fillPolygon(xTecho, yTecho, 3);

                // CHIMENEA
                g.setColor(Color.GRAY);
                g.fillRect(520, 170, 40, 70);

                g.setColor(Color.DARK_GRAY);
                g.fillRect(510, 160, 60, 15);

                // PUERTA
                g.setColor(new Color(140, 90, 20));
                g.fillRect(340, 280, 70, 90);

                // PERILLA
                g.setColor(Color.WHITE);
                g.fillOval(390, 325, 10, 10);

                //MARCO DE PUERTA
                g.setColor(Color.decode("#5C2F09"));
                g.fillRect(340, 280, 5, 90);
                g.fillRect(340, 280, 70, 5);
                g.fillRect(405, 280, 5, 90);

                // VENTANA
                g.setColor(new Color(180, 30, 30));
                g.fillRect(450, 280, 80, 70);

                // CUADROS DE LA VENTANA
                g.setColor(Color.WHITE);
                g.fillRect(455, 285, 30, 25);
                g.fillRect(495, 285, 30, 25);
                g.fillRect(455, 320, 30, 25);
                g.fillRect(495, 320, 30, 25);

                // BASE VENTANA
                g.setColor(Color.DARK_GRAY);
                g.fillRect(445, 350, 90, 10);



                // CERCA IZQUIERDA
                g.setColor(new Color(240, 180, 80));
                for (int x = 160; x < 300; x += 30) {

                    int xp[] = { x, x + 10, x + 20 };
                    int yp[] = { 330, 300, 330 };

                    g.fillPolygon(xp, yp, 3);
                    g.fillRect(x, 330, 20, 70);
                }

                // CERCA DERECHA
                for (int x = 590; x < 750; x += 30) {

                    int xp[] = { x, x + 10, x + 20 };
                    int yp[] = { 330, 300, 330 };

                    g.fillPolygon(xp, yp, 3);
                    g.fillRect(x, 330, 20, 70);
                }
            }
        };
        panel.setBounds(30, 30, 800, 600);
        this.add(panel);
    }
}
