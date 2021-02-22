import javax.swing.*;
import java.awt.*;

public class JFrameIngresoA extends JFrame
{
  IngresoA piA = new IngresoA();
  
  public JFrameIngresoA()
   {   
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(300, 200);
      setTitle("Usuario y contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(piA);
      setVisible(true);
       
   }   
}
