/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

/**
 *
 * @author PC
 */
public class Instancias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int legajo; 
        String nombre;
        alumno UnAlumno;
        UnAlumno = new alumno();
        UnAlumno.legajo = 777;
        UnAlumno.Mostrar();
        alumno otroAlumno;
        otroAlumno = new alumno();
        otroAlumno.legajo = 555;
        UnAlumno.Mostrar();
        
        Calculadora Uncal = new Calculadora();
        Uncal.numerouno = 10;
        Uncal.numerodos = 15;
        Uncal.Sumar();
        System.out.println("El resultado es " + Uncal.resultado);
    }
    
}
