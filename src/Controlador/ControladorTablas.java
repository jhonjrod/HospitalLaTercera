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
import Vista.Tablas;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ControladorTablas {
    //Variables.
    Tablas Ventana9;

    //Constructores.
    public ControladorTablas() {
    }

    public ControladorTablas(Tablas Ventana9) {
        this.Ventana9 = Ventana9;
    }
    
    //Setters and Getters.
    public Tablas getVentana9() {
        return Ventana9;
    }

    public void setVentana9(Tablas Ventana9) {
        this.Ventana9 = Ventana9;
    }
    
    //Metodos.
    //Para mostrar elementos en las tablas.
    public void mostrarentidades(){
        //Area:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo1().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo1().removeRow(i);
        }
        //Variables para trabajar
        Area a = new Area();
        ArrayList<Area> Areas = a.listar();
        for(int i = 0; i < Areas.size(); i++){
            Object []filas = new Object[4];
            filas[0] = Areas.get(i).getCodigodearea();
            filas[1] = Areas.get(i).getNombre();
            filas[2] = Areas.get(i).getDescripcion();
            filas[3] = Areas.get(i).getCamadisp();
            Ventana9.getModelo1().addRow(filas);
            Ventana9.getjTable1().setModel(Ventana9.getModelo1());
        
        }
        
        //Habitacion:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo2().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo2().removeRow(i);
        }
        //Variables para trabajar
        Habitacion h = new Habitacion();
        ArrayList<Habitacion> Habitaciones = h.listar();
        for(int i = 0; i < Habitaciones.size(); i++){
            Object []filas = new Object[3];
            filas[0] = Habitaciones.get(i).getNrohabitacion();
            filas[1] = Habitaciones.get(i).getDescripcion();
            filas[2] = Habitaciones.get(i).getCodigodearea();
            Ventana9.getModelo2().addRow(filas);
            Ventana9.getjTable2().setModel(Ventana9.getModelo2());        
        }
        //Cama:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo3().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo3().removeRow(i);
        }
        //Variables para trabajar
        Cama c = new Cama();
        ArrayList<Cama> Camas = c.listar();
        for(int i = 0; i < Camas.size(); i++){
            Object []filas = new Object[5];
            filas[0] = Camas.get(i).getNumerodecama();
            filas[1] = Camas.get(i).getDescripcion();
            filas[2] = Camas.get(i).getEstado();
            filas[3] = Camas.get(i).getNrohabitacion();
            filas[4] = Camas.get(i).getIdpersona();
            Ventana9.getModelo3().addRow(filas);
            Ventana9.getjTable3().setModel(Ventana9.getModelo3());       
        }
        //Medico:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo5().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo5().removeRow(i);
        }
        //Variables para trabajar
        Medico m2 = new Medico();
        ArrayList<Medico> Medicos = m2.listar();
        for(int i = 0; i < Medicos.size(); i++){
            Object []filas = new Object[12];
            filas[0] = Medicos.get(i).getIdpersona();
            filas[1] = Medicos.get(i).getIdentificacion();
            filas[2] = Medicos.get(i).getNombre();
            filas[3] = Medicos.get(i).getDireccion();
            filas[4] = Medicos.get(i).getTelefono();
            filas[5] = Medicos.get(i).getCargo();
            filas[6] = Medicos.get(i).getSalario();
            filas[7] = Medicos.get(i).getEmail();
            filas[8] = Medicos.get(i).getCodigodearea();
            filas[9] = Medicos.get(i).getJefe();
            filas[10] = Medicos.get(i).getEspecialidad();
            filas[11] = Medicos.get(i).getNumerodelicencia();
            filas[12] = Medicos.get(i).getUniversidad();
            Ventana9.getModelo5().addRow(filas);
            Ventana9.getjTable5().setModel(Ventana9.getModelo5());         
            }
        
        //Paciente:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo6().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo6().removeRow(i);
        }
        //Variables para trabajar
        Paciente p = new Paciente();
        ArrayList<Paciente> Pacientes = p.listar();
        for(int i = 0; i < Pacientes.size(); i++){
            Object []filas = new Object[7];
            filas[0] = Pacientes.get(i).getIdpersona();
            filas[1] = Pacientes.get(i).getIdentificacion();
            filas[2] = Pacientes.get(i).getNombre();
            filas[3] = Pacientes.get(i).getDireccion();
            filas[4] = Pacientes.get(i).getTelefono();
            filas[5] = Pacientes.get(i).getFechadenacimento();
            filas[6] = Pacientes.get(i).getActividadeconomica();
            Ventana9.getModelo6().addRow(filas);
            Ventana9.getjTable6().setModel(Ventana9.getModelo6());        
        }
        //Enfermera:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo7().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo7().removeRow(i);
        }
        //Variables para trabajar
        Enfermera e = new Enfermera();
        ArrayList<Enfermera> Enfermeras = e.listar();
        for(int i = 0; i < Enfermeras.size(); i++){
            Object []filas = new Object[11];
            filas[0] = Enfermeras.get(i).getIdpersona();
            filas[1] = Enfermeras.get(i).getIdentificacion();
            filas[2] = Enfermeras.get(i).getNombre();
            filas[3] = Enfermeras.get(i).getDireccion();
            filas[4] = Enfermeras.get(i).getTelefono();
            filas[5] = Enfermeras.get(i).getCargo();
            filas[6] = Enfermeras.get(i).getSalario();
            filas[7] = Enfermeras.get(i).getEmail();
            filas[8] = Enfermeras.get(i).getCodigodearea();
            filas[9] = Enfermeras.get(i).getJefe();
            filas[10] = Enfermeras.get(i).getExperiencia();
            //filas[11] = Enfermeras.get(i).getConjuntodehabilidades()); 
            Ventana9.getModelo7().addRow(filas);
            Ventana9.getjTable7().setModel(Ventana9.getModelo7());
        }
        //Medicamento:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo8().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo8().removeRow(i);
        }
        //Variables para trabajar
        Medicamento m = new Medicamento();
        ArrayList<Medicamento> Medicamentos = m.listar();
        for(int i = 0; i < Medicamentos.size(); i++){
            Object []filas = new Object[5];
            filas[0] = Medicamentos.get(i).getCodigodemedicamento();
            filas[1] = Medicamentos.get(i).getNombre();
            filas[2] = Medicamentos.get(i).getDescripcion();
            filas[3] = Medicamentos.get(i).getCosto();
            filas[4] = Medicamentos.get(i).getEstado();
            Ventana9.getModelo8().addRow(filas);
            Ventana9.getjTable8().setModel(Ventana9.getModelo8());
        }
        //Cita:
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo9().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo9().removeRow(i);
        }
        //Variables para trabajar
        Cita c3 = new Cita();
        ArrayList<Cita> Citas = c3.listar();
        for(int i = 0; i < Citas.size(); i++){
            Object []filas = new Object[5];
            filas[0] = Citas.get(i).getIdcita();
            filas[1] = Citas.get(i).getFecha();
            filas[2] = Citas.get(i).getHora();
            filas[3] = Citas.get(i).getIdpersonam();
            filas[4] = Citas.get(i).getIdpersonap();
            Ventana9.getModelo9().addRow(filas);
            Ventana9.getjTable9().setModel(Ventana9.getModelo9());       
        }
        //RecetaMedica:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo10().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo10().removeRow(i);
        }
        //Variables para trabajar
        RecetaMedica r = new RecetaMedica();
        ArrayList<RecetaMedica> RecetasMedicas = r.listar();
        for(int i = 0; i < RecetasMedicas.size(); i++){
            Object []filas = new Object[4];
            filas[0] = RecetasMedicas.get(i).getNumeroderecetamedica();
            filas[1] = RecetasMedicas.get(i).getCodigodemedicamento();
            filas[2] = RecetasMedicas.get(i).getDosis();
            filas[3] = RecetasMedicas.get(i).getCantidad();           
            Ventana9.getModelo10().addRow(filas);
            Ventana9.getjTable10().setModel(Ventana9.getModelo10());
        }    
        //Causas:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo11().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo11().removeRow(i);
        }
        //Variables para trabajar
        Causa c2 = new Causa();
        ArrayList<Causa> Causas = c2.listar();
        for(int i = 0; i < Causas.size(); i++){
            Object []filas = new Object[4];
            filas[0] = Causas.get(i).getCodigodecausa();
            filas[1] = Causas.get(i).getNombre();
            filas[2] = Causas.get(i).getDescripcion();
            Ventana9.getModelo11().addRow(filas);
            Ventana9.getjTable11().setModel(Ventana9.getModelo11());        
        }
        //Consulta:                                                           ----------
        //Limpiamos el modelo.
        for(int i = Ventana9.getModelo12().getRowCount()-1; i >= 0 ;i--){
                Ventana9.getModelo12().removeRow(i);
        }
        //Variables para trabajar
        Consulta h3 = new Consulta();
        ArrayList<Consulta> Consultas = h3.listar();
        for(int i = 0; i < Consultas.size(); i++){
            Object []filas = new Object[6];
            filas[0] = Consultas.get(i).getIdpersonam();
            filas[1] = Consultas.get(i).getIdpersonap();
            filas[2] = Consultas.get(i).getIdcita();
            filas[3] = Consultas.get(i).getNumeroderecetamedica();
            filas[4] = Consultas.get(i).getCodigodecausa();
            filas[5] = Consultas.get(i).getDiagnostico();
            Ventana9.getModelo12().addRow(filas);
            Ventana9.getjTable12().setModel(Ventana9.getModelo12());      
        }   
    }
}
