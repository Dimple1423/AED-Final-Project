package HealthBuddy.ui.SysAdminWorkArea;

import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import HealthBuddy.models.EcoSystem;

/**
 *
 * @author Nidhi Singh
 */

public class SysAdminWorkAreaJPanel extends javax.swing.JPanel {
JPanel showPanel;
    EcoSystem ecosystem;
    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    public SysAdminWorkAreaJPanel(JPanel showPanel,EcoSystem ecosystem) {
        initComponents();
        this.ecosystem=ecosystem;
        this.showPanel=showPanel;
        setSize(1540,800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageLocation = new javax.swing.JButton();
        btnManagePatient = new javax.swing.JButton();
        btnManageDonor = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnTitle = new javax.swing.JLabel();
        btnManageEnterAdministrator = new javax.swing.JButton();
        btnApplicationAnalytics = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("System Administrator Work Area"));
        setForeground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageLocation.setBackground(new java.awt.Color(0, 102, 102));
        btnManageLocation.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnManageLocation.setForeground(new java.awt.Color(255, 255, 255));
        btnManageLocation.setText("Manage Location");
        btnManageLocation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageLocation.setBorderPainted(false);
        btnManageLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLocationActionPerformed(evt);
            }
        });
        add(btnManageLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 130, 360, 50));

        btnManagePatient.setBackground(new java.awt.Color(0, 102, 102));
        btnManagePatient.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnManagePatient.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePatient.setText("Manage Patient");
        btnManagePatient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManagePatient.setBorderPainted(false);
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });
        add(btnManagePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 310, 360, 50));

        btnManageDonor.setBackground(new java.awt.Color(0, 102, 102));
        btnManageDonor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnManageDonor.setForeground(new java.awt.Color(255, 255, 255));
        btnManageDonor.setText("Manage Donor");
        btnManageDonor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageDonor.setBorderPainted(false);
        btnManageDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDonorActionPerformed(evt);
            }
        });
        add(btnManageDonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 370, 360, 50));

        btnManageEnterprise.setBackground(new java.awt.Color(0, 102, 102));
        btnManageEnterprise.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterprise.setBorderPainted(false);
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        add(btnManageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 190, 360, 50));

        btnTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnTitle.setForeground(new java.awt.Color(0, 102, 102));
        btnTitle.setText("System Admin");
        add(btnTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 500, -1));

        btnManageEnterAdministrator.setBackground(new java.awt.Color(0, 102, 102));
        btnManageEnterAdministrator.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnManageEnterAdministrator.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterAdministrator.setText("Manage Enterprise admin");
        btnManageEnterAdministrator.setActionCommand("Manage Enterprise\nadmin");
        btnManageEnterAdministrator.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterAdministrator.setBorderPainted(false);
        btnManageEnterAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterAdministratorActionPerformed(evt);
            }
        });
        add(btnManageEnterAdministrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 250, 360, 50));

        btnApplicationAnalytics.setBackground(new java.awt.Color(0, 102, 102));
        btnApplicationAnalytics.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnApplicationAnalytics.setForeground(new java.awt.Color(255, 255, 255));
        btnApplicationAnalytics.setText("Application Analysis");
        btnApplicationAnalytics.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApplicationAnalytics.setBorderPainted(false);
        btnApplicationAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplicationAnalyticsActionPerformed(evt);
            }
        });
        add(btnApplicationAnalytics, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 430, 360, 50));

        ImageIcon imageIcon =  new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/admin.gif")).getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT));
        jLabel1.setIcon(imageIcon);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1100, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLocationActionPerformed
        // TODO add your handling code here:
        LocationManageJPanel manageLocationPanel=new  LocationManageJPanel(showPanel, ecosystem);
        showPanel.add("manageLocationPanel",manageLocationPanel);
        CardLayout layout=(CardLayout)showPanel.getLayout();
        layout.next(showPanel);
        
    }//GEN-LAST:event_btnManageLocationActionPerformed

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed
        // TODO add your handling code here:
        PatientManageJPanel managePatientPanel=new  PatientManageJPanel(showPanel, ecosystem);
        showPanel.add("managePatientPanel",managePatientPanel);
        CardLayout layout=(CardLayout)showPanel.getLayout();
        layout.next(showPanel);
    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void btnManageDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDonorActionPerformed
        // TODO add your handling code here:
        DonorManageJPanel manageDonorPanel=new  DonorManageJPanel(showPanel, ecosystem);
        showPanel.add("manageDonorPanel",manageDonorPanel);
        CardLayout layout=(CardLayout)showPanel.getLayout();
        layout.next(showPanel);
    }//GEN-LAST:event_btnManageDonorActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        // TODO add your handling code here:
        EnterprisesManageJPanel manageEnterprisePanel=new  EnterprisesManageJPanel(showPanel, ecosystem);
        showPanel.add("manageEnterprisePanel",manageEnterprisePanel);
        CardLayout layout=(CardLayout)showPanel.getLayout();
        layout.next(showPanel);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageEnterAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterAdministratorActionPerformed
        // TODO add your handling code here:
        AdminEnterpriseManagerJPanel manageEnterpriseAdmin = new AdminEnterpriseManagerJPanel(showPanel,ecosystem);
        showPanel.add("manageEnterprisePanel",manageEnterpriseAdmin);
        CardLayout layout=(CardLayout)showPanel.getLayout();
        layout.next(showPanel);
    }//GEN-LAST:event_btnManageEnterAdministratorActionPerformed

    private void btnApplicationAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicationAnalyticsActionPerformed
        SysAdminPerformanceJPanel systemAdminAnalytics = new SysAdminPerformanceJPanel(showPanel,ecosystem);
        showPanel.add("systemAdminAnalyticsJPanel",systemAdminAnalytics);
        CardLayout layout=(CardLayout)showPanel.getLayout();
        layout.next(showPanel);
    }//GEN-LAST:event_btnApplicationAnalyticsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplicationAnalytics;
    private javax.swing.JButton btnManageDonor;
    private javax.swing.JButton btnManageEnterAdministrator;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageLocation;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JLabel btnTitle;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
