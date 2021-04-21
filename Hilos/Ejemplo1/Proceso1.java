public class Proceso1 extends Thread{
  //Sobreescribir métodos  
    @Override
    public void run(){//método que ejecuta el hilo
        for(int i = 0; i <= 5; i++){
            System.out.println("Proceso 1");
        }
    }
}
