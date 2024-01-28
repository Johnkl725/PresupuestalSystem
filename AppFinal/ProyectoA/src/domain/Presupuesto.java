package domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Presupuesto implements Serializable {

    private int añoInicio;
    private String nombreCliente;
    private String rubro;
    private double valorMonetario;
    private String titulo;
    private ArrayList<Double> areas;

    public Presupuesto() {
    }

    public Presupuesto(int añoInicio, String nombreCliente, String rubro,
            double valorMonetario, String titulo) {
        
        this.añoInicio = añoInicio;
        this.nombreCliente = nombreCliente;
        this.rubro = rubro;
        this.valorMonetario = valorMonetario;
        this.titulo = titulo;
        this.areas = new ArrayList<Double>();
        dividirPorAreas();
    }

    public void dividirPorAreas(){
        double aMark = 0.2, aLog = 0.3, aRRHH = 0.1, aCon = 0.2, aVen = 0.2;
        areas.add(aMark*valorMonetario);
        areas.add(aLog*valorMonetario);
        areas.add(aRRHH*valorMonetario);
        areas.add(aCon*valorMonetario);
        areas.add(aVen*valorMonetario);
    }

    public double getValorMonetario() {
        return valorMonetario;
    }

    public void setValorMonetario(double valorMonetario) {
        this.valorMonetario = valorMonetario;
    }
    
    
    public int getAñoInicio() {
        return añoInicio;
    }

    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Double> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Double> areas) {
        this.areas = areas;
    }
    
    

    @Override
    public String toString() {
        String out = "";
        out += "=========================================\n";
        out += this.titulo;
        out += "\n=========================================";
        out += "\nNombre de la Empresa: " + this.nombreCliente;
        out += "\nAño de inicio: " + this.añoInicio;
        out += "\nRubro: " + this.rubro;
        out += "\n=========================================";
        out += "\nÁreas:";
        out += "\n\t- Marketing:"+this.areas.get(0);
        out += "\n\t- Logística:"+this.areas.get(1);
        out += "\n\t- RR.HH.:"+this.areas.get(2);
        out += "\n\t- Contabilidad:"+this.areas.get(3);
        out += "\n\t- Ventas:"+this.areas.get(4);
        out += "\n=========================================";
        out += "\nValor Total: "+this.valorMonetario;
        out += "\n=========================================";
        out += "\n";

        return out;
    }
    
}
