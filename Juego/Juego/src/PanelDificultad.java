import javax.swing.*;
import java.awt.*;

public class PanelDificultad extends JPanel {

    public PanelDificultad(VentanaJuego ventana) {
        setLayout(new GridBagLayout());
        setBackground(Color.DARK_GRAY);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        JButton facil = new JButton("Fácil");
        facil.setFont(new Font("Arial", Font.PLAIN, 24));
        facil.setPreferredSize(new Dimension(200, 50));
        facil.setBackground(Color.WHITE);
        facil.setOpaque(true);
        facil.setBorderPainted(false);
        facil.addActionListener(e -> ventana.iniciarJuego(1));
        add(facil, gbc);

        gbc.gridy = 1;
        JButton medio = new JButton("Medio");
        medio.setFont(new Font("Arial", Font.PLAIN, 24));
        medio.setPreferredSize(new Dimension(200, 50));
        medio.setBackground(Color.WHITE);
        medio.setOpaque(true);
        medio.setBorderPainted(false);
        medio.addActionListener(e -> ventana.iniciarJuego(2));
        add(medio, gbc);

        gbc.gridy = 2;
        JButton dificil = new JButton("Difícil");
        dificil.setFont(new Font("Arial", Font.PLAIN, 24));
        dificil.setPreferredSize(new Dimension(200, 50));
        dificil.setBackground(Color.WHITE);
        dificil.setOpaque(true);
        dificil.setBorderPainted(false);
        dificil.addActionListener(e -> ventana.iniciarJuego(3));
        add(dificil, gbc);
    }
}