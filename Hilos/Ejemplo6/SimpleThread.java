//Ejemplo para obtener el grupo de hilos activos
//clase de los hilos con los que se formará el grupo de hilos
public class SimpleThread extends Thread
{
 public SimpleThread(String str)
  {
    super(str);
  }

public void run() {
for (int i = 0; i < 5; i++)
{
try
 {
   sleep((long)(Math.random() * 1000));
  } catch (InterruptedException e) {}
 }
 System.out.format("HECHO! %s%n", getName());
 }
}
