package test;

import controller.Controlador;
import view.MainWindow;

public class Test1 {
    public static void main(String[] args) {
        MainWindow main = new MainWindow();
        main.setVisible(true);
        new Controlador(main);
    }
}
