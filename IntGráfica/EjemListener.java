import javax.swing.*;
import java.awt.event.*;//paquete para controlar los eventos

public class EjemListener extends JFrame
{
  JTextField texto;//Reserva el espacio en memoria
  JButton boton;
  JPanel panel;
  
  public EjemListener()
  {
   initComponents();
  }
  
  private void initComponents()
  {
    setSize(400, 200);
    texto = new JTextField("0",20);//instanciación del objeto
    texto.setEditable(false);//el usuario no puede cambiar el valor del texto
    boton = new JButton("Pulsa para incrementar");
    boton.addMouseListener(new MyClickListener());
    panel = new JPanel();
    panel.add(texto);
    panel.add(boton);
    setContentPane(panel);
    setVisible(true);
  }
  
  private class MyClickListener extends MouseAdapter
  {
    int numClicks=0;
    
    public void mouseClicked(MouseEvent event)
    {
      numClicks++;
      texto.setText(String.valueOf(numClicks));
      //Los JTextField solamente pueden recibir y mostrar cadenas.
    }
  }
}
