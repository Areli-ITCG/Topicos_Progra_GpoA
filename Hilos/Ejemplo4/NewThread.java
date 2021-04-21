public class NewThread extends Thread 
{
  NewThread() {
    super("Hilo Demo"); // Crea un nuevo hilo
    System.out.println("Hilo hijo: " + this);
    start(); // Comienza el hilo
  }
  public void run() {// Este es el punto de entrada del segundo hilo
    try {
      for(int i = 5; i > 0; i--) {
        System.out.println("Hilo hijo: " + i);
        Thread.sleep(500); }
    } catch (InterruptedException e) {
      System.out.println("Interrupcion del hilo hijo.");
    }
    System.out.println("Sale del hilo hijo.");
  }
}
