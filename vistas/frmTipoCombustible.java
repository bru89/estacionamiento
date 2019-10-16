/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Class.MaquinaCorriente;
import Class.MaquinaDiesel;
import Class.MaquinaSurtidora;
import java.awt.Color;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Spinner;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class frmTipoCombustible extends javax.swing.JFrame {

   // private int venta=0;
    private MaquinaSurtidora objMaquina; 
    private FrmPrincipal  objPrincipal;
    //private MaquinaCorriente objMaquinaCorrriente;
    /**
     * Creates new form frmTipoCombustible
     */
    public frmTipoCombustible(MaquinaSurtidora objMaquina, FrmPrincipal Principal) {
        
        initComponents();
        jPanel1.setBackground(new  Color(44, 184, 171 ));
        btnSurtir.setBackground(new  Color(44, 184, 171 ));
        btnReinicio.setBackground(new  Color(44, 184, 171 ));
        retorno.setBackground(new  Color(44, 184, 171 ));
        this.objMaquina = objMaquina;
        this.objPrincipal = Principal;
        
        
        //MaquinaDiesel objDiesel = new MaquinaDiesel(WIDTH, HEIGHT);
       
        //SpinnerNumberModel spinner = new SpinnerNumberModel(0, 0, 2000, 1);
        lblTipoCombustible.setText(objMaquina.getTipocombustible());
        lblPrecio.setText("Precio de Venta: " + objMaquina.getPrecioVenta());
        lblDisponibilidad.setText("Disponibilidad: "  + objMaquina.getDisponibilidadTanque() + " Litros");
        
      // / Condicional para el Spinner
        if(objMaquina.getTipocombustible().equals("DIESEL")){
             SpinnerNumberModel spinner = new SpinnerNumberModel(); 
                spinner.setMinimum(0);
                spinner.setMaximum(2000);
                spinner.setStepSize(1);          
                Litros.setModel(spinner);      
                Litros.getModel().toString();
                  
        }else if(objMaquina.getTipocombustible().equals("Corriente")){
             SpinnerNumberModel spinner2 = new SpinnerNumberModel(); 
                spinner2.setMinimum(0);
                spinner2.setMaximum(3000);
                spinner2.setStepSize(1);          
                Litros.setModel(spinner2);      
                Litros.getModel().toString();
        }else{
            SpinnerNumberModel spinner3 = new SpinnerNumberModel(); 
                spinner3.setMinimum(0);
                spinner3.setMaximum(4000);
                spinner3.setStepSize(1);          
                Litros.setModel(spinner3);      
                Litros.getModel().toString();
        } 
         
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
        retorno = new javax.swing.JButton();
        btnReinicio = new javax.swing.JButton();
        btnSurtir = new javax.swing.JButton();
        Litros = new javax.swing.JSpinner();
        jlabelSurtidos = new javax.swing.JLabel();
        totalito = new javax.swing.JLabel();
        lblTipoCombustible = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblDisponibilidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        retorno.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        retorno.setText("PRINCIPAL");
        retorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retornoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                retornoMouseExited(evt);
            }
        });
        retorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornoActionPerformed(evt);
            }
        });
        jPanel1.add(retorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 180, 50));

        btnReinicio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnReinicio.setText("REINICIAR");
        btnReinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReinicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReinicioMouseExited(evt);
            }
        });
        btnReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReinicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnReinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 180, 50));

        btnSurtir.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSurtir.setText("SURTIR");
        btnSurtir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSurtirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSurtirMouseExited(evt);
            }
        });
        btnSurtir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSurtirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSurtir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 423, 180, 50));

        Litros.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Litros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LitrosStateChanged(evt);
            }
        });
        jPanel1.add(Litros, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 210, 50));

        jlabelSurtidos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlabelSurtidos.setText("Litros a Surtir");
        jPanel1.add(jlabelSurtidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        totalito.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        totalito.setText("Total: $0");
        totalito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalitoKeyPressed(evt);
            }
        });
        jPanel1.add(totalito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        lblTipoCombustible.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblTipoCombustible.setForeground(new java.awt.Color(0, 153, 0));
        lblTipoCombustible.setText("TIPO DE COMBUSTIBLE");
        jPanel1.add(lblTipoCombustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblPrecio.setText("Precio de Venta: 0");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        lblDisponibilidad.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblDisponibilidad.setText("Disponibilidad: 3000 Litros");
        lblDisponibilidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblDisponibilidadPropertyChange(evt);
            }
        });
        jPanel1.add(lblDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1350, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSurtirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSurtirActionPerformed
        
       
            objMaquina.registrarVenta(Integer.parseInt(Litros.getValue().toString()));
            totalito.setText("Total $:" + String.valueOf(objMaquina.getMontoVendido()));
            lblDisponibilidad.setText("Disponibilidad:" + 
                    String.valueOf(objMaquina.getDisponibilidadTanque()) + "Litros"
            );
           
        if(objMaquina.getDisponibilidadTanque() < objMaquina.getCantidadVendida()){
                    JOptionPane.showInputDialog("Usted a sobrepasado la capacidad del tanque");
                       
            } 
       //  if(objMaquina.getDisponibilidadTanque()<objMaquina.getCantidadVendida()){
          //              lblDisponibilidad.setSize(0, objMaquina.getDisponibilidadTanque());
            //     } 
          //objMaquina.getMontoAcumulado();
        //  objMaquina.setCantidadVentas(venta);
           
         
      
    }//GEN-LAST:event_btnSurtirActionPerformed

    private void LitrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LitrosStateChanged
      
    }//GEN-LAST:event_LitrosStateChanged

    private void btnReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReinicioActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
       objMaquina.reiniciar();
       //lblDisponibilidad.setText("Disponibilidad: " + objMaquina.getDisponibilidadTanque());
       totalito.setText("Total $ " + String.valueOf(objMaquina.getPrecioVenta()));
       Litros.setValue(0);
       
       
    }//GEN-LAST:event_btnReinicioActionPerformed

    private void btnReinicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReinicioMouseEntered
      btnReinicio.setBackground(new Color(53, 215, 200  ));
    }//GEN-LAST:event_btnReinicioMouseEntered

    private void lblDisponibilidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblDisponibilidadPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lblDisponibilidadPropertyChange

    private void retornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornoActionPerformed
        // TODO add your handling code here:
