public class UsoHilos
{
    public static void main(String[] args) 
    {
        System.out.println("Hilo principal iniciando.");
        //Primero, construye un objeto MiHilo.
        MiHilo mh=new MiHilo("#1");
        //Luego, construye un hilo de ese objeto.
        Thread nuevoh=new Thread(mh);
        //Finalmente, comienza la ejecución del hilo.
        nuevoh.start();
        for (int i=0; i<50;i++){
            System.out.print(" .");
        }try{
            Thread.sleep(100);
        }catch (InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }
}
