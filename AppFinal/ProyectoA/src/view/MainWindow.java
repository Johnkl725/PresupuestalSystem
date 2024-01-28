package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import utilities.GestorRecursos;

public class MainWindow extends JFrame {

    public LoginPanel loginp;
    public PresupuestoPanel presup;
    public MainMenuPanel mainM;
    public EjecutarPanel ejecp;
    public StatusBar stb;
    public ExitButtonPanel ebp;
    public int x;
    public int y;

    public MainWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Presupuesto Expresss");
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        ImageIcon icon = GestorRecursos.obtenerIcon("mainIcon.png", 100, 100);
        this.setIconImage(icon.getImage());
        initComponents();
    }

    public void initComponents() {

        stb = new StatusBar();
        ebp = new ExitButtonPanel();
        this.add(stb);
        this.add(ebp);

        loginp = new LoginPanel();
        mainM = new MainMenuPanel();
        presup = new PresupuestoPanel();
        ejecp = new EjecutarPanel();


        this.add(loginp);
        this.add(presup);
        this.add(mainM);
        this.add(ejecp);

        presup.setVisible(false);
        mainM.setVisible(false);
        ejecp.setVisible(false);
    }
}
