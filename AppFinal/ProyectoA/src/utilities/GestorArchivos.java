package utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class GestorArchivos {

    private static String path = "src\\files\\";

    public static void escribirArchivo(String nombreArchivo, String mensaje, boolean aniadir) throws IOException {
        String nombreFullArchivo = path + nombreArchivo;
        File archivo = new File(nombreFullArchivo);
        PrintWriter salida = new PrintWriter(new FileWriter(archivo, aniadir));
        salida.println(mensaje);
        salida.close();
    }
}
