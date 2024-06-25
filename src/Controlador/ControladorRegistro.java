/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Area;
import Modelo.Cama;
import Modelo.Causa;
import Modelo.Cita;
import Modelo.Consulta;
import Modelo.Enfermera;
import Modelo.Habitacion;
import Modelo.Medicamento;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.RecetaMedica;
import Vista.RegistroArea;
import Vista.RegistroCama;
import Vista.RegistroCausa;
import Vista.RegistroCita;
import Vista.RegistroConsulta;
import Vista.RegistroHabitacion;
import Vista.RegistroMedicamento;
import Vista.RegistroPersona;
import Vista.RegistroRecetaMedica;

/**
 *
 * @author USUARIO
 */
public class ControladorRegistro {
    //Variables.
    RegistroArea Ventana1;
    RegistroCama Ventana2;
    RegistroPersona Ventana3;
    RegistroMedicamento Ventana4;
    RegistroCausa Ventana5;
    RegistroCita Ventana6;
    RegistroConsulta Ventana7;
    RegistroRecetaMedica Ventana8;
    RegistroHabitacion Ventana9;
    
    //Constructores
    public ControladorRegistro() {
    }

    public ControladorRegistro(RegistroArea Ventana1, RegistroCama Ventana2, RegistroPersona Ventana3, RegistroMedicamento Ventana4, RegistroCausa Ventana5, RegistroCita Ventana6, RegistroConsulta Ventana7, RegistroRecetaMedica Ventana8, RegistroHabitacion Ventana9) {
        this.Ventana1 = Ventana1;
        this.Ventana2 = Ventana2;
        this.Ventana3 = Ventana3;
        this.Ventana4 = Ventana4;
        this.Ventana5 = Ventana5;
        this.Ventana6 = Ventana6;
        this.Ventana7 = Ventana7;
        this.Ventana8 = Ventana8;
        this.Ventana9 = Ventana9;
    }

    //Setters and Getters
    public RegistroArea getVentana1() {
        return Ventana1;
    }

    public void setVentana1(RegistroArea Ventana1) {
        this.Ventana1 = Ventana1;
    }

    public RegistroCama getVentana2() {
        return Ventana2;
    }

    public void setVentana2(RegistroCama Ventana2) {
        this.Ventana2 = Ventana2;
    }

    public RegistroPersona getVentana3() {
        return Ventana3;
    }

    public void setVentana3(RegistroPersona Ventana3) {
        this.Ventana3 = Ventana3;
    }

    public RegistroMedicamento getVentana4() {
        return Ventana4;
    }

    public void setVentana4(RegistroMedicamento Ventana4) {
        this.Ventana4 = Ventana4;
    }

    public RegistroCausa getVentana5() {
        return Ventana5;
    }

    public void setVentana5(RegistroCausa Ventana5) {
        this.Ventana5 = Ventana5;
    }

    public RegistroCita getVentana6() {
        return Ventana6;
    }

    public void setVentana6(RegistroCita Ventana6) {
        this.Ventana6 = Ventana6;
    }

    public RegistroConsulta getVentana7() {
        return Ventana7;
    }

    public void setVentana7(RegistroConsulta Ventana7) {
        this.Ventana7 = Ventana7;
    }

    public RegistroRecetaMedica getVentana8() {
        return Ventana8;
    }

    public void setVentana8(RegistroRecetaMedica Ventana8) {
        this.Ventana8 = Ventana8;
    }

    public RegistroHabitacion getVentana9() {
        return Ventana9;
    }

    public void setVentana9(RegistroHabitacion Ventana9) {
        this.Ventana9 = Ventana9;
    }

