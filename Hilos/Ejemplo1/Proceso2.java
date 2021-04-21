
public class Proceso2 implements Runnable {
  //sobreescritura del método
    @Override
    public void run() {//método que ejecutará el hilo
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 2");
        }
    }

}
