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
public class TpEntradaSalida2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FuncionesEstaticas.Saludar();
        FuncionesEstaticas.SaludarConNombre("Bruno");
        FuncionesEstaticas.SaludarConNombreyApellido("Bruno", "Olivera");
        FuncionesEstaticas.SaludarConNombreyEdad("Bruno ", 30);
        FuncionesEstaticas.SumarSinRetorno(30, 40);
        FuncionesEstaticas.SumarConRetorno(23, 5);
        double prom;
        prom = FuncionesEstaticas.promedio(10, 10, 10);
        System.out.println("Su promedio" + prom);
        
    }
    
}