    //Metodos.
    //Metodos para registrar.
    public void registrarUnArea(){
        System.out.println("entramos a registrar un area");
        //Para validar
        boolean guardar = true;
        //objeto
        Area a = new Area();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        System.out.println("entramos a registrar un area 2");
        //Codigo del Area.
        if(instancia1.validarTextfield(Ventana1.getjTextField1(), true)){
            a.setCodigodearea(Ventana1.getjTextField1().getText().replace(" ", ""));
            System.out.println("entramos a registrar un area 3");
        }
        else{
            Ventana1.CamposinLlenar("<Codigo del Area>");
            guardar = false;
        }
        //Nombre.
        if(instancia1.validarTextfield(Ventana1.getjTextField2(), true)){
            a.setNombre(Ventana1.getjTextField2().getText());       
            System.out.println("entramos a registrar un area 4");
        }
        else{
            Ventana1.CamposinLlenar("<Nombre>");
            guardar = false;
        }
        //Descripción.
        if(instancia1.validarTextfield(Ventana1.getjTextField3(), true)){
            a.setDescripcion(Ventana1.getjTextField3().getText());
            System.out.println("entramos a registrar un area 5");
        }
        else{
            Ventana1.CamposinLlenar("<Descripción>");
            guardar = false;
        }
        //Camas Disponibles.
        if(instancia1.validarTextfield(Ventana1.getjTextField4(), true)){
            a.setCamadisp(Ventana1.getjTextField4().getText().replace(" ", ""));
            System.out.println("entramos a registrar un area 6");
        }
        else{
            Ventana1.CamposinLlenar("<Camas disponibles>");
            guardar = false;
        }
        
        if(guardar){
            System.out.println("entramos a registrar un area 7");
            a.GuardarArea();//no se pudo realizar la accion
            System.out.println("entramos a registrar un area 8");
        }
         
    }
    
    public void registrarUnacama(){
        //Para validar
        boolean guardar = true;
        System.out.println("entramos a registrar un cama");
        Cama c = new Cama();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Numero de la Cama.
        if(instancia1.validarTextfield(Ventana2.getjTextField1(), true)){
            c.setNumerodecama(Ventana2.getjTextField1().getText().replace(" ", ""));
            System.out.println("entramos a registrar un cama 2");
        }
        else{
            Ventana2.CamposinLlenar("<Numero de la Cama>");
            guardar = false;
        }
        //Descripción.
        if(instancia1.validarTextfield(Ventana2.getjTextField1(), true)){
            c.setDescripcion(Ventana2.getjTextField1().getText());
            System.out.println("entramos a registrar un cama 3");
        }
        else{
            Ventana2.CamposinLlenar("<Descripción>");
            guardar = false;
        }
        //Estado.
        c.setEstado(Ventana2.getjComboBox1().getSelectedItem().toString());
        //Numero de la habitacion.
        if(instancia1.validarCombobox(Ventana2.getjComboBox2(), true)){
            c.setNrohabitacion(Ventana2.getjComboBox2().getSelectedItem().toString());
            System.out.println("entramos a registrar un cama 4");
        }
        else{
            Ventana2.ComboboxVacio("<Codigo de Area>", "Area");
            guardar = false;
        }
        //ID del paciente.
        if(instancia1.validarCombobox(Ventana2.getjComboBox3(), true)){
            c.setIdpersona(Ventana2.getjComboBox3().getSelectedItem().toString());
            System.out.println("entramos a registrar un cama 5");
        }
        else{
            Ventana2.ComboboxVacio("<ID del paciente>", "Paciente en el registro de personas."); 
            guardar = false;
        }

        if(guardar){
            System.out.println("entramos a registrar un cama 6");
            c.GuardarCama();
            System.out.println("entramos a registrar un cama 7");
        }     
    }
    
    public void registrarUnacausa(){
        //Para validar
        boolean guardar = true;
        Causa c = new Causa();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Codigo de Causa.
        if(instancia1.validarTextfield(Ventana5.getjTextField1(), true)){
            c.setCodigodecausa(Ventana5.getjTextField1().getText().replace(" ", ""));    
        }
        else{
            Ventana5.CamposinLlenar("<Codigo de Causa>");
            guardar = false;
        }
        //Nombre.
        if(instancia1.validarTextfield(Ventana5.getjTextField2(), true)){
            c.setNombre(Ventana5.getjTextField2().getText());    
        }
        else{
            Ventana5.CamposinLlenar("<Nombre>");
            guardar = false;
        }
        //Descripción.
        if(instancia1.validarTextfield(Ventana5.getjTextField3(), true)){
            c.setDescripcion(Ventana5.getjTextField3().getText());   
        }
        else{
            Ventana5.CamposinLlenar("<Descripción>");
            guardar = false;
        }
        if(guardar){
            c.GuardarCausa();
        }
         
    }
    
