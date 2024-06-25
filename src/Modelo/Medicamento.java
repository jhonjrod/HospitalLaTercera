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
public class Medicamento {
    //Variables.
    String codigodemedicamento, nombre, descripcion, costo, estado;

    //Constructores.
    public Medicamento() {
    }

    public Medicamento(String codigodemedicamento, String nombre, String descripcion, String costo, String estado) {
        this.codigodemedicamento = codigodemedicamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.estado = estado;
    }

    //Setters and Getters.
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCodigodemedicamento() {
        return codigodemedicamento;
    }

    public void setCodigodemedicamento(String codigodemedicamento) {
        this.codigodemedicamento = codigodemedicamento;
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

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    //Metodo toString.
    @Override
    public String toString() {
        return "Medicamento{" + "codigodemedicamento=" + codigodemedicamento + ", nombre=" + nombre + ", descripcion=" + descripcion + ", costo=" + costo + ", estado=" + estado + '}';
    }
    
    //Metodo para guardar medicamento en la base de datos.
    public void GuardarMedicamento(){
        String sql = "insert into Medicamento(codigodemedicamento, nombre, descripcion, costo, estado) values('"+this.codigodemedicamento+"', '"+this.nombre+"', '"+this.descripcion+"', '"+this.costo+"', '"+this.estado+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar medicamento en la base de datos.
    public void CambiarMedicamento(String Atributo, String Valor, String IdValor){
        String sql = "update Medicamento set "+Atributo+" = '"+Valor+"'  where codigodemedicamento = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para listar los elementos medicamento de la base de datos.
    public ArrayList<Medicamento> listar(){
        String sql = "SELECT * FROM Medicamento";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Medicamento> Medicamentos = new ArrayList<Medicamento>();
        try{
            while(rs.next()){
                Medicamento m = new Medicamento();
                m.setCodigodemedicamento(rs.getString("codigodemedicamento"));
                m.setNombre(rs.getString("nombre"));
                m.setDescripcion(rs.getString("descripcion"));
                m.setCosto(rs.getString("costo"));
                m.setEstado(rs.getString("estado"));
                Medicamentos.add(m);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Medicamentos;
    }
    
}
