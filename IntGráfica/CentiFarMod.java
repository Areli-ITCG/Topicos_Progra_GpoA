import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CentiFarMod extends JFrame
{
  JTextField cent, far;
  JButton btnAceptar, btnSalir;
  JLabel lblLetrero, lblCent, lblFar;
  JPanel panel;
  private Object objTextField;
  
  public CentiFarMod()
  {
   initComponents();
  }
  
  private void initComponents()
  {
    setSize(400, 200);
    lblLetrero = new JLabel("Convertidor Grados Centigrados a Farenheit");
    lblCent = new JLabel("Grados Centigrados: ");
    cent = new JTextField(10);
    lblFar = new JLabel("Grados Farenheit: ");
    far = new JTextField(10);
    btnAceptar = new JButton("Aceptar");
    btnAceptar.setMnemonic('A');
    btnSalir = new JButton("Salir");
    btnSalir.setMnemonic('S');
    
    panel = new JPanel();
    
    panel.add(lblLetrero);
    panel.add(lblCent);
    lblCent.setBounds(12,28,116,16);
    panel.add(cent);
    cent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    cent.setBounds(132, 28, 144, 20);
    
    btnSalir.addMouseListener(new MyClick());
    
    KeyAdapter kl = new KeyAdapter()//clase anónima
    {
      public void keyTyped(KeyEvent evt)
      {
         GradosKeyTyped(evt);
      }
    };
    cent.addKeyListener(kl);
    
    KeyAdapter klF = new KeyAdapter()//clase anónima
    {
      public void keyTyped(KeyEvent evt)
      {
         GradosKeyTyped(evt);
      }
    };
    far.addKeyListener(klF);

    
    btnAceptar.addActionListener(new ActionListener()
    {
     public void actionPerformed(ActionEvent evt)
     {
       btnAceptarActionPerformed(evt);
     }
    });
    
 
    panel.add(lblFar);
    panel.add(far);
    panel.add(btnAceptar);
    panel.add(btnSalir);
    setContentPane(panel);
    setVisible(true);
  }
  
    private void GradosKeyTyped(KeyEvent evt)
    {
      objTextField = evt.getSource();//objeto que produce el evento
    }

     private void btnAceptarActionPerformed(ActionEvent evt)
    {
       try {
             double grados;
             if(objTextField == cent)
             {
               grados = Double.parseDouble(cent.getText())*9.0/5.0+32.0;
               String texto = String.format("%.2f", grados);
               far.setText(texto);
             }
             if(objTextField == far)
             {
               grados =( Double.parseDouble(far.getText()) - 32.0 )*5.0/9.0;
               String texto = String.format("%.2f", grados);
               cent.setText(texto);
             }

           }
           catch(NumberFormatException e)
           {
             JOptionPane.showMessageDialog(null, "El valor es incorrecto",
            "Error", JOptionPane.ERROR_MESSAGE);
            far.setText("");
            cent.setText("");
            cent.requestFocus();
           }
    }
  private class MyClick extends MouseAdapter
  {
    public void mouseClicked(MouseEvent event)
    {
      System.exit(0);
    }
  }

}
