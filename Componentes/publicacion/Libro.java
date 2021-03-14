package publicacion;

public class Libro extends Publicacion
{
    private String ISBN;
    private String edicion;
    private String autor;
       
    public String getISBN(){
     return ISBN;
    }
    
    public void setISBN(String isbn){
       ISBN = isbn;
    }
    
    public String getEdicion(){
     return edicion;
    }
    
    public void setEdicion(String ed){
        edicion = ed;
    }
    
     public String getAutor(){
     return autor;
    }
    
    public void setAutor(String au){
        autor = au;
    }

}
