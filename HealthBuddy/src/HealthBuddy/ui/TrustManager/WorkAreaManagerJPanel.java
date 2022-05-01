package HealthBuddy.ui.TrustManager;

import HealthBuddy.models.Trust.Organisation.TrustOrgManager;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.EnterpriseTrust;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.User.User;
import HealthBuddy.models.WorkQueue.HealthcareTrustRequestWQ;
import HealthBuddy.models.WorkQueue.WorkRequest;
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
public class WorkAreaManagerJPanel extends javax.swing.JPanel 
{
    private JPanel showPanel;
    private EnterpriseTrust enterprise;
    private User userAccount;
    private EcoSystem ecoSystem;
    private Network network;
    String funds;
    /**
     * Creates new form ManagerWorkAreaJPanel
     */
    public WorkAreaManagerJPanel(JPanel showPanel, User userAccount, TrustOrgManager organisation, EnterpriseTrust enterprise, Network network, EcoSystem ecoSystem) 
    {
        initComponents();
        this.showPanel = showPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.network = network;
        setSize(1540,800);
        
        lblValue.setText(enterprise.getName());    
        
        float amountReceived = 0;
        
        try
        {
            for(TrustDetails dd : ecoSystem.getDonationDirectory().getTrustCatalog())
            {
                if(dd.geTrustOrgName().equalsIgnoreCase(lblValue.getText()))
                {
                    amountReceived += Float.parseFloat(dd.getDonation());
                }
            }
        
            lblFundsValue.setText(String.valueOf(amountReceived));
            float sumUsed = fundCalculation();
            float sumAvailable = (amountReceived-sumUsed);
            funds = String.valueOf(amountReceived-sumUsed);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Server Down", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public float fundCalculation()
    {
        float sum =0;
        
        for(WorkRequest request : network.getFundsRequests().getWorkRequestList())
            {
                HealthcareTrustRequestWQ hospitalFundsRequestWorkQueue = (HealthcareTrustRequestWQ)request;
                
                if(hospitalFundsRequestWorkQueue.getMessage().equalsIgnoreCase("Acknowledged") && hospitalFundsRequestWorkQueue.getFunderName().equalsIgnoreCase(enterprise.getName()))
                {
                    sum += hospitalFundsRequestWorkQueue.getAmount();
                }
            }
        
        lblFundsUsed.setText(String.valueOf(sum));
        
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

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        btnViewDonations = new javax.swing.JButton();
        btnPickUp = new javax.swing.JButton();
        lblFunds = new javax.swing.JLabel();
        lblFundsValue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFundsUsed = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Funding Manager"));
        setForeground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblTitle.setText("Funding Manager");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 410, -1));

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 102));
        lblName.setText("Funding Organisation Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblValue.setBackground(new java.awt.Color(255, 255, 255));
        lblValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValue.setForeground(new java.awt.Color(0, 102, 102));
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 120, 20));

        btnViewDonations.setBackground(new java.awt.Color(0, 102, 102));
        btnViewDonations.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewDonations.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDonations.setText("View Donations");
        btnViewDonations.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewDonations.setBorderPainted(false);
        btnViewDonations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDonationsActionPerformed(evt);
            }
        });
        add(btnViewDonations, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 190, 30));

        btnPickUp.setBackground(new java.awt.Color(0, 102, 102));
        btnPickUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPickUp.setForeground(new java.awt.Color(255, 255, 255));
        btnPickUp.setText("Pick New Case");
        btnPickUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPickUp.setBorderPainted(false);
        btnPickUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickUpActionPerformed(evt);
            }
        });
        add(btnPickUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 280, 190, 30));

        lblFunds.setBackground(new java.awt.Color(255, 255, 255));
        lblFunds.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFunds.setForeground(new java.awt.Color(0, 102, 102));
        lblFunds.setText("Funds Received");
        add(lblFunds, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        lblFundsValue.setBackground(new java.awt.Color(255, 255, 255));
        lblFundsValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFundsValue.setForeground(new java.awt.Color(0, 102, 102));
        lblFundsValue.setText("value");
        add(lblFundsValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 80, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Funds Used");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        lblFundsUsed.setBackground(new java.awt.Color(255, 255, 255));
        lblFundsUsed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFundsUsed.setForeground(new java.awt.Color(0, 102, 102));
        lblFundsUsed.setText("0");
        add(lblFundsUsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 40, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDonationsActionPerformed
        AllDonationInformationJPanel completeDonationRelatedDetailsJPanel = new AllDonationInformationJPanel(showPanel, ecoSystem,enterprise, userAccount);
        showPanel.add("completeDonationRelatedDetailsJPanel", completeDonationRelatedDetailsJPanel);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.next(showPanel);
    }//GEN-LAST:event_btnViewDonationsActionPerformed

    private void btnPickUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickUpActionPerformed
        PatientsCureSponsoringInformation patientsTreatmentSponsoringDetails = new PatientsCureSponsoringInformation(showPanel,enterprise,network,ecoSystem, userAccount,funds);
        showPanel.add("patientsTreatmentSponsoringDetails", patientsTreatmentSponsoringDetails);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.next(showPanel);
    }//GEN-LAST:event_btnPickUpActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        float sum =0;
        
        for(WorkRequest request : network.getFundsRequests().getWorkRequestList())
            {
                HealthcareTrustRequestWQ hospitalFundsRequestWorkQueue = (HealthcareTrustRequestWQ)request;
                
                if(hospitalFundsRequestWorkQueue.getMessage().equalsIgnoreCase("Acknowledged") && hospitalFundsRequestWorkQueue.getFunderName().equalsIgnoreCase(enterprise.getName()))
                {
                    sum += hospitalFundsRequestWorkQueue.getAmount();
                }
            }
        
        lblFundsUsed.setText(String.valueOf(sum));
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPickUp;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewDonations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFunds;
    private javax.swing.JLabel lblFundsUsed;
    private javax.swing.JLabel lblFundsValue;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
}