    public void registrarUnacita(){
        //Para validar
        boolean guardar = true; 
        Cita c = new Cita();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //ID de la Cita.
        if(instancia1.validarTextfield(Ventana6.getjTextField1(), true)){
            c.setIdcita(Ventana6.getjTextField1().getText().replace(" ", ""));
        }
        else{
            Ventana6.CamposinLlenar("<ID de la Cita>");
            guardar = false;
        }
        //Fecha.
        if(instancia1.validarTextfield(Ventana6.getjTextField2(), true)){
            c.setFecha(Ventana6.getjTextField2().getText().replace(" ", ""));
        }
        else{
            Ventana6.CamposinLlenar("<Fecha>");
            guardar = false;
        }
        //Hora.
        if(instancia1.validarTextfield(Ventana6.getjTextField3(), true)){
            c.setHora(Ventana6.getjTextField3().getText().replace(" ", ""));
        }
        else{
            Ventana6.CamposinLlenar("<Hora>");
            guardar = false;
        }
        //ID del medico.
        if(instancia1.validarCombobox(Ventana6.getjComboBox1(), true)){
            c.setIdpersonam(Ventana6.getjComboBox1().getSelectedItem().toString());
        }
        else{
            Ventana6.ComboboxVacio("<Id de Persona>", "Medico en el registro de persona."); 
            guardar = false;
        }
        //ID del paciente.
        if(instancia1.validarCombobox(Ventana6.getjComboBox2(), true)){
            c.setIdpersonap(Ventana6.getjComboBox2().getSelectedItem().toString());
        }
        else{
            Ventana6.ComboboxVacio("<Id de Persona>", "Paciente en el registro de persona."); 
            guardar = false;
        }
        if(guardar){
            c.GuardarCita();
        }
         
    }
    
    public void registrarUnaConsulta(){
        //Para validar
        boolean guardar = true;
        Consulta c = new Consulta();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //ID del Medico:.
        if(instancia1.validarCombobox(Ventana7.getjComboBox1(), true)){
            c.setIdpersonam(Ventana7.getjComboBox1().getSelectedItem().toString());
        }
        else{
            Ventana7.ComboboxVacio("<ID de Persona>", "Medico en el registro de personas."); 
            guardar = false;
        }
        //ID del Paciente.
        if(instancia1.validarCombobox(Ventana7.getjComboBox2(), true)){
            c.setIdpersonap(Ventana7.getjComboBox2().getSelectedItem().toString());
        }
        else{
            Ventana7.ComboboxVacio("<ID de Persona>", "Paciente en el registro de personas."); 
            guardar = false;
        }
        //ID de la Cita.
        if(instancia1.validarCombobox(Ventana7.getjComboBox3(), true)){
            c.setIdcita(Ventana7.getjComboBox3().getSelectedItem().toString());
        }
        else{
            Ventana7.ComboboxVacio("<ID de la Cita>", "Cita en el registro de Citas."); 
            guardar = false;
        }
        //Numero de Receta Medica.
        if(instancia1.validarCombobox(Ventana7.getjComboBox4(), true)){
            c.setNumeroderecetamedica(Ventana7.getjComboBox4().getSelectedItem().toString());
        }
        else{
            Ventana7.ComboboxVacio("<Numero de Receta Medica>", "Receta Medica en el registro de Recetas Medicas."); 
            guardar = false;
        }
        //Codigo de Causa
        if(instancia1.validarCombobox(Ventana7.getjComboBox3(), true)){
            c.setCodigodecausa(Ventana7.getjComboBox3().getSelectedItem().toString());
        }
        else{
            Ventana7.ComboboxVacio("<Codigo de Causa>", "Causa en el registro de Causas."); 
            guardar = false;
        }
        
        //Diagnostico.
        if(instancia1.validarTextfield(Ventana7.getjTextField1(), true)){
            c.setDiagnostico(Ventana7.getjTextField1().getText());
        }
        else{
            Ventana7.CamposinLlenar("<Diagnostico>");
            guardar = false;
        }
        
        if(guardar){
            c.GuardarConsulta();
        }
         
    }
    
