public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nCuentas = 5;
        //Crear y lanzar el hilo Cuentas
        Cuentas hiloCuantas = new Cuentas(nCuentas);
        hiloCuantas.start();
    }
    
}
