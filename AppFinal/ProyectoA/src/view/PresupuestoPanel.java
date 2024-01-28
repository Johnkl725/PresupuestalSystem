package view;

import components.JPanelGradient;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import utilities.GestorRecursos;

public class PresupuestoPanel extends JPanelGradient {

    private JLabel lbNombre;
    private JLabel lbRubro;
    private JLabel lbValorMonetario;
    private JLabel lbAño;
    public JLabel lbSaludo;
    public JTextField tfNombre;
    public JTextField tfRubro;
    public JTextField tfAño;
    public JTextField tfValorMoneratio;
    public JButton btRegistrar;

    public PresupuestoPanel() {
        this.setBounds(0, 0, 1000, 600);
        this.setLayout(null);
        this.setRoundBottomLeft(50);
        this.setRoundBottomRight(50);
        this.setRoundTopLeft(50);
        this.setRoundTopRight(50);
        this.setGradientStart(new Color(66, 125, 157));
        this.setGradientEnd(new Color(155, 190, 200));
        initComponents();
    }

    public void initComponents() {

        Font custom = GestorRecursos.obtenerFuente("Sarala-Regular.ttf", Font.PLAIN, 16);

        lbSaludo = new JLabel("Bienvenido");
        lbSaludo.setBounds(150, 50, 300, 30);
        lbSaludo.setFont(custom.deriveFont(Font.BOLD, 20));
        lbSaludo.setForeground(Color.WHITE);
        this.add(lbSaludo);

        lbNombre = new JLabel("Ingrese el nombre:");
        lbNombre.setBounds(150, 100, 300, 30);
        lbNombre.setFont(custom);
        lbNombre.setForeground(Color.WHITE);
        this.add(lbNombre);

        tfNombre = new JTextField("Ejemplo: Interbank");
        tfNombre.setBounds(150, 140, 300, 30);
        tfNombre.setFont(custom);
        tfNombre.setForeground(Color.GRAY);  
        tfNombre.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfNombre.getText().equals("Ejemplo: Interbank")) {
                    tfNombre.setText("");
                    tfNombre.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfNombre.getText().isEmpty()) {
                    tfNombre.setForeground(Color.GRAY);
                    tfNombre.setText("Ejemplo: Interbank");
                }
            }
        });
        this.add(tfNombre);

        lbAño = new JLabel("Ingrese el año:");
        lbAño.setBounds(150, 220, 300, 30);
        lbAño.setForeground(Color.WHITE);
        lbAño.setFont(custom);
        this.add(lbAño);

        tfAño = new JTextField("Ejemplo: 2023");
        tfAño.setBounds(150, 260, 300, 30);
        tfAño.setFont(custom);
        tfAño.setForeground(Color.GRAY);
        tfAño.setBorder(new LineBorder(Color.WHITE, 3, false));
        tfAño.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfAño.getText().equals("Ejemplo: 2023")) {
                    tfAño.setText("");
                    tfAño.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfAño.getText().isEmpty()) {
                    tfAño.setForeground(Color.GRAY);
                    tfAño.setText("Ejemplo: 2023");
                }
            }
        });
        this.add(tfAño);

        lbRubro = new JLabel("Ingrese el rubro:");
        lbRubro.setBounds(550, 100, 300, 30);
        lbRubro.setFont(custom);
        lbRubro.setForeground(Color.WHITE);
        this.add(lbRubro);

        tfRubro = new JTextField("Ejemplo: Tecnologia");
        tfRubro.setBounds(550, 140, 300, 30);
        tfRubro.setFont(custom);
        tfRubro.setForeground(Color.GRAY);
        tfRubro.setBorder(new LineBorder(Color.WHITE, 3, false));
        tfRubro.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfRubro.getText().equals("Ejemplo: Tecnologia")) {
                    tfRubro.setText("");
                    tfRubro.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfRubro.getText().isEmpty()) {
                    tfRubro.setForeground(Color.GRAY);
                    tfRubro.setText("Ejemplo: Tecnologia");
                }
            }
        });
        this.add(tfRubro);

        lbValorMonetario = new JLabel("Ingrese el valor monetario ($):");
        lbValorMonetario.setBounds(550, 220, 300, 30);
        lbValorMonetario.setForeground(Color.WHITE);
        lbValorMonetario.setFont(custom);
        this.add(lbValorMonetario);

        tfValorMoneratio = new JTextField("Ejemplo: 15458900");
        tfValorMoneratio.setBounds(550, 260, 300, 30);
        tfValorMoneratio.setFont(custom);
        tfValorMoneratio.setForeground(Color.GRAY);
        tfValorMoneratio.setBackground(Color.WHITE);
        tfValorMoneratio.setBorder(new LineBorder(Color.WHITE, 3, false));
        tfValorMoneratio.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tfValorMoneratio.getText().equals("Ejemplo: 15458900")) {
                    tfValorMoneratio.setText("");
                    tfValorMoneratio.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tfValorMoneratio.getText().isEmpty()) {
                    tfValorMoneratio.setForeground(Color.GRAY);
                    tfValorMoneratio.setText("Ejemplo: 15458900");
                }
            }
        });
        this.add(tfValorMoneratio);

        btRegistrar = new JButton("Registrar");
        btRegistrar.setFont(custom);
        btRegistrar.setBounds(400, 400, 200, 30);
        btRegistrar.setBackground(Color.BLACK);
        btRegistrar.setForeground(Color.WHITE);
        btRegistrar.setBorder(new LineBorder(Color.BLACK, 2, false));
        this.add(btRegistrar);
    }
}
