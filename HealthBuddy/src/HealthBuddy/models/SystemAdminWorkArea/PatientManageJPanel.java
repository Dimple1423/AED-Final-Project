/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.models.SystemAdminWorkArea;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import medistopBackend.EcoSystem;
import medistopBackend.UserData.PatientData;

/**
 *
 * @author Virendra Rathore
 */
public class PatientManageJPanel extends javax.swing.JPanel {
JPanel showPanel;
EcoSystem ecosystem;
    /**
     * Creates new form ManagePatientJPanel
     */
    public PatientManageJPanel(JPanel showPanel, EcoSystem ecosystem) {
        initComponents();
        this.showPanel=showPanel;
        this.ecosystem=ecosystem;
        populatePatinetTable();
    }

    private void populatePatinetTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        for (PatientData network : ecosystem.getPatientDir().getPatientDirectory()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
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
        jTable1 = new javax.swing.JTable();
        BackjButton = new javax.swing.JButton();
        ViewjButton = new javax.swing.JButton();
        DeletejButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BackjButton.setText("<<Back");

        ViewjButton.setText("View");
        ViewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewjButtonActionPerformed(evt);
            }
        });

        DeletejButton.setText("Delete");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Donor Information");

        setBackground(new java.awt.Color(102, 153, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Patient"));
        setForeground(new java.awt.Color(0, 51, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient"
            }
        ));
        jScrollPane2.setViewportView(tblPatient);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 404, 145));

        btnView.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 51, 153));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 84, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 51, 153));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Songti TC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("MANAGE PATIENT INFORMATION");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 600, 34));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewjButtonActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        
        int selectedRow = tblPatient.getSelectedRow();
        if(selectedRow>=0){
        
        PatientData patient = (PatientData)tblPatient.getValueAt(selectedRow,0);
        PatientViewJpanel vp = new PatientViewJpanel(showPanel,patient);
        showPanel.add("ViewFlight",vp);
        CardLayout layout = (CardLayout)showPanel.getLayout();
        layout.next(showPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Select a row");
        }
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        showPanel.remove(this);
        Component[] componentArray = showPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminWorkAreaJPanel sysAdminwjp = (SysAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       int selectedRow = tblPatient.getSelectedRow();
        if(selectedRow>=0){
        PatientData patient = (PatientData)tblPatient.getValueAt(selectedRow,0);
        ecosystem.getUserAccountDirectory().removeUserAccount(patient.getUsername());
        ecosystem.getPatientDir().removePatient(patient);
        populatePatinetTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackjButton;
    private javax.swing.JButton DeletejButton;
    private javax.swing.JButton ViewjButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPatient;
    // End of variables declaration//GEN-END:variables
}
