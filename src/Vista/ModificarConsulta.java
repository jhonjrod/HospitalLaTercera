/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorFunciones;
import Controlador.ControladorModificacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class ModificarConsulta extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form ModificarConsulta
     */
    public ModificarConsulta() {
        initComponents();
        jButton1.addActionListener(this);
        jCheckBox1.addActionListener(this);
        jCheckBox2.addActionListener(this);
        jCheckBox3.addActionListener(this);
        jCheckBox4.addActionListener(this);
        jCheckBox5.addActionListener(this);
        jCheckBox6.addActionListener(this);
        
        ControladorFunciones instancia1 = new ControladorFunciones();
        instancia1.obtenerIdmedico(jComboBox1);
        instancia1.obtenerIdpaciente(jComboBox2);
        instancia1.obtenerIdcita(jComboBox3);
        instancia1.obtenerNumeroderecetamedica(jComboBox4);
        instancia1.obtenerCodigodecausa(jComboBox5);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jComboBox6 = new javax.swing.JComboBox<>();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Actualización de Consulta:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(79, 79, 79))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("ID del Medico:");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("ID del Paciente:");

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("ID de la Cita:");

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Numero de Receta Medica:");

        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Codigo de Causa:");

        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Diagnostico:");

        jLabel1.setText("ID del Medico:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addGap(8, 8, 8)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Aceptar")){
            ControladorModificacion instancia2 = new ControladorModificacion ();
            instancia2.modificarUnaconsulta();
        }
        
        if(e.getActionCommand().equals("ID del Medico:")){
            if(jCheckBox1.isSelected()){
                jComboBox1.setEnabled(true);
            }
            else{
                jComboBox1.setEnabled(false);
            }
            
        }
        
        if(e.getActionCommand().equals("ID del Paciente:")){
            if(jCheckBox2.isSelected()){
                jComboBox2.setEnabled(true);
            }
            else{
                jComboBox2.setEnabled(false);
            }
        }
        if(e.getActionCommand().equals("ID de la Cita:")){
            if(jCheckBox3.isSelected()){
                jComboBox3.setEnabled(true);
            }
            else{
                jComboBox3.setEnabled(false);
            }
        }
        if(e.getActionCommand().equals("Numero de Receta Medica:")){
            if(jCheckBox4.isSelected()){
                jComboBox4.setEnabled(true);
            }
            else{
                jComboBox4.setEnabled(false);
            }
        }
        if(e.getActionCommand().equals("Codigo de Causa:")){
            if(jCheckBox5.isSelected()){
                jComboBox5.setEnabled(true);
            }
            else{
                jComboBox5.setEnabled(false);
            }
        }
        
        if(e.getActionCommand().equals("Diagnostico:")){
            if(jCheckBox6.isSelected()){
                jTextField1.setEnabled(true);
            }
            else{
                jTextField1.setEnabled(false);
            }
            
        }
    }
    
    //Mensajes de error.
    public void CamposinLlenar(String campo){
        JOptionPane.showMessageDialog(rootPane, "Error, Tiene que llenar el campo "+campo+" para completar el registro del area.", "Error.", JOptionPane.ERROR_MESSAGE);
    }
    
    public void ComboboxVacio(String campo, String entidad){
        JOptionPane.showMessageDialog(rootPane, "Error, Aun no se a registrado ningun "+campo+", para completar el registro debe regustrar primero una entidad "+entidad, "Error.", JOptionPane.ERROR_MESSAGE);
    }
    
    //Setters and Getters.
    public JCheckBox getjCheckBox1() {
        return jCheckBox1;
    }

    public void setjCheckBox1(JCheckBox jCheckBox1) {
        this.jCheckBox1 = jCheckBox1;
    }

    public JCheckBox getjCheckBox2() {
        return jCheckBox2;
    }

    public void setjCheckBox2(JCheckBox jCheckBox2) {
        this.jCheckBox2 = jCheckBox2;
    }

    public JCheckBox getjCheckBox3() {
        return jCheckBox3;
    }

    public void setjCheckBox3(JCheckBox jCheckBox3) {
        this.jCheckBox3 = jCheckBox3;
    }

    public JCheckBox getjCheckBox4() {
        return jCheckBox4;
    }

    public void setjCheckBox4(JCheckBox jCheckBox4) {
        this.jCheckBox4 = jCheckBox4;
    }

    public JCheckBox getjCheckBox5() {
        return jCheckBox5;
    }

    public void setjCheckBox5(JCheckBox jCheckBox5) {
        this.jCheckBox5 = jCheckBox5;
    }

    public JCheckBox getjCheckBox6() {
        return jCheckBox6;
    }

    public void setjCheckBox6(JCheckBox jCheckBox6) {
        this.jCheckBox6 = jCheckBox6;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public void setjComboBox2(JComboBox<String> jComboBox2) {
        this.jComboBox2 = jComboBox2;
    }

    public JComboBox<String> getjComboBox3() {
        return jComboBox3;
    }

    public void setjComboBox3(JComboBox<String> jComboBox3) {
        this.jComboBox3 = jComboBox3;
    }

    public JComboBox<String> getjComboBox4() {
        return jComboBox4;
    }

    public void setjComboBox4(JComboBox<String> jComboBox4) {
        this.jComboBox4 = jComboBox4;
    }

    public JComboBox<String> getjComboBox5() {
        return jComboBox5;
    }

    public void setjComboBox5(JComboBox<String> jComboBox5) {
        this.jComboBox5 = jComboBox5;
    }

    public JComboBox<String> getjComboBox6() {
        return jComboBox6;
    }

    public void setjComboBox6(JComboBox<String> jComboBox6) {
        this.jComboBox6 = jComboBox6;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }
    
}