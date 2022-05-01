package HealthBuddy.ui.TrustVolunteer;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import HealthBuddy.models.EcoSystem;
import javax.swing.table.DefaultTableModel;
import HealthBuddy.models.Trust.Donation.TrustDetails;
import HealthBuddy.models.Enterprise.EnterpriseTrust;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Trust.Organisation.TrustOrgVolunteer;
import HealthBuddy.models.WorkQueue.HealthcareTrustRequestWQ;
import HealthBuddy.models.User.User;
import HealthBuddy.Util.SendEmailUtility;
import HealthBuddy.models.WorkQueue.WorkRequest;
import HealthBuddy.Util.Utilities;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author Bhawna Singh
 */
public class WorkAreaVolunteerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaVolunteerJPanel
     */
    private JPanel displayJPanel;
    private EcoSystem ecosystem;
    private EnterpriseTrust enterprise;
    private Network network;
    private User userAccount;
 
    public WorkAreaVolunteerJPanel(JPanel displayJPanel,User account, TrustOrgVolunteer orgVolunteer ,EnterpriseTrust enterprise, Network network, EcoSystem ecosystem) {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.network = network;
        this.ecosystem = ecosystem;
        setSize(1540,800);
        
        //Setting label values
        lblVolunteerName.setText(userAccount.getUsername());
        lblFundsOrgName.setText(this.enterprise.getName());
        lblFundsOrgCity.setText(network.getNetworkName());
        
        populateTable();
        
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
        tblPatientCharity = new javax.swing.JTable();
        lblWelcome = new javax.swing.JLabel();
        lblFundsName = new javax.swing.JLabel();
        lblFundsOrgName = new javax.swing.JLabel();
        lblFundsName1 = new javax.swing.JLabel();
        lblFundsOrgCity = new javax.swing.JLabel();
        btnPublish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblVolunteerName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblPatientCharity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblPatientCharity.setForeground(new java.awt.Color(0, 102, 102));
        tblPatientCharity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PatientName", "Address", "Hospital", "Funds Required", "Newsletter"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatientCharity);

        lblWelcome.setBackground(new java.awt.Color(255, 255, 255));
        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 102, 102));
        lblWelcome.setText(", Thank You For Your Valuable Contribution");

        lblFundsName.setBackground(new java.awt.Color(255, 255, 255));
        lblFundsName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFundsName.setForeground(new java.awt.Color(0, 102, 102));
        lblFundsName.setText("Funding Organisation Name:");

        lblFundsOrgName.setBackground(new java.awt.Color(255, 255, 255));
        lblFundsOrgName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFundsOrgName.setForeground(new java.awt.Color(0, 102, 102));
        lblFundsOrgName.setText("value");

        lblFundsName1.setBackground(new java.awt.Color(255, 255, 255));
        lblFundsName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFundsName1.setForeground(new java.awt.Color(0, 102, 102));
        lblFundsName1.setText("Funding Organisation Address:");

        lblFundsOrgCity.setBackground(new java.awt.Color(255, 255, 255));
        lblFundsOrgCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFundsOrgCity.setForeground(new java.awt.Color(0, 102, 102));
        lblFundsOrgCity.setText("value");

        btnPublish.setBackground(new java.awt.Color(0, 102, 102));
        btnPublish.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPublish.setForeground(new java.awt.Color(255, 255, 255));
        btnPublish.setText("Publish Journal");
        btnPublish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishActionPerformed(evt);
            }
        });

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/volunteer.jpeg")).getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT));

        jLabel1.setIcon(imageIcon);

        lblVolunteerName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblVolunteerName.setForeground(new java.awt.Color(0, 102, 102));
        lblVolunteerName.setText("value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFundsName1)
                                    .addComponent(lblFundsName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFundsOrgName, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(lblFundsOrgCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(btnPublish, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVolunteerName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(lblVolunteerName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFundsName)
                            .addComponent(lblFundsOrgName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFundsName1)
                            .addComponent(lblFundsOrgCity))
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnPublish))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPublishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblPatientCharity.getModel();
        int selectedRow = tblPatientCharity.getSelectedRow();
        
        if (selectedRow > -1)
        {
            HealthcareTrustRequestWQ request = (HealthcareTrustRequestWQ)tblPatientCharity.getValueAt(selectedRow,0);
            
            if(request.getStatus().equalsIgnoreCase("Published"))
            {
                JOptionPane.showMessageDialog(null, "Newsletter Already Published!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                request.setStatus("Published");
                populateTable();
                int count =0;
                for(TrustDetails funds : ecosystem.getDonationDirectory().getTrustCatalog())
                {
                    if(funds.geTrustOrgName().equalsIgnoreCase(enterprise.getName()))
                    {
                        count++;
                    }
                }
        
                String[] receiver = new String[count];
        
                int index =0;
                for(TrustDetails donation : ecosystem.getDonationDirectory().getTrustCatalog())
                {
                    if(donation.geTrustOrgName().equalsIgnoreCase(enterprise.getName()))
                    {
                        receiver[index++] = donation.getDonor().getEmail();
                    }
                }
        
                
                //Defining newsletter details

        
                String message = "Hello Donors," +",\n\nGreetings from MediStop! Your gift, whether big or small, matters!!" + "\nListed below are the details of the patient we sponsored for treatment:\n" +"\n"+"Patient Name: "+request.getPatientName()+ "\nHospital Name: " + request.getHospitalName()+"\nHospital City: " + request.getCity() + "\nDonation Provided: "+request.getAmount()+"\n\nRegards,\nTeam MediStop";
                String subject ="News @ MediStop";
                SendEmailUtility.sendEmail(subject, Utilities.email, Utilities.password, message, receiver);
        
                JOptionPane.showMessageDialog(null, "Newsletter Successfully Published!!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a case you wish to publish.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
            
    }//GEN-LAST:event_btnPublishActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPublish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFundsName;
    private javax.swing.JLabel lblFundsName1;
    private javax.swing.JLabel lblFundsOrgCity;
    private javax.swing.JLabel lblFundsOrgName;
    private javax.swing.JLabel lblVolunteerName;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTable tblPatientCharity;
    // End of variables declaration//GEN-END:variables

    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblPatientCharity.getModel();
        model.setRowCount(0);
        
        for(WorkRequest workRequest : network.getFundsRequests().getWorkRequestList())
        {
            HealthcareTrustRequestWQ fundsReqWorkQueue = (HealthcareTrustRequestWQ)workRequest;
                
            if(fundsReqWorkQueue.getMessage().equalsIgnoreCase("Acknowledged") && fundsReqWorkQueue.getFunderName().equalsIgnoreCase(enterprise.getName()))
            {
                Object[] row = new Object[5];
                row[0] = fundsReqWorkQueue;
                row[1] = fundsReqWorkQueue.getCity();
                row[2] = fundsReqWorkQueue.getHospitalName();
                row[3] = fundsReqWorkQueue.getAmount();
                row[4] = fundsReqWorkQueue.getStatus();
                
                model.addRow(row);
            }
        }          
    }
}
