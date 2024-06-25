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
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class ControladorFunciones {
    //Variables.
    
    //Constructores.
    public ControladorFunciones(){
    }
    
    //Metodos.
    //Para validar.
    public boolean validarCombobox(JComboBox<String> combobox, boolean guardar){
        if(combobox.getSelectedItem().toString().length() > 0){
            return guardar = true;
        }  
        else{
            return guardar = false;      
        }
    }
    public boolean validarTextfield(JTextField textfield, boolean guardar){
        if(textfield.getText().replace(" ", "").length() > 0){
            return guardar = true;
        }  
        else{
            return guardar = false;      
        }
    }
    
    //Para registrar un conjunto de habilidades.
    public void guardarConjuntodehabilidades(ArrayList<String> Habilidades){
        //RegistrarERH
    
    }
    
     //Para dar elementos a los combobox.
    //jefe.
    public void obtenerJefe(JComboBox<String> combo, int opcion){
        if(opcion == 1){
            //Objeto de tipo paciente.
            Medico m = new Medico();
            //Lista de objeto area.
            ArrayList<Medico> Medicos = m.listar();
            //Creacion del modelo.
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            //lleando el modelo con los id de persona de la base de datos.
            for(int i = 0; i < Medicos.size();i++){
                modelo.addElement(Medicos.get(i).getIdpersona());
            }
            modelo.addElement("Nulo");
            //le damos el modelo.
            combo.setModel(modelo);
        }
        else if(opcion == 2){
            //Objeto de tipo paciente.
            Enfermera e = new Enfermera();
            //Lista de objeto area.
            ArrayList<Enfermera> Enfermeras = e.listar();
            //Creacion del modelo.
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            //lleando el modelo con los id de persona de la base de datos.
            for(int i = 0; i < Enfermeras.size();i++){
                modelo.addElement(Enfermeras.get(i).getIdpersona());
            }
            modelo.addElement("Nulo");
            //le damos el modelo.
            combo.setModel(modelo);  
        }
    
    }
    
    //Codigo de area.                                                           ----------
    public void obtenerCodigodearea(JComboBox<String> combo) {
        //Objeto de tipo Area.
        Area a = new Area();
        //Lista de objeto area.
        ArrayList<Area> Areas = a.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los codigos de area de la base de datos.
        for(int i = 0; i < Areas.size();i++){
            modelo.addElement(Areas.get(i).getCodigodearea());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
    //Id de la cama.                                                           ----------
    public void obtenerNumerodecama(JComboBox<String> combo){
        //Objeto de tipo paciente.
        Cama c = new Cama();
        //Lista de objeto area.
        ArrayList<Cama> Camas = c.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < Camas.size();i++){
            modelo.addElement(Camas.get(i).getNumerodecama());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
    //Codigo de la causa.                                                           ----------
    public void obtenerCodigodecausa(JComboBox<String> combo){
        //Objeto de tipo paciente.
        Causa c = new Causa();
        //Lista de objeto area.
        ArrayList<Causa> Causas = c.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < Causas.size();i++){
            modelo.addElement(Causas.get(i).getCodigodecausa());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
    //Id de Cita.                                                           ----------
    public void obtenerIdcita(JComboBox<String> combo){
        //Objeto de tipo paciente.
        Cita c = new Cita();
        //Lista de objeto area.
        ArrayList<Cita> Citas = c.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < Citas.size();i++){
            modelo.addElement(Citas.get(i).getIdcita());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
    //Id de Consulta.                                                           ----------
    public void obtenerIdconsulta(JComboBox<String> combo){
        //Objeto de tipo paciente.
        Consulta c = new Consulta();
        //Lista de objeto area.
        ArrayList<Consulta> Consultas = c.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < Consultas.size();i++){
            modelo.addElement(Consultas.get(i).getIdpersonam());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
    //Id de persona de la enfermera.                                                           ----------
    public void obtenerIdenfermera(JComboBox<String> combo){
        //Objeto de tipo paciente.
        Enfermera e = new Enfermera();
        //Lista de objeto area.
        ArrayList<Enfermera> Enfermeras = e.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < Enfermeras.size();i++){
            modelo.addElement(Enfermeras.get(i).getIdpersona());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
    //Id de habitacion.                                                           ----------
    public void obtenerNrohabitacion(JComboBox<String> combo){
        //Objeto de tipo paciente.
        Habitacion h = new Habitacion();
        //Lista de objeto area.
        ArrayList<Habitacion> Habitaciones = h.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < Habitaciones.size();i++){
            modelo.addElement(Habitaciones.get(i).getNrohabitacion());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
    //Codigo del medicamento.                                                           ----------
    public void obtenerCodigodemedicamento(JComboBox<String> combo){
        //Objeto de tipo paciente.
        Medicamento m = new Medicamento();
        //Lista de objeto area.
        ArrayList<Medicamento> Medicamentos = m.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < Medicamentos.size();i++){
            modelo.addElement(Medicamentos.get(i).getCodigodemedicamento());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
     //Id de persona del medico.                                                           ----------
    public void obtenerIdmedico(JComboBox<String> combo){
        //Objeto de tipo paciente.
        Medico m = new Medico();
        //Lista de objeto area.
        ArrayList<Medico> Medicos = m.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < Medicos.size();i++){
            modelo.addElement(Medicos.get(i).getIdpersona());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
        //Id de persona del paciente.                                                           ----------
    public void obtenerIdpaciente(JComboBox<String> combo){
        //Objeto de tipo paciente.
        Paciente p = new Paciente();
        //Lista de objeto area.
        ArrayList<Paciente> Pacientes = p.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < Pacientes.size();i++){
            modelo.addElement(Pacientes.get(i).getIdpersona());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
    
    //numero de la receta medica.                                                           ----------
    public void obtenerNumeroderecetamedica(JComboBox<String> combo){
        //Objeto de tipo paciente.
        RecetaMedica r = new RecetaMedica();
        //Lista de objeto area.
        ArrayList<RecetaMedica> RecetasMedicas = r.listar();
        //Creacion del modelo.
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        //lleando el modelo con los id de persona de la base de datos.
        for(int i = 0; i < RecetasMedicas.size();i++){
            modelo.addElement(RecetasMedicas.get(i).getNumeroderecetamedica());
        }
        //le damos el modelo.
        combo.setModel(modelo);
    }
}
