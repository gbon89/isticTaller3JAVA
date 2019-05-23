package estacionamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

public class Garaje
{
    public static void ingresarAuto(Auto unAuto) throws IOException
    {
        FileWriter Archivo;
        Archivo = new FileWriter("Estacionados.txt", true);
        
        PrintWriter Escritor;
        Escritor = new PrintWriter(Archivo);
 
        Escritor.println(unAuto.Patente + "=>" + new Date());
        Archivo.close();
        
        System.out.println(unAuto.Patente);
    }
    public static ArrayList retornarListado() throws FileNotFoundException, IOException
    {
        ArrayList arrayRetorno = new ArrayList();
        File Archivo = new File("Estacionados.txt");
        FileReader Lector = new FileReader(Archivo);
        BufferedReader BF = new BufferedReader(Lector);
        
        String Renglon;
        while ((Renglon = BF.readLine()) != null)
        {
            //System.out.println(Renglon);
            arrayRetorno.add(Renglon);
        }
        return arrayRetorno;
    }
}