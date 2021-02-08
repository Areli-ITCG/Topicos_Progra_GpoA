import javax.swing.*;
import java.awt.event.*;

public class CentToFar extends JFrame
{
  JTextField centi;
  JTextField far;
  JButton btnAceptar;
  JButton btnSalir;
  JLabel GCenti, GFar, letrero;
  JPanel panel;
  
  public CentToFar()
  {
   initComponents();
  }
  
  private void initComponents()
  {
    setSize(400, 300);
    centi = new JTextField(10);
    far = new JTextField();
    far.setEditable(false);
    letrero = new JLabel("Convierte Grados Centigrados a Farenheit");
    GCenti = new JLabel("Grados Centigrados: ");
    GFar = new JLabel("Grados Farenheit: ");
    btnAceptar = new JButton("Aceptar");
    btnAceptar.setMnemonic('A');
    btnSalir = new JButton ("Salir");
    btnSalir.setMnemonic('S');
    
    btnAceptar.addMouseListener(new MyClickListener());
    btnSalir.addMouseListener(new MyListener());
    
    panel = new JPanel();
    panel.add(letrero);
    panel.add(GCenti);
    panel.add(centi);
    panel.add(GFar);
    panel.add(far);
    panel.add(btnAceptar);
    panel.add(btnSalir);
    setTitle("Centigrados a Farenheit");
    setContentPane(panel);
    setVisible(true);
  }
  
  private class MyClickListener extends MouseAdapter
  {
    double farenheit=0.0;
    int gcent=0;
    
    public void mouseClicked(MouseEvent event)
    {
     try{
          gcent = Integer.parseInt(String.trim(centi.getText()));
          farenheit = (gcent * 9 / 5) + 32;//conversión
          far.setText(String.valueOf(farenheit));
        }
      catch(NumberFormatException e)
      {
        JOptionPane.showMessageDialog(null, "El valor de los grados centigrados no es correcto");
        centi.setText(" ");//centi.setText(null)
        centi.requestFocus();
        far.setText("32.00");
      }
        
    }
  }    
   private class MyListener extends MouseAdapter
  {
    public void mouseClicked(MouseEvent event)
    {
      System.exit(0);
     }
   }
}
