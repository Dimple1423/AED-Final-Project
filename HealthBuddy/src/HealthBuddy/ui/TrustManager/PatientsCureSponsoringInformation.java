package HealthBuddy.ui.TrustManager;

import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Enterprise.EnterpriseTrust;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.WorkQueue.TrustReceiveWR;
import java.awt.Image;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationAssistant;
import HealthBuddy.models.WorkQueue.HealthcareTrustRequestWQ;
import HealthBuddy.models.WorkQueue.WorkRequest;
import HealthBuddy.models.User.User;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author Nidhi Singh
 */
public class PatientsCureSponsoringInformation extends javax.swing.JPanel {

    private JPanel showPanel;
    private EnterpriseTrust fundingEnterprise;
    private Network network;
    private EcoSystem ecoSystem;
    private User userAccount;
    String funds;
    Float amountFromFunding;

    /**
     * Creates new form ViewPatienttoSponsorJPanel
     */
    public PatientsCureSponsoringInformation(JPanel showPanel, EnterpriseTrust fundingEnterprise, Network network, EcoSystem ecoSystem, User userAccount, String funds) {
        initComponents();
        this.showPanel = showPanel;
        this.fundingEnterprise = fundingEnterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.funds = funds;

        amountFromFunding = Float.parseFloat(funds);

        populateJTable();
        setSize(1540, 800);
    }

    public void populateJTable() {
        DefaultTableModel model = (DefaultTableModel) patsponsorTAble.getModel();

        model.setRowCount(0);
        for (WorkRequest request : network.getFundsRequests().getWorkRequestList()) {
            HealthcareTrustRequestWQ hospitalFundsRequestWorkQueue;
            hospitalFundsRequestWorkQueue = (HealthcareTrustRequestWQ) request;
            Object[] row = new Object[5];
            row[0] = hospitalFundsRequestWorkQueue;
            row[1] = hospitalFundsRequestWorkQueue.getAmount();
            row[2] = hospitalFundsRequestWorkQueue.getMessage();
            row[3] = hospitalFundsRequestWorkQueue.getHospitalName();
            row[4] = hospitalFundsRequestWorkQueue.getCity();
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

        titlelabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patsponsorTAble = new javax.swing.JTable();
        sponsorButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("View Patients"));
        setForeground(new java.awt.Color(0, 102, 102));

        titlelabel.setBackground(new java.awt.Color(255, 255, 255));
        titlelabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titlelabel.setForeground(new java.awt.Color(0, 102, 102));
        titlelabel.setText("Sponsor Patients' Treatment");

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        patsponsorTAble.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        patsponsorTAble.setForeground(new java.awt.Color(0, 102, 102));
        patsponsorTAble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Amount", "Message", "Hospital", "Hospital Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patsponsorTAble.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(patsponsorTAble);
        if (patsponsorTAble.getColumnModel().getColumnCount() > 0) {
            patsponsorTAble.getColumnModel().getColumn(0).setResizable(false);
            patsponsorTAble.getColumnModel().getColumn(1).setResizable(false);
            patsponsorTAble.getColumnModel().getColumn(2).setResizable(false);
            patsponsorTAble.getColumnModel().getColumn(3).setResizable(false);
            patsponsorTAble.getColumnModel().getColumn(4).setResizable(false);
        }

        sponsorButton.setBackground(new java.awt.Color(0, 102, 102));
        sponsorButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sponsorButton.setForeground(new java.awt.Color(255, 255, 255));
        sponsorButton.setText("Sponsor");
        sponsorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sponsorButton.setBorderPainted(false);
        sponsorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sponsorButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ImageIcon imageIcon =  new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/pickanewcase.gif")).getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT));

        jLabel1.setIcon(imageIcon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(titlelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sponsorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(titlelabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(sponsorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sponsorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sponsorButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) patsponsorTAble.getModel();
        int selectedRow = patsponsorTAble.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a patient to sponsor", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            HealthcareTrustRequestWQ request = (HealthcareTrustRequestWQ) patsponsorTAble.getValueAt(selectedRow, 0);
            float amount = request.getAmount();

            if (amount < amountFromFunding) {
                if (request.getMessage().equals("Acknowledged")) {
                    JOptionPane.showMessageDialog(null, "Request Already Processed please select a different patient", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    request.setMessage("Acknowledged");
                    request.setReceiver(userAccount);
                    request.setFunderName(fundingEnterprise.getName());
                    populateJTable();
                    amountFromFunding = amountFromFunding - amount;
                    TrustReceiveWR recivedFundWorkRequest = new TrustReceiveWR();

                    recivedFundWorkRequest.setPatientName(request.getPatientName());
                    recivedFundWorkRequest.setFunderName(fundingEnterprise.getName());
                    recivedFundWorkRequest.setCity(network.getNetworkName());
                    recivedFundWorkRequest.setDateReceived(new Date());
                    recivedFundWorkRequest.setHospitalName(request.getHospitalName());
                    recivedFundWorkRequest.setSender(userAccount);
                    recivedFundWorkRequest.setFundsSponsored(String.valueOf(request.getAmount()));

                    Enterprise enterprise = null;
                    for (Network net : ecoSystem.getNetworkList()) {
                        for (Enterprise enter : net.getEnterpriseCatalog().getEnterpriseList()) {
                            if (enter.getName().equalsIgnoreCase(request.getHospitalName())) {
                                enterprise = enter;
                                break;
                            }
                        }
                    }

                    HealthcareOrganisationAssistant org = null;
                    for (Organisation organi : enterprise.getOrganizationCatalog().getOrganizationList()) {
                        if (organi instanceof HealthcareOrganisationAssistant) {
                            for (User uacc : organi.getUserCatalog().getUserCatalog()) {
                                if (uacc.getUsername().equalsIgnoreCase(request.getSender().getUsername())) {
                                    org = (HealthcareOrganisationAssistant) organi;
                                    break;
                                }
                            }
                        }
                    }
                    org.getFundsReceived().getWorkRequestList().add(recivedFundWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(recivedFundWorkRequest);

                    JOptionPane.showMessageDialog(null, "Hospital Request successfully acknowledged by hospital", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Funding Oranisation can't sponsor the treatment due to money sortage", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_sponsorButtonActionPerformed

    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        showPanel.remove(this);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patsponsorTAble;
    private javax.swing.JButton sponsorButton;
    private javax.swing.JLabel titlelabel;
    // End of variables declaration//GEN-END:variables
}
