public class Contador extends Thread
{
    public int cuenta;
    private double suma =0;
    
    public void run()
    {
        for(cuenta = 0; cuenta < 500000; cuenta ++)
        {
            suma += Math.random();
        }
    }
    
}
