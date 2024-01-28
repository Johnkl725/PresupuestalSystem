package view;

import components.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import utilities.GestorRecursos;

public class LoginPanel extends JPanelGradient {

    private JLabel lbTitulo;
    private JLabel lbUsuario;
    public JTextField tfUsuario;
    public JLabel lbImagen;
    public JPanelRound prIngresar;
    public JLabel lbIngresar;
    private ImageIcon imagen;

    public LoginPanel() {
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

    public void initComponents() {

        Font customFont = GestorRecursos.obtenerFuente("Sarala-Regular.ttf", Font.BOLD, 16);

        lbTitulo = new JLabel("LOGIN");
        lbTitulo.setFont(customFont.deriveFont(Font.BOLD, 50));
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitulo.setBounds(0, 50, 1000, 70);
        this.add(lbTitulo);
        
        imagen = new ImageIcon("C:\\Users\\risse\\Downloads\\ProyectoFInals\\ProyectoA\\src\\resources\\images\\iconImagen.png");
        lbImagen = new JLabel(imagen);
        lbImagen.setBounds(430, 120, imagen.getIconWidth(), imagen.getIconHeight());
        this.add(lbImagen);

        lbUsuario = new JLabel("Ingrese el nombre del usuario");
        lbUsuario.setFont(customFont);
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuario.setBounds(0, 270, 1000, 40);
        add(lbUsuario);

        tfUsuario = new JTextField("");
        tfUsuario.setFont(customFont);
        tfUsuario.setBounds(410, 320, 200, 30);
        tfUsuario.setBackground(Color.WHITE);
        tfUsuario.setBorder(new LineBorder(Color.WHITE, 3, false));
       
        tfUsuario.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfUsuario.getText().equals("Ejemplo: Ivan")) {
                    tfUsuario.setText("");
                    tfUsuario.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfUsuario.getText().isEmpty()) {
                    tfUsuario.setForeground(Color.GRAY);
                    tfUsuario.setText("Ejemplo: Ivan");
                }
            }
        });

        add(tfUsuario);

        prIngresar = new JPanelRound();
        prIngresar.setBackground(Color.BLACK);
        prIngresar.setBounds(460, 370, 100, 30);
        prIngresar.setLayout(null);
        prIngresar.setRoundBottomLeft(25);
        prIngresar.setRoundBottomRight(25);
        prIngresar.setRoundTopRight(25);
        prIngresar.setRoundTopLeft(25);

        lbIngresar = new JLabel("Ingresar");
        lbIngresar.setBounds(0, 0, 100, 30);
        lbIngresar.setFont(customFont);
        lbIngresar.setForeground(Color.WHITE);
        lbIngresar.setHorizontalAlignment(SwingConstants.CENTER);
        prIngresar.add(lbIngresar);
        this.add(prIngresar);
    }
}
