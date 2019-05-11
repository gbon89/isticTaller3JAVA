
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class garaje {
    
   public static void IngresarAuto(auto unAuto) throws IOException{
       FileWriter archivo;
       archivo = new FileWriter("estacionados.text", true);
       PrintWriter escritor;
       escritor = new PrintWriter(archivo);
      
       escritor.println(unAuto.patente + " " + new Date());
     
       String patente = unAuto.patente;
       System.out.println(unAuto.Ingresos(patente));
       
       archivo.close();
   }
   
}
