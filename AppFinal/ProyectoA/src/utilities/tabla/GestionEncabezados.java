package utilities.tabla;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;

public class GestionEncabezados implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComponent comp = null;
        if(value instanceof String){
            comp = new JLabel((String) value);
            ((JLabel)comp).setHorizontalAlignment(JLabel.CENTER);
            ((JLabel)comp).setSize(40, comp.getWidth());
            ((JLabel)comp).setPreferredSize(new Dimension(6, comp.getWidth()));
        }
        
        comp.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, new Color(22, 72, 99)));
        comp.setOpaque(true);
        comp.setBackground(new Color(22, 72, 99));
        comp.setToolTipText("Tabla de Resumen");
        comp.setForeground(Color.WHITE);
        return comp;
    }
    
}
