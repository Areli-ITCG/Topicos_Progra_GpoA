public class NuevoHilo implements Runnable
{
  String nomb;
  Thread t;
  public NuevoHilo(String nomHilo)
  {
   nomb=nomHilo;
   t=new Thread(this, nomb);
   System.out.println("nuevo hilo: "+t);
}
public void run()
{
  try
   {
     for(int i=5; i>0; i--)
     {
       System.out.println(nomb+": "+i);
       Thread.sleep(1000);
     }
   }
 catch(InterruptedException e)
 {
  System.out.println(nomb+" ha sido interrumpido ");}
  System.out.println(nomb+" saliendo ");
 }
}
