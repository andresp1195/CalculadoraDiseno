/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaGUI;
import VistaGUI.GUI;
//import calculadoradiseño.DTO;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Jespi_000
 */
public class OperacionGUI extends javax.swing.JFrame {
    public String operacion;
    /**
     * Creates new form OperacionGUI
     */
    public OperacionGUI(String NombreOperacion,String TituloDeVentana) {
        initComponents();
        this.operacion = NombreOperacion;
        this.setTitle(TituloDeVentana);
        this.LabelOperacion.setText(NombreOperacion);
        if (NombreOperacion.equals("Radicacion")){
            this.FieldOperando2.setVisible(false);
            this.LabelOperando2.setVisible(false);
        }
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(BotonCalcular);
        FieldOperando1.requestFocusInWindow();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonCalcular = new javax.swing.JButton();
        LabelOperacionSeleccionada = new javax.swing.JLabel();
        LabelOperacion = new javax.swing.JLabel();
        FieldOperando1 = new javax.swing.JTextField();
        LabelOperando1 = new javax.swing.JLabel();
        FieldOperando2 = new javax.swing.JTextField();
        LabelOperando2 = new javax.swing.JLabel();
        LabelResultado = new javax.swing.JLabel();
        LabelResultadoInt = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotonCalcular.setText("Calcular");
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });

        LabelOperacionSeleccionada.setText("Operación Seleccionada");

        LabelOperacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        LabelOperando1.setText("Operando #1:");

        LabelOperando2.setText("Operando #2: ");

        LabelResultado.setText("Resultado: ");

        BotonAtras.setText("Atrás");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonAtras)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelOperando2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelOperando1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FieldOperando2)
                                    .addComponent(FieldOperando1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LabelOperacionSeleccionada)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(LabelOperacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelResultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelResultadoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotonCalcular))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelOperacionSeleccionada)
                    .addComponent(BotonAtras))
                .addGap(18, 18, 18)
                .addComponent(LabelOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldOperando1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelOperando1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldOperando2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelOperando2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCalcular)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelResultado)
                    .addComponent(LabelResultadoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed
        //get parámetros de cada text field y validarlos
        try{
            int op1 = Integer.parseInt(FieldOperando1.getText());
            int op2 = Integer.parseInt(FieldOperando2.getText());
            if ((op1>0) && (op2>0)){
                //crear el DTO que contenga la información de petición al controlador
                List <Integer> lista = new LinkedList();
                lista.add(op1);
                lista.add(op2);
                //DTO enviar = new DTO(lista,this.operacion,"",false,"");
                JOptionPane.showMessageDialog(new JFrame(), "Crear DTO: DTO(lista,"+this.operacion+",--,false,--","Información",JOptionPane.INFORMATION_MESSAGE);
                //enviarlo al controlador
                //LabelResultadoInt.setText(/*Respuesta del DTO enviado como respuesta por el controlador*/);
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(),"Los operandos ingresados no son números enteros positivos.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(new JFrame(),"Debe ingresar los datos requeridos (Operandos) para continuar.\nLos datos deben ser números enteros positivos.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonCalcularActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        GUI gui = new GUI();
        this.setVisible(false);
        gui.setVisible(true);
    }//GEN-LAST:event_BotonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(OperacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionGUI().setVisible(true);
            }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionGUI().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JTextField FieldOperando1;
    private javax.swing.JTextField FieldOperando2;
    private javax.swing.JLabel LabelOperacion;
    private javax.swing.JLabel LabelOperacionSeleccionada;
    private javax.swing.JLabel LabelOperando1;
    private javax.swing.JLabel LabelOperando2;
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JLabel LabelResultadoInt;
    // End of variables declaration//GEN-END:variables
}