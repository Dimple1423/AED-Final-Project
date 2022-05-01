package HealthBuddy.ui.SysAdminWorkArea;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.JOptionPane;
import HealthBuddy.models.EcoSystem;
import javax.swing.JPanel;
import HealthBuddy.models.UserData.DonorData;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Nidhi Singh
 */
public class DonorManageJPanel extends javax.swing.JPanel {
JPanel showPanel;
EcoSystem ecosystem;
    /**
     * Creates new form ManageDonorJPanel
     */
    public DonorManageJPanel(JPanel showPanel, EcoSystem ecosystem) {
        initComponents();
        this.showPanel=showPanel;
        setSize(1540,800);
        this.ecosystem=ecosystem;
        populateDonorTable();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        manageDonorlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        donorInforTable = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Donor"));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageDonorlabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        manageDonorlabel.setForeground(new java.awt.Color(0, 102, 102));
        manageDonorlabel.setText("Manage Donor Information");
        jPanel1.add(manageDonorlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 600, 40));

        donorInforTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        donorInforTable.setForeground(new java.awt.Color(0, 102, 102));
        donorInforTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name"
            }
        ));
        donorInforTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(donorInforTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 500, 170));

        viewButton.setBackground(new java.awt.Color(0, 102, 102));
        viewButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View");
        viewButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewButton.setBorderPainted(false);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 120, 30));

        deleteButton.setBackground(new java.awt.Color(0, 102, 102));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.setBorderPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 100, 30));

        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 30, 90, 40));

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/managedonor.gif")).getImage().getScaledInstance(780, 600, Image.SCALE_DEFAULT));

        jLabel2.setIcon(imageIcon);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 820, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1514, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateDonorTable() {
        DefaultTableModel model = (DefaultTableModel) donorInforTable.getModel();

        model.setRowCount(0);
        ecosystem.getDonorDir().getDonorCatalog().forEach(don -> {
            Object[] tuple = new Object[1];
            tuple[0] = don;
            model.addRow(tuple);
        });
//        for (DonorData test : ecosystem.getDonorDir().getDonorCatalog()) {
//            Object[] row = new Object[1];
//            row[0] = test;
//            model.addRow(row);
//        }
    }
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedTuple = donorInforTable.getSelectedRow();
        if(selectedTuple>=0){
            DonorData donor = (DonorData)donorInforTable.getValueAt(selectedTuple,0);
            DonorViewJpanel donorViewJpanel = new DonorViewJpanel(showPanel,donor);
            showPanel.add("DonorViewJpanel",donorViewJpanel);
            CardLayout layout = (CardLayout)showPanel.getLayout();
            layout.next(showPanel);
        }
        else
            JOptionPane.showMessageDialog(null,"Kindly Select row");
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedTuple = donorInforTable.getSelectedRow();
        if(selectedTuple>=0){
            DonorData donor = (DonorData)donorInforTable.getValueAt(selectedTuple,0);
            ecosystem.getUserCatalog().removeUserAccount(donor.getUsername());
            ecosystem.getDonorDir().deleteDonor(donor);
            populateDonorTable();
    }//GEN-LAST:event_deleteButtonActionPerformed
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

            showPanel.remove(this);
            CardLayout layout = (CardLayout) showPanel.getLayout();
            layout.previous(showPanel);
//GEN-LAST:event_backButtonActionPerformed
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable donorInforTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageDonorlabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
