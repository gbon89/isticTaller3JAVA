/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1ejercico1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Clase1Ejercico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un numero paraver si es primo");
        Scanner MiScanner = new Scanner(System.in);
        int i;
        int numero;
        numero = MiScanner.nextInt();
        for(i = 0; i < numero ;i++){
            if(numero%2 == 0){
                break;
            }
        }
        if(i == numero){
            System.out.println("es primo");
        } else{
            System.out.println("no es primo");
        }
    }
    
}
