package controller;

import domain.Presupuesto;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import utilities.GestorArchivos;
import view.MainWindow;

public class Controlador {

    private MainWindow mainW;
    private ControladorLogin cLogin;
    private ControladorPresup cPresup;
    private ControladorMainMenu cMainM;
    private ControladorEjecutar cEjec;

    public Controlador(MainWindow mainW) {
        this.mainW = mainW;
        cLogin = new ControladorLogin(this.mainW);
        cPresup = new ControladorPresup(this.mainW){
            @Override
            public void mostrar() {
                colocarValores();
            }
            
        };
        cMainM = new ControladorMainMenu(this.mainW) {
            @Override
            public void ejecutar() {
                colocarValores();
            }

        };
        cEjec = new ControladorEjecutar(this.mainW) {
            @Override
            public void borrarElementos() {
                borrarInformacion();
            }

            @Override
            public void guardarElementos() {
                guardarInformacion();
            }

        };
        this.mainW.stb.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                statusBarArrastrado(evt);
            }
        });
        this.mainW.stb.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                statusBarPresionado(evt);
            }
        });
        this.mainW.ebp.lbExitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                salirSeleccionado(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                salirDeseleccionado(evt);
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                salirPrograma(evt);
            }
        });
    }

    public void statusBarArrastrado(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.mainW.setLocation(x - this.mainW.x, y - this.mainW.y);
    }

    public void statusBarPresionado(MouseEvent evt) {
        this.mainW.x = evt.getX();
        this.mainW.y = evt.getY();
    }

    public void salirSeleccionado(MouseEvent evt) {
        this.mainW.ebp.lbExitButton.setIcon(this.mainW.ebp.exitON);
    }

    public void salirDeseleccionado(MouseEvent evt) {
        this.mainW.ebp.lbExitButton.setIcon(this.mainW.ebp.exitOFF);
    }

    public void salirPrograma(MouseEvent evt) {
        System.exit(0);
    }

    public void colocarValores() {
        ArrayList<Double> array = this.cPresup.pres.getAreas();
        ArrayList<String> array2 = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            array2.add(String.valueOf(array.get(i)));
        }
        this.cEjec.colocarValores(array2.get(0), array2.get(1), array2.get(2), array2.get(3), array2.get(4));
    }

    public void borrarInformacion() {
        this.cPresup.pres = new Presupuesto();
        this.cMainM.pres = false;
    }

    public void guardarInformacion() {
        try {
            GestorArchivos.escribirArchivo("presupuestos.txt", this.cPresup.pres.toString(), false);
        } catch (IOException e) {
            System.out.println("No se guardó el archivo");
        }
    }
}
