import javax.swing.*;
import java.awt.event.*;

public class Convertidor extends JFrame
{
  JTextField texto;
  JButton boton;
  JLabel respuesta, pesos;
  JPanel panel;
  
  public Convertidor()
  {
   initComponents();
  }
  
  private void initComponents()
  {
    setSize(400, 200);
    texto = new JTextField(20);
    boton = new JButton("Convertir a dólares");
    pesos = new JLabel("Dinero en pesos: ");
    respuesta = new JLabel();
    boton.addMouseListener(new MyClickListener());
    panel = new JPanel();
    panel.add(pesos);
    panel.add(texto);
    panel.add(boton);
    panel.add(respuesta);
    setContentPane(panel);
    setVisible(true);
  }
  
  private class MyClickListener extends MouseAdapter
  {
    double dolar=0.0;
    int peso=0;
    
    public void mouseClicked(MouseEvent event)
    {
      peso = Integer.parseInt(texto.getText());
      dolar = peso/20.31;
      respuesta.setText("Puedes comprar " + dolar + " dolares");
    }
  }
}