    public void registrarUnmedicamento(){
        //Para validar
        boolean guardar = true;
        Medicamento m = new Medicamento();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Codigo del Medicamento.
        if(instancia1.validarTextfield(Ventana4.getjTextField1(), true)){
            m.setCodigodemedicamento(Ventana4.getjTextField1().getText().replace(" ", ""));
        }
        else{
            Ventana4.CamposinLlenar("<Codigo del Medicamento>");
            guardar = false;
        }
        //Nombre.
        if(instancia1.validarTextfield(Ventana4.getjTextField2(), true)){
            m.setNombre(Ventana4.getjTextField2().getText().replace(" ", ""));
        }
        else{
            Ventana4.CamposinLlenar("<Nombre>");
            guardar = false;
        }
        //Descripcion.
        if(instancia1.validarTextfield(Ventana4.getjTextField3(), true)){
            m.setDescripcion(Ventana4.getjTextField3().getText().replace(" ", ""));
        
        }
        else{
            Ventana4.CamposinLlenar("<Descripción>");
            guardar = false;
        }
        //Costo.
        if(instancia1.validarTextfield(Ventana4.getjTextField4(), true)){
            m.setCosto(Ventana4.getjTextField4().getText().replace(" ", ""));
        
        }
        else{
            Ventana4.CamposinLlenar("<Costo>");
            guardar = false;
        }
        //Estado.
        if(instancia1.validarTextfield(Ventana4.getjTextField5(), true)){
            m.setEstado(Ventana4.getjTextField5().getText().replace(" ", ""));
        
        }
        else{
            Ventana4.CamposinLlenar("<Estado>");
            guardar = false;
        }
        if(guardar){
            m.GuardarMedicamento();
        }
         
    }
    
    public void registrarUnarecetamedica(){
        //Para validar
        boolean guardar = true;
        RecetaMedica r = new RecetaMedica();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Numero de Receta Medica.
        if(instancia1.validarTextfield(Ventana8.getjTextField1(), true)){
            r.setNumeroderecetamedica(Ventana8.getjTextField1().getText().replace(" ", ""));
        }
        else{
            Ventana8.CamposinLlenar("<Numero de Receta Medica>");
            guardar = false;
        }
        if(guardar){
            r.GuardarRecetaMedica();
        }
        //Codigo del medicamento.
        if(instancia1.validarCombobox(Ventana8.getjComboBox1(), true)){
            r.setCodigodemedicamento(Ventana8.getjComboBox1().getSelectedItem().toString());
        }
        else{
            Ventana8.ComboboxVacio("<Codigo del medicamento>", "Medicamento en el registro de Medicamentos."); 
            guardar = false;
        }       
        //Dosis.
        if(instancia1.validarTextfield(Ventana8.getjTextField2(), true)){
            r.setDosis(Ventana8.getjTextField2().getText());
        }
        else{
            Ventana8.CamposinLlenar("<Dosis>");
            guardar = false;
        }
        //Cantidad.
        if(instancia1.validarTextfield(Ventana8.getjTextField3(), true)){
            r.setCantidad(Ventana8.getjTextField3().getText().replace(" ", ""));
        }
        else{
            Ventana8.CamposinLlenar("<Cantidad>");
            guardar = false;
        }
        if(guardar){
            r.GuardarRecetaMedica();
        }
    }
    
