/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class menu {
    public static int mostrarMenu() {
        System.out.println("¿Qué operación desea?");
        System.out.println("pulse 1 para sumar");
        System.out.println("pulse 2 para restar");
        System.out.println("pulse 3 para multiplicar");
        System.out.println("pulse 4 para dividir");
        Scanner miLector;
        miLector = new Scanner(System.in);
        int opcion;
        opcion = miLector.nextInt();
        while(opcion < 1 || opcion > 4 ){
            System.out.println("Registre opcion");
            opcion = miLector.nextInt();
        } 
        return opcion;
    }

    
   public static float HacerCalculo(float NumUno, float NumDos, int operador){
        float resultado = 0;
                switch(operador){
                    case 1:
                        resultado = calculadora.sumar(NumUno,NumDos);
                        break;
                    case 2:
                        resultado = calculadora.restar(NumUno, NumDos);
                        break;
                    case 3:
                        resultado = calculadora.multiplicar(NumUno, NumDos);
                        break;
                    case 4:
                        resultado = calculadora.dividir(NumUno, NumDos);
                        break;
                }
        return resultado;
        
    }
   public static float pedirNumero(){
        float retorno = 0;
        Scanner miLector;
        miLector = new Scanner(System.in);
        System.out.println("Por favor ingrese su numero;");
        retorno = miLector.nextFloat();
        
            
            
            
            
            
    return retorno;
    
   }
            
}
