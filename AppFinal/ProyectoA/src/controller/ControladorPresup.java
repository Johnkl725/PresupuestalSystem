package controller;

import domain.Presupuesto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import view.MainWindow;

public class ControladorPresup implements ActionListener{

    private MainWindow mainW;
    public Presupuesto pres;
    
    public ControladorPresup(MainWindow mainW) {
        this.mainW = mainW;
        this.mainW.presup.btRegistrar.addActionListener(this);
    }
    
    public boolean validarDatos(){
        String nombre = this.mainW.presup.tfNombre.getText().trim();
        String rubro = this.mainW.presup.tfRubro.getText().trim();
        String año = this.mainW.presup.tfAño.getText().trim();
        String valor = this.mainW.presup.tfValorMoneratio.getText().trim();
        int num1 = 0;
        double num2 = 0;
        try{
            num1 = Integer.parseInt(año);
            if(num1<1500||num1>9999){
                throw new NumberFormatException();
            }
            num2 = Double.parseDouble(valor);
            if(num2<0){
                throw new NumberFormatException();
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error en uno o mas campos, asegúrese de revisar los datos", "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        guardarDatos(nombre, rubro, num1, num2);
        return true;
    }
    
    public void guardarDatos(String nombre, String rubro, int año, double valor){
        pres = new Presupuesto(año, nombre, rubro, valor, "\t.:Presupuesto:.");
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.mainW.presup.btRegistrar){
            if(validarDatos()){
                this.mainW.presup.setVisible(false);
                this.mainW.ejecp.setVisible(true);
                this.mainW.ejecp.btMainMenu.setVisible(true);
                this.mainW.ejecp.btRechazar.setVisible(false);
                this.mainW.ejecp.btEjecutar.setVisible(false);
                mostrar();
            }
        }
    }
    public void mostrar(){
        
    }
}
