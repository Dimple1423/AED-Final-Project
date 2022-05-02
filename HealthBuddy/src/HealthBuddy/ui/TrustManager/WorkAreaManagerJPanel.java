package HealthBuddy.ui.TrustManager;

import HealthBuddy.models.Trust.Organisation.TrustOrgManager;
import HealthBuddy.models.EcoSystem;
import java.awt.Image;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Enterprise.EnterpriseTrust;
import javax.swing.ImageIcon;
import HealthBuddy.models.User.User;
import HealthBuddy.models.WorkQueue.WorkRequest;
import HealthBuddy.models.WorkQueue.HealthcareTrustRequestWQ;
import HealthBuddy.models.Trust.Donation.TrustDetails;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Image;


/**
 *
 * @author Nidhi Singh
 */
public class WorkAreaManagerJPanel extends javax.swing.JPanel {

    private JPanel showPanel;
    private EnterpriseTrust enterprise;
    private User userAccount;
    private EcoSystem ecoSystem;
    private Network network;
    String funds;

    /**
     * Creates new form ManagerWorkAreaJPanel
     */
    
    public WorkAreaManagerJPanel(JPanel showPanel, User userAccount, TrustOrgManager organisation, EnterpriseTrust enterprise, Network network, EcoSystem ecoSystem) {
        initComponents();
        this.showPanel = showPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.network = network;
        setSize(1540, 800);

        valtext.setText(enterprise.getName());

        float amountReceived = 0;

        try {
            for (TrustDetails dd : ecoSystem.getDonationDirectory().getTrustCatalog()) {
                if (dd.geTrustOrgName().equalsIgnoreCase(valtext.getText())) {
                    amountReceived += Float.parseFloat(dd.getDonation());
                }
            }

            trustvaltext.setText(String.valueOf(amountReceived));
            float sumUsed = fundCalculation();
            float sumAvailable = (amountReceived - sumUsed);
            funds = String.valueOf(amountReceived - sumUsed);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Server Down", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public float fundCalculation() {
        float sum = 0;

        for (WorkRequest request : network.getFundsRequests().getWorkRequestList()) {
            HealthcareTrustRequestWQ hospitalFundsRequestWorkQueue = (HealthcareTrustRequestWQ) request;

            if (hospitalFundsRequestWorkQueue.getMessage().equalsIgnoreCase("Acknowledged") && hospitalFundsRequestWorkQueue.getFunderName().equalsIgnoreCase(enterprise.getName())) {
                sum += hospitalFundsRequestWorkQueue.getAmount();
            }
        }

        trustusedtext.setText(String.valueOf(sum));
        return sum;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelable = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        valtext = new javax.swing.JLabel();
        viewDonButton = new javax.swing.JButton();
        pickupButton = new javax.swing.JButton();
        receivelabel = new javax.swing.JLabel();
        trustvaltext = new javax.swing.JLabel();
        fundusedjlabel = new javax.swing.JLabel();
        trustusedtext = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Funding Manager"));
        setForeground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlelable.setBackground(new java.awt.Color(255, 255, 255));
        titlelable.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titlelable.setForeground(new java.awt.Color(0, 102, 102));
        titlelable.setText("Trust Manager");
        add(titlelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 410, -1));

        namelabel.setBackground(new java.awt.Color(255, 255, 255));
        namelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namelabel.setForeground(new java.awt.Color(0, 102, 102));
        namelabel.setText("Funding Organisation Name");
        add(namelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        valtext.setBackground(new java.awt.Color(255, 255, 255));
        valtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valtext.setForeground(new java.awt.Color(0, 102, 102));
        add(valtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 120, 20));

        viewDonButton.setBackground(new java.awt.Color(0, 102, 102));
        viewDonButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewDonButton.setForeground(new java.awt.Color(255, 255, 255));
        viewDonButton.setText("View Donations Details");
        viewDonButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewDonButton.setBorderPainted(false);
        viewDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonButtonActionPerformed(evt);
            }
        });
        add(viewDonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 240, 30));

        pickupButton.setBackground(new java.awt.Color(0, 102, 102));
        pickupButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pickupButton.setForeground(new java.awt.Color(255, 255, 255));
        pickupButton.setText("Pick New Case");
        pickupButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pickupButton.setBorderPainted(false);
        pickupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupButtonActionPerformed(evt);
            }
        });
        add(pickupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 240, 30));

        receivelabel.setBackground(new java.awt.Color(255, 255, 255));
        receivelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        receivelabel.setForeground(new java.awt.Color(0, 102, 102));
        receivelabel.setText("Funds Received");
        add(receivelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        trustvaltext.setBackground(new java.awt.Color(255, 255, 255));
        trustvaltext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        trustvaltext.setForeground(new java.awt.Color(0, 102, 102));
        trustvaltext.setText("value");
        add(trustvaltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 80, 20));

        fundusedjlabel.setBackground(new java.awt.Color(255, 255, 255));
        fundusedjlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fundusedjlabel.setForeground(new java.awt.Color(0, 102, 102));
        fundusedjlabel.setText("Funds Used");
        add(fundusedjlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        trustusedtext.setBackground(new java.awt.Color(255, 255, 255));
        trustusedtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        trustusedtext.setForeground(new java.awt.Color(0, 102, 102));
        trustusedtext.setText("0");
        add(trustusedtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 40, -1));

        btnRefresh.setBackground(new java.awt.Color(0, 102, 102));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.setBorderPainted(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 120, 40));

        ImageIcon imageIcon =  new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/trustmanager.gif")).getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT));

        jLabel1.setIcon(imageIcon);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 680, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void viewDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonButtonActionPerformed
        AllDonationInformationJPanel completeDonationRelatedDetailsJPanel = new AllDonationInformationJPanel(showPanel, ecoSystem, enterprise, userAccount);
        showPanel.add("completeDonationRelatedDetailsJPanel", completeDonationRelatedDetailsJPanel);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.next(showPanel);
    }//GEN-LAST:event_viewDonButtonActionPerformed

    
    private void pickupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupButtonActionPerformed
        PatientsCureSponsoringInformation patientsTreatmentSponsoringDetails = new PatientsCureSponsoringInformation(showPanel, enterprise, network, ecoSystem, userAccount, funds);
        showPanel.add("patientsTreatmentSponsoringDetails", patientsTreatmentSponsoringDetails);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.next(showPanel);
    }//GEN-LAST:event_pickupButtonActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        float sum = 0;

        for (WorkRequest request : network.getFundsRequests().getWorkRequestList()) {
            HealthcareTrustRequestWQ hospitalFundsRequestWorkQueue = (HealthcareTrustRequestWQ) request;

            if (hospitalFundsRequestWorkQueue.getMessage().equalsIgnoreCase("Acknowledged") && hospitalFundsRequestWorkQueue.getFunderName().equalsIgnoreCase(enterprise.getName())) {
                sum += hospitalFundsRequestWorkQueue.getAmount();
            }
        }

        trustusedtext.setText(String.valueOf(sum));
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel fundusedjlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JButton pickupButton;
    private javax.swing.JLabel receivelabel;
    private javax.swing.JLabel titlelable;
    private javax.swing.JLabel trustusedtext;
    private javax.swing.JLabel trustvaltext;
    private javax.swing.JLabel valtext;
    private javax.swing.JButton viewDonButton;
    // End of variables declaration//GEN-END:variables
}

