/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.ui.BloodDonorCenter;

import medistopBackend.Bloodbank.Stock.BloodBankStockDirectory;
import medistopBackend.Bloodbank.Organisation.HeadsOrganisation;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.BloodbankEnterprise;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.UserAccount.UserAccount;
import medistopBackend.WorkQueue.BloodHeadAttendentWorkQueue;
import medistopBackend.WorkQueue.WorkRequest;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAttendant;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Virendra Rathore
 */
public class HeadBloodDonorCenterWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HeadBloodDonorCenterWorkAreaJPanel
     */
   
    private JPanel showPanel;
    private UserAccount userAccount;
    private HeadsOrganisation headsOrganisation;
    private EcoSystem system;
    private Network network;
    private BloodbankEnterprise enterprise;
    private BloodBankStockDirectory bloodBankStockDirectory;

    public HeadBloodDonorCenterWorkAreaJPanel(JPanel displayJPanel, UserAccount userAccount, HeadsOrganisation headsOrganisation, BloodbankEnterprise enterprise, Network network, EcoSystem business) {
               
       
        initComponents();
        this.showPanel=displayJPanel;
        this.headsOrganisation = headsOrganisation;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = business;
        this.network=network;
        this.userAccount=userAccount;
        this.bloodBankStockDirectory = this.headsOrganisation.getBbStockDirectory();    
        populateTable();
    }
   
    
    
    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) BloodRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request :network.getBloodBankRequests().getWorkRequestList())
        {
            BloodHeadAttendentWorkQueue nb = (BloodHeadAttendentWorkQueue)request;
            Object[] row = new Object[4];
            row[0] = nb;
            row[1] = nb.getTypeOfBlood();
            row[2] = nb.getUnitsOfBlood();
            row[3]=request.getMessage();
            
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
        BloodRequestJTable = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Blood Requests"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BloodRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Blood Group", "Quantity Required", "Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BloodRequestJTable);
        if (BloodRequestJTable.getColumnModel().getColumnCount() > 0) {
            BloodRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            BloodRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            BloodRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            BloodRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 600, 137));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setText("All BLOOD REQUESTS");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 380, 34));

        btnAccept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(0, 51, 153));
        btnAccept.setText("Accept Request");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medistopUI.images/bloodStatus.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
       int selectedRow=BloodRequestJTable.getSelectedRow();
       
       if(selectedRow<0)
       {
           JOptionPane.showMessageDialog(null, "No row is selected","Warning", JOptionPane.WARNING_MESSAGE);
       }
       else
       {
           BloodHeadAttendentWorkQueue  bloodHeadAttendentWorkQueue = (BloodHeadAttendentWorkQueue)BloodRequestJTable.getValueAt(selectedRow, 0);
           boolean result = bloodBankStockDirectory.checkBloodQuantity(bloodHeadAttendentWorkQueue.getTypeOfBlood(), bloodHeadAttendentWorkQueue.getUnitsOfBlood());
           
           if(bloodHeadAttendentWorkQueue.getMessage().equals("Blood Supplied"))
           {
               JOptionPane.showMessageDialog(null, "Blood is Delivered earlier","Warning", JOptionPane.WARNING_MESSAGE);
           }
           
           else if(result == true)
           {
                    bloodHeadAttendentWorkQueue.setMessage("Blood Supplied");
                    populateTable();
                
                    BloodHeadAttendentWorkQueue bhawq= new BloodHeadAttendentWorkQueue();
                             
                    bhawq.setSender(userAccount);
                    bhawq.setStatus("Blood Supplied");
                    bhawq.setTypeOfBlood(bloodHeadAttendentWorkQueue.getTypeOfBlood());
                    bhawq.setNameOfPatient(bloodHeadAttendentWorkQueue.getNameOfPatient());
                    bhawq.setUnitsOfBlood(bloodHeadAttendentWorkQueue.getUnitsOfBlood());
                
             
                    HospitalOrganisationAttendant bb = null;
                    for(Network network : system.getNetworkList())
                    {
                        if(network.getNetworkName().equals(network.getNetworkName()))
                        {
                            for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList())
                            {
                                for(Organisation org : ent.getOrganizationDirectory().getOrganizationList())
                                {
                                    if(org.getName().equalsIgnoreCase("Attendant Organisation"))
                                    {
                                        for(UserAccount uacnt : org.getUserAccountDirectory().getUserAccountDirectory())
                                        {
                                            if(uacnt.getUsername().equalsIgnoreCase(bloodHeadAttendentWorkQueue.getSender().getUsername()))
                                            {
                                                bb = (HospitalOrganisationAttendant)org;
                                                break;
                                            }
                                        }
                                    }
                                }   
                            }
                    
                            if (bb!= null)
                            {
                                bb.getBloodHeadAttendantWQ().getWorkRequestList().add(bhawq);
                                userAccount.getWorkQueue().getWorkRequestList().add(bhawq);
                            }   
                
                            JOptionPane.showMessageDialog(null, "Posted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        }      
                    }
                }
           
           else
           {
               JOptionPane.showMessageDialog(null, "Sufficient blood quantity not available at present for this blood group", "Warning", JOptionPane.WARNING_MESSAGE);
           }
        } 
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        showPanel.remove(this);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BloodRequestJTable;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    
}