    public void registrarUnapersona(){
        if(Ventana3.getjRadioButton1().isSelected()){
            registrarUnpaciente();
        }
        else if(Ventana3.getjRadioButton2().isSelected()){
            if(Ventana3.getjRadioButton3().isSelected()){
                registrarUnmedico();
            }
            else if(Ventana3.getjRadioButton4().isSelected()){
                this.registraruUnaenfermera();
            }
        } 
    }
    
    public void registrarUnmedico(){
        //Para validar
        boolean guardar = true;
        Medico m = new Medico();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //ID de la Persona.
        if(instancia1.validarTextfield(Ventana3.getjTextField1(), true)){
            m.setIdpersona(Ventana3.getjTextField1().getText().replace(" ", ""));
        }
        else{
            Ventana3.CamposinLlenar("<ID de la Persona>");
            guardar = false;
        }
        //Identificación.
        if(instancia1.validarTextfield(Ventana3.getjTextField2(), true)){
            m.setIdentificacion(Ventana3.getjTextField2().getText().replace(" ", ""));
        }
        else{
            Ventana3.CamposinLlenar("<Identificación>");
            guardar = false;
        }
        //Nombre.
        if(instancia1.validarTextfield(Ventana3.getjTextField3(), true)){
            m.setNombre(Ventana3.getjTextField3().getText());
        }
        else{
            Ventana1.CamposinLlenar("<Nombre>");
            guardar = false;
        }
        //Dirección.
        if(instancia1.validarTextfield(Ventana3.getjTextField4(), true)){
            m.setDireccion(Ventana3.getjTextField4().getText());
        }
        else{
            Ventana3.CamposinLlenar("<Dirección>");
            guardar = false;
        }
        //Telefono.
        if(instancia1.validarTextfield(Ventana3.getjTextField5(), true)){
            m.setTelefono(Ventana3.getjTextField5().getText().replace(" ", ""));
        }
        else{
            Ventana3.CamposinLlenar("<Telefono>");
            guardar = false;
        }
        //Cargo.
        if(instancia1.validarTextfield(Ventana3.getjTextField8(), true)){
            m.setCargo(Ventana3.getjTextField8().getText());
        }
        else{
            Ventana3.CamposinLlenar("<Cargo>");
            guardar = false;
        }
        //Salario
        if(instancia1.validarTextfield(Ventana3.getjTextField9(), true)){
            m.setSalario(Ventana3.getjTextField9().getText().replace(" ", ""));
        }
        else{
            Ventana3.CamposinLlenar("<Salario>");
            guardar = false;
        }
        //Email.
        if(instancia1.validarTextfield(Ventana3.getjTextField10(), true)){
            m.setEmail(Ventana3.getjTextField10().getText().replace(" ", ""));
        }
        else{
            Ventana3.CamposinLlenar("<Email>");
            guardar = false;
        }
        //Coodigodearea.
        if(instancia1.validarCombobox(Ventana3.getjComboBox1(), true)){
            m.setCodigodearea(Ventana3.getjComboBox1().getSelectedItem().toString());
        }
        else{
            Ventana3.ComboboxVacio("<Codigo de Area>", "Area en el registro de Areas.");
            guardar = false;
        }
        //Jefe.
        m.setJefe(Ventana3.getjComboBox2().getSelectedItem().toString());
        
        //Especialidad.
        if(instancia1.validarTextfield(Ventana3.getjTextField11(), true)){
            m.setEspecialidad(Ventana3.getjTextField11().getText());
        }
        else{
            Ventana3.CamposinLlenar("<Especialidad>");
            guardar = false;
        }
        //Numero de licencia.
        if(instancia1.validarTextfield(Ventana3.getjTextField12(), true)){
            m.setNumerodelicencia(Ventana3.getjTextField12().getText().replace(" ", ""));
        }
        else{
            Ventana3.CamposinLlenar("<Numero de licencia>");
            guardar = false;
        }
        //Universidad.
        if(instancia1.validarTextfield(Ventana3.getjTextField13(), true)){
            m.setUniversidad(Ventana3.getjTextField13().getText());
        }
        else{
            Ventana3.CamposinLlenar("<Universidad>");
            guardar = false;
        }
        if(guardar){
            m.GuardarMedico();
        }
         
    }
    
