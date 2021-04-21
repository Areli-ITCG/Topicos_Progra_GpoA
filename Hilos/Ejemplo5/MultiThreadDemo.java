public class MultiThreadDemo 
{
  public static void main(String args[]) 
  {
    new NuevoHilos("Uno"); // comienzan los hilos
    new NuevoHilos("Dos");
    new NuevoHilos("Tres");
    try {
      // espera un tiempo para que terminen los otros hilos
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Interrupcion del hilo principal");
    }
    System.out.println("Sale del hilo principal.");
  }
}
