/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities.tabla;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leocv
 */
public class ModeloTabla extends DefaultTableModel{
    String[] titulos; 
    String[][] datos;

    public ModeloTabla(String[] titulos, String[][] datos) {
        super();
        this.titulos = titulos;
        this.datos = datos;
        setDataVector(datos, titulos);
    }

    public ModeloTabla() {
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    
    
}
