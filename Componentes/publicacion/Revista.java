package publicacion;

public class Revista extends Publicacion implements Periodicidad
{
    private String ISSN;
    private int numero;
    private int anio;
    
    public String getISSN(){
     return ISSN;
    }
    
    public void setISSN(String issn){
        ISSN = issn;
    }
    
    public int getNumero(){
     return numero;
    }
    
    public void setNumero(int num){
        numero = num;
    }
    
     public int getAnio(){
     return anio;
    }
    
    public void setAnio(int year){
        anio = year;
    }
    
   @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
        
  }