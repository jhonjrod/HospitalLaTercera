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
public class Consulta {
    //Variables.
    String idpersonam, idpersonap, idcita, numeroderecetamedica, codigodecausa, diagnostico;
    
    //Constructores.

    public Consulta() {
    }

    public Consulta(String idpersonam, String idpersonap, String idcita, String numeroderecetamedica, String codigodecausa, String diagnostico) {
        this.idpersonam = idpersonam;
        this.idpersonap = idpersonap;
        this.idcita = idcita;
        this.numeroderecetamedica = numeroderecetamedica;
        this.codigodecausa = codigodecausa;
        this.diagnostico = diagnostico;
    }

    
    
    //Setters and Getters.
    public String getCodigodecausa() {
        return codigodecausa;
    }

    public void setCodigodecausa(String codigodecausa) {
        this.codigodecausa = codigodecausa;
    }

    public String getNumeroderecetamedica() {
        return numeroderecetamedica;
    }

    public void setNumeroderecetamedica(String numeroderecetamedica) {
        this.numeroderecetamedica = numeroderecetamedica;
    }

    public String getIdcita() {
        return idcita;
    }

    public void setIdcita(String idcita) {
        this.idcita = idcita;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
      
    //Metodo toString.
    @Override
    public String toString() {
        return "Consulta{" + "idpersonam=" + idpersonam + ", idpersonap=" + idpersonap + ", idcita=" + idcita + ", numeroderecetamedica=" + numeroderecetamedica + ", codigodecausa=" + codigodecausa + ", diagnostico=" + diagnostico + '}';
    }
    
    //Metodo para guardar consulta en la base de datos.
    public void GuardarConsulta(){
        String sql = "insert into Consulta(idpersonam, idpersonap, idcita, numeroderecetamedica, codigodecausa, diagnostico) values('"+this.idpersonam+"', '"+this.idpersonap+"', '"+this.idcita+"', '"+this.numeroderecetamedica+"', '"+this.codigodecausa+"', '"+this.diagnostico+"')";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para cambiar consulta en la base de datos.
    public void CambiarConsulta(String Atributo, String Valor, String IdValor){
        String sql = "update Consulta set "+Atributo+" = '"+Valor+"'  where idpersonam = '"+IdValor+"'";
        Conexion c = new Conexion();
        c.executesql(sql);
        c.closeConnection();
    }
    
    //Metodo para listar los elementos consulta de la base de datos.
    public ArrayList<Consulta> listar(){
        String sql = "SELECT * FROM Consulta";
        Conexion c = new Conexion();
        ResultSet rs = c.executeQuerysql(sql);
        ArrayList<Consulta> Consultas = new ArrayList<Consulta>();
        try{
            while(rs.next()){
                Consulta co = new Consulta();
                co.setIdpersonam(rs.getString("idpersonam"));
                co.setIdpersonap(rs.getString("idpersonap"));
                co.setIdcita(rs.getString("idcita"));
                co.setNumeroderecetamedica(rs.getString("numeroderecetamedica"));
                co.setCodigodecausa(rs.getString("codigodecausa"));
                co.setDiagnostico(rs.getString("diagnostico"));
                Consultas.add(co);
            }
        }catch(Exception e){
            System.out.print("No se pudo listar.\n");
        }
        c.closeConnection();
        return Consultas;
    }
    
}
