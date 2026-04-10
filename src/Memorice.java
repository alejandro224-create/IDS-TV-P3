import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Memorice extends JFrame{
    public Memorice() {
        // CONFIGURACIONES BASICAS
        this.setBounds(0, 0, 600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Memorama");
        this.setLayout(new BorderLayout()); // IMPORTANTE (ya no null)
        this.getContentPane().setBackground(Color.BLACK);

        this.memorice();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.repaint();
    }

    public void memorice() {
        //PANEL
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridLayout(1, 3));

        JLabel tiempoLabel = new JLabel("Tiempo: 00:00", SwingConstants.CENTER);
        JLabel movimientosLabel = new JLabel("Movimientos: 0", SwingConstants.CENTER);
        JLabel extraLabel = new JLabel("Pares correctos: 0", SwingConstants.CENTER);

        panelNorth.add(tiempoLabel);
        panelNorth.add(movimientosLabel);
        panelNorth.add(extraLabel);

        //PANEL DE LAS CARTAS
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(3, 4, 10, 10));

        for (int i = 1; i <= 12; i++) {
            JButton carta = new JButton("Carta " + i);
            panelCenter.add(carta);
        }

        //BOTONES DE ABAJO
        JPanel panelSouth = new JPanel();
        panelSouth.setLayout(new FlowLayout());

        JButton botonReiniciar = new JButton("Reiniciar");
        panelSouth.add(botonReiniciar);

        JButton botonPausa = new JButton("Pausa");
        panelSouth.add(botonPausa);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
    }
}
