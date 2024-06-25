/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Causa {
    //Variables.
    String codigodecausa, nombre, descripcion;

    //Constructores.
    public Causa() {
    }

    public Causa(String codigodecausa, String nombre, String descripcion) {
        this.codigodecausa = codigodecausa;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Setters and Getters.
    public String getCodigodecausa() {
        return codigodecausa;
    }

    public void setCodigodecausa(String codigodecausa) {
        this.codigodecausa = codigodecausa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Causa{" + "codigodecausa=" + codigodecausa + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    //Metodo para guardar causa en la base de datos.
    public void GuardarCausa(){
        String sql = "insert into Causa(codigodecausa, nombre, descripcion) values('"+this.codigodecausa+"', '"+this.nombre+"', '"+this.descripcion+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar causa en la base de datos.
    public void CambiarCausa(String Atributo, String Valor, String IdValor){
        String sql = "update Causa set "+Atributo+" = '"+Valor+"'  where codigodecausa = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para listar los elementos causa de la base de datos.
    public ArrayList<Causa> listar(){
        String sql = "SELECT * FROM Causa";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Causa> Causas = new ArrayList<Causa>();
        try{
            while(rs.next()){
                Causa ca = new Causa();
                ca.setCodigodecausa(rs.getString("codigodecausa"));
                ca.setNombre(rs.getString("nombre"));
                ca.setDescripcion(rs.getString("descripcion"));
                Causas.add(ca);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Causas;
    }
    
    
}
