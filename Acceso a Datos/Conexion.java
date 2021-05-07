public class Conexion {
    Statement stmt = null;
    Connection conect = null;
    public static Connection sql;
  
  public static Connection conectar()
   {
    
    try {
         String connectionUrl = "jdbc:sqlserver://localhost:1433;database=BDSI;user=sa; password = 123;";
         sql = DriverManager.getConnection(connectionUrl);
         System.out.println("Conectado.");
        } 
    catch (SQLException ex) 
    {
     System.out.println("Error." + ex);
    }
    return sql;
  }
  
  public static void main(String args[])
  {
   conectar();
  }
 }
