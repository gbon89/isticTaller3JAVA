/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

        
public class Clase3 {

   
    public static void main(String[] args) {
      //menu.mostrarMenu();
      int Opc;
      float numeroUno;
      float numeroDos;
      Opc = menu.mostrarMenu();
      numeroUno = menu.pedirNumero();
      numeroDos = menu.pedirNumero();
      float resultado;
      resultado = menu.HacerCalculo(numeroUno, numeroDos, Opc);
        System.out.println("El resultado es:" + resultado);
    }
    
}
