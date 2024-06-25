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
public class RecetaMedica {
    //Variables.
    String numeroderecetamedica, codigodemedicamento, dosis, cantidad;

    //Constructores.
    public RecetaMedica() {
    }

    public RecetaMedica(String numeroderecetamedica, String codigodemedicamento, String dosis, String cantidad) {
        this.numeroderecetamedica = numeroderecetamedica;
        this.codigodemedicamento = codigodemedicamento;
        this.dosis = dosis;
        this.cantidad = cantidad;
    }

    //Setters and Getters.
    public String getNumeroderecetamedica() {
        return numeroderecetamedica;
    }

    public void setNumeroderecetamedica(String numeroderecetamedica) {
        this.numeroderecetamedica = numeroderecetamedica;
    }

    public String getCodigodemedicamento() {
        return codigodemedicamento;
    }

    public void setCodigodemedicamento(String codigodemedicamento) {
        this.codigodemedicamento = codigodemedicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    //Metodo toString.
    @Override
    public String toString() {
        return "RecetaMedica{" + "numeroderecetamedica=" + numeroderecetamedica + ", codigodemedicamento=" + codigodemedicamento + ", dosis=" + dosis + ", cantidad=" + cantidad + '}';
    }
    
    //Metodo para guardar recetamedica en la base de datos.
    public void GuardarRecetaMedica(){
        String sql = "insert into RecetaMedica(numeroderecetamedica, codigodemedicamento, dosis, cantidad) values('"+this.codigodemedicamento+"', '"+this.codigodemedicamento+"', '"+this.dosis+"', '"+this.cantidad+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar recetamedica en la base de datos.
    public void CambiarRecetaMedica(String Atributo, String Valor, String IdValor){
        String sql = "update RecetaMedica set "+Atributo+" = '"+Valor+"'  where numeroderecetamedica = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para listar los elementos recetamedica de la base de datos.
    public ArrayList<RecetaMedica> listar(){
        String sql = "SELECT * FROM RecetaMedica";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<RecetaMedica> RecetasMedicas = new ArrayList<RecetaMedica>();
        try{
            while(rs.next()){
                RecetaMedica r = new RecetaMedica();
                r.setNumeroderecetamedica(rs.getString("numeroderecetamedica"));
                r.setCodigodemedicamento(rs.getString("codigodemedicamento"));
                r.setDosis(rs.getString("dosis"));
                r.setCantidad(rs.getString("cantidad"));
                RecetasMedicas.add(r);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return RecetasMedicas;
    }
    
}
