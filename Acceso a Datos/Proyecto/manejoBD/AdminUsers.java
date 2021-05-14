/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoBD;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author areli
 */
public class AdminUsers {
     Connection cn;
     Conexion con=new Conexion();
    private int id_user;
    private String nombre;
    private String pass;
    private int tipo;
      
    public AdminUsers(){
        
        cn= con.conectar();
    }  

    public void LLenarDatos(DefaultTableModel modelo){
        try {
            String sql="select * from Usuarios";
            CallableStatement cmd=cn.prepareCall(sql);
            ResultSet rs= cmd.executeQuery();
           
            while(rs.next()){
                Object[] datos=new Object[4];
              
                for(int i=0;i<4;i++){
                    datos[i]=rs.getString(i+1);                  
                }
                modelo.addRow(datos);
            }
            cmd.close();
            cn.close();
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }  

    public int Agregar1 (String nombre, String password, int tipo){
        int band =0;
        try {
            cn = con.conectar();
            String sql="{call sp_alta_usuario (?,?,?,?)}";
            CallableStatement cmd=cn.prepareCall(sql);
            cmd.setString("nombre", nombre);
            cmd.setString("password", password);
            cmd.setInt("tipo", tipo);
            cmd.registerOutParameter("return", java.sql.Types.INTEGER);
            cmd.execute();
            band = cmd.getInt("return");
            cmd.close();
            cn.close();          
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
        return band;
    }       
   
     public int numUsr ()
  {
      int nuser = 0;
      try{
          cn = con.conectar();         
          CallableStatement cst = cn.prepareCall("{call max_user(?)}");
          cst.registerOutParameter("val", java.sql.Types.INTEGER);
          cst.execute();
          
          nuser = cst.getInt("val");
         }catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
      return nuser;
  }
  
    public Object[] Buscar(String nom)
    {
        nombre = nom;
        Object[] datos = new Object[4];
        datos[0] = "";
         try {
            cn = con.conectar();
            //Sentencia con parámetros
             String sql="select * from usuarios where usuario = ?";
             PreparedStatement sentencia= cn.prepareStatement(sql);
             sentencia.setString(1,nombre);
             ResultSet rs = sentencia.executeQuery();//Guarda el resultado de la consulta
             while(rs.next())
             {
               // datos=new Object[4];
              
                for(int i=0;i<4;i++){
                    datos[i]=rs.getString(i+1);                  
                }
              } 
         }catch (Exception e) {
            System.out.println(e.getMessage());
        }
      return datos;
    }
}