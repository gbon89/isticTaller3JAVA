/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalida3;

/**
 *
 * @author Bruno Olivera
 */
public class FuncionesEstaticas3 {
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
                public static double PerimetroCuadrado(double lado){
                    double perim;
                    perim = lado * 4;
                    System.out.println(perim);
                    return (double) perim;
                }
                public static double PerimetroRectangulo(double side1,double side2){
                    double perim2;
                    perim2 = (side1 * 2 + side2 *2);
                    System.out.println(perim2);
                        return (double) perim2; 
                }
                public static double CompraTotal(int cantidad,double precio){
                    double precioCompra;
                    precioCompra = Math.floor(cantidad * precio);
                    System.out.println(precioCompra);
                    return (double) precioCompra;
                }
                public static double RepartirPremio(double premiototal,double win1, double win2, double win3){
                   
                    double premio = 0;
                    double premio1;
                    double premio2;
                    double premio3;
                    premio1 = premiototal * win1;
                    premio2 = premiototal * win2;
                    premio3 = premiototal * win3;
                        System.out.println(" Ganador uno: "+premio1+" Ganador 2: "+premio2+" Ganador 3 "+premio3);
                        return (double) premio;
                }
                public static double CalcularSueldo(double horaBasico, int horasTrabajadas, double aportes){
                    double sueldo;
                    sueldo = (horaBasico * horasTrabajadas) * 0.85;
                    System.out.println(sueldo);
                        return (double) sueldo;
                }
                public static double CalcularImpuesto(double producto){
                    double calculo;
                    calculo = producto * 0.65;
                    System.out.println(calculo);
                        return calculo;
                }
}
