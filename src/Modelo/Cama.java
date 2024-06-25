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
public class Cama {
    //Variables.
    String numerodecama, descripcion, estado, nrohabitacion, idpersona;

    //Constructores.
    public Cama() {
    }

    public Cama(String numerodecama, String descripcion, String estado, String nrohabitacion, String idpersona) {
        this.numerodecama = numerodecama;
        this.descripcion = descripcion;
        this.estado = estado;
        this.nrohabitacion = nrohabitacion;
        this.idpersona = idpersona;
    }

    //Setters and Getters.
    public String getNumerodecama() {
        return numerodecama;
    }

    public void setNumerodecama(String numerodecama) {
        this.numerodecama = numerodecama;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNrohabitacion() {
        return nrohabitacion;
    }

    public void setNrohabitacion(String nrohabitacion) {
        this.nrohabitacion = nrohabitacion;
    }

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    //Metodo toString.
    @Override
    public String toString() {
        return "Cama{" + "numerodecama=" + numerodecama + ", descripcion=" + descripcion + ", estado=" + estado + ", nrohabitacion=" + nrohabitacion + ", idpersona=" + idpersona + '}';
    }
    
    //Metodo para guardar cama en la base de datos.
    public void GuardarCama(){
        String sql = "insert into Cama(numerodecama, descripcion, estado, nrohabitacion, idpersona) values('"+this.numerodecama+"', '"+this.descripcion+"', '"+this.estado+"', '"+this.nrohabitacion+"', '"+this.idpersona+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar cama en la base de datos.
    public void CambiarCama(String Atributo, String Valor, String IdValor){
        String sql = "update Cama set "+Atributo+" = '"+Valor+"'  where numerodecama = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para listar los elementos cama de la base de datos.
    public ArrayList<Cama> listar(){
        String sql = "SELECT * FROM Cama";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Cama> Camas = new ArrayList<Cama>();
        try{
            while(rs.next()){
                Cama ca = new Cama();
                ca.setNumerodecama(rs.getString("numerodecama"));
                ca.setDescripcion(rs.getString("descripcion"));
                ca.setEstado(rs.getString("estado"));
                ca.setNrohabitacion(rs.getString("nrohabitacion"));
                ca.setIdpersona(rs.getString("idpersona"));
                Camas.add(ca);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Camas;
    }
    
    
}

    

