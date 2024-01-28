package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import utilities.GestorRecursos;

public class StatusBar extends JPanel {

    public JLabel lbStatus;

    public StatusBar() {
        this.setBounds(0, 0, 960, 40);
        this.setLayout(null);
        this.setBackground(new Color(0,0,0,0));
        initComponents();
    }

    public void initComponents() {

        Font custom = GestorRecursos.obtenerFuente("Sarala-Regular.ttf", Font.PLAIN, 15);

        lbStatus = new JLabel(">> Presupuesto Expresss");
        lbStatus.setForeground(Color.WHITE);
        lbStatus.setBounds(10, 10, 200, 15);
        lbStatus.setFont(custom);
        this.add(lbStatus);
    }
}
