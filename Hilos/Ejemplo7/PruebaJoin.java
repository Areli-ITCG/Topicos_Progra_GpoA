public class PruebaJoin
{
 public static void main(String arg[])
 {
  NuevoHilo h1=new NuevoHilo("uno");
  NuevoHilo h2=new NuevoHilo("dos");
  NuevoHilo h3=new NuevoHilo("tres");
  h1.t.start();
  h2.t.start();
  h3.t.start();
  System.out.println("hilo uno esta vivo? "+h1.t.isAlive());
  System.out.println("hilo dos esta vivo? "+h2.t.isAlive());
  System.out.println("hilo tres esta vivo? "+h3.t.isAlive());
 //para que se note la diferencia del join y sin el join, pongan por
 //favor entre comentarios todo el try-catch, lo compilan y lo vuelven
 // a ejecutar para que vean la diferencia
 try
  {
  System.out.println("En espera que los hilos terminen");
   h1.t.join();
   h2.t.join();
   h3.t.join();
  }
 catch(InterruptedException e)
 {
  System.out.println(Thread.currentThread()+" ha sido interrumpido ");}
  System.out.println("hilo uno esta vivo? "+h1.t.isAlive());
  System.out.println("hilo dos esta vivo? "+h2.t.isAlive());
  System.out.println("hilo tres esta vivo? "+h3.t.isAlive());
  System.out.println(Thread.currentThread()+" saliendo ");
}
}
