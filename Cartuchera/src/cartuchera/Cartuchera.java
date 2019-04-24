/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartuchera;

/**
 *
 * @author PC
 */
public class Cartuchera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boligrafo uno = new Boligrafo();
        Boligrafo dos = new Boligrafo("BIC");
        dos.TuTinta.color = "rojo";
        System.out.println(dos.TuTinta.color);
        Boligrafo tres = new Boligrafo("bic","rojo",100);
             tres.Escribir("rojo", 50);
       
       
        
        if(tres.Escribir("azul", 20)==1)
        {
            System.out.println("exito");
        }else
        {
            System.out.println("nop");
        }
         if(tres.Escribir("rojo", 20)==1)
        {
            System.out.println("exito");
        }else
        {
            System.out.println("nop");
        }
          if(tres.Escribir("rojo", 200)==1)
        {
            System.out.println("exito");
        }else
        {
            System.out.println("nop");
        }
         System.out.println("quedo :" + tres.TuTinta.Cantidad);
         tres.recargar(170);
            if(tres.Escribir("rojo", 200)==1)
        {
            System.out.println("exito");
        }else
        {
            System.out.println("nop");
        }
         System.out.println("quedo :" + tres.TuTinta.Cantidad);
    }
    }
    