//        FrmPrincipal retorno = new FrmPrincipal();
//        retorno.setVisible(true);
    //   this.setVisible(false);
        this.dispose();
        objPrincipal.MostrarDashboard();
        objPrincipal.setVisible(true);
        //.setVisible(false);
           
    }//GEN-LAST:event_retornoActionPerformed

    private void totalitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalitoKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_totalitoKeyPressed

    private void btnSurtirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSurtirMouseEntered
        // TODO add your handling code here:
        btnSurtir.setBackground(new Color(53, 215, 200  ));
    }//GEN-LAST:event_btnSurtirMouseEntered

    private void btnSurtirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSurtirMouseExited
        // TODO add your handling code here:
        btnSurtir.setBackground(new Color(44, 184, 171));
    }//GEN-LAST:event_btnSurtirMouseExited

    private void btnReinicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReinicioMouseExited
        // TODO add your handling code here:
        btnReinicio.setBackground(new Color(44, 184, 171));
    }//GEN-LAST:event_btnReinicioMouseExited

    private void retornoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retornoMouseEntered
        // TODO add your handling code here:
        retorno.setBackground(new Color(53, 215, 200  ));
    }//GEN-LAST:event_retornoMouseEntered

    private void retornoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retornoMouseExited
        // TODO add your handling code here:
        retorno.setBackground(new Color(44, 184, 171));
    }//GEN-LAST:event_retornoMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Litros;
    private javax.swing.JButton btnReinicio;
    private javax.swing.JButton btnSurtir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabelSurtidos;
    private javax.swing.JLabel lblDisponibilidad;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipoCombustible;
    private javax.swing.JButton retorno;
    private javax.swing.JLabel totalito;
    // End of variables declaration//GEN-END:variables

    

    
}