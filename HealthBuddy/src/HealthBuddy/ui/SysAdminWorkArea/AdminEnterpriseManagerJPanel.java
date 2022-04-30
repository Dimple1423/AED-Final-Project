package HealthBuddy.ui.SysAdminWorkArea;

import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Employee.Employee;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Healthcare.Role.HealthcareAdmin;
import HealthBuddy.models.Trust.Role.TrustAdminRole;
import HealthBuddy.models.BloodDonorCenter.Role.BloodDonorCenterAdmin;
import HealthBuddy.models.User.User;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class AdminEnterpriseManagerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public AdminEnterpriseManagerJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateEnterpriseAdminTable();
        populateNetworkComboBox();
        setSize(1540,800);
    }

    private void populateEnterpriseAdminTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseCatalog().getEnterpriseList()) {
                for (User userAccount : enterprise.getUserCatalog().getUserCatalog()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetworkName();
                    row[2] = userAccount.getUsername();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        for (int i = 0; i < system.getNetworkList().size(); i++) {
            Network network=system.getNetworkList().get(i);
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        for (int i = 0; i < network.getEnterpriseCatalog().getEnterpriseList().size(); i++) {
            Enterprise enterprise=network.getEnterpriseCatalog().getEnterpriseList().get(i);
            enterpriseJComboBox.addItem(enterprise);
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
        tblEnterprise = new javax.swing.JTable();
        lblNetwork = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        lblUserName = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblEnterPrise = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        btnsubmit = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Enterprise Admin"));
        setForeground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Location", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 530, 130));

        lblNetwork.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(0, 102, 102));
        lblNetwork.setText("Network");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(0, 102, 102));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 136, -1));

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 102, 102));
        lblUserName.setText("Username");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 102, 102));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 136, -1));

        lblEnterPrise.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEnterPrise.setForeground(new java.awt.Color(0, 102, 102));
        lblEnterPrise.setText("Enterprise");
        add(lblEnterPrise, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        enterpriseJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 136, -1));

        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(0, 102, 102));
        btnsubmit.setText("Submit");
        btnsubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 100, 30));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 102, 102));
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 102, 102));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 136, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 102));
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 102, 102));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 134, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 30, 80, 30));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblTitle.setText("Add Enterprise Admin");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 470, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        } 
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String name = txtName.getText();
        Employee employee = enterprise.getEmployeeCatalog().addEmployee(name);
        if(enterprise.getEnterpriseClassification().equals(Enterprise.EnterpriseClassification.Healthcare)){
        User account = enterprise.getUserCatalog().newUserAccount(username, password, employee, new HealthcareAdmin());
        }
        if(enterprise.getEnterpriseClassification().equals(Enterprise.EnterpriseClassification.Trust)){
        User account = enterprise.getUserCatalog().newUserAccount(username, password, employee, new TrustAdminRole());
        }
        if(enterprise.getEnterpriseClassification().equals(Enterprise.EnterpriseClassification.BloodDonorCenter)){
        User account = enterprise.getUserCatalog().newUserAccount(username, password, employee, new BloodDonorCenterAdmin());
        }
        populateEnterpriseAdminTable();
        txtUsername.setText("");
        txtPassword.setText("");
        txtName.setText("");
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminWorkAreaJPanel sysAdminwjp = (SysAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterPrise;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
