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
import Vista.ModificarArea;
import Vista.ModificarCama;
import Vista.ModificarCausa;
import Vista.ModificarCita;
import Vista.ModificarConsulta;
import Vista.ModificarEnfermera;
import Vista.ModificarHabitacion;
import Vista.ModificarMedicamento;
import Vista.ModificarMedico;
import Vista.ModificarPaciente;
import Vista.ModificarRecetaMedica;

/**
 *
 * @author USUARIO
 */
public class ControladorModificacion {
    //Variables.
    ModificarArea Ventana1;
    ModificarCama Ventana2;
    ModificarPaciente Ventana3;
    ModificarMedicamento Ventana4;
    ModificarCausa Ventana5;
    ModificarCita Ventana6;
    ModificarConsulta Ventana7; //
    ModificarRecetaMedica Ventana8;
    ModificarMedico Ventana9;
    ModificarEnfermera Ventana10;
    ModificarHabitacion Ventana11; //
    
    //Constructores.
    public ControladorModificacion(){
    }

    public ControladorModificacion(ModificarArea Ventana1, ModificarCama Ventana2, ModificarPaciente Ventana3, ModificarMedicamento Ventana4, ModificarCausa Ventana5, ModificarCita Ventana6, ModificarConsulta Ventana7, ModificarRecetaMedica Ventana8, ModificarMedico Ventana9, ModificarEnfermera Ventana10, ModificarHabitacion Ventana11) {
        this.Ventana1 = Ventana1;
        this.Ventana2 = Ventana2;
        this.Ventana3 = Ventana3;
        this.Ventana4 = Ventana4;
        this.Ventana5 = Ventana5;
        this.Ventana6 = Ventana6;
        this.Ventana7 = Ventana7;
        this.Ventana8 = Ventana8;
        this.Ventana9 = Ventana9;
        this.Ventana10 = Ventana10;
        this.Ventana11 = Ventana11;
    }

    //Setters and Getters.
    public ModificarArea getVentana1() {
        return Ventana1;
    }

    public void setVentana1(ModificarArea Ventana1) {
        this.Ventana1 = Ventana1;
    }

    public ModificarCama getVentana2() {
        return Ventana2;
    }

    public void setVentana2(ModificarCama Ventana2) {
        this.Ventana2 = Ventana2;
    }

    public ModificarPaciente getVentana3() {
        return Ventana3;
    }

    public void setVentana3(ModificarPaciente Ventana3) {
        this.Ventana3 = Ventana3;
    }

    public ModificarMedicamento getVentana4() {
        return Ventana4;
    }

    public void setVentana4(ModificarMedicamento Ventana4) {
        this.Ventana4 = Ventana4;
    }

    public ModificarCausa getVentana5() {
        return Ventana5;
    }

    public void setVentana5(ModificarCausa Ventana5) {
        this.Ventana5 = Ventana5;
    }

    public ModificarCita getVentana6() {
        return Ventana6;
    }

    public void setVentana6(ModificarCita Ventana6) {
        this.Ventana6 = Ventana6;
    }

    public ModificarConsulta getVentana7() {
        return Ventana7;
    }

    public void setVentana7(ModificarConsulta Ventana7) {
        this.Ventana7 = Ventana7;
    }

    public ModificarRecetaMedica getVentana8() {
        return Ventana8;
    }

    public void setVentana8(ModificarRecetaMedica Ventana8) {
        this.Ventana8 = Ventana8;
    }

    public ModificarMedico getVentana9() {
        return Ventana9;
    }

    public void setVentana9(ModificarMedico Ventana9) {
        this.Ventana9 = Ventana9;
    }

    public ModificarEnfermera getVentana10() {
        return Ventana10;
    }

    public void setVentana10(ModificarEnfermera Ventana10) {
        this.Ventana10 = Ventana10;
    }

    public ModificarHabitacion getVentana11() {
        return Ventana11;
    }

    public void setVentana11(ModificarHabitacion Ventana11) {
        this.Ventana11 = Ventana11;
    }
    
