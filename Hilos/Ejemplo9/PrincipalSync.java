//primer ejemplo, se sincroniza la suma de los números del 1 al 10000 
//entre dos hilos
public class PrincipalSync
{
public static void main(String arg[])
{
 Proceso p=new Proceso();
 Thread t=new Thread(p);
 Thread t2=new Thread(p);
 t.start();
 t2.start();
 synchronized(t)
 { 
  try
   {
    System.out.println("espero");
    t.wait();
    System.out.println("salgo de la espera");
 }
 catch(InterruptedException e){}
 System.out.println("La suma es = " + p.getTotal());
 }
}
}

class Proceso implements Runnable
{
 private int valor;
 public int getTotal()
 {
  return valor;
 }
  
public void run()
{
  synchronized(this)
  {
   for (int i=1;i<=10000;i++)
   {
     valor +=i;
   }
 System.out.println("salgo");
 this.notify();
 System.out.println("notifique");
 }
}
}
