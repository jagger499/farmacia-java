package desarrollolabii;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    
    private String RequiredField = "Este campo es requerido";
    private String InvalidType = "Este campo debe ser numerico";
    
    private void resetValidations() {
        lblErrorNombre.setText(" ");
        lblErrorTipo.setText(" ");
        lblErrorCantidad.setText(" ");
        lblErrorDistribuidor.setText(" ");
        lblErrorSucursal.setText(" ");
    }
    
    private void resetValues() {
        txtNombre.setText("");
        rdoDistribuidor.clearSelection();
        cobTipo.setSelectedItem(null);
        txtCantidad.setText("");
        chkPrincipal.setSelected(false);
        chkSecundaria.setSelected(false);
    }
  
    private boolean isStringValidInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
 
    private Boolean validateForm() {
        resetValidations();
        boolean isValid = true;
        
        // Voy a describir las validaciones (estas van a dar un error):
        // que exista un distribuidor seleccionado
        if (rdoDistribuidor.getSelection() == null) {
            lblErrorDistribuidor.setText(RequiredField);
            isValid = false;
        }
  
        // que el nombre este vacio
        if (txtNombre.getText().equals("")) {
            lblErrorNombre.setText(RequiredField);
            isValid = false;
        }
        
        // que el tipo de medicamento no este seleccionado
        if (cobTipo.getSelectedItem() == null) {
             lblErrorTipo.setText(RequiredField);
             isValid = false;
        }
        
        // que la cantidad no sea un numero valido
        if (!isStringValidInt(txtCantidad.getText())) {
            lblErrorCantidad.setText(InvalidType);
            isValid = false;
        }
        
        // que si es un numero valido sea <= 0
        if (isStringValidInt(txtCantidad.getText())) {
            int parsedCantidad = Integer.parseInt(txtCantidad.getText());
            if (parsedCantidad <= 0) {
                lblErrorCantidad.setText("El numero debe ser mayor que 0");
                isValid = false;
            }
        }
        
        // que la cantidad este vacia
        if (txtCantidad.getText().equals("")) {
            lblErrorCantidad.setText(RequiredField);
            isValid = false;
        }
        
        // que ninguno de los checksbox fuera seleccionado
        if (!chkPrincipal.isSelected() && !chkSecundaria.isSelected()) {
            lblErrorSucursal.setText(RequiredField);
            isValid = false;
        }
        
        return isValid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rdoDistribuidor = new javax.swing.ButtonGroup();
        lblNombre1 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblDistribuidor = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cobTipo = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        Cofarma = new javax.swing.JRadioButton();
        Empsephar = new javax.swing.JRadioButton();
        Cemefar = new javax.swing.JRadioButton();
        chkPrincipal = new javax.swing.JCheckBox();
        chkSecundaria = new javax.swing.JCheckBox();
        btnBorrar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblErrorNombre = new javax.swing.JLabel();
        lblErrorTipo = new javax.swing.JLabel();
        lblErrorCantidad = new javax.swing.JLabel();
        lblErrorDistribuidor = new javax.swing.JLabel();
        lblErrorSucursal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre1.setText("Nombre del medicamento:");

        lblTipo.setText("Tipo del medicamento:");

        lblCantidad.setText("Cantidad del medicamento:");

        lblDistribuidor.setText("Nombre del distribuidor:");

        lblSucursal.setText("Sucursal de la farmacia");

        cobTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "analgésico", "analéptico", "anestésico", "antiácido", "antidepresivo", "antibióticos" }));
        cobTipo.setSelectedIndex(-1);
        cobTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobTipoActionPerformed(evt);
            }
        });

        rdoDistribuidor.add(Cofarma);
        Cofarma.setText("Cofarma");
        Cofarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CofarmaActionPerformed(evt);
            }
        });

        rdoDistribuidor.add(Empsephar);
        Empsephar.setText("Empsephar");

        rdoDistribuidor.add(Cemefar);
        Cemefar.setText("Cemefar");

        chkPrincipal.setText("Principal");
        chkPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPrincipalActionPerformed(evt);
            }
        });

        chkSecundaria.setText("Secundaria");

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        lblErrorNombre.setForeground(new java.awt.Color(255, 102, 102));
        lblErrorNombre.setText(" ");

        lblErrorTipo.setForeground(new java.awt.Color(255, 102, 102));
        lblErrorTipo.setText(" ");

        lblErrorCantidad.setForeground(new java.awt.Color(255, 102, 102));
        lblErrorCantidad.setText(" ");

        lblErrorDistribuidor.setForeground(new java.awt.Color(255, 102, 102));
        lblErrorDistribuidor.setText(" ");

        lblErrorSucursal.setForeground(new java.awt.Color(255, 102, 102));
        lblErrorSucursal.setText(" ");

        jLabel2.setText("FARMACIA UNIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18)
                .addComponent(btnContinuar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblErrorSucursal)
                    .addComponent(lblErrorDistribuidor)
                    .addComponent(lblErrorCantidad)
                    .addComponent(lblErrorTipo)
                    .addComponent(lblErrorNombre)
                    .addComponent(lblNombre1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cobTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDistribuidor)
                    .addComponent(Cofarma)
                    .addComponent(Empsephar)
                    .addComponent(Cemefar)
                    .addComponent(lblSucursal)
                    .addComponent(chkPrincipal)
                    .addComponent(chkSecundaria)
                    .addComponent(lblTipo))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombre1)
                .addGap(2, 2, 2)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipo)
                .addGap(3, 3, 3)
                .addComponent(cobTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantidad)
                .addGap(3, 3, 3)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDistribuidor)
                .addGap(3, 3, 3)
                .addComponent(Cofarma)
                .addGap(9, 9, 9)
                .addComponent(Empsephar)
                .addGap(9, 9, 9)
                .addComponent(Cemefar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorDistribuidor)
                .addGap(15, 15, 15)
                .addComponent(lblSucursal)
                .addGap(3, 3, 3)
                .addComponent(chkPrincipal)
                .addGap(9, 9, 9)
                .addComponent(chkSecundaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorSucursal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuar)
                    .addComponent(btnBorrar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cobTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cobTipoActionPerformed

    private void chkPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPrincipalActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        resetValidations();
        resetValues();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        if (validateForm()) {
            String distribuidor = Cofarma.isSelected()
                    ? "Cofarma" : Empsephar.isSelected()
                    ? "Empsephar" : Cemefar.isSelected()
                    ? "Cemefar" : "";
            Medicamento medicamento = new Medicamento();
            medicamento.setNombre(txtNombre.getText());
            medicamento.setCantidad(Integer.parseInt(txtCantidad.getText()));
            medicamento.setChkPrincipal(chkPrincipal.isSelected());
            medicamento.setChkSecundario(chkSecundaria.isSelected());
            medicamento.setDistribuidor(distribuidor);
            medicamento.setTipo("" + cobTipo.getSelectedItem());
            Ventana ventana = new Ventana();
            ventana.setTitle(medicamento.getTitle());
            ventana.lblSubtitle.setText(medicamento.getSubtitle());
            ventana.lblAddress.setText(medicamento.getAddress());
            resetValues();
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void CofarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CofarmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CofarmaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Cemefar;
    private javax.swing.JRadioButton Cofarma;
    private javax.swing.JRadioButton Empsephar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JCheckBox chkPrincipal;
    private javax.swing.JCheckBox chkSecundaria;
    private javax.swing.JComboBox<String> cobTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDistribuidor;
    private javax.swing.JLabel lblErrorCantidad;
    private javax.swing.JLabel lblErrorDistribuidor;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblErrorSucursal;
    private javax.swing.JLabel lblErrorTipo;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTipo;
    private javax.swing.ButtonGroup rdoDistribuidor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
