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
public class Enfermera {
    //Variables.
    String idpersona, identificacion, nombre, direccion, telefono;
    String cargo, salario, email, codigodearea, jefe;
    String experiencia, conjuntodehabilidades;

    //Constructores.
    public Enfermera() {
    }

    public Enfermera(String idpersona, String identificacion, String nombre, String direccion, String telefono, String cargo, String salario, String email, String codigodearea, String jefe, String experiencia, String conjuntodehabilidades) {
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
        this.experiencia = experiencia;
        this.conjuntodehabilidades = conjuntodehabilidades;
    }

    //Setters and Getters.
    public String getConjuntodehabilidades() {
        return conjuntodehabilidades;
    }

    public void setConjuntodehabilidades(String conjuntodehabilidades) {
        this.conjuntodehabilidades = conjuntodehabilidades;
    }
    
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

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    //toString.

    @Override
    public String toString() {
        return "Enfermera{" + "idpersona=" + idpersona + ", identificacion=" + identificacion + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", cargo=" + cargo + ", salario=" + salario + ", email=" + email + ", codigodearea=" + codigodearea + ", jefe=" + jefe + ", experiencia=" + experiencia + ", conjuntodehabilidades=" + conjuntodehabilidades + '}';
    }
    
    //Metodo para guardar enfermera en la base de datos.
    public void GuardarEnfermera(){
        String sql = "insert into Enfermera(identificacion, nombre, direccion, telefono, cargo, salario, email, codigodearea, jefe, experiencia, conjuntodehabilidades) values('"+this.identificacion+"', '"+this.nombre+"', '"+this.direccion+"', '"+this.telefono+"', '"+this.cargo+"', '"+this.salario+"', '"+this.email+"', '"+this.codigodearea+"', '"+this.jefe+"', '"+this.experiencia+"', '"+this.conjuntodehabilidades+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar Enfermera en la base de datos.
    public void CambiarEnfermera(String Atributo, String Valor, String IdValor){
        String sql = "update Enfermera set "+Atributo+" = '"+Valor+"'  where idpersona = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para listar los elementos area de la base de datos.
    public ArrayList<Enfermera> listar(){
        String sql = "SELECT * FROM Enfermera";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Enfermera> Enfermeras = new ArrayList<Enfermera>();
        try{
            while(rs.next()){
                Enfermera e = new Enfermera();
                e.setIdpersona(rs.getString("idpersona"));
                e.setIdentificacion(rs.getString("identificacion"));
                e.setNombre(rs.getString("nombre"));
                e.setDireccion(rs.getString("direccion"));
                e.setTelefono(rs.getString("telefono"));
                e.setCargo(rs.getString("cargo"));
                e.setSalario(rs.getString("salario"));
                e.setEmail(rs.getString("email"));
                e.setCodigodearea(rs.getString("codigodearea"));
                e.setJefe(rs.getString("jefe"));
                e.setExperiencia(rs.getString("experiencia"));
                e.setConjuntodehabilidades(rs.getString("conjuntodehabilidades"));          
                Enfermeras.add(e);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Enfermeras;
    }
    
}
