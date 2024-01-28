package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import view.MainWindow;

public class ControladorEjecutar implements ActionListener {

    public MainWindow mainW;

    public ControladorEjecutar(MainWindow mainW) {
        this.mainW = mainW;
        this.mainW.ejecp.btEjecutar.addActionListener(this);
        this.mainW.ejecp.btRechazar.addActionListener(this);
        this.mainW.ejecp.btMainMenu.addActionListener(this);
    }

    public void colocarValores(String AM, String AL, String AR, String AC, String AV) {
        this.mainW.ejecp.tfAMarketing.setText(AM);
        this.mainW.ejecp.tfALogistica.setText(AL);
        this.mainW.ejecp.tfARRHH.setText(AR);
        this.mainW.ejecp.tfAContabilidad.setText(AC);
        this.mainW.ejecp.tfAreaDeVentas.setText(AV);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.mainW.ejecp.btEjecutar) {
            this.mainW.ejecp.btEjecutar.setText("Imprimiendo...");
            guardarElementos();
            Timer timer = new Timer(1000, acc -> {
                this.mainW.mainM.setVisible(true);
                this.mainW.ejecp.setVisible(false);
            });
            timer.start();
        } else if (e.getSource() == this.mainW.ejecp.btRechazar) {
            this.mainW.ejecp.setVisible(false);
            this.mainW.mainM.setVisible(true);
            borrarElementos();
        } else if (e.getSource() == this.mainW.ejecp.btMainMenu) {
            this.mainW.ejecp.setVisible(false);
            this.mainW.mainM.setVisible(true);
            this.mainW.ejecp.btEjecutar.setVisible(true);
            this.mainW.ejecp.btRechazar.setVisible(true);
        }
    }

    public void borrarElementos() {

    }

    public void guardarElementos() {

    }
}
