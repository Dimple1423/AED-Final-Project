package HealthBuddy.ui.SysAdminWorkArea;

import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import HealthBuddy.models.Network.Network;
import javax.swing.JPanel;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.Enterprise;


/**
 *
 * @author Nidhi Singh
 */
public class EnterprisesManageJPanel extends javax.swing.JPanel {
JPanel showPanel;
EcoSystem ecosystem;
    /**
     * Creates new form ManageEnterprisesJPanel
     */
    public EnterprisesManageJPanel(JPanel showPanel, EcoSystem ecosystem) {
        initComponents();
        this.showPanel=showPanel;
        this.ecosystem= ecosystem;
        setSize(1540,800);
        populateEnterpriseTable();
        populateComboBox();
    }

    private void populateEnterpriseTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterpriseDetails.getModel();
        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseCatalog().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getNetworkName();
                row[2] = enterprise.getEnterpriseClassification().getVal();
                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();
        for (int i = 0; i < ecosystem.getNetworkList().size(); i++) {
            Network network =ecosystem.getNetworkList().get(i);
            networkJComboBox.addItem(network);
        }
        for (Enterprise.EnterpriseClassification type : Enterprise.EnterpriseClassification.values()) {
            enterpriseTypeJComboBox.addItem(type);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterpriseDetails = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        lblEnterprise = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        txtcause = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Enterprise"));
        setForeground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEnterpriseDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblEnterpriseDetails.setForeground(new java.awt.Color(0, 153, 153));
        tblEnterpriseDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EnterPrise's Name", "Network", "Type"
            }
        ));
        jScrollPane1.setViewportView(tblEnterpriseDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 440, 180));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblTitle.setText("Manage Enterprise");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 250, 40));

        lblNetwork.setBackground(new java.awt.Color(255, 255, 255));
        lblNetwork.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(0, 102, 102));
        lblNetwork.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNetwork.setText("Network:");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 150, -1));

        networkJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(0, 102, 102));
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 170, 30));

        lblEnterprise.setBackground(new java.awt.Color(255, 255, 255));
        lblEnterprise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(0, 102, 102));
        lblEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEnterprise.setText("Enterprise Type:");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 190, -1));

        enterpriseTypeJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterpriseTypeJComboBox.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 170, 30));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 102, 102));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 170, 30));

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 102));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 150, -1));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 40, 110, 30));

        btnSubmit.setBackground(new java.awt.Color(0, 102, 102));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.setBorderPainted(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 130, 40));

        txtcause.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcause.setForeground(new java.awt.Color(0, 102, 102));
        add(txtcause, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 170, 30));

        lblName1.setBackground(new java.awt.Color(255, 255, 255));
        lblName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 102, 102));
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName1.setText("Cause:");
        add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 150, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, -1));

        ImageIcon imageIcon =  new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/enterprise.gif")).getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        jLabel2.setIcon(imageIcon);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 810, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseClassification type = (Enterprise.EnterpriseClassification) enterpriseTypeJComboBox.getSelectedItem();
        if (network == null || type == null) 
        {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        String name = txtName.getText();
        if(name.isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null, "Please add a Name ","Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {    
            Enterprise enterprise = network.getEnterpriseCatalog().createAndAddEnterprise(name, type, txtcause.getText().trim());
            populateEnterpriseTable();
            txtName.setText("");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         showPanel.remove(this);
        Component[] componentArray = showPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminWorkAreaJPanel sysAdminwjp = (SysAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel); 
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTable tblEnterpriseDetails;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtcause;
    // End of variables declaration//GEN-END:variables
}
