package utilities.tabla;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class GestionCeldas extends DefaultTableCellRenderer {

    private String tipo = "text";
    private Font fNormal = new Font("Verdana", Font.PLAIN, 12);
    private Font fBold = new Font("Verdana", Font.BOLD, 12);

    public GestionCeldas() {
    }

    public GestionCeldas(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Color colorFondo = null;
        Color colorFondoPorDefecto = new Color(192, 192, 192);
        Color colorFondoSeleccion = new Color(140, 140, 140);

        if (isSelected) {
            this.setBackground(colorFondoPorDefecto);
        } else {
            this.setBackground(Color.WHITE);
        }

        if (tipo.equals("texto")) {
            if (hasFocus) {
                colorFondo = colorFondoSeleccion;
            } else {
                colorFondo = colorFondoPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String) value);
            this.setBackground((isSelected) ? colorFondo : Color.WHITE);
            this.setFont(fBold);
            return this;
        }
        if(tipo.equals("numerico")){
             if (hasFocus) {
                colorFondo = colorFondoSeleccion;
            } else {
                colorFondo = colorFondoPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String) value);
            this.setBackground((isSelected) ? colorFondo : Color.WHITE);
            this.setFont(fBold);
            return this;
        }
        return this;
    }

}
