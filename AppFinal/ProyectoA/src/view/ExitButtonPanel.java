package view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import utilities.GestorRecursos;

public class ExitButtonPanel extends JPanel {

    public JLabel lbExitButton;
    public ImageIcon exitOFF;
    public ImageIcon exitON;

    public ExitButtonPanel() {
        this.setBounds(960, 0, 40, 40);
        this.setLayout(null);
        this.setBackground(new Color(0, 0, 0, 0));
        initComponents();
    }

    public void initComponents() {

        exitOFF = GestorRecursos.obtenerIcon("salirNormal.png", 30, 30);

        exitON = GestorRecursos.obtenerIcon("salirAlternativo.png", 30, 30);

        lbExitButton = new JLabel();
        lbExitButton.setBounds(0, 0, 40, 40);
        lbExitButton.setIcon(exitOFF);
        this.add(lbExitButton);
    }
}
