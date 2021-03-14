package publicacion;

public abstract class Publicacion {
    private String titulo;
    private int numpag;
    private double precio;
     
    public String getTitulo(){
     return titulo;
    }
    
    public void setTitulo(String tit){
        titulo = tit;
    }
    public int getNumpag(){
     return numpag;
    }
    
    public void setNumpag(int np){
        numpag = np;
    }
    
    public double getPrecio(){
     return precio;
    }
    
    public void setPrecio(double pre){
        precio = pre;
    }
    
}
