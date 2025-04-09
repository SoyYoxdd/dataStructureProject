package IGU;

import BusinessLayer.*;
import EntityLayer.BinaryTree;
import EntityLayer.Medicine;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainScreen extends javax.swing.JFrame {

    BLInsertNode bLInsertNode = new BLInsertNode();

    BinaryTree sharedTree = BLInsertNode.getSharedBinaryTree();
    BLDeleteNode bLDeleteNode = new BLDeleteNode(sharedTree);
    BLSearchNode bLSearchNode = new BLSearchNode(sharedTree);
    BLTour bLTour = new BLTour(sharedTree);

    public MainScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelButtons = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnAddMedicine = new javax.swing.JButton();
        btnDeleteNode = new javax.swing.JButton();
        btnSearchNode = new javax.swing.JButton();
        btnViewTree = new javax.swing.JButton();
        btnViewTravel = new javax.swing.JButton();
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
        jPanelViewTreeAdd = new javax.swing.JPanel();
        jPanelDeleteNode = new javax.swing.JPanel();
        txtIDToDelete = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jPanelToDeleteNode = new javax.swing.JPanel();
        jPanelSearch = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtIDToSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSearch = new javax.swing.JTextArea();
        btnSearch = new javax.swing.JButton();
        jPanelViewtree = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelNodeTour = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaTour = new javax.swing.JTextArea();
        btnLeaves = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnPost = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnNodes = new javax.swing.JButton();
        btnValue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelButtons.setMinimumSize(new java.awt.Dimension(300, 100));

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

        btnDeleteNode.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnDeleteNode.setText("Delete node");
        btnDeleteNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNodeActionPerformed(evt);
            }
        });

        btnSearchNode.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnSearchNode.setText("Search node");
        btnSearchNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNodeActionPerformed(evt);
            }
        });

        btnViewTree.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnViewTree.setText("View Tree");
        btnViewTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTreeActionPerformed(evt);
            }
        });

        btnViewTravel.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnViewTravel.setText("Nodes tour");
        btnViewTravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTravelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewTree, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchNode, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteNode, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnDeleteNode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnSearchNode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnViewTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnViewTree, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelButtons, java.awt.BorderLayout.LINE_START);

        jPanelStages.setLayout(new java.awt.CardLayout());

        jPanelAddMedicine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel1.setText("Amount");
        jPanelAddMedicine.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 60, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel2.setText("ID");
        jPanelAddMedicine.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel3.setText("Medicine Name");
        jPanelAddMedicine.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel4.setText("Price");
        jPanelAddMedicine.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 50, 50));

        txtAmount.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelAddMedicine.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 170, 50));

        txtID.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelAddMedicine.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 80, 50));

        txtName.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanelAddMedicine.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 440, 50));

        txtPrice.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelAddMedicine.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 170, 50));

        btnSave.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanelAddMedicine.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 700, 194, 62));

        jPanelViewTreeAdd.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelViewTreeAddLayout = new javax.swing.GroupLayout(jPanelViewTreeAdd);
        jPanelViewTreeAdd.setLayout(jPanelViewTreeAddLayout);
        jPanelViewTreeAddLayout.setHorizontalGroup(
            jPanelViewTreeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanelViewTreeAddLayout.setVerticalGroup(
            jPanelViewTreeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanelAddMedicine.add(jPanelViewTreeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1000, 530));

        jPanelStages.add(jPanelAddMedicine, "card2");

        jPanelDeleteNode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIDToDelete.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtIDToDelete.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelDeleteNode.add(txtIDToDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 80, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel5.setText("Enter an ID to delete");
        jPanelDeleteNode.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 160, 50));

        btnDelete.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanelDeleteNode.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 700, 130, 60));

        jPanelToDeleteNode.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelToDeleteNodeLayout = new javax.swing.GroupLayout(jPanelToDeleteNode);
        jPanelToDeleteNode.setLayout(jPanelToDeleteNodeLayout);
        jPanelToDeleteNodeLayout.setHorizontalGroup(
            jPanelToDeleteNodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanelToDeleteNodeLayout.setVerticalGroup(
            jPanelToDeleteNodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanelDeleteNode.add(jPanelToDeleteNode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 980, 540));

        jPanelStages.add(jPanelDeleteNode, "card3");

        jPanelSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel6.setText("Enter an ID to search");
        jPanelSearch.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 160, 50));

        txtIDToSearch.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txtIDToSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelSearch.add(txtIDToSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 80, 50));

        jTextAreaSearch.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaSearch.setColumns(20);
        jTextAreaSearch.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jTextAreaSearch.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSearch);

        jPanelSearch.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 680, 350));

        btnSearch.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanelSearch.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 690, 190, 60));

        jPanelStages.add(jPanelSearch, "card4");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelViewtreeLayout = new javax.swing.GroupLayout(jPanelViewtree);
        jPanelViewtree.setLayout(jPanelViewtreeLayout);
        jPanelViewtreeLayout.setHorizontalGroup(
            jPanelViewtreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewtreeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelViewtreeLayout.setVerticalGroup(
            jPanelViewtreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewtreeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanelStages.add(jPanelViewtree, "card5");

        jPanelNodeTour.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaTour.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaTour.setColumns(20);
        jTextAreaTour.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jTextAreaTour.setRows(5);
        jScrollPane2.setViewportView(jTextAreaTour);

        jPanelNodeTour.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 870, 450));

        btnLeaves.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnLeaves.setText("Number of leaves");
        btnLeaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeavesActionPerformed(evt);
            }
        });
        jPanelNodeTour.add(btnLeaves, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 220, 60));

        btnPre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnPre.setText("Pre-order tour");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });
        jPanelNodeTour.add(btnPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 220, 60));

        btnPost.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnPost.setText("Post-order tour");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });
        jPanelNodeTour.add(btnPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 220, 60));

        btnIn.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnIn.setText("In-order tour");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });
        jPanelNodeTour.add(btnIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 220, 60));

        btnNodes.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnNodes.setText("Number of nodes");
        btnNodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNodesActionPerformed(evt);
            }
        });
        jPanelNodeTour.add(btnNodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 220, 60));

        btnValue.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnValue.setText("Medicine with the highest value");
        btnValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValueActionPerformed(evt);
            }
        });
        jPanelNodeTour.add(btnValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 700, 310, 60));

        jPanelStages.add(jPanelNodeTour, "card6");

        getContentPane().add(jPanelStages, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnViewTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTreeActionPerformed
        if (empty()) {
            jPanelDeleteNode.setVisible(false);
            jPanelAddMedicine.setVisible(false);
            jPanelSearch.setVisible(false);
            jPanelViewtree.setVisible(true);

            showTree(jPanel1);
            jPanel1.setPreferredSize(new Dimension(1000, 750));
        }


    }//GEN-LAST:event_btnViewTreeActionPerformed

    private void btnAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicineActionPerformed
        jPanelViewtree.setVisible(false);
        jPanelNodeTour.setVisible(false);
        jPanelSearch.setVisible(false);
        jPanelNodeTour.setVisible(false);
        jPanelDeleteNode.setVisible(false);
        jPanelAddMedicine.setVisible(true);
        //View in JPanel Add
        showTree(jPanelViewTreeAdd);
    }//GEN-LAST:event_btnAddMedicineActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Medicine medicine = new Medicine();
        medicine.setName(txtName.getText().trim());

        if (validation(medicine)) {
            bLInsertNode.insert(medicine);
            //View in JPanel Add
            showTree(jPanelViewTreeAdd);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNodeActionPerformed
        if (empty()) {
            jPanelViewtree.setVisible(false);
            jPanelAddMedicine.setVisible(false);
            jPanelSearch.setVisible(false);
            jPanelDeleteNode.setVisible(true);
            //View in JPanel delete
            showTree(jPanelToDeleteNode);
        }
    }//GEN-LAST:event_btnDeleteNodeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int id = Integer.parseInt(txtIDToDelete.getText());
            bLDeleteNode.delete(id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please make sure to enter valid dates.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }

        //View in JPanel delete
        showTree(jPanelToDeleteNode);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSearchNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNodeActionPerformed
        if (empty()) {
            jPanelViewtree.setVisible(false);
            jPanelDeleteNode.setVisible(false);
            jPanelNodeTour.setVisible(false);
            jPanelAddMedicine.setVisible(false);
            jPanelSearch.setVisible(true);
        }
    }//GEN-LAST:event_btnSearchNodeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if (empty()) {
            try {
                int id = Integer.parseInt(txtIDToSearch.getText());
                Medicine medicine = bLSearchNode.searchNode(id);
                if (medicine != null) {
                    jTextAreaSearch.setText(medicine.toString());
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please make sure to enter valid dates.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTravelActionPerformed
        if (empty()) {
            jPanelViewtree.setVisible(false);
            jPanelDeleteNode.setVisible(false);
            jPanelAddMedicine.setVisible(false);
            jPanelSearch.setVisible(false);
            jPanelNodeTour.setVisible(true);
        }
    }//GEN-LAST:event_btnViewTravelActionPerformed

    private void btnLeavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeavesActionPerformed
        int leaves = bLTour.numberOfLeaves();
        jTextAreaTour.setText("Currently there are " + leaves + " leaves");
    }//GEN-LAST:event_btnLeavesActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        String preOrden = bLTour.preOrden();
        if (preOrden != null) {
            jTextAreaTour.setText(preOrden);
        }
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        String postOrden = bLTour.postOrden();
        if (postOrden != null) {
            jTextAreaTour.setText(postOrden);
        }
    }//GEN-LAST:event_btnPostActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        String inOrden = bLTour.inOrden();
        if (inOrden != null) {
            jTextAreaTour.setText(inOrden);
        }
    }//GEN-LAST:event_btnInActionPerformed

    private void btnNodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNodesActionPerformed
        int nodes = bLTour.numberOfNodes();
        jTextAreaTour.setText("Currently there are " + nodes + " nodes");
    }//GEN-LAST:event_btnNodesActionPerformed

    private void btnValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValueActionPerformed
        Medicine highest = bLTour.highestValue();
        jTextAreaTour.setText("Currently highest value is with  " + highest.toString() + "\nTotal: " + highest.getPrice() * highest.getAmount());
    }//GEN-LAST:event_btnValueActionPerformed

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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteNode;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnLeaves;
    private javax.swing.JButton btnNodes;
    private javax.swing.JButton btnPost;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchNode;
    private javax.swing.JButton btnValue;
    private javax.swing.JButton btnViewTravel;
    private javax.swing.JButton btnViewTree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAddMedicine;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelDeleteNode;
    private javax.swing.JPanel jPanelNodeTour;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JPanel jPanelStages;
    private javax.swing.JPanel jPanelToDeleteNode;
    private javax.swing.JPanel jPanelViewTreeAdd;
    private javax.swing.JPanel jPanelViewtree;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaSearch;
    private javax.swing.JTextArea jTextAreaTour;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDToDelete;
    private javax.swing.JTextField txtIDToSearch;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private boolean validation(Medicine medicine) {
        try {
            int ID = Integer.parseInt(txtID.getText());
            double price = Double.parseDouble(txtPrice.getText());
            int amount = Integer.parseInt(txtAmount.getText());

            medicine.setID(ID);
            medicine.setPrice(price);
            medicine.setAmount(amount);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please make sure to enter valid datess.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void showTree(JPanel panel) {
        panel.setVisible(true);
        panel.removeAll();
        panel.setLayout(new java.awt.BorderLayout());
        ViewData view = new ViewData(sharedTree);
        view.setOpaque(false);
        panel.add(view, BorderLayout.CENTER);

        panel.revalidate();
        panel.repaint();
    }

    private boolean empty() {
        if (sharedTree.getRoot() == null) {
            JOptionPane.showMessageDialog(null, "The tree is empty. Please enter data first", "Input Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
