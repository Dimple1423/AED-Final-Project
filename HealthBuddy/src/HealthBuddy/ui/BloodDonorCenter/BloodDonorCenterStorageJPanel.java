package HealthBuddy.ui.BloodDonorCenter;

import HealthBuddy.models.BloodDonorCenter.Inventory.BloodDonorCenterInventory;
import HealthBuddy.models.BloodDonorCenter.Inventory.BloodDonorCenterInventory.BloodGroup;
import HealthBuddy.models.BloodDonorCenter.Inventory.BloodDonorCenterInventoryCatalog;
import HealthBuddy.models.BloodDonorCenter.Organisation.BDCControllerOrganisation;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.EnterpriseBloodDonorCenter;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.User.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Virendra Rathore
 */
public class BloodDonorCenterStorageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodDonorCenterStorageJPanel
     */
     
    private JPanel showPanel;
    private User userAccount;
    private BDCControllerOrganisation headOrganisation;
    private EcoSystem ecosystem;
    private Network network;
    private EnterpriseBloodDonorCenter bloodBankEnterprise;
    private BloodDonorCenterInventoryCatalog bbsd;
   
    public BloodDonorCenterStorageJPanel(JPanel showPanel, User userAccount, BDCControllerOrganisation headOrganisation, EnterpriseBloodDonorCenter bloodBankEnterprise, Network network, EcoSystem ecosystem) 
    {
        initComponents();
        
        this.showPanel=showPanel;
        this.headOrganisation = headOrganisation;
        this.userAccount = userAccount;
        this.bloodBankEnterprise = bloodBankEnterprise;
        this.ecosystem = ecosystem;
        this.network=network;
        this.bbsd=headOrganisation.getBbStockDirectory();
        populatecomboBox();
    }

    private void populatecomboBox()
    {
        BloodTypeComboBox.removeAllItems();
        
        for(BloodGroup t:BloodGroup.values())
        {
            if(t.getVal().equals(BloodGroup.getBloodGroupONegative().getVal()) ||t.getVal().equals(BloodGroup.getBloodGroupOPositive().getVal()) ||t.getVal().equals(BloodGroup.getBloodGroupBPositive().getVal())||t.getVal().equals(BloodGroup.getBloodGroupBNegative().getVal()) ||t.getVal().equals(BloodGroup.getBloodGroupAPositive().getVal())||t.getVal().equals(BloodGroup.getBloodGroupANegative().getVal())||t.getVal().equals(BloodGroup.getBloodGroupABPositive().getVal())||t.getVal().equals(BloodGroup.getBloodGroupABNegative().getVal()))
            {
                BloodTypeComboBox.addItem(t);   
            }                  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        lblBloodType = new javax.swing.JLabel();
        BloodTypeComboBox = new javax.swing.JComboBox<>();
        lblBloodQuantity = new javax.swing.JLabel();
        txtUnitsOfBlood = new javax.swing.JTextField();
        btnAddBlood = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BloodInventoryjTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 153, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Blood Bank"));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 660));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 153));
        btnBack.setText("Back ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        lblTitle1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle1.setText("BLOOD BANK STOCK");

        lblBloodType.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBloodType.setForeground(new java.awt.Color(0, 51, 153));
        lblBloodType.setText("Blood Type");

        BloodTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodTypeComboBoxActionPerformed(evt);
            }
        });

        lblBloodQuantity.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblBloodQuantity.setForeground(new java.awt.Color(0, 51, 153));
        lblBloodQuantity.setText("Units of Blood");

        btnAddBlood.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAddBlood.setForeground(new java.awt.Color(0, 51, 153));
        btnAddBlood.setText("Add Blood");
        btnAddBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBloodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblTitle1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBloodType)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddBlood)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtUnitsOfBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BloodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 218, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBloodQuantity)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BloodTypeComboBox, btnAddBlood, txtUnitsOfBlood});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBloodQuantity, lblBloodType});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodType)
                    .addComponent(BloodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodQuantity)
                    .addComponent(txtUnitsOfBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnAddBlood)
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BloodTypeComboBox, btnAddBlood, txtUnitsOfBlood});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBloodQuantity, lblBloodType});

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 540, 220));

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        BloodInventoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Type", "Blood Quantity"
            }
        ));
        jScrollPane1.setViewportView(BloodInventoryjTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 540, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        showPanel.remove(this);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void BloodTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodTypeComboBoxActionPerformed
        BloodGroup typ = (BloodGroup) BloodTypeComboBox.getSelectedItem();
        if(typ != null)
        {
            populateTable(typ);
        }
    }//GEN-LAST:event_BloodTypeComboBoxActionPerformed

    private void btnAddBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBloodActionPerformed
        try
        {
            Integer quantity= (Integer.parseInt(txtUnitsOfBlood.getText()));                          
            BloodGroup typ = (BloodGroup) BloodTypeComboBox.getSelectedItem();
           
            BloodDonorCenterInventory bb=  bbsd.findBloodGroup(typ);
        
            if(bb.getBloodGroup() == null || bb.getBloodGroup() == "")
            {
                bb.setBloodGroup(typ.getVal());
            }
        
            int bloodquan = bb.getBloodVolume();
            bloodquan = bloodquan + quantity;
        
            bb.setBloodVolume(bloodquan);
        
            populateTable(typ);
            txtUnitsOfBlood.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Entered value", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddBloodActionPerformed
       
   private void populateTable(BloodGroup typ)
   {
        DefaultTableModel model = (DefaultTableModel)BloodInventoryjTable.getModel();
        
        model.setRowCount(0);
        
        for(BloodDonorCenterInventory b :bbsd.getStock())
        {
            if(b.getBloodGroup()!= null && b.getBloodGroup().equals(typ.getVal()))
            {
                Object[] row = new Object[2];
                row[0] = b.getBloodGroup();
                row[1]=b.getBloodVolume();
                model.addRow(row);
            }
        }
    }
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BloodInventoryjTable;
    private javax.swing.JComboBox<Object> BloodTypeComboBox;
    private javax.swing.JButton btnAddBlood;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodQuantity;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField txtUnitsOfBlood;
    // End of variables declaration//GEN-END:variables
}
