/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author Bruno Olivera
 */
public class Calculando {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int PrimerValor;
        int SegundoValor;
        int Respuesta;
        Scanner Lector;
        Lector = new Scanner(System.in);
        System.out.println("Ingrese un número");
        PrimerValor = Lector.nextInt();
        System.out.println("Ingrese segundo número");
        SegundoValor = Lector.nextInt();
        System.out.println("--------------------");
        Respuesta = calcu2.SumarConParametro(PrimerValor, SegundoValor);
        System.out.println("La suma es: " + Respuesta);
        System.out.println("-------------------");
        Respuesta = calcu2.RestarConParametro(PrimerValor, SegundoValor);
        System.out.println("La resta es: " + Respuesta);
    }
    /*
        Calculadora.sumar();
        int resultado = Calculadora.sumarConRetorno();
        System.out.println("La suma con Retorno es:"+resultado);
        
       resultado = Calculadora.SumarconParanetro(33,33);
                System.out.println("La suma con Parametros es:"+resultado);
        /*
        System.out.println("Hola");
        Scanner lector;
        lector = new Scanner(System.in);
        int edad;
        edad = lector.nextInt();
        System.out.println("La edad es"+edad);
      */
}
