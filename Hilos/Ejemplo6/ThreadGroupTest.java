//clase principal que obtiene el grupo de hilos activos
public class ThreadGroupTest
{
 public static void main (String[] args)
{
 // Inicia tres threads primero.
  new SimpleThread("Boston").start();
  new SimpleThread("New York").start();
  new SimpleThread("Seoul").start();
 // Obtiene un ThreadGroup y muestra numero
  ThreadGroup group = Thread.currentThread().getThreadGroup();
  System.out.println("Numero de threads activos en el grupo = " + group.activeCount());
// Muestra nombres de threads en ThreadGroup.
 Thread[] tarray = new Thread[10];
  int actualSize = group.enumerate(tarray); //enumerate() permite obtener un array con los hilos activos del grupo
 for (int i=0; i<actualSize;i++)
 {
 System.out.println("Thread " + tarray[i].getName()+ " en thread group " + group.getName()); 
 }
 }
}
