public class ExtendThread {
  public static void main(String args[]) 
  {
    new NewThread(); // crea un nuevo hilo
    try {
      for(int i = 5; i > 0; i--) {
        System.out.println("Hilo principal: " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupcion del hilo principal.");
    }
    System.out.println("Sale del hilo principal.");
  }
}