    //Metodos.
    //Metodos para modificar.
    public void modificarUnarea() {
        System.out.println("entramos a modificar area");
        //Para validar
        boolean guardar = true;
        //objeto
        Area a = new Area();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Para validar si puso un id por el cual modificar.
        if(instancia1.validarCombobox(Ventana1.getjComboBox1(), guardar)){
            //Si llegamos aqui es que no hay ids.
            System.out.println("entramos a modificar area 2");
            guardar=false;
        }
        else{
            Ventana1.ComboboxVacio("<Codigo de area>", "Area en el registro de Areas."); 
        }              
        //Nombre.
        if(Ventana1.getjCheckBox2().isSelected() && guardar){
            //Nombre.
            if(instancia1.validarTextfield(Ventana1.getjTextField2(), true)){
                a.CambiarArea("nombre", Ventana1.getjTextField2().getText(), Ventana1.getjComboBox1().getSelectedItem().toString());
                System.out.println("entramos a modificar area 3");
            }
            else{
                Ventana1.CamposinLlenar("<Nombre>");
            } 
        }
        //descripcion.
        if(Ventana1.getjCheckBox3().isSelected() && guardar){
            //descripcion.
            if(instancia1.validarTextfield(Ventana1.getjTextField3(), true)){
                a.CambiarArea("descripcion", Ventana1.getjTextField3().getText(), Ventana1.getjComboBox1().getSelectedItem().toString());
                System.out.println("entramos a modificar area 4");
            }
            else{
                Ventana1.CamposinLlenar("<Descripción>");
            }            
        }
        //camadisp
        if(Ventana1.getjCheckBox4().isSelected() && guardar){
            //camadisp.
            if(instancia1.validarTextfield(Ventana1.getjTextField4(), true)){
                a.CambiarArea("camadisp", Ventana1.getjTextField4().getText().replace(" ", ""), Ventana1.getjComboBox1().getSelectedItem().toString());
                System.out.println("entramos a modificar area 5");
            }
            else{
                Ventana1.CamposinLlenar("<Camas disponibles>");
            }               
        }
        //Codigo del Area:
        if(Ventana1.getjCheckBox1().isSelected() && guardar){
            //Nombre.
            if(instancia1.validarTextfield(Ventana1.getjTextField1(), true)){
                a.CambiarArea("codigodearea", Ventana1.getjTextField1().getText().replace(" ", ""), Ventana1.getjComboBox1().getSelectedItem().toString());
                System.out.println("entramos a modificar area 6");
            }
            else{
                Ventana1.CamposinLlenar("<Codigo del Area>");
                guardar = false;
            } 
        }
    }
    
    public void modificarUnacama(){
        //Para validar
        boolean guardar = true;
        Cama c = new Cama();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana2.getjComboBox4(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana2.ComboboxVacio("<Numero de la Cama>", "Cama en el registro de Camas."); 
        }              
        //descripcion.
        if(Ventana2.getjCheckBox2().isSelected() && guardar){
            //descripcion.
            if(instancia1.validarTextfield(Ventana2.getjTextField2(), true)){
                c.CambiarCama("descripcion", Ventana2.getjTextField2().getText(), Ventana2.getjComboBox4().getSelectedItem().toString());
            }
            else{
                Ventana2.CamposinLlenar("<Descripción>");
            }
        }
        //estado.
        if(Ventana2.getjCheckBox3().isSelected() && guardar){
            //estado.
            c.CambiarCama("estado", Ventana2.getjComboBox1().getSelectedItem().toString(), Ventana2.getjComboBox4().getSelectedItem().toString());
        }
        //nrohabitacion:
        if(Ventana2.getjCheckBox4().isSelected() && guardar){
            //nrohabitacion.
            if(instancia1.validarCombobox(Ventana2.getjComboBox2(), true)){
                c.CambiarCama("nrohabitacion", Ventana2.getjComboBox2().getSelectedItem().toString(), Ventana2.getjComboBox4().getSelectedItem().toString());
            }
            else{
                Ventana2.ComboboxVacio("<Numero de la Habitación>", "Habitación"); 
            }
        }
        //idpersona.
        if(Ventana2.getjCheckBox5().isSelected() && guardar){
            //idpersona.
            if(instancia1.validarCombobox(Ventana2.getjComboBox3(), true)){
                c.CambiarCama("idpersona", Ventana2.getjComboBox3().getSelectedItem().toString(), Ventana2.getjComboBox4().getSelectedItem().toString());
            }
            else{
                Ventana2.ComboboxVacio("<ID de la Persona>", "Paciente en el registro de personas."); 
            }
        }
        //Numero de la Cama
        if(Ventana2.getjCheckBox1().isSelected() && guardar){
            //Numero de la Cama.
            if(instancia1.validarTextfield(Ventana2.getjTextField1(), true)){
                c.CambiarCama("numerodecama", Ventana2.getjTextField1().getText().replace(" ", ""), Ventana2.getjComboBox4().getSelectedItem().toString());
            }
            else{
                Ventana2.CamposinLlenar("<Numero de la Cama>");
            }
        }
    }
    
