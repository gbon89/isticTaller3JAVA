/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Bruno Olivera
 */
 import java.util.Scanner;
public class calcu2 {
    private static void Sumar(){
        System.out.println("Estoy sumando");
            int NumeroUno;
            int NumeroDos;
            int Suma;
            Scanner Lector;
            Lector = new Scanner(System.in);
            System.out.println("Ingrese un  numero");
            NumeroUno = Lector.nextInt();
            System.out.println("Ingrese otro numero");
            NumeroDos = Lector.nextInt();
            Suma = NumeroUno + NumeroDos;
            System.out.println("El resultado es " + Suma);
    }
    public static int SumarConRetorno(){
            System.out.println("Estoy Sumando");
                int NumeroUno;
                int NumeroDos;
                int Suma;

                Scanner Lector;
                Lector = new Scanner(System.in);

                System.out.println("Ingrese Primer Numero:");
                NumeroUno = Lector.nextInt();

                System.out.println("Ingrese Segundo Numero:");
                NumeroDos = Lector.nextInt();

                Suma = NumeroUno + NumeroDos;
                //System.out.println("La suma es:"+Suma);
                return Suma;
}
   public static int SumarConParametro(int parametro1,int parametro2){
     
      int Suma;
      Suma = parametro1 + parametro2;
      return Suma;
  }
   public static int RestarConParametro(int parametro1,int parametro2){
     
      int Resta;
      Resta = parametro1 - parametro2;
      return Resta;
  }
}
   
    