    public void registrarUnpaciente(){
        System.out.println("entramos a registrar paciente");
        //Para validar
        boolean guardar = true;
        Paciente p = new Paciente();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //ID de la Persona.
        if(instancia1.validarTextfield(Ventana3.getjTextField1(), true)){
            p.setIdpersona(Ventana3.getjTextField1().getText().replace(" ", ""));
            System.out.println("entramos a registrar paciente 2");
        }
        else{
            Ventana3.CamposinLlenar("<ID de la Persona>");
            guardar = false;
        }
        //Identificación.
        if(instancia1.validarTextfield(Ventana3.getjTextField2(), true)){
            p.setIdentificacion(Ventana3.getjTextField2().getText().replace(" ", ""));
            System.out.println("entramos a registrar paciente 2");
        }
        else{
            Ventana3.CamposinLlenar("<Identificación>");
            guardar = false;
        }
        //Nombre.
        if(instancia1.validarTextfield(Ventana3.getjTextField3(), true)){
            p.setNombre(Ventana3.getjTextField3().getText());
        }
        else{
            Ventana3.CamposinLlenar("<Nombre>");
            guardar = false;
        }
        //Dirección.
        if(instancia1.validarTextfield(Ventana3.getjTextField4(), true)){
            p.setDireccion(Ventana3.getjTextField4().getText());
            System.out.println("entramos a registrar paciente 3");
        }
        else{
            Ventana3.CamposinLlenar("<Dirección>");
            guardar = false;
        }
          //Telefono.
        if(instancia1.validarTextfield(Ventana3.getjTextField5(), true)){
            p.setTelefono(Ventana3.getjTextField5().getText().replace(" ", ""));
            System.out.println("entramos a registrar paciente 4");
        }
        else{
            Ventana3.CamposinLlenar("<Telefono>");
            guardar = false;
        }
        //Fecha de nacimiento.
        if(instancia1.validarTextfield(Ventana3.getjTextField6(), true)){
            p.setFechadenacimento(Ventana3.getjTextField6().getText().replace(" ", ""));
            System.out.println("entramos a registrar paciente 5");
        }
        else{
            Ventana3.CamposinLlenar("<Fecha de nacimiento>");
            guardar = false;
        }
        //Actividad economica.
        if(instancia1.validarTextfield(Ventana3.getjTextField7(), true)){
            p.setActividadeconomica(Ventana3.getjTextField7().getText());
            System.out.println("entramos a registrar paciente 6");
        }
        else{
            Ventana3.CamposinLlenar("<Actividad economica>");
            guardar = false;
        }
        if(guardar){
            System.out.println("entramos a registrar paciente 7");
            p.GuardarPaciente();//no se pudo realizar la accion
            System.out.println("entramos a registrar paciente 8");
        }
         
    }
    
