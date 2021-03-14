package publicacion;

public class Principal {

    public static void main(String[] args) {
        int ctrlpub = 0;
      
        Object publicaciones [] = new Object[10]; //reservamos espacio
        //Damos de alta constante, para ejemplificar
        //Revista
          Revista revista = new Revista();
          revista.setISSN("1234-5678");
          revista.setTitulo("Gavilanes");
          revista.setPrecio(35.79);
          revista.setNumero(1);
          revista.setAnio(2);
          revista.setNumpag(50);
          publicaciones[ctrlpub] = revista;
          ctrlpub++;
         //Libro
         Libro libro = new Libro();
         libro.setISBN("978-67-7645");
         libro.setTitulo("Python Machine Learning");
         libro.setAutor("Sebastian Raschka");
         libro.setEdicion("Segunda");
         libro.setPrecio(550);
         libro.setNumpag(658);
         publicaciones [ctrlpub] = libro; //guarda el objeto en el arreglo
         ctrlpub++;
    
         revista.setISSN("1357-9113");
          revista.setTitulo("Developers Java");
          revista.setPrecio(45.9);
          revista.setNumero(2);
          revista.setAnio(3);
          revista.setNumpag(70);
          publicaciones[ctrlpub] = revista;
          ctrlpub++;
        
         //Ahora mostramos el contenido del arreglo     
         
          //Mostrar el arreglo
        for(int i = 0; i < ctrlpub; i ++ )
          {
             System.out.println("  " + publicaciones [i].getClass());
              if(publicaciones[i] instanceof Revista)
              {
                   Revista rev1 = new Revista();
                   rev1 = (Revista)publicaciones[i];
                    System.out.println("----REVISTA----");
                    System.out.println("ISSN " + rev1.getISSN());
                
              }
              else if (publicaciones [i] instanceof Libro )
              {
                  Libro lib = new Libro();
                  lib = (Libro)publicaciones[i];
                  System.out.println("---LIBRO---");
                 System.out.println("ISBN " + lib.getISBN());
              }
        }
        
     }
   }