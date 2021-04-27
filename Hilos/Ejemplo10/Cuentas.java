public class Cuentas extends Thread
{
    public static int nCuentas;
    private Contador [] cuenta;
    
    public Cuentas(int n)
    {
        nCuentas = n; //número de hilos contadores
        //Establecer la prioridad de este hilo
        setPriority((nCuentas + 2)%Thread.MAX_PRIORITY);
        
        //Crear y establecer las prioridades de los hilos contador
        cuenta = new Contador[nCuentas];
        for(int i =0; i < nCuentas; i ++)
        {
            cuenta[i] = new Contador();
            cuenta[i].setPriority((i+3)%Thread.MAX_PRIORITY-1);
        }
    }
    
    public void run()
    {
        int i;
        boolean hayHilosVivos;
        
        //Mostrar el nombre y la prioridad de este hilo
        System.out.println(this.getName() + ", P-" + this.getPriority());
        //Lanzar los contadores para su ejecución
        for(i =0; i < nCuentas; i ++)
            cuenta[i].start();
        do{
            //Mostrar nombre del hilo, prioridad y estado de la cuenta
            for( i =0; i < nCuentas; i ++)
                System.out.println(cuenta[i].getName() + ", P - " + cuenta[i].getPriority()+
                        " " + cuenta[i].cuenta + " ");
            //Hay hilos vivos?
            hayHilosVivos = cuenta[0].isAlive();
            for(i =0; i < nCuentas; i ++)
                hayHilosVivos = hayHilosVivos || cuenta[i].isAlive();
            //Ahora el hilo dormirá nMilisegundos, mientras los contadores siguen su curso
            try{
                int nMilisegundos = (int)(10 * Math.pow(2, nCuentas));
                sleep(0);
            }
            catch(InterruptedException e) {}
          } while(hayHilosVivos);
    }
    
}
