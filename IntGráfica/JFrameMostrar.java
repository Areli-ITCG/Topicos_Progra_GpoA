import javax.swing.*;
import java.awt.*;

public class JFrameMostrar extends JFrame
{
   MostrarDatosA mostrar = new MostrarDatosA();
   
    public JFrameMostrar()
   {  
      //super.setVisible(false);
     //super.dispose();
      initComponents();
   }
   
   private void initComponents()
   {
      //super.setVisible(false);
      //super.dispose();
      setSize(300, 200);
      setTitle("Contactos Registrados");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}
