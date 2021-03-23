import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class emergente extends JFrame implements ActionListener, MouseListener
{
 JLabel label;
 JPopupMenu pop=new JPopupMenu("Menu emergente");// permite generar un menu emergente
 //opciones del menu
 JMenuItem op1=new JMenuItem("opcion1");
 JMenuItem op2=new JMenuItem("opcion2");
 JMenuItem op3=new JMenuItem("opcion3");
 JMenuItem op4=new JMenuItem("opcion4");
 
 public emergente()
 {//se asocian los metodos escucha a cada opcion del menu
  op1.addActionListener(this);
  op2.addActionListener(this);
  op3.addActionListener(this);
  op4.addActionListener(this);
  //agregamos las opciones al menu emergente
  pop.add(op1);
  pop.addSeparator();//pone un separador en cada opcion
  pop.add(op2);
  pop.addSeparator();
  pop.add(op3);
  pop.addSeparator();
  pop.add(op4);
  pop.addSeparator();
  add(pop);
  label=new JLabel("hola hola!!!!");
  add(label);

  //agregamos eventos del raton a nuestro frame para poder captar las posiciones en las
  //que se activa el menu,esto sucede cuando se presiona el boton derecho del raton
  addMouseListener(this);
  addWindowListener(new WindowAdapter ()  
  {
   public void windowClosing(WindowEvent e)  
   { 
     setVisible(false);
     System.exit(0);      
    } });

 }
 public void mousePressed(MouseEvent e)
  { 
    if (e.getModifiers()!=0)     
     {
       pop.show(this,e.getX(),e.getY());
     }
  }
 public void mouseClicked(MouseEvent e)  {  }
 public void mouseReleased(MouseEvent e)  {  }  
 public void mouseEntered(MouseEvent e)  {  }  
 public void mouseExited(MouseEvent e)  {  }  
 public void actionPerformed(ActionEvent e)
  {
    if (e.getSource()==op1)    label.setText("se eligio opcion 1");
    else if (e.getSource()==op2)          label.setText("se eligio opcion 2");
    else if (e.getSource()==op3)          label.setText("se eligio opcion 3");
    else if (e.getSource()==op4)          label.setText("se eligio opcion 4");
  }
 public static void main(String arg [])
  {
   emergente emer=new emergente();
   emer.setSize(300,300);
   emer.setVisible(true);
  }

}
