package IGU;
import BusinessLayer.BLInsertNode;
import EntityLayer.BinaryTree;
import EntityLayer.Medicine;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
public class MainScreen extends javax.swing.JFrame {
BLInsertNode bLInsertNode = new BLInsertNode();

    public MainScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelButtons = new javax.swing.JPanel();
        btnViewTree = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAddMedicine = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelStages = new javax.swing.JPanel();
        jPanelAddMedicine = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelViewtree = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelButtons.setMinimumSize(new java.awt.Dimension(300, 100));

        btnViewTree.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnViewTree.setText("View Tree");
        btnViewTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTreeActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAddMedicine.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnAddMedicine.setText("Add medicine");
        btnAddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicineActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton4.setText("Exit");

        jButton5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jButton5.setText("Exit");

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewTree, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)))
            .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                    .addContainerGap(72, Short.MAX_VALUE)
                    .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnViewTree, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                    .addContainerGap(618, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(100, 100, 100)))
            .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelButtonsLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(603, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelButtons, java.awt.BorderLayout.LINE_START);

        jPanelStages.setLayout(new java.awt.CardLayout());

        jPanelAddMedicine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel1.setText("Amount");
        jPanelAddMedicine.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 160, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel2.setText("ID");
        jPanelAddMedicine.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 160, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel3.setText("Medicine Name");
        jPanelAddMedicine.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel4.setText("Price");
        jPanelAddMedicine.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 160, 50));

        txtAmount.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelAddMedicine.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 170, 50));

        txtID.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelAddMedicine.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 80, 50));

        txtName.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelAddMedicine.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 440, 50));

        txtPrice.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelAddMedicine.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 170, 50));

        btnSave.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanelAddMedicine.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 670, 194, 62));

        jPanelStages.add(jPanelAddMedicine, "card2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        jPanelStages.add(jPanel2, "card3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        jPanelStages.add(jPanel3, "card4");

        javax.swing.GroupLayout jPanelViewtreeLayout = new javax.swing.GroupLayout(jPanelViewtree);
        jPanelViewtree.setLayout(jPanelViewtreeLayout);
        jPanelViewtreeLayout.setHorizontalGroup(
            jPanelViewtreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanelViewtreeLayout.setVerticalGroup(
            jPanelViewtreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        jPanelStages.add(jPanelViewtree, "card5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        jPanelStages.add(jPanel4, "card6");

        getContentPane().add(jPanelStages, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnViewTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTreeActionPerformed
    jPanelAddMedicine.setVisible(false);
    jPanelViewtree.setVisible(true);
    jPanelViewtree.removeAll();

    jPanelViewtree.setLayout(new java.awt.BorderLayout());

    BinaryTree sharedTree = BLInsertNode.getSharedBinaryTree();
    ViewData view = new ViewData(sharedTree);
    jPanelViewtree.add(view, BorderLayout.CENTER);

    jPanelViewtree.revalidate();
    jPanelViewtree.repaint();
    }//GEN-LAST:event_btnViewTreeActionPerformed

    private void btnAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicineActionPerformed
        jPanelViewtree.setVisible(false);
        jPanelAddMedicine.setVisible(true);
    }//GEN-LAST:event_btnAddMedicineActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Medicine medicine = new Medicine();
        medicine.setName(txtName.getText().trim());
        
        if(validation(medicine)) {
            bLInsertNode.insert(medicine);
        }
    }//GEN-LAST:event_btnSaveActionPerformed


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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedicine;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnViewTree;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelAddMedicine;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelStages;
    private javax.swing.JPanel jPanelViewtree;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    
    private boolean validation(Medicine medicine) {
        
        try{
            int ID = Integer.parseInt(txtID.getText());
            double price = Double.parseDouble(txtPrice.getText());
            int amount = Integer.parseInt(txtAmount.getText());
            
            medicine.setID(ID);
            medicine.setPrice(price);
            medicine.setAmount(amount);
        }catch (NumberFormatException  e) {
            JOptionPane.showMessageDialog(null, "Please make sure to enter valid datess.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
}
