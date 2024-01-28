package utilities;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public abstract class GestorRecursos {

    private static String pathFont = "src\\resources\\fonts\\";
    private static String pathImage = "src\\resources\\images\\";

    public static Font obtenerFuente(String nombreFuente, int style, int size) {
        Font font = new Font("Arial", style, size);
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File(pathFont + nombreFuente));
        } catch (FontFormatException | IOException ex) {
            ex.printStackTrace(System.out);
        }
        return font.deriveFont(style, size);
    }
    
    public static ImageIcon obtenerIcon(String nombreImagen, int ancho, int alto){
        ImageIcon icon = new ImageIcon(pathImage+nombreImagen);
        Image scaled = icon.getImage().getScaledInstance(alto, ancho, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaled);
        return icon;
    }
}