    public void registraruUnaenfermera(){
        //Para validar
        boolean guardar = true;
        Enfermera e = new Enfermera();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //ID de la Persona.
        if(instancia1.validarTextfield(Ventana3.getjTextField1(), true)){
            e.setIdpersona(Ventana3.getjTextField1().getText().replace(" ", ""));
        }
        else{
            Ventana3.CamposinLlenar("<ID de la Persona>");
            guardar = false;
        }
        //Identificación.
        if(instancia1.validarTextfield(Ventana3.getjTextField2(), true)){
            e.setIdentificacion(Ventana3.getjTextField2().getText().replace(" ", ""));
        }
        else{
            Ventana3.CamposinLlenar("<Identificación>");
            guardar = false;
        }
        //Nombre.
        if(instancia1.validarTextfield(Ventana3.getjTextField3(), true)){
            e.setNombre(Ventana3.getjTextField3().getText());
        }
        else{
            Ventana3.CamposinLlenar("<Nombre>");
            guardar = false;
        }
        //Dirección.
        if(instancia1.validarTextfield(Ventana3.getjTextField4(), true)){
            e.setDireccion(Ventana3.getjTextField4().getText());
        }
        else{
            Ventana3.CamposinLlenar("<Dirección>");
            guardar = false;
        }
        //Telefono.
        if(instancia1.validarTextfield(Ventana3.getjTextField5(), true)){
            e.setTelefono(Ventana3.getjTextField5().getText().replace(" ", ""));
            }
        else{
            Ventana3.CamposinLlenar("<Telefono>");
            guardar = false;
        }
        //Cargo.
        if(instancia1.validarTextfield(Ventana3.getjTextField8(), true)){
            e.setCargo(Ventana3.getjTextField8().getText().replace(" ", ""));
            }
        else{
            Ventana3.CamposinLlenar("<Cargo>");
            guardar = false;
        }
        //Salario.
        if(instancia1.validarTextfield(Ventana3.getjTextField9(), true)){
            e.setSalario(Ventana3.getjTextField9().getText().replace(" ", ""));
            }
        else{
            Ventana3.CamposinLlenar("<Salario>");
            guardar = false;
        }
        //Email.
        if(instancia1.validarTextfield(Ventana3.getjTextField10(), true)){
            e.setEmail(Ventana3.getjTextField10().getText().replace(" ", ""));
            }
        else{
            Ventana3.CamposinLlenar("<Email>");
            guardar = false;
        }
        //Codigo de Area.
        if(instancia1.validarCombobox(Ventana3.getjComboBox1(), true)){
            e.setCodigodearea(Ventana3.getjComboBox1().getSelectedItem().toString());
        }
        else{
            Ventana3.ComboboxVacio("<Codigo de Area>", "Area en el registro de Areas."); 
            guardar = false;
        }
        //Jefe.
        e.setJefe(Ventana3.getjComboBox2().getSelectedItem().toString());
        
        //Experiencia.
        if(instancia1.validarTextfield(Ventana3.getjTextField14(), true)){
            e.setExperiencia(Ventana3.getjTextField14().getText().replace(" ", ""));
         }
        else{
            Ventana3.CamposinLlenar("<Experiencia>");
        }
        //Conjuntodehabilidades.
        e.setConjuntodehabilidades(Ventana3.getjComboBox3().getSelectedItem().toString());
        
        if(guardar){
            e.GuardarEnfermera();
        }      
    }
    
    public void registraruUnahabitacion(){
        System.out.println("entramos a registrar habitacion");
        //Para validar
        boolean guardar = true;
        Habitacion h = new Habitacion();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        
        //Numero de Habitación.
        if(instancia1.validarTextfield(Ventana9.getjTextField1(), true)){
            h.setNrohabitacion(Ventana9.getjTextField1().getText().replace(" ", ""));
            System.out.println("entramos a registrar habitacion 2");
            }
        else{
            Ventana9.CamposinLlenar("<Numero de Habitación>");
            guardar = false;
        }
        //Descripción.
        if(instancia1.validarTextfield(Ventana9.getjTextField2(), true)){
            h.setDescripcion(Ventana9.getjTextField2().getText());
            System.out.println("entramos a registrar habitacion 3");
            }
        else{
            Ventana9.CamposinLlenar("<Descripción>");
            guardar = false;
        }
        //Codigo de Area.
        if(instancia1.validarCombobox(Ventana9.getjComboBox1(), true)){
            h.setCodigodearea(Ventana9.getjComboBox1().getSelectedItem().toString());
            System.out.println("entramos a registrar habitacion 4");
        }
        else{
            Ventana9.ComboboxVacio("<Codigo de Area>", "Area en el registro de Areas."); 
            guardar = false;
        }
        if(guardar){
            System.out.println("entramos a registrar habitacion 5");
            h.GuardarHabitacion();
            System.out.println("entramos a registrar habitacion 6");
        }
    }
    
    
}
