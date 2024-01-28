package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import view.MainWindow;

public class ControladorLogin{

    private MainWindow mainW;
    public String usuario;

    public ControladorLogin(MainWindow mainW) {
        this.mainW = mainW;
        this.mainW.loginp.lbIngresar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseExited(MouseEvent e) {
                mainW.loginp.prIngresar.setBackground(Color.BLACK);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                mainW.loginp.prIngresar.setBackground(new Color(50, 50, 50));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                btIngresarPresionado();
            }
            
        });
    }

    public boolean validarLogin() {
        String usuario = this.mainW.loginp.tfUsuario.getText().trim();
        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(mainW, "Usuario vacío", "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        JOptionPane.showMessageDialog(mainW, ("Bienvenido " + usuario), "Validación", JOptionPane.INFORMATION_MESSAGE);
        this.usuario = usuario;
        return true;
    }
    
    public void btIngresarPresionado(){
        if(validarLogin()){
            this.mainW.loginp.setVisible(false);
            this.mainW.presup.lbSaludo.setText("Bienvenido " + usuario);
            this.mainW.mainM.setVisible(true);
        }
    }

}
