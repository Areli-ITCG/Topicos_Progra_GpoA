public class JoinMethod 
{
  public static void main(String[] args) {
     for(int i = 0; i < 10; i++) {
      // Cuando el hilo principal se ejecuta dos veces, únete a otro hilo nuevo
         if( i == 2) 
         {
          Thread t = new Thread(new Runnable() {
          @Override
          public void run() 
          {
            for(int i = 10; i < 20; i++) {
                 System.out.println(Thread.currentThread().getName() + ": " + i);
                }
          }
         });
        t.start();
        }
      System.out.println(Thread.currentThread().getName() + ": " + i);
    }
  }
 }
