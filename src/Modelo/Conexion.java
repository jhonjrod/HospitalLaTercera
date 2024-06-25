/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author UNIVALLE
 */
public class Conexion {
    //Variables.
    String Driver = "org.postgresql.Driver";
    String Stringcon = "jdbc:postgresql:mibase2";
    String User = "postgres";
    String Password = "root";
    Connection con;
    
    //Constructor.
    public Conexion(){
        
        try{
            Class.forName(Driver);
            con = DriverManager.getConnection(Stringcon, User, Password);
        
        }catch(Exception e){
            System.out.print("No se pudo realizar la conexion a la base de datos\n");
        }
    }
    
    
    //Para insertar, eliminar o modificar.
    public boolean executesql(String sql){
        boolean guardo = false;
        try{
            Statement stms = con.createStatement();
            guardo = stms.execute(sql);
        }catch(Exception e){
            System.out.print("No se pudo realizar la accion\n");
        }
        return guardo;
    }
    
    //Para consultar.
    public ResultSet executeQuerysql(String sql){
        ResultSet rs = null;
        try{
            Statement stms = con.createStatement();
            rs = stms.executeQuery(sql);
        }catch(Exception e){
            System.out.print("No se pudo realizar la consulta\n");
        }
        return rs;
    }
    
    //Para cerrar la coneccion.
    public void closeConnection(){
        try{
            con.close();
        }catch(Exception e){
            System.out.print("No se pudo cerrar la base de datos\n");
        }
    }
}

