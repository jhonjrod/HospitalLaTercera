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
public class Habitacion {
    //Variables.
    String nrohabitacion, descripcion, codigodearea;
    
    //Constructores.
    public Habitacion() {
    }

    public Habitacion(String nrohabitacion, String descripcion, String codigodearea) {
        this.nrohabitacion = nrohabitacion;
        this.descripcion = descripcion;
        this.codigodearea = codigodearea;
    }
    
    //Getters and Setters.
    public String getNrohabitacion() {
        return nrohabitacion;
    }

    public void setNrohabitacion(String nrohabitacion) {
        this.nrohabitacion = nrohabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigodearea() {
        return codigodearea;
    }

    public void setCodigodearea(String codigodearea) {
        this.codigodearea = codigodearea;
    }
    
    //Metodo toStirng.
    @Override
    public String toString() {
        return "Habitacion{" + "nrohabitacion=" + nrohabitacion + ", descripcion=" + descripcion + ", codigodearea=" + codigodearea + '}';
    }
    
    //Metodo para guardar habitacion en la base de datos.
    public void GuardarHabitacion(){
        String sql = "insert into Habitacion(nrohabitacion, descripcion, codigodearea) values('"+this.nrohabitacion+"', '"+this.descripcion+"', '"+this.codigodearea+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar habitacion en la base de datos.
    public void CambiarHabitacion(String Atributo, String Valor, String IdValor){
        String sql = "update Habitacion set "+Atributo+" = '"+Valor+"'  where nrohabitacion = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    //Metodo para listar los elementos habitaciones de la base de datos.
    public ArrayList<Habitacion> listar(){
        String sql = "SELECT * FROM Habitacion";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Habitacion> Habitaciones = new ArrayList<Habitacion>();
        try{
            while(rs.next()){
                Habitacion h = new Habitacion();
                h.setNrohabitacion(rs.getString("nrohabitacion"));
                h.setDescripcion(rs.getString("descripcion"));
                h.setCodigodearea(rs.getString("codigodearea"));
                Habitaciones.add(h);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Habitaciones;
    }
}
