import java.util.*;
public class ManejoPersona
{
   static ArrayList<Persona> Arrperson = new ArrayList<Persona>(); 
   private Persona objPersona;
   
   public ManejoPersona()
   {  }
   
   public void agregar(String nom, String ap, String tel, String tipo)
   {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setApellidos(ap);
    objPersona.setTelefono(tel);
    objPersona.setTipo(tipo);
    Arrperson.add(objPersona);//Agrega el objeto al arraylist
   }
   
   public void mostrar()
   {
     System.out.println("... Personas en la Agenda ...");
     Iterator<Persona> itrPersona = Arrperson.iterator();
     while(itrPersona.hasNext()){
	      Persona persona = itrPersona.next();
	    System.out.println(persona.getNombre() + "  "
			+ persona.getApellidos() + "  "
			+ persona.getTelefono() + "  "
			+ persona.getTipo());
      }
   }
  }
