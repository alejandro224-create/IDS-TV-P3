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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
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
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ventana extends JFrame {
    public Ventana() {
        // CONFIGURACIONES BASICAS
        this.setBounds(0, 0, 1300, 700);
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

        JMenu switch_acount = new JMenu("Cuentas");
        barra.add(switch_acount);

        JMenuItem login = new JMenuItem("Registro");
        login.addActionListener(e -> {
            this.router("registro");
        });
        switch_acount.add(login);

        JMenuItem registro = new JMenuItem("Login");
        registro.addActionListener(e -> {
            this.router("login");
        });
        switch_acount.add(registro);

        JMenuItem file_m1 = new JMenuItem("New");
        menu1.add(file_m1);

        JMenuItem file_m2 = new JMenuItem("Open");
        menu1.add(file_m2);

        JMenuItem file_m3 = new JMenuItem("Close");
        file_m3.addActionListener(e -> {
            this.dispose();
        });
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
        // this.RegistroUsuario();
        // this.casa();
        // this.examen();
        this.dibujarEscena();
        // this.router("login");

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.repaint();
    }

    public void router(String target) {

        this.getContentPane().removeAll();

        if (target.equals("login"))
            this.login();

        if (target.equals("registro"))
            this.registro();

        this.repaint();
        this.revalidate();
    }

    public void login() {
        // PANELS
        JPanel login_container = new JPanel() {
            private Image fondo = new ImageIcon(getClass().getResource("/imagenes/NuevoFondo.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
            }
        };
        login_container.setBounds(280, 50, 400, 650);
        login_container.setLayout(null);
        this.add(login_container);

        // TITULO

        JLabel tag_title = new JLabel();
        tag_title.setText("BIENVENIDO");
        tag_title.setBounds(100, 140, 200, 200);
        tag_title.setBackground(Color.white);
        tag_title.setOpaque(false);
        tag_title.setFont(new Font("Arial", Font.BOLD, 22));
        tag_title.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(tag_title);

        // IMAGENES

        // ICONOS

        // OTROS

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
        email_input.setSize(270, 40);
        email_input.setLocation(65, 300);
        email_input.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        email_input.setBackground(Color.LIGHT_GRAY);
        login_container.add(email_input);

        JPasswordField password_input = new JPasswordField();
        password_input.setSize(270, 40);
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

        access_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email = email_input.getText();
                String password = password_input.getText();

                String correo = "fake@gmail.com";
                String contraseña = "prueba528";

                boolean emailValido = !email.equals("");
                boolean passwordValido = !password.trim().isEmpty() && password.trim().length() >= 6;

                // Validar email
                email_input.setBorder(BorderFactory.createLineBorder(
                        emailValido ? Color.GREEN : Color.RED, 3));

                // Validar password
                password_input.setBorder(BorderFactory.createLineBorder(
                        passwordValido ? Color.GREEN : Color.RED, 3));

                // Validación general
                if (!emailValido || !passwordValido) {
                    JOptionPane.showMessageDialog(null, "Completa correctamente los campos");
                } else if (!email.equals(correo) || !password.equals(contraseña)) {
                    JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectas (Esta maaaaal)", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                }

            }
        });

        JButton registro = new JButton("¿No tienes cuenta?");
        registro.setBounds(130, 590, 150, 20);
        registro.setBackground(Color.DARK_GRAY);
        registro.setFont(new Font("Arial", Font.BOLD, 10));
        registro.setForeground(Color.WHITE);
        login_container.add(registro);

        registro.addActionListener(e -> {
            this.router("registro");
        });

        // CHECK
        JCheckBox rememberme = new JCheckBox("Recordarme");
        rememberme.setBounds(65, 446, 150, 30);
        rememberme.setOpaque(false);
        login_container.add(rememberme);
    }

    public void registro() {
        // REGISTRO

        // PANEL
        JPanel rgstr_container = new JPanel() {
            private Image fondoRegister = new ImageIcon(getClass().getResource("/imagenes/FondoChido.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(fondoRegister, 0, 0, getWidth(), getHeight(), this);
            }
        };
        rgstr_container.setBounds(280, 50, 400, 650);
        rgstr_container.setOpaque(true);
        rgstr_container.setLayout(null);
        this.add(rgstr_container);

        // TITLE
        JLabel rgstr_tag = new JLabel("REGISTRO");
        rgstr_tag.setBounds(50, 50, 300, 40);
        rgstr_tag.setHorizontalAlignment(JLabel.CENTER);
        rgstr_tag.setOpaque(false);
        rgstr_tag.setFont(new Font("Arial", Font.BOLD, 22));
        rgstr_tag.setForeground(Color.WHITE);
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
        pref_text.setForeground(Color.WHITE);
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
        opt_sweet.setForeground(Color.WHITE);
        opt_sweet.setBorderPainted(true);
        rgstr_container.add(opt_sweet);

        JCheckBox opt_salty = new JCheckBox("Salado");
        opt_salty.setBounds(150, 385, 100, 20);
        opt_salty.setOpaque(false);
        opt_salty.setForeground(Color.WHITE);
        rgstr_container.add(opt_salty);

        JCheckBox opt_healty = new JCheckBox("Saludable");
        opt_healty.setBounds(250, 385, 100, 20);
        opt_healty.setOpaque(false);
        opt_healty.setForeground(Color.WHITE);
        rgstr_container.add(opt_healty);

        // LABEL TERMS
        JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
        accept_terms.setBounds(50, 470, 150, 20);
        accept_terms.setOpaque(false);
        accept_terms.setForeground(Color.WHITE);
        accept_terms.setBorderPainted(true);
        rgstr_container.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
        reject_terms.setBounds(200, 470, 150, 20);
        reject_terms.setOpaque(false);
        reject_terms.setForeground(Color.WHITE);
        rgstr_container.add(reject_terms);

        // BOTONES
        JButton register_btn = new JButton("Crear cuenta");
        register_btn.setBounds(50, 540, 300, 40);
        register_btn.setFont(new Font("Arial", Font.BOLD, 20));
        register_btn.setBackground(Color.DARK_GRAY);
        register_btn.setForeground(Color.WHITE);
        rgstr_container.add(register_btn);

        register_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = name_text.getText();
                String bio = bio_text.getText();
                Boolean accept = accept_terms.isSelected();
                Boolean reject = reject_terms.isSelected();
                Boolean check = opt_sweet.isSelected();
                Boolean check2 = opt_salty.isSelected();
                Boolean check3 = opt_healty.isSelected();

                Boolean algunoSeleccionado = check || check2 || check3;
                Boolean terminosSeleccionados = accept || reject;

                if (name.equals("")) {
                    name_text.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                } else {
                    name_text.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
                }

                if (bio.trim().isEmpty() || bio.trim().length() < 5) {
                    bio_text.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                } else {
                    bio_text.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
                }

                if (!algunoSeleccionado) {
                    opt_sweet.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                } else {
                    opt_sweet.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
                }

                if (!terminosSeleccionados) {
                    accept_terms.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                } else {
                    accept_terms.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
                }

            }
        });

        JButton login = new JButton("Ya tengo una cuenta");
        login.setBounds(130, 590, 150, 20);
        login.setFont(new Font("Arial", Font.BOLD, 10));
        login.setBackground(Color.DARK_GRAY);
        login.setForeground(Color.WHITE);
        rgstr_container.add(login);

        login.addActionListener(e -> {
            this.router("login");
        });

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

    public void examen() {

        JPanel ventana = new JPanel();
        ventana.setBounds(90, 50, 700, 650);
        ventana.setBackground(Color.WHITE);
        ventana.setLayout(null);
        this.add(ventana);

        // PARTE SUPERIOR
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 700, 80);
        panel.setBackground(new Color(0, 102, 153));
        panel.setLayout(null);
        ventana.add(panel);

        JLabel titulo = new JLabel("Factura en Java - Visual estudio - ArrayList y POO");
        titulo.setBounds(20, 15, 500, 25);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titulo);

        JLabel subtitulo = new JLabel("[Sin base de datos]");
        subtitulo.setBounds(20, 40, 200, 20);
        subtitulo.setForeground(Color.WHITE);
        panel.add(subtitulo);

        // DATOS
        JPanel cliente = new JPanel();
        cliente.setBorder(BorderFactory.createTitledBorder("Datos del cliente"));
        cliente.setLayout(null);
        cliente.setBounds(30, 90, 640, 100);
        ventana.add(cliente);

        JLabel documento = new JLabel("Documento:");
        documento.setBounds(30, 20, 70, 20);
        cliente.add(documento);

        JTextField doc_text = new JTextField("123456");
        doc_text.setBounds(120, 23, 70, 20);
        cliente.add(doc_text);

        JLabel nombre = new JLabel("Nombres:");
        nombre.setBounds(400, 20, 70, 20);
        cliente.add(nombre);

        JTextField name_text = new JTextField("Jhon Doe");
        name_text.setBounds(490, 23, 70, 20);
        cliente.add(name_text);

        JLabel direccion = new JLabel("Dierccion:");
        direccion.setBounds(30, 65, 70, 20);
        cliente.add(direccion);

        JTextField direc_text = new JTextField("Calle 1 # 123");
        direc_text.setBounds(120, 65, 70, 20);
        cliente.add(direc_text);

        JLabel telefono = new JLabel("Telefono:");
        telefono.setBounds(400, 65, 70, 20);
        cliente.add(telefono);

        JTextField tel_text = new JTextField("5554433");
        tel_text.setBounds(490, 65, 70, 20);
        cliente.add(tel_text);

        // FACTURA
        JPanel factura = new JPanel();
        factura.setBounds(30, 200, 640, 60);
        factura.setBorder(BorderFactory.createTitledBorder("Datos de factura"));
        factura.setLayout(null);
        ventana.add(factura);

        JLabel nFactura = new JLabel("N° Factura:");
        nFactura.setBounds(30, 20, 70, 20);
        factura.add(nFactura);

        JTextField fac_text = new JTextField("1");
        fac_text.setBounds(120, 20, 70, 20);
        factura.add(fac_text);

        JLabel fecha = new JLabel("Fecha:");
        fecha.setBounds(400, 20, 70, 20);
        factura.add(fecha);

        JTextField fecha_text = new JTextField("2021/06/21");
        fecha_text.setBounds(490, 20, 70, 20);
        factura.add(fecha_text);

        // TABLA
        String[] columnas = { "Producto", "Cantidad", "Valor", "Sub Total" };
        Object[][] datos = {
                { "Agua", 2, 500, 1000.0 },
                { "Cereal", 5, 1000, 5000.0 },
                { "Leche", 2, 300, 600.0 }
        };

        JTable tabla = new JTable(new javax.swing.table.DefaultTableModel(datos, columnas));
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(30, 300, 640, 120);
        ventana.add(scroll);

        // BOTONE
        JPanel botones = new JPanel();
        botones.setBounds(30, 270, 640, 30);
        botones.setLayout(null);
        ventana.add(botones);

        JLabel text = new JLabel("Ver listado de facturas");
        text.setBounds(35, 5, 130, 20);
        botones.add(text);

        JButton btnAgregar = new JButton("Añadir");
        btnAgregar.setBounds(440, 5, 80, 20);
        botones.add(btnAgregar);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(550, 5, 80, 20);
        botones.add(btnEliminar);

        // TOTAL
        JPanel total_panel = new JPanel();
        total_panel.setBounds(30, 430, 640, 200);
        total_panel.setLayout(null);
        ventana.add(total_panel);

        JLabel subtotal = new JLabel("Subtotal:");
        subtotal.setBounds(30, 10, 100, 30);
        total_panel.add(subtotal);

        JLabel subtotal_text = new JLabel("6600.0");
        subtotal_text.setBounds(90, 10, 100, 30);
        total_panel.add(subtotal_text);

        JLabel descuento_tag = new JLabel("% Descuento:");
        descuento_tag.setBounds(30, 50, 80, 30);
        total_panel.add(descuento_tag);

        JTextField descuento = new JTextField("5");
        descuento.setBounds(140, 55, 30, 20);
        total_panel.add(descuento);

        JCheckBox check = new JCheckBox();
        check.setBounds(180, 52, 20, 25);
        total_panel.add(check);

        JLabel valor_des = new JLabel("Valor descontado:");
        valor_des.setBounds(250, 53, 110, 20);
        total_panel.add(valor_des);

        JLabel valor_text = new JLabel("330.0");
        valor_text.setBounds(370, 53, 100, 20);
        total_panel.add(valor_text);

        JLabel iva = new JLabel("IVA 19%:");
        iva.setBounds(30, 95, 110, 20);
        total_panel.add(iva);

        JLabel iva_text = new JLabel("1254.0");
        iva_text.setBounds(90, 95, 100, 20);
        total_panel.add(iva_text);

        JLabel total_fac = new JLabel("Total Factura:");
        total_fac.setBounds(30, 130, 110, 20);
        total_panel.add(total_fac);

        JLabel total_text = new JLabel("7524.0");
        total_text.setBounds(120, 130, 100, 20);
        total_panel.add(total_text);

        JButton finalizar = new JButton("Finalizar factura");
        finalizar.setBounds(440, 160, 180, 30);
        total_panel.add(finalizar);

        JPanel borde = new JPanel();
        borde.setBounds(0, 630, 700, 20);
        borde.setBackground(new Color(0, 102, 153));
        ventana.add(borde);
    }

    public void dibujarEscena() {
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);

                Graphics2D g2 = (Graphics2D) g;

                //FONDO
                g2.setColor(new Color(150, 200, 215));
                g2.fillRect(0, 0, 1300, 700);

                //SUELO
                g2.setColor(new Color(220, 175, 155));
                g2.fillRoundRect(0, 580, 1300, 120, 20, 20);

                //BLOQUES FLOTANTES
                g2.setColor(new Color(245, 140, 85));

                g2.fillRect(200, 40, 70, 70);
                g2.fillRect(280, 40, 70, 70);

                g2.fillRect(40, 280, 70, 70);

                g2.fillRect(1150, 120, 70, 70);

                g2.setColor(Color.BLACK);
                g2.setStroke(new BasicStroke(3));
                g2.drawRect(200, 40, 70, 70);
                g2.drawRect(280, 40, 70, 70);
                g2.drawRect(40, 280, 70, 70);
                g2.drawRect(1150, 120, 70, 70);

                //SOMBRAS
                g2.fillRoundRect(550, 235, 220, 345, 15, 15); // sombra azul

                //BLOQUE AZUL
                g2.setColor(new Color(110, 160, 210));
                g2.fillRoundRect(520, 198, 220, 380, 15, 15);

                g2.setColor(Color.BLACK);
                g2.drawRoundRect(520, 198, 220, 380, 15, 15);

                g2.fillRoundRect(430, 380, 180, 200, 15, 15); // sombra rosa

                //TORNILLOS
                g2.setColor(Color.GRAY);
                g2.fillOval(530, 210, 30, 30);
                g2.fillOval(700, 210, 30, 30);

                //BLOQUE ROSA
                g2.setColor(new Color(225, 170, 155));
                g2.fillRoundRect(380, 348, 200, 230, 15, 15);

                g2.setColor(Color.BLACK);
                g2.drawRoundRect(380, 348, 200, 230, 15, 15);

                //TORNILLOS
                g2.setColor(Color.GRAY);
                g2.fillOval(390, 355, 30, 30);
                g2.fillOval(540, 355, 30, 30);
                g2.fillOval(390, 540, 30, 30);
                g2.fillOval(540, 540, 30, 30);

                //TUBO
                
                
                g2.setColor(new Color(30, 160, 30));
                g2.fillRect(860, 380, 100, 200);
                
                g2.setColor(new Color(20, 120, 20));
                g2.fillRect(855, 340, 110, 40);
                
                g2.setColor(new Color(80, 220, 80));
                g2.fillRect(870, 340, 10, 240);
                g2.fillRect(890, 340, 5, 240);

                g2.setColor(Color.BLACK);
                g2.fillRect(928,340, 10, 240);

                g2.setColor(Color.BLACK);
                g2.drawRect(855, 340, 110, 40);
                g2.drawRect(860, 380, 100, 200);
                
                //BLOQUE VERDE
                g2.setColor(new Color(80, 200, 100));
                g2.fillRoundRect(1080, 300, 220, 280, 15, 15);

                g2.setColor(Color.BLACK);
                g2.drawRoundRect(1080, 300, 220, 280, 15, 15);

                //TORNILLOS
                g2.setColor(Color.GRAY);
                g2.fillOval(1090, 310, 30, 30);
                g2.fillOval(1090, 530, 30, 30);
            }
        };
        pane.setBounds(0, 0, 1300, 700);
        this.add(pane);

    }

}
