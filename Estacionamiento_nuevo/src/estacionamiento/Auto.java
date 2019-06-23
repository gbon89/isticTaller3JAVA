package estacionamiento;

import java.time.LocalTime;
import java.util.Date;

public class Auto
{
    public String Patente;
    public LocalTime fechaIngreso;
    
    public Auto(String Patente)
    {
        this.Patente = Patente;
        this.fechaIngreso = LocalTime.now();
    }
    public String Ingresos(String patente1){
        this.Patente = LocalTime.now() + " "+ patente1;
        
        return Patente;
    }

    public Date parse(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}