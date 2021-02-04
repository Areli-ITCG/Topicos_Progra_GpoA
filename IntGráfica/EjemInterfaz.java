import javax.swing.*;
public class Ejem_Interfaz extends JFrame
{
  public Ejem_Interfaz()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    setSize(300, 200);
    setTitle("Ventana con Texto");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel etiqueta = new JLabel("Hola interfaz grafica");
    JButton boton = new JButton("Aceptar");
    JTextField texto = new JTextField("Nombre", 10);
      
    JPanel panel = new JPanel();//Crea un contenedor
    panel.add(etiqueta);
    panel.add(texto);
    panel.add(boton);
    
    setContentPane(panel);
    setVisible(true);
  }
}
