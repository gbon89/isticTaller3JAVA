package estacionamiento;

import java.util.Date;

public class Auto
{
    public String Patente;
    public Date fechaIngreso;
    
    public Auto(String Patente)
    {
        this.Patente = Patente;
        this.fechaIngreso = new Date();
    }
    public String Ingresos(String patente1){
        this.Patente = new Date() + " "+ patente1;
        
        return Patente;
    }
}