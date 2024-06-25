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
public class Area {
    //Atributos.
    String codigodearea, nombre, descripcion, camadisp;
    
    //Constructores
    public Area() {
    }
    
    public Area(String codigodearea, String nombre, String descripcion, String camadisp) {
        this.codigodearea = codigodearea;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.camadisp = camadisp;
    }

    //Setters and Getters.
    public String getCodigodearea() {
        return codigodearea;
    }

    public void setCodigodearea(String codigodearea) {
        this.codigodearea = codigodearea;
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

    public String getCamadisp() {
        return camadisp;
    }

    public void setCamadisp(String camadisp) {
        this.camadisp = camadisp;
    }

    //Metodo tostring
    @Override
    public String toString() {
        return "Area{" + "codigodearea=" + codigodearea + ", nombre=" + nombre + ", descripcion=" + descripcion + ", camadisp=" + camadisp + '}';
    }

    //Metodo para guardar area en la base de datos.
    public void GuardarArea(){
        String sql = "insert into Area(codigodearea, nombre, descripcion, camadisp) values('"+this.codigodearea+"', '"+this.nombre+"', '"+this.descripcion+"', '"+this.camadisp+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar area en la base de datos.
    public void CambiarArea(String Atributo, String Valor, String IdValor){
        String sql = "update Area set "+Atributo+" = '"+Valor+"'  where codigodearea = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    //Metodo para listar los elementos area de la base de datos.
    public ArrayList<Area> listar(){
        String sql = "SELECT * FROM Area";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Area> Areas = new ArrayList<Area>();
        try{
            while(rs.next()){
                Area a = new Area();
                a.setCodigodearea(rs.getString("codigodearea"));
                a.setNombre(rs.getString("nombre"));
                a.setDescripcion(rs.getString("descripcion"));
                a.setCamadisp(rs.getString("camadisp"));
                Areas.add(a);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Areas;
    }
    
}
