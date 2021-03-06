package HealthBuddy.ui.SysAdminWorkArea;

import java.awt.CardLayout;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.UserData.PatientData;

/**
 *
 * @author Nidhi Singh
 */
public class PatientManageJPanel extends javax.swing.JPanel {
JPanel showPanel;
EcoSystem ecosystem;
    /**
     * Creates new form PatientManageJPanel
     */
    public PatientManageJPanel(JPanel showPanel, EcoSystem ecosystem) {
        initComponents();
        this.showPanel=showPanel;
        setSize(1540,800);
        this.ecosystem=ecosystem;
        populatePatinetTable();
    }

    private void populatePatinetTable() {
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        ecosystem.getPatientDir().getPatientCatalog().forEach(net -> {
            Object[] tuple = new Object[1];
            tuple[0] = net;
            model.addRow(tuple);
        });
//        for (PatientData network : ecosystem.getPatientDir().getPatientCatalog()) {
//            Object[] row = new Object[1];
//            row[0] = network;
//            model.addRow(row);
//        }
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
        patientTable = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        titleLable = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Patient"));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientTable.setForeground(new java.awt.Color(0, 102, 102));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient"
            }
        ));
        patientTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane2.setViewportView(patientTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 404, 170));

        viewButton.setBackground(new java.awt.Color(0, 102, 102));
        viewButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View");
        viewButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewButton.setBorderPainted(false);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 120, 30));

        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 30, 100, 40));

        deleteButton.setBackground(new java.awt.Color(0, 102, 102));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.setBorderPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 110, 30));

        titleLable.setFont(new java.awt.Font("Songti TC", 1, 36)); // NOI18N
        titleLable.setForeground(new java.awt.Color(0, 102, 102));
        titleLable.setText("Manage Patient Details");
        add(titleLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 410, 50));

        ImageIcon imageIcon =  new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/managePatient.gif")).getImage().getScaledInstance(850, 550, Image.SCALE_DEFAULT));

        jLabel3.setIcon(imageIcon);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 720, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewjButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        
        int selectedRow = patientTable.getSelectedRow();
        if(selectedRow>=0){
            PatientData patient = (PatientData)patientTable.getValueAt(selectedRow,0);
            PatientViewJpanel patientViewJpanel = new PatientViewJpanel(showPanel,patient);
            showPanel.add("patientViewJpanel",patientViewJpanel);
            CardLayout layout = (CardLayout)showPanel.getLayout();
            layout.next(showPanel);
        }
        else
            JOptionPane.showMessageDialog(null,"Row must be selected");
        
        
    }//GEN-LAST:event_viewButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        showPanel.remove(this);
        Component[] arrayCom = showPanel.getComponents();
        Component component = arrayCom[arrayCom.length - 1];
        SysAdminWorkAreaJPanel sysAdminWorkAreaJPanel = (SysAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       int selectedTuple = patientTable.getSelectedRow();
        if(selectedTuple >= 0){
            PatientData patient = (PatientData)patientTable.getValueAt(selectedTuple,0);
            ecosystem.getUserCatalog().removeUserAccount(patient.getUsername());
            ecosystem.getPatientDir().removePatient(patient);
            populatePatinetTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackjButton;
    private javax.swing.JButton DeletejButton;
    private javax.swing.JButton ViewjButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable patientTable;
    private javax.swing.JLabel titleLable;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
