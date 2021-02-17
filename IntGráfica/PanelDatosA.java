import javax.swing.*;
import java.awt.*;

public class PanelDatosA extends JPanel
{
  
  public PanelDatosA()
  {
    setLayout(new GridLayout(5,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    JTextField txtNombre = new JTextField(20);
    add(lblNombre);
    add(txtNombre);
    JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
    JTextField txtApellidos = new JTextField(30);
    add(lblApellidos);
    add(txtApellidos);
    JLabel lblTelefono = new JLabel("Celular: ", JLabel.RIGHT);
    JTextField txtTelefono = new JTextField(15);
    add(lblTelefono);
    add(txtTelefono);
    
    ButtonGroup gpoBotones = new ButtonGroup();
    JRadioButton amigo = new JRadioButton("Amigo", true);
    JRadioButton conocido = new JRadioButton("Conocido");
    gpoBotones.add(amigo);
    gpoBotones.add(conocido);
    
    add(amigo);
    add(conocido);
    
    JButton btnGuardar = new JButton("Guardar");
    JButton btnSalir = new JButton("Salir");
    
    add(btnGuardar);
    add(btnSalir);
  }
}
