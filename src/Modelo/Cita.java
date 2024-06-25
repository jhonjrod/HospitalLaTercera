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
public class Cita {
    //Variables.
    String idcita, fecha, hora, idpersonam, idpersonap;

    //Constructores.
    public Cita() {
    }

    public Cita(String idcita, String fecha, String hora, String idpersona, String idpersona2) {
        this.idcita = idcita;
        this.fecha = fecha;
        this.hora = hora;
        this.idpersonam = idpersona;
        this.idpersonap = idpersona2;
    }

    //Setters and Getters.
    public String getIdcita() {
        return idcita;
    }

    public void setIdcita(String idcita) {
        this.idcita = idcita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getIdpersonam() {
        return idpersonam;
    }

    public void setIdpersonam(String idpersonam) {
        this.idpersonam = idpersonam;
    }

    public String getIdpersonap() {
        return idpersonap;
    }

    public void setIdpersonap(String idpersonap) {
        this.idpersonap = idpersonap;
    }

    //Metodo toString.
    @Override
    public String toString() {
        return "Cita{" + "idcita=" + idcita + ", fecha=" + fecha + ", hora=" + hora + ", idpersonam=" + idpersonam + ", idpersonap=" + idpersonap + '}';
    }
 
    //Metodo para guardar cita en la base de datos.
    public void GuardarCita(){
        String sql = "insert into Cita(idcita, fecha, hora, idpersonam, idpersonap) values('"+this.idcita+"', '"+this.fecha+"', '"+this.hora+"', '"+this.idpersonam+"', '"+this.idpersonap+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar cita en la base de datos.
    public void CambiarCita(String Atributo, String Valor, String IdValor){
        String sql = "update Cita set "+Atributo+" = '"+Valor+"'  where idcita = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para listar los elementos cits de la base de datos.
    public ArrayList<Cita> listar(){
        String sql = "SELECT * FROM Cita";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Cita> Citas = new ArrayList<Cita>();
        try{
            while(rs.next()){
                Cita ci = new Cita();
                ci.setIdcita(rs.getString("idcita"));
                ci.setFecha(rs.getString("fecha"));
                ci.setHora(rs.getString("hora"));
                ci.setIdpersonam(rs.getString("idpersonam"));
                ci.setIdpersonap(rs.getString("idpersonap"));
                Citas.add(ci);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Citas;
    }
    
}
