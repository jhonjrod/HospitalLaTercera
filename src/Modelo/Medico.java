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
public class Medico {
    //Variables.
    String idpersona, identificacion, nombre, direccion, telefono;
    String cargo, salario, email, codigodearea, jefe;
    String especialidad, numerodelicencia, universidad;

    //Constructores.
    public Medico() {
    }

    public Medico(String idpersona, String identificacion, String nombre, String direccion, String telefono, String cargo, String salario, String email, String codigodearea, String jefe, String especialidad, String numerodelicencia, String universidad) {
        this.idpersona = idpersona;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
        this.salario = salario;
        this.email = email;
        this.codigodearea = codigodearea;
        this.jefe = jefe;
        this.especialidad = especialidad;
        this.numerodelicencia = numerodelicencia;
        this.universidad = universidad;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigodearea() {
        return codigodearea;
    }

    public void setCodigodearea(String codigodearea) {
        this.codigodearea = codigodearea;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumerodelicencia() {
        return numerodelicencia;
    }

    public void setNumerodelicencia(String numerodelicencia) {
        this.numerodelicencia = numerodelicencia;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Medico{" + "idpersona=" + idpersona + ", identificacion=" + identificacion + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", cargo=" + cargo + ", salario=" + salario + ", email=" + email + ", codigodearea=" + codigodearea + ", jefe=" + jefe + ", especialidad=" + especialidad + ", numerodelicencia=" + numerodelicencia + ", universidad=" + universidad + '}';
    }
    
    //Metodo para guardar medico en la base de datos.
    public void GuardarMedico(){
        String sql = "insert into Medico(idpersona, identificacion, nombre, direccion, telefono, cargo, salario, email, codigodearea, jefe, especialidad, numerodelicencia, universidad) values('"+this.idpersona+"', '"+this.identificacion+"', '"+this.nombre+"', '"+this.direccion+"', '"+this.telefono+"', '"+this.cargo+"', '"+this.salario+"', '"+this.email+"', '"+this.codigodearea+"', '"+this.jefe+"', '"+this.especialidad+"', '"+this.numerodelicencia+"', '"+this.universidad+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar medico en la base de datos.
    public void CambiarMedico(String Atributo, String Valor, String IdValor){
        String sql = "update Medico set "+Atributo+" = '"+Valor+"'  where idpersona = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para listar los elementos medico de la base de datos.
    public ArrayList<Medico> listar(){
        String sql = "SELECT * FROM Medico";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Medico> Medicos = new ArrayList<Medico>();
        try{
            while(rs.next()){
                Medico m = new Medico();
                m.setIdpersona(rs.getString("idpersona"));
                m.setIdentificacion(rs.getString("identificacion"));
                m.setNombre(rs.getString("nombre"));
                m.setDireccion(rs.getString("direccion"));
                m.setTelefono(rs.getString("telefono"));
                m.setCargo(rs.getString("cargo"));
                m.setSalario(rs.getString("salario"));
                m.setEmail(rs.getString("email"));
                m.setCodigodearea(rs.getString("codigodearea"));
                m.setJefe(rs.getString("jefe"));
                m.setEspecialidad(rs.getString("especialidad"));
                m.setNumerodelicencia(rs.getString("numerodelicencia"));
                m.setUniversidad(rs.getString("universidad"));
                Medicos.add(m);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Medicos;
    }
    
}
