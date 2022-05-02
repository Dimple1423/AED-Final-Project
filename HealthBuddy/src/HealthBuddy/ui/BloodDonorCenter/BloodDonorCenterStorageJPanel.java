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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dimple Patel
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
        setSize(1540,800);
        populatecomboBox();
    }

    private void populatecomboBox()
    {
        BloodTypeComboBox9.removeAllItems();
        
        for(BloodGroup t:BloodGroup.values())
        {
            if(t.getVal().equals(BloodGroup.getBloodGroupONegative().getVal()) ||t.getVal().equals(BloodGroup.getBloodGroupOPositive().getVal()) ||t.getVal().equals(BloodGroup.getBloodGroupBPositive().getVal())||t.getVal().equals(BloodGroup.getBloodGroupBNegative().getVal()) ||t.getVal().equals(BloodGroup.getBloodGroupAPositive().getVal())||t.getVal().equals(BloodGroup.getBloodGroupANegative().getVal())||t.getVal().equals(BloodGroup.getBloodGroupABPositive().getVal())||t.getVal().equals(BloodGroup.getBloodGroupABNegative().getVal()))
            {
                BloodTypeComboBox9.addItem(t);   
            }                  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lblBloodType9 = new javax.swing.JLabel();
        BloodTypeComboBox9 = new javax.swing.JComboBox<>();
        lblBloodQuant9 = new javax.swing.JLabel();
        unitsOfBlood9TextF = new javax.swing.JTextField();
        buttonAddBlood9 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        BloodInvntryjTable9 = new javax.swing.JTable();
        lblTitle9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Blood Bank"));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 660));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack9.setBackground(new java.awt.Color(0, 102, 102));
        btnBack9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBack9.setForeground(new java.awt.Color(255, 255, 255));
        btnBack9.setText("Back ");
        btnBack9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack9.setBorderPainted(false);
        btnBack9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack9ActionPerformed(evt);
            }
        });
        add(btnBack9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 30, 90, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        jPanel9.setForeground(new java.awt.Color(0, 102, 102));

        lblBloodType9.setBackground(new java.awt.Color(255, 255, 255));
        lblBloodType9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBloodType9.setForeground(new java.awt.Color(0, 102, 102));
        lblBloodType9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBloodType9.setText("Blood Type:");

        BloodTypeComboBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BloodTypeComboBox9.setForeground(new java.awt.Color(0, 102, 102));
        BloodTypeComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodTypeComboBox9ActionPerformed(evt);
            }
        });

        lblBloodQuant9.setBackground(new java.awt.Color(255, 255, 255));
        lblBloodQuant9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBloodQuant9.setForeground(new java.awt.Color(0, 102, 102));
        lblBloodQuant9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBloodQuant9.setText("Units of Blood:");

        unitsOfBlood9TextF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unitsOfBlood9TextF.setForeground(new java.awt.Color(0, 102, 102));
        unitsOfBlood9TextF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsOfBlood9TextFActionPerformed(evt);
            }
        });

        buttonAddBlood9.setBackground(new java.awt.Color(0, 102, 102));
        buttonAddBlood9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonAddBlood9.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddBlood9.setText("Add Blood");
        buttonAddBlood9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAddBlood9.setBorderPainted(false);
        buttonAddBlood9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddBlood9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBloodType9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBloodQuant9, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BloodTypeComboBox9, 0, 160, Short.MAX_VALUE)
                    .addComponent(unitsOfBlood9TextF))
                .addGap(0, 204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAddBlood9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodType9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodTypeComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodQuant9)
                    .addComponent(unitsOfBlood9TextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAddBlood9)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BloodTypeComboBox9, buttonAddBlood9, unitsOfBlood9TextF});

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBloodQuant9, lblBloodType9});

        add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 540, 220));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        BloodInvntryjTable9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BloodInvntryjTable9.setForeground(new java.awt.Color(0, 102, 102));
        BloodInvntryjTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Type", "Blood Quantity"
            }
        ));
        BloodInvntryjTable9.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jScrollPane19.setViewportView(BloodInvntryjTable9);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 540, -1));

        lblTitle9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle9.setForeground(new java.awt.Color(0, 102, 102));
        lblTitle9.setText("Blood Donor Center Inventory");
        add(lblTitle9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 380, 34));

        ImageIcon imageIcon =  new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/bloodinventory.jpg")).getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT));

        jLabel1.setIcon(imageIcon);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 890, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack9ActionPerformed
        showPanel.remove(this);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
        
    }//GEN-LAST:event_btnBack9ActionPerformed

    private void BloodTypeComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodTypeComboBox9ActionPerformed
        BloodGroup typ = (BloodGroup) BloodTypeComboBox9.getSelectedItem();
        if(typ != null)
        {
            populateTable(typ);
        }
    }//GEN-LAST:event_BloodTypeComboBox9ActionPerformed

    private void buttonAddBlood9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddBlood9ActionPerformed
        try
        {
            Integer quantity= (Integer.parseInt(unitsOfBlood9TextF.getText()));                          
            BloodGroup typ = (BloodGroup) BloodTypeComboBox9.getSelectedItem();
           
            BloodDonorCenterInventory bb=  bbsd.findBloodGroup(typ);
        
            if(bb.getBloodGroup() == null || bb.getBloodGroup() == "")
            {
                bb.setBloodGroup(typ.getVal());
            }
        
            int bloodquan = bb.getBloodVolume();
            bloodquan = bloodquan + quantity;
        
            bb.setBloodVolume(bloodquan);
        
            populateTable(typ);
            unitsOfBlood9TextF.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Input entered is wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAddBlood9ActionPerformed

    private void unitsOfBlood9TextFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsOfBlood9TextFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitsOfBlood9TextFActionPerformed
       
   private void populateTable(BloodGroup typ)
   {
        DefaultTableModel model = (DefaultTableModel)BloodInvntryjTable9.getModel();
        
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
    private javax.swing.JTable BloodInvntryjTable9;
    private javax.swing.JComboBox<Object> BloodTypeComboBox9;
    private javax.swing.JButton btnBack9;
    private javax.swing.JButton buttonAddBlood9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JLabel lblBloodQuant9;
    private javax.swing.JLabel lblBloodType9;
    private javax.swing.JLabel lblTitle9;
    private javax.swing.JTextField unitsOfBlood9TextF;
    // End of variables declaration//GEN-END:variables
}