    public void modificarUnpaciente(){
        //Para validar
        boolean guardar = true;
        Paciente p = new Paciente();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana3.getjComboBox1(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana3.ComboboxVacio("<ID de la Persona>", "Paciente en el registro de personas."); 
        }
        //Identificación.
        if(Ventana3.getjCheckBox2().isSelected() && guardar){
            //Identificación.
            if(instancia1.validarTextfield(Ventana3.getjTextField2(), true)){
                 p.CambiarPaciente("identificacion", Ventana3.getjTextField2().getText().replace(" ", ""), Ventana3.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana3.CamposinLlenar("<Identificación>");
            }       
        }
        //Nombre.
        if(Ventana3.getjCheckBox3().isSelected() && guardar){
            //Nombre.
            if(instancia1.validarTextfield(Ventana3.getjTextField3(), true)){
                 p.CambiarPaciente("nombre", Ventana3.getjTextField3().getText(), Ventana3.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana3.CamposinLlenar("<Nombre>");
            }       
        }
        //Dirección.
        if(Ventana3.getjCheckBox4().isSelected() && guardar){
            //Dirección.
            if(instancia1.validarTextfield(Ventana3.getjTextField4(), true)){
                 p.CambiarPaciente("direccion", Ventana3.getjTextField4().getText(), Ventana3.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana3.CamposinLlenar("<Dirección>");
            }     
        }
        //Telefono.
        if(Ventana3.getjCheckBox5().isSelected() && guardar){
            //Telefono.
            if(instancia1.validarTextfield(Ventana3.getjTextField5(), true)){
                 p.CambiarPaciente("telefono", Ventana3.getjTextField5().getText().replace(" ", ""), Ventana3.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana3.CamposinLlenar("<Telefono>");
            }      
        }      
        //Fechadenacimento.
        if(Ventana3.getjCheckBox6().isSelected() && guardar){
            //Fechadenacimento.
            if(instancia1.validarTextfield(Ventana3.getjTextField6(), true)){
                 p.CambiarPaciente("fechadenacimento", Ventana3.getjTextField6().getText().replace(" ", ""), Ventana3.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana3.CamposinLlenar("<Fecha de nacimento>");
            }       
        }       
        //Actividadeconomica.
        if(Ventana3.getjCheckBox7().isSelected() && guardar){
            //Actividadeconomica.
            if(instancia1.validarTextfield(Ventana3.getjTextField7(), true)){
                 p.CambiarPaciente("actividadeconomica", Ventana3.getjTextField7().getText().replace(" ", ""), Ventana3.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana3.CamposinLlenar("<Actividad economica>");
            }
        
        }
        //ID de la Persona:.
        if(Ventana3.getjCheckBox1().isSelected() && guardar){
            //ID de la Persona:.
            if(instancia1.validarTextfield(Ventana3.getjTextField1(), true)){
                 p.CambiarPaciente("idpersona", Ventana3.getjTextField1().getText().replace(" ", ""), Ventana3.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana3.CamposinLlenar("<ID de la Persona>");
            }       
        }
    }
    
    public void modificarUnMedicamento(){
        //Para validar
        boolean guardar = true;
        Medicamento m = new Medicamento();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana4.getjComboBox1(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana4.ComboboxVacio("<Codigo del Medicamento>", "Medicamento en el registro de Medicamentos."); 
        }       
        //Nombre.
        if(Ventana4.getjCheckBox2().isSelected() && guardar){
            //Nombre.
            if(instancia1.validarTextfield(Ventana4.getjTextField2(), true)){
                m.CambiarMedicamento("nombre", Ventana4.getjTextField2().getText(), Ventana4.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana4.CamposinLlenar("<Nombre>");
            }
        }
        //DescripciÓn.
        if(Ventana4.getjCheckBox3().isSelected() && guardar){
            //DescripciÓn.
            if(instancia1.validarTextfield(Ventana4.getjTextField3(), true)){
                m.CambiarMedicamento("descripcion", Ventana4.getjTextField3().getText(), Ventana4.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana4.CamposinLlenar("<Descripción>");
            }
        }
        //Costo.
        if(Ventana4.getjCheckBox4().isSelected() && guardar){
            //Costo.
            if(instancia1.validarTextfield(Ventana4.getjTextField4(), true)){
                m.CambiarMedicamento("costo", Ventana4.getjTextField4().getText().replace(" ", ""), Ventana4.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana4.CamposinLlenar("<Costo>");
            }
        }
        //Estado.
        if(Ventana4.getjCheckBox5().isSelected() && guardar){
            //Estado.
            if(instancia1.validarTextfield(Ventana4.getjTextField5(), true)){
                m.CambiarMedicamento("estado", Ventana4.getjTextField5().getText(), Ventana4.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana4.CamposinLlenar("<Estado>");
            }        
        }
        //Codigo del Medicamento.
        if(Ventana4.getjCheckBox1().isSelected() && guardar){
            //Codigo del Medicamento.
            if(instancia1.validarTextfield(Ventana4.getjTextField1(), true)){
                m.CambiarMedicamento("codigodemedicamento", Ventana4.getjTextField1().getText().replace(" ", ""), Ventana4.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana4.CamposinLlenar("<Codigo del Medicamento>");
            }
        }
    }
    
    public void modificarUnacausa(){
        //Para validar
        boolean guardar = true;
        Causa c = new Causa();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana5.getjComboBox1(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana5.ComboboxVacio("<Codigo de Causa>", "Causa en el registro de Causas."); 
        }
        //Nombre.
        if(Ventana5.getjCheckBox2().isSelected() && guardar){
            //Nombre.
            if(instancia1.validarTextfield(Ventana5.getjTextField2(), true)){
                c.CambiarCausa("nombre", Ventana5.getjTextField2().getText(), Ventana5.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana5.CamposinLlenar("<Nombre>");
            }
        }
        //Descripción.
        if(Ventana5.getjCheckBox3().isSelected() && guardar){
            //Descripción.
            if(instancia1.validarTextfield(Ventana5.getjTextField3(), true)){
                c.CambiarCausa("descripcion", Ventana5.getjTextField3().getText(), Ventana5.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana5.CamposinLlenar("<Descripción>");
            } 
        }
        //Codigo de Causa.
        if(Ventana5.getjCheckBox1().isSelected() && guardar){
            //Codigo de Causa.
            if(instancia1.validarTextfield(Ventana5.getjTextField1(), true)){
                c.CambiarCausa("codigodecausa", Ventana5.getjTextField1().getText().replace(" ", ""), Ventana5.getjComboBox1().getSelectedItem().toString());
            }
            else{
                Ventana5.CamposinLlenar("<Codigo de Causa:>");
            }
        }
    }
    
    public void modificarUnacita(){
        //Para validar
        boolean guardar = true; 
        Cita c = new Cita();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana6.getjComboBox3(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana6.ComboboxVacio("<Id Cita>", "Cita en el registro de Citas."); 
        }
        //Fecha.
        if(Ventana6.getjCheckBox2().isSelected() && guardar){
            //Fecha.
            if(instancia1.validarTextfield(Ventana6.getjTextField2(), true)){
                c.CambiarCita("fecha", Ventana6.getjTextField2().getText().replace(" ", ""), Ventana6.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana6.CamposinLlenar("<Fecha>");
            }
        }
        //Hora.
        if(Ventana6.getjCheckBox3().isSelected() && guardar){
            //Hora.
            if(instancia1.validarTextfield(Ventana6.getjTextField3(), true)){
                c.CambiarCita("hora", Ventana6.getjTextField3().getText().replace(" ", ""), Ventana6.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana6.CamposinLlenar("<Hora>");
            }        
        }
        //ID del Medico.
        if(Ventana6.getjCheckBox4().isSelected() && guardar){
            //Idpersona.
            if(instancia1.validarCombobox(Ventana6.getjComboBox1(), true)){
                c.CambiarCita("idpersonam", Ventana6.getjComboBox1().getSelectedItem().toString(), Ventana6.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana6.ComboboxVacio("<ID del Medico>", "Medico en el registro de persona."); 
            }
        }
        //ID del paciente.
        if(Ventana6.getjCheckBox5().isSelected() && guardar){
            //ID del paciente.
            if(instancia1.validarCombobox(Ventana6.getjComboBox2(), true)){
                c.CambiarCita("idpersonap", Ventana6.getjComboBox2().getSelectedItem().toString(), Ventana6.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana6.ComboboxVacio("<ID del Paciente>", "Paciente en el registro de persona."); 
            }        
        }
        //ID de la Cita.
        if(Ventana6.getjCheckBox1().isSelected() && guardar){
            //ID de la cita.
            if(instancia1.validarTextfield(Ventana6.getjTextField1(), true)){
                c.CambiarCita("idcita", Ventana6.getjTextField1().getText().replace(" ", ""), Ventana6.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana6.CamposinLlenar("<ID de la Cita>");
            }
        }
    }
    
    
    public void modificarUnaconsulta(){
        //Para validar
        boolean guardar = true;
        Consulta c = new Consulta();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana7.getjComboBox6(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana7.ComboboxVacio("<ID del Medico>", "Consultas en el registro de Consultas."); 
        }       
        //ID del Paciente.
        if(Ventana7.getjCheckBox2().isSelected() && guardar){
            //ID del Paciente.
            if(instancia1.validarCombobox(Ventana7.getjComboBox2(), true)){
                c.CambiarConsulta("idpersonap", Ventana7.getjComboBox2().getSelectedItem().toString(), Ventana7.getjComboBox6().getSelectedItem().toString());
            }
            else{
                Ventana7.ComboboxVacio("<ID del Paciente>", "Paciente en el registro de personas."); 
            }
        }
        //ID de la Cita.
        if(Ventana7.getjCheckBox3().isSelected() && guardar){
            //ID de la Cita.
            if(instancia1.validarCombobox(Ventana7.getjComboBox3(), true)){
                c.CambiarConsulta("idcita", Ventana7.getjComboBox3().getSelectedItem().toString(), Ventana7.getjComboBox6().getSelectedItem().toString());
            }
            else{
                Ventana7.ComboboxVacio("<ID de la Cita>", "Cita en el registro de Citas."); 
            }
        }
        //Numero de Receta Medica.
        if(Ventana7.getjCheckBox4().isSelected() && guardar){
            //Numero de Receta Medica.
            if(instancia1.validarCombobox(Ventana7.getjComboBox4(), true)){
                c.CambiarConsulta("numeroderecetamedica", Ventana7.getjComboBox4().getSelectedItem().toString(), Ventana7.getjComboBox6().getSelectedItem().toString());
            }
            else{
                Ventana7.ComboboxVacio("<Numero de Receta Medica>", "Receta Medica en el registro de Recetas Medicas."); 
            }
        }
        //Codigo de Causa.
        if(Ventana7.getjCheckBox5().isSelected() && guardar){
            //Codigo de Causa.
            if(instancia1.validarCombobox(Ventana7.getjComboBox5(), true)){
                c.CambiarConsulta("codigodecausa", Ventana7.getjComboBox5().getSelectedItem().toString(), Ventana7.getjComboBox6().getSelectedItem().toString());
            }
            else{
                Ventana7.ComboboxVacio("<Codigo de Causa>", "Causa en el registro de Causas"); 
            }
        }
        //Diagnostico.
        if(Ventana7.getjCheckBox6().isSelected() && guardar){
            //Diagnostico.
            if(instancia1.validarTextfield(Ventana7.getjTextField1(), true)){
                c.CambiarConsulta("diagnostico", Ventana7.getjTextField1().getText(), Ventana7.getjComboBox6().getSelectedItem().toString());
            }
            else{
                Ventana7.CamposinLlenar("<Diagnostico>");
            }
        }
        //ID del Medico.
        if(Ventana7.getjCheckBox1().isSelected() && guardar){
            //ID del Medico.
            if(instancia1.validarCombobox(Ventana7.getjComboBox1(), true)){
                c.CambiarConsulta("idpersonam", Ventana7.getjComboBox1().getSelectedItem().toString(), Ventana7.getjComboBox6().getSelectedItem().toString());
            }
            else{
                Ventana7.ComboboxVacio("<ID del Medico>", "Medico en el registro de personas."); 
            }
        }        
    }
    
    
    public void modificarUnarecetamedica(){
        //Para validar
        boolean guardar = true;
        RecetaMedica r = new RecetaMedica();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana8.getjComboBox2(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana8.ComboboxVacio("<ID del Medico>", "Medico en el registro de personas."); 
        }
        //Codigo del Medicamento.
        if(Ventana8.getjCheckBox2().isSelected() && guardar){
            //Codigo del Medicamento.
            if(instancia1.validarCombobox(Ventana8.getjComboBox1(), true)){
                r.CambiarRecetaMedica("codigodemedicamento",Ventana8.getjComboBox1().getSelectedItem().toString(), Ventana7.getjComboBox2().getSelectedItem().toString());
            }
            else{
                Ventana8.ComboboxVacio("<Codigo del Medicamento>", "Medicamento en el registro de Medicamentos."); 
            }
        }       
        //Dosis.
        if(Ventana8.getjCheckBox3().isSelected() && guardar){
            //Dosis.
            if(instancia1.validarTextfield(Ventana8.getjTextField2(), true)){
                 r.CambiarRecetaMedica("dosis", Ventana8.getjTextField2().getText(), Ventana8.getjComboBox2().getSelectedItem().toString());
            }
            else{
                Ventana8.CamposinLlenar("<Dosis>");
            }              
        }
        //Cantidad.
        if(Ventana8.getjCheckBox4().isSelected() && guardar){
            //Cantidad.
            if(instancia1.validarTextfield(Ventana8.getjTextField3(), true)){
                 r.CambiarRecetaMedica("cantidad", Ventana8.getjTextField3().getText(), Ventana8.getjComboBox2().getSelectedItem().toString());
            }
            else{
                Ventana8.CamposinLlenar("<Cantidad>");
            }              
        }
        //Numero de Receta Medica.
        if(Ventana8.getjCheckBox1().isSelected() && guardar){
            //Numero de Receta Medica.
            if(instancia1.validarTextfield(Ventana8.getjTextField1(), true)){
                 r.CambiarRecetaMedica("numeroderecetamedica", Ventana8.getjTextField1().getText().replace(" ", ""), Ventana8.getjComboBox2().getSelectedItem().toString());
            }
            else{
                Ventana8.CamposinLlenar("<Numero de Receta Medica>");
            }              
        }
    }
    
    public void modificarUnmedico(){
        //Para validar
        boolean guardar = true;
        Medico m = new Medico();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana9.getjComboBox3(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana9.ComboboxVacio("<ID del Medico>", "Medico en el registro de personas."); 
        }       
        //Identificacion.
        if(Ventana9.getjCheckBox2().isSelected() && guardar){
            //Identificacion.
            if(instancia1.validarTextfield(Ventana9.getjTextField2(), true)){
                 m.CambiarMedico("identificacion", Ventana9.getjTextField2().getText().replace(" ", ""), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Identificación>");
            }        
        }
        //Nombre.
        if(Ventana9.getjCheckBox3().isSelected() && guardar){
            //Nombre.
            if(instancia1.validarTextfield(Ventana9.getjTextField3(), true)){
                 m.CambiarMedico("nombre", Ventana9.getjTextField3().getText(), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Nombre>");
            }       
        }
        //Direcccion.
        if(Ventana9.getjCheckBox4().isSelected() && guardar){
            //Direccion.
            if(instancia1.validarTextfield(Ventana9.getjTextField4(), true)){
                 m.CambiarMedico("direccion", Ventana9.getjTextField4().getText(), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Dirección>");
            }        
        }
        //Telefono.
        if(Ventana9.getjCheckBox5().isSelected() && guardar){
            //Telefono.
            if(instancia1.validarTextfield(Ventana9.getjTextField5(), true)){
                 m.CambiarMedico("telefono", Ventana9.getjTextField5().getText().replace(" ", ""), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Telefono>");
            }       
        }       
        //Cargo.
        if(Ventana9.getjCheckBox6().isSelected() && guardar){
            //Cargo.
            if(instancia1.validarTextfield(Ventana9.getjTextField6(), true)){
                 m.CambiarMedico("cargo", Ventana9.getjTextField6().getText(), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Cargo>");
            }      
        }
        //Salario.
        if(Ventana9.getjCheckBox7().isSelected() && guardar){
            //Salario.
            if(instancia1.validarTextfield(Ventana9.getjTextField7(), true)){
                 m.CambiarMedico("salario", Ventana9.getjTextField7().getText().replace(" ", ""), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Salario>");
            }        
        }
        //Email.
        if(Ventana9.getjCheckBox8().isSelected() && guardar){
            //Email.
            if(instancia1.validarTextfield(Ventana9.getjTextField8(), true)){
                 m.CambiarMedico("email", Ventana9.getjTextField8().getText().replace(" ", ""), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Email>");
            }       
        }
        //Codigo de Area.
        if(Ventana9.getjCheckBox12().isSelected() && guardar){
            //Codigo de Area.
            if(instancia1.validarCombobox(Ventana9.getjComboBox1(), true)){
                 m.CambiarMedico("codigodearea", Ventana9.getjComboBox1().getSelectedItem().toString(), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Codigo de Area>");
            }       
        }
        //Jefe.
        if(Ventana9.getjCheckBox13().isSelected() && guardar){
            //Jefe.
            if(instancia1.validarCombobox(Ventana9.getjComboBox2(), true)){
                 m.CambiarMedico("jefe", Ventana9.getjComboBox2().getSelectedItem().toString(), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Jefe>");
            }       
        }       
        //Especialidad:.
        if(Ventana9.getjCheckBox9().isSelected() && guardar){
            //Especialidad:.
            if(instancia1.validarTextfield(Ventana9.getjTextField9(), true)){
                 m.CambiarMedico("especialidad", Ventana9.getjTextField9().getText(), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Especialidad>");
            }     
        }
        
        //Numero de licencia:.
        if(Ventana9.getjCheckBox10().isSelected() && guardar){
            //Numero de licencia:.
            if(instancia1.validarTextfield(Ventana9.getjTextField10(), true)){
                 m.CambiarMedico("numerodelicencia", Ventana9.getjTextField10().getText().replace(" ", ""), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Numero de licencia:>");
            }      
        }        
        //Universidad.
        if(Ventana9.getjCheckBox11().isSelected() && guardar){
            //universidad.
            if(instancia1.validarTextfield(Ventana9.getjTextField11(), true)){
                 m.CambiarMedico("universidad", Ventana9.getjTextField11().getText().replace(" ", ""), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<Universidad>");
            }       
        } 
        //ID de la Persona.
        if(Ventana9.getjCheckBox1().isSelected() && guardar){
            //ID de la Persona.
            if(instancia1.validarTextfield(Ventana9.getjTextField1(), true)){
                 m.CambiarMedico("idpersona", Ventana9.getjTextField1().getText().replace(" ", ""), Ventana9.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana9.CamposinLlenar("<ID de la Persona>");
            }        
        }
    }
    
    public void modificarUnaenfermera(){
        //Para validar
        boolean guardar = true;
        Enfermera e = new Enfermera();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana10.getjComboBox3(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana10.ComboboxVacio("<Id Persona>", "Medico en el registro de personas."); 
        }
        //Identificación.
        if(Ventana10.getjCheckBox2().isSelected() && guardar){
            //Identificación.
            if(instancia1.validarTextfield(Ventana10.getjTextField2(), true)){
                 e.CambiarEnfermera("identificacion", Ventana10.getjTextField2().getText().replace(" ", ""), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Identificación>");
            }       
        }
        //Nombre.
        if(Ventana10.getjCheckBox3().isSelected() && guardar){
            //Nombre.
            if(instancia1.validarTextfield(Ventana10.getjTextField3(), true)){
                 e.CambiarEnfermera("nombre", Ventana10.getjTextField3().getText(), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Nombre>");
            }        
        }
        //Dirección.
        if(Ventana10.getjCheckBox4().isSelected() && guardar){
            //Dirección.
            if(instancia1.validarTextfield(Ventana10.getjTextField4(), true)){
                 e.CambiarEnfermera("direccion", Ventana10.getjTextField4().getText().replace(" ", ""), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Dirección>");
            }        
        }
        //Telefono.
        if(Ventana10.getjCheckBox5().isSelected() && guardar){
            //Telefono.
            if(instancia1.validarTextfield(Ventana10.getjTextField5(), true)){
                 e.CambiarEnfermera("telefono", Ventana10.getjTextField5().getText().replace(" ", ""), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Telefono>");
            }        
        }        
        //Cargo.
        if(Ventana10.getjCheckBox6().isSelected() && guardar){
            //Cargo.
            if(instancia1.validarTextfield(Ventana10.getjTextField6(), true)){
                 e.CambiarEnfermera("cargo", Ventana10.getjTextField6().getText().replace(" ", ""), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Cargo>");
            }        
        }
        //Salario.
        if(Ventana10.getjCheckBox7().isSelected() && guardar){
            //Salario.
            if(instancia1.validarTextfield(Ventana10.getjTextField7(), true)){
                 e.CambiarEnfermera("salario", Ventana10.getjTextField7().getText().replace(" ", ""), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Salario>");
            }        
        }
        //Email.
        if(Ventana10.getjCheckBox8().isSelected() && guardar){
            //Email.
            if(instancia1.validarTextfield(Ventana10.getjTextField8(), true)){
                 e.CambiarEnfermera("email", Ventana10.getjTextField8().getText().replace(" ", ""), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Email>");
            }        
        }
        //Codigo de Area.
        if(Ventana10.getjCheckBox10().isSelected() && guardar){
            //Codigo de Area.
            if(instancia1.validarCombobox(Ventana10.getjComboBox1(), true)){
                 e.CambiarEnfermera("codigodearea", Ventana10.getjComboBox1().getSelectedItem().toString(), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Codigo de Area>");
            }        
        }
        //jefe.
        if(Ventana10.getjCheckBox11().isSelected() && guardar){
            //Jefe.
            if(instancia1.validarCombobox(Ventana10.getjComboBox2(), true)){
                 e.CambiarEnfermera("jefe", Ventana10.getjComboBox2().getSelectedItem().toString(), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Jefe>");
            }        
        }
        //Experiencia.
        if(Ventana10.getjCheckBox9().isSelected() && guardar){
            //Experiencia.
            if(instancia1.validarTextfield(Ventana10.getjTextField9(), true)){
                 e.CambiarEnfermera("experiencia", Ventana10.getjTextField9().getText().replace(" ", ""), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<Experiencia>");
            }       
        }       
        //Conjuntodehabilidades.
        if(Ventana10.getjCheckBox12().isSelected() && guardar){
            //Conjuntodehabilidades.
            e.setConjuntodehabilidades(Ventana10.getjComboBox4().getSelectedItem().toString());           
        }
        //ID de la Persona.
        if(Ventana10.getjCheckBox1().isSelected() && guardar){
            //ID de la Persona:.
            if(instancia1.validarTextfield(Ventana10.getjTextField1(), true)){
                 e.CambiarEnfermera("identificacion", Ventana10.getjTextField1().getText().replace(" ", ""), Ventana10.getjComboBox3().getSelectedItem().toString());
            }
            else{
                Ventana10.CamposinLlenar("<ID de la Persona>");
            }        
        }        
    }
    
    public void modificarUnahabitacion(){
        //Para validar
        boolean guardar = true;
        Habitacion h = new Habitacion();
        //Validaciones
        ControladorFunciones instancia1 = new ControladorFunciones();
        //Id para modificar.
        if(instancia1.validarCombobox(Ventana11.getjComboBox2(), guardar)){
            //Si llegamos aqui es que no hay ids.
        }
        else{
            Ventana11.ComboboxVacio("<Numero de Habitación>", "Habitación en el registro de Habitaciones."); 
        }       
        //Descripción.
        if(Ventana11.getjCheckBox2().isSelected() && guardar){
            //Descripción.
            if(instancia1.validarTextfield(Ventana11.getjTextField2(), true)){
                 h.CambiarHabitacion("descripcion", Ventana11.getjTextField2().getText(), Ventana11.getjComboBox2().getSelectedItem().toString());
            }
            else{
                Ventana11.CamposinLlenar("<Descripción>");
            }        
        }
        //Codigo de Area.
        if(Ventana11.getjCheckBox3().isSelected() && guardar){
            //Codigo de Area.
            if(instancia1.validarCombobox(Ventana11.getjComboBox1(), true)){
                 h.CambiarHabitacion("codigodearea", Ventana11.getjComboBox1().getSelectedItem().toString(), Ventana11.getjComboBox2().getSelectedItem().toString());
            }
            else{
                Ventana11.CamposinLlenar("<Codigo de Area>");
            }        
        }
        //Numero de Habitación.
        if(Ventana11.getjCheckBox1().isSelected() && guardar){
            //Numero de Habitación.
            if(instancia1.validarTextfield(Ventana11.getjTextField1(), true)){
                 h.CambiarHabitacion("nrohabitacion", Ventana11.getjTextField1().getText().replace(" ", ""), Ventana11.getjComboBox2().getSelectedItem().toString());
            }
            else{
                Ventana11.CamposinLlenar("<Numero de Habitación>");
            }        
        }
    }
}
