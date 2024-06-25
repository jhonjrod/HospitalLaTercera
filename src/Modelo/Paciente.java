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
public class Paciente {
    //Variables.
    String idpersona, identificacion, nombre, direccion, telefono;
    String fechadenacimento, actividadeconomica;

    //Constructores.
    public Paciente() {
    }

    public Paciente(String idpersona, String identificacion, String nombre, String direccion, String telefono, String fechadenacimento, String actividadeconomica) {
        this.idpersona = idpersona;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechadenacimento = fechadenacimento;
        this.actividadeconomica = actividadeconomica;
    }

    //Setters and Getters.
    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechadenacimento() {
        return fechadenacimento;
    }

    public void setFechadenacimento(String fechadenacimento) {
        this.fechadenacimento = fechadenacimento;
    }

    public String getActividadeconomica() {
        return actividadeconomica;
    }

    public void setActividadeconomica(String actividadeconomica) {
        this.actividadeconomica = actividadeconomica;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Paciente{" + "idpersona=" + idpersona + ", identificacion=" + identificacion + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", fechadenacimento=" + fechadenacimento + ", actividadeconomica=" + actividadeconomica + '}';
    }
    
    //Metodo para guardar paciente en la base de datos.
    public void GuardarPaciente(){
        String sql = "insert into Paciente(idpersona, identificacion, nombre, direccion, telefono, fechadenacimiento, actividadeconomica) values('"+this.idpersona+"', '"+this.identificacion+"', '"+this.nombre+"', '"+this.direccion+"', '"+this.telefono+"', '"+this.fechadenacimento+"', '"+this.actividadeconomica+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar paciente en la base de datos.
    public void CambiarPaciente(String Atributo, String Valor, String IdValor){
        String sql = "update Paciente set "+Atributo+" = '"+Valor+"'  where idpersona = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para listar los elementos paciente de la base de datos.
    public ArrayList<Paciente> listar(){
        String sql = "SELECT * FROM Paciente";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Paciente> Pacientes = new ArrayList<Paciente>();
        try{
            while(rs.next()){
                Paciente p = new Paciente();
                p.setIdpersona(rs.getString("idpersona"));
                p.setIdentificacion(rs.getString("identificacion"));
                p.setNombre(rs.getString("nombre"));
                p.setDireccion(rs.getString("direccion"));
                p.setTelefono(rs.getString("telefono"));
                p.setFechadenacimento(rs.getString("fechadenacimento"));
                p.setActividadeconomica(rs.getString("actividadeconomica"));
                Pacientes.add(p);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Pacientes;
    }
    
    
}
