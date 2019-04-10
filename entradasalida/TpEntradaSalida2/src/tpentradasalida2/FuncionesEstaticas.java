/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpentradasalida2;

/**
 *
 * @author PC
 */
public class FuncionesEstaticas {
    public static void Saludar(){
        System.out.println("Bienvenido a Java");
        System.out.println("--------------------------------");
    }
    public static void SaludarConNombre(String nombre){
           System.out.println("El nombre es:" +nombre);
           System.out.println("----------------------------");
    }
    public static void SaludarConNombreyApellido(String nombre, String apellido){
           System.out.println("El nombre es:" + nombre + "y su apellido es" + apellido);
           System.out.println("---------------------------");
    }
    public static void SaludarConNombreyEdad(String nombre, int edad){
        System.out.println("El nombre es " + nombre + "Su edad es " + edad);
        System.out.println("------------------------------");
    }
    public static void SumarSinRetorno(int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        System.out.println(resultado);
        System.out.println("------------------------------");
    } 
    public static int SumarConRetorno(int number1, int number2){
      
        int resultado1;
        resultado1 = number1 + number2;
        System.out.println(resultado1);
        return (int) resultado1;
    }
    public static double promedio(int nu, int me, int ro){
      double pro;
      pro = nu + me + ro /3;
        System.out.println(pro);
        return (double) pro;
    
    }
}
