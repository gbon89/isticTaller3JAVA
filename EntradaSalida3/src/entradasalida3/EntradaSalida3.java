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
public class EntradaSalida3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            FuncionesEstaticas3.Saludar();
            FuncionesEstaticas3.SaludarConNombre("Bruno");
            FuncionesEstaticas3.SaludarConNombreyApellido("Bruno", "Olivera");
            FuncionesEstaticas3.SaludarConNombreyEdad("Bruno ", 30);
            FuncionesEstaticas3.SumarSinRetorno(30, 40);
            FuncionesEstaticas3.SumarConRetorno(23, 5);
            double prom;
            prom = FuncionesEstaticas3.promedio(10, 10, 10);
            System.out.println("Su promedio" + prom);
            double perimetro;
            perimetro = FuncionesEstaticas3.PerimetroCuadrado(4);
            System.out.println("el perimetro del cuadrado es " + perimetro);
            double perimetro2;
            perimetro2 = FuncionesEstaticas3.PerimetroRectangulo(15, 7);
            System.out.println("El perimetro del rectangulo es: "+ perimetro2);
            double precioTotal;
            precioTotal = FuncionesEstaticas3.CompraTotal(23, 5.55);
            System.out.println("El total de su compra es: "+ precioTotal);
            double ganadores;
            ganadores = FuncionesEstaticas3.RepartirPremio(1000, 0.50, 0.30, 0.20);
            System.out.println(ganadores);
            double sueldoaCobrar;
            sueldoaCobrar = FuncionesEstaticas3.CalcularSueldo(100, 180, 0.85);
            System.out.println("El sueldo a cobrar serà" + sueldoaCobrar);
            double precioCalculado;
            precioCalculado = FuncionesEstaticas3.CalcularImpuesto(350);
            System.out.println("Precio total del producto con el impuesto del 35% incluido: "+precioCalculado);
                    
                    }
}