/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PC
 */
public class SalaCine {
    
    //Atributos o miembros de la Clase (Encapsulados)
    private Integer capacidad;
    private Integer asientosOcupados;
    private String tituloPelicula;
    private double precioEntrada;
    private double porcOcupacion;
    private double totaldeIngresos;
    
    //Método constructor de la clase
    public SalaCine(){
       this.capacidad = 0;
       this.asientosOcupados =0; 
       this.tituloPelicula = "";
       this.porcOcupacion =0.0;
    }
    
    //Método Constructor Sobrecargado
    public SalaCine(Integer capacidad, double precioEntrada){
        this.capacidad = capacidad;
        this.precioEntrada = precioEntrada;
        
        this.asientosOcupados =0; 
        this.tituloPelicula = "";
        this.porcOcupacion =0.0;
    }
    
    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getAsientosOcupados() {
        return this.asientosOcupados;
    }

    public void setAsientosOcupados(Integer asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public double getPorcOcupacion() {
        return porcOcupacion;
    }

    public void setPorcOcupacion(double porcOcupacion) {
        this.porcOcupacion = porcOcupacion;
    }
    
    //Métodos de Acción
    
    //Ingresa un Espectador a la Sala
    public void ingresarEspectador(Integer cantIngresa){
        this.asientosOcupados += cantIngresa;
        calcularPorcOcupacion();
        calcularTotalIngresos();
        //this.asientosOcupados = this.asientosOcupados + cantIngresa;
    }
    
    //Calcula el Total de Ingresos de la Sala
    public double totalIngresosSala(){
        return this.precioEntrada * this.asientosOcupados;
        
    }
    
    //Retorna el Procentaje de Ocupación de la Sala
    private void calcularPorcOcupacion(){
        this.porcOcupacion = (this.asientosOcupados * this.capacidad) /100;
    }
    private void calcularTotalIngresos(){
        this.totaldeIngresos = this.asientosOcupados * this.precioEntrada;    
                
                }

    public double getTotaldeIngresos() {
        return totaldeIngresos;
    }

    public void setTotaldeIngresos(double totaldeIngresos) {
        this.totaldeIngresos = totaldeIngresos;
    }
            
    public void vaciarSala(){
        this.asientosOcupados = 0;
        this.totaldeIngresos = 0;
        this.porcOcupacion = 0;
    }
}
