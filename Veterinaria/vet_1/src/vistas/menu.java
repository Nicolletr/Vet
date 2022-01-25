package vistas;
public class menu extends javax.swing.JFrame {
    public menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_crud1 = new javax.swing.JPanel();
        txtproveedor1 = new javax.swing.JButton();
        txtcliente1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        crud_Cliente1 = new sql.Crud_Cliente();
        jLabel1 = new javax.swing.JLabel();
        p_crud = new javax.swing.JPanel();
        txtproveedor = new javax.swing.JButton();
        txtcliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        p_crud2 = new javax.swing.JPanel();
        VENTA = new javax.swing.JButton();
        Compra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        p_crud1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), java.awt.Color.white));

        txtproveedor1.setText("PROVEEDOR");
        txtproveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproveedor1ActionPerformed(evt);
            }
        });

        txtcliente1.setText("CLIENTE");
        txtcliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcliente1ActionPerformed(evt);
            }
        });

        jLabel3.setText("CRUD");

        javax.swing.GroupLayout p_crud1Layout = new javax.swing.GroupLayout(p_crud1);
        p_crud1.setLayout(p_crud1Layout);
        p_crud1Layout.setHorizontalGroup(
            p_crud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_crud1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(txtproveedor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(txtcliente1)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_crud1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(195, 195, 195))
        );
        p_crud1Layout.setVerticalGroup(
            p_crud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_crud1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(p_crud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproveedor1)
                    .addComponent(txtcliente1))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("VETERINARIA \"AMAIA MOREIRA\"");

        p_crud.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), java.awt.Color.white));

        txtproveedor.setText("PROVEEDOR");
        txtproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproveedorActionPerformed(evt);
            }
        });

        txtcliente.setText("CLIENTE");
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        jLabel2.setText("CRUD");

        javax.swing.GroupLayout p_crudLayout = new javax.swing.GroupLayout(p_crud);
        p_crud.setLayout(p_crudLayout);
        p_crudLayout.setHorizontalGroup(
            p_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_crudLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(txtproveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(txtcliente)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_crudLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(194, 194, 194))
        );
        p_crudLayout.setVerticalGroup(
            p_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_crudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(p_crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproveedor)
                    .addComponent(txtcliente))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        p_crud2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), java.awt.Color.white));

        VENTA.setText("VENTA");
        VENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VENTAActionPerformed(evt);
            }
        });

        Compra.setText("COMPRA");
        Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraActionPerformed(evt);
            }
        });

        jLabel4.setText("TRANSACCIONES");

        javax.swing.GroupLayout p_crud2Layout = new javax.swing.GroupLayout(p_crud2);
        p_crud2.setLayout(p_crud2Layout);
        p_crud2Layout.setHorizontalGroup(
            p_crud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_crud2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(VENTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Compra)
                .addGap(77, 77, 77))
            .addGroup(p_crud2Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_crud2Layout.setVerticalGroup(
            p_crud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_crud2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(p_crud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VENTA)
                    .addComponent(Compra))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_crud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_crud2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(p_crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p_crud2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproveedorActionPerformed
        // TODO add your handling code here:
        Proveedor pro=new Proveedor();
        pro.setVisible(true);
        pro.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_txtproveedorActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
        Cliente abrir=new Cliente();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtproveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproveedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproveedor1ActionPerformed

    private void txtcliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcliente1ActionPerformed

    private void VENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VENTAActionPerformed
        // TODO add your handling code here:
        Detalle_Venta abrir=new Detalle_Venta();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VENTAActionPerformed

    private void CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraActionPerformed
        // TODO add your handling code here:
        Detalle_Compra abrir=new Detalle_Compra();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_CompraActionPerformed
 
/**/

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compra;
    private javax.swing.JButton VENTA;
    private sql.Crud_Cliente crud_Cliente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel p_crud;
    private javax.swing.JPanel p_crud1;
    private javax.swing.JPanel p_crud2;
    private javax.swing.JButton txtcliente;
    private javax.swing.JButton txtcliente1;
    private javax.swing.JButton txtproveedor;
    private javax.swing.JButton txtproveedor1;
    // End of variables declaration//GEN-END:variables
}
