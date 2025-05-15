import javax.swing.*;
import java.awt.*;

public class PanelMenu extends JPanel {

    public PanelMenu(VentanaJuego ventana) {
        setLayout(new GridBagLayout());
        setBackground(Color.BLACK);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        JButton botonIniciar = new JButton("Iniciar Partida");
        botonIniciar.setFont(new Font("Arial", Font.PLAIN, 24));
        botonIniciar.setPreferredSize(new Dimension(200, 50));
        botonIniciar.setBackground(Color.WHITE);
        botonIniciar.setOpaque(true);
        botonIniciar.setBorderPainted(false);
        botonIniciar.addActionListener(e -> ventana.mostrarSeleccionDificultad());
        add(botonIniciar, gbc);

        gbc.gridy = 1;
        JButton botonSalir = new JButton("Salir");
        botonSalir.setFont(new Font("Arial", Font.PLAIN, 24));
        botonSalir.setPreferredSize(new Dimension(200, 50));
        botonSalir.setBackground(Color.WHITE);
        botonSalir.setOpaque(true);
        botonSalir.setBorderPainted(false);
        botonSalir.addActionListener(e -> System.exit(0));
        add(botonSalir, gbc);
    }
}