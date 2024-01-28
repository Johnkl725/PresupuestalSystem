package view;

import components.JPanelGradient;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.LineBorder;
import utilities.GestorRecursos;

public class MainMenuPanel extends JPanelGradient{
    
    private JLabel lbRegistrarP;
    private JLabel lbEjecutarP;
    public JButton btRegistrarP;
    public JButton btEjecutarP;
    
    public MainMenuPanel() {
        this.setLayout(null);
        this.setBounds(0, 0, 1000, 600);
        this.setRoundBottomLeft(50);
        this.setRoundBottomRight(50);
        this.setRoundTopLeft(50);
        this.setRoundTopRight(50);
        this.setGradientStart(new Color(22, 72, 99));
        this.setGradientEnd(new Color(66, 125, 157));
        this.initComponents();
    }
    public void initComponents(){
        
        Font custom = GestorRecursos.obtenerFuente("Sarala-Regular.ttf", Font.PLAIN, 16);
        
        lbRegistrarP = new JLabel();
        lbRegistrarP.setBounds(150, 100, 250, 250);
        lbRegistrarP.setHorizontalAlignment(SwingConstants.CENTER);
        lbRegistrarP.setIcon(GestorRecursos.obtenerIcon("registrar.png", 200, 200));
        this.add(lbRegistrarP);
        
        lbEjecutarP = new JLabel();
        lbEjecutarP.setBounds(600, 100, 250, 250);
        lbEjecutarP.setHorizontalAlignment(SwingConstants.CENTER);
        lbEjecutarP.setIcon(GestorRecursos.obtenerIcon("ejecutar.png", 200, 200));
        this.add(lbEjecutarP);
        
        btRegistrarP = new JButton("Registrar");
        btRegistrarP.setBounds(150,400, 250, 30);
        btRegistrarP.setForeground(Color.WHITE);
        btRegistrarP.setFont(custom);
        btRegistrarP.setBackground(Color.BLACK);
        btRegistrarP.setBorder(new LineBorder(Color.BLACK, 2, false));
        this.add(btRegistrarP);
        
        btEjecutarP = new JButton("Ejecutar");
        btEjecutarP.setBounds(600,400, 250, 30);
        btEjecutarP.setForeground(Color.WHITE);
        btEjecutarP.setFont(custom);
        btEjecutarP.setBackground(Color.BLACK);
        btEjecutarP.setBorder(new LineBorder(Color.BLACK, 2, false));
        this.add(btEjecutarP);
    }
}
