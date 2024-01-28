package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.MainWindow;

public class ControladorMainMenu implements ActionListener{
    
    public MainWindow mainW;
    public boolean pres = false;

    public ControladorMainMenu(MainWindow mainW) {
        this.mainW = mainW;
        this.mainW.mainM.btEjecutarP.addActionListener(this);
        this.mainW.mainM.btRegistrarP.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.mainW.mainM.btRegistrarP){
            pres = true;
            this.mainW.mainM.setVisible(false);
            this.mainW.presup.setVisible(true);
        }
        if(e.getSource()==this.mainW.mainM.btEjecutarP){
            if(pres){
                pres = false;
                this.mainW.mainM.setVisible(false);
                this.mainW.ejecp.setVisible(true);
                ejecutar();
            }else{
                JOptionPane.showMessageDialog(null, "Error, no hay Presupuesto registrado", "Ejecutar", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public void ejecutar(){
        
    }
}
