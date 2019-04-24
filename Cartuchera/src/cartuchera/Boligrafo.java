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
public class Boligrafo {
    String Marca;
    Tinta TuTinta;
    String Color;
    int Cantidad;
    
    public Boligrafo(){
        this.TuTinta = new Tinta();
        
    }
    
    public Boligrafo(String Marca){
        this();//llamo al constructor por defecto
     //   this.TuTinta = new Tinta();//en este caso tambien llamo al constructor por defecto pero lo ideal es el 
        this.Marca = Marca;
    }
    public  Boligrafo(String Marca, String Color, int Cantidad){
        this(Marca);//llama al segundo constructor que ya tiene al atributo marca
        this.TuTinta.color=Color;
        this.TuTinta.Cantidad=Cantidad;    
        
       // System.out.println("todi");
    }
    public int Escribir(String color,int cantidad)
    {
        int retorno=0;
        if(this.TuTinta.color==color)
        {
            if(this.TuTinta.Cantidad> cantidad)
                {                    
                    retorno=1;
                    this.TuTinta.Cantidad=this.TuTinta.Cantidad-cantidad;
                }           
        }
        return retorno;
    }
    public void recargar(int cantidad)
   {
       this.TuTinta.Cantidad=this.TuTinta.Cantidad +cantidad;
   }
    
    public void reciclar(String color,int cantidad)
    {
        
    }
}
