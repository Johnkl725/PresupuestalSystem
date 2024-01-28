package view;

import components.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.LineBorder;
import utilities.GestorRecursos;

public class EjecutarPanel extends JPanelGradient{
    
    private JLabel lbEjecutar;
    private JPanelRound prFondo;
    private JLabel lbAMarketing;
    private JLabel lbALogistica;
    private JLabel lbARRHH;
    private JLabel lbAContabilidad;
    private JLabel lbAreaDeVentas;
    public JTextField tfAMarketing;
    public JTextField tfALogistica;
    public JTextField tfARRHH;
    public JTextField tfAContabilidad;
    public JTextField tfAreaDeVentas;
    public JButton btEjecutar;
    public JButton btRechazar;
    public JButton btMainMenu;

    public EjecutarPanel() {
        this.setBounds(0, 0, 1000, 600);
        this.setLayout(null);
        this.setRoundBottomLeft(50);
        this.setRoundBottomRight(50);
        this.setRoundTopLeft(50);
        this.setRoundTopRight(50);
        this.setGradientStart(new Color(155, 190, 200));
        this.setGradientEnd(new Color(221, 242, 253));
        initComponents();
    }
    public void initComponents(){
        
        Font custom = GestorRecursos.obtenerFuente("Sarala-Regular.ttf", Font.PLAIN, 16);
        
        lbEjecutar = new JLabel("Ejecutar Presupuesto");
        lbEjecutar.setBounds(150, 50, 500, 40);
        lbEjecutar.setFont(custom.deriveFont(Font.BOLD, 20));
        lbEjecutar.setForeground(Color.BLACK);
        this.add(lbEjecutar);
        
        prFondo = new JPanelRound();
        prFondo.setBounds(200, 100, 600, 400);
        prFondo.setBackground(new Color(22, 72, 99));
        prFondo.setRoundBottomLeft(50);
        prFondo.setRoundBottomRight(50);
        prFondo.setRoundTopLeft(50);
        prFondo.setRoundTopRight(50);
        prFondo.setLayout(null);
        this.add(prFondo);
        
        lbAMarketing = new JLabel("A. Marketing");
        lbAMarketing.setBounds(50, 20, 200, 30);
        lbAMarketing.setForeground(Color.WHITE);
        lbAMarketing.setFont(custom);
        prFondo.add(lbAMarketing);
        
        lbALogistica = new JLabel("A. Logística");
        lbALogistica.setBounds(50, 80, 200, 30);
        lbALogistica.setForeground(Color.WHITE);
        lbALogistica.setFont(custom);
        prFondo.add(lbALogistica);
        
        lbARRHH = new JLabel("A. RR.HH.");
        lbARRHH.setBounds(50, 140, 200, 30);
        lbARRHH.setForeground(Color.WHITE);
        lbARRHH.setFont(custom);
        prFondo.add(lbARRHH);
        
        lbAContabilidad = new JLabel("A. Contabilidad");
        lbAContabilidad.setBounds(50, 200, 200, 30);
        lbAContabilidad.setForeground(Color.WHITE);
        lbAContabilidad.setFont(custom);
        prFondo.add(lbAContabilidad);
        
        lbAreaDeVentas = new JLabel("A. de Ventas");
        lbAreaDeVentas.setBounds(50, 260, 200, 30);
        lbAreaDeVentas.setForeground(Color.WHITE);
        lbAreaDeVentas.setFont(custom);
        prFondo.add(lbAreaDeVentas);
        
        tfAMarketing = new JTextField();
        tfAMarketing.setEditable(false);
        tfAMarketing.setBounds(350, 20, 200, 30);
        tfAMarketing.setFont(custom);
        tfAMarketing.setForeground(Color.BLACK);
        tfAMarketing.setBackground(Color.WHITE);
        tfAMarketing.setBorder(new LineBorder(Color.WHITE, 2, false));
        prFondo.add(tfAMarketing);
        
        tfALogistica = new JTextField();
        tfALogistica.setEditable(false);
        tfALogistica.setBounds(350, 80, 200, 30);
        tfALogistica.setFont(custom);
        tfALogistica.setForeground(Color.BLACK);
        tfALogistica.setBackground(Color.WHITE);
        tfALogistica.setBorder(new LineBorder(Color.WHITE, 2, false));
        prFondo.add(tfALogistica);
        
        tfARRHH = new JTextField();
        tfARRHH.setEditable(false);
        tfARRHH.setBounds(350, 140, 200, 30);
        tfARRHH.setFont(custom);
        tfARRHH.setForeground(Color.BLACK);
        tfARRHH.setBackground(Color.WHITE);
        tfARRHH.setBorder(new LineBorder(Color.WHITE, 2, false));
        prFondo.add(tfARRHH);
        
        tfAContabilidad = new JTextField();
        tfAContabilidad.setEditable(false);
        tfAContabilidad.setBounds(350, 200, 200, 30);
        tfAContabilidad.setFont(custom);
        tfAContabilidad.setForeground(Color.BLACK);
        tfAContabilidad.setBackground(Color.WHITE);
        tfAContabilidad.setBorder(new LineBorder(Color.WHITE, 2, false));
        prFondo.add(tfAContabilidad);
        
        tfAreaDeVentas = new JTextField();
        tfAreaDeVentas.setEditable(false);
        tfAreaDeVentas.setBounds(350, 260, 200, 30);
        tfAreaDeVentas.setFont(custom);
        tfAreaDeVentas.setForeground(Color.BLACK);
        tfAreaDeVentas.setBackground(Color.WHITE);
        tfAreaDeVentas.setBorder(new LineBorder(Color.WHITE, 2, false));
        prFondo.add(tfAreaDeVentas);
        
        btEjecutar = new JButton("Ejecutar");
        btEjecutar.setBounds(175, 320, 100, 30);
        btEjecutar.setForeground(Color.WHITE);
        btEjecutar.setBackground(Color.BLACK);
        btEjecutar.setFont(custom);
        btEjecutar.setBorder(new LineBorder(Color.BLACK, 2, false));
        prFondo.add(btEjecutar);
        
        btRechazar = new JButton("Rechazar");
        btRechazar.setBounds(325, 320, 100, 30);
        btRechazar.setForeground(Color.WHITE);
        btRechazar.setBackground(Color.BLACK);
        btRechazar.setFont(custom);
        btRechazar.setBorder(new LineBorder(Color.BLACK, 2, false));
        prFondo.add(btRechazar);
        
        btMainMenu = new JButton("Regresar");
        btMainMenu.setBounds(325, 320, 100, 30);
        btMainMenu.setForeground(Color.WHITE);
        btMainMenu.setBackground(Color.BLACK);
        btMainMenu.setFont(custom);
        btMainMenu.setBorder(new LineBorder(Color.BLACK, 2, false));
        prFondo.add(btMainMenu);
        this.btMainMenu.setVisible(false);
    }
}
