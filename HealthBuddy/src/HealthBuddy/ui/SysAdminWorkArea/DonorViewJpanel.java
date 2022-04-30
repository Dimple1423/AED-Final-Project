package HealthBuddy.ui.SysAdminWorkArea;


import java.awt.CardLayout;
import javax.swing.JPanel;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.UserData.*;

/**
 *
 * @author Nidhi Singh
 */
public class DonorViewJpanel extends javax.swing.JPanel 
{
    private JPanel showPanel;
    private EcoSystem system;
    private DonorData donorData;
    /**
     * Creates new form CreatePatientAccount
     */
    public DonorViewJpanel(JPanel showPanel, DonorData donorData) 
    {
        initComponents();
        this.system=system;
        this.showPanel=showPanel;
        this.donorData = donorData;
        txtDonorsAddress.setEnabled(false);
        txtDonorsCity.setEnabled(false);
        txtDonorsName.setEnabled(false);
        txtDonorsContactNumber.setEnabled(false);
        txtDonorsState.setEnabled(false);
        txtZipCode.setEnabled(false);
        txtDonorUserName.setEnabled(false);
        txtDonorsAddress.setText(donorData.getAddress());
        txtDonorsCity.setText(donorData.getCity());
        txtDonorsName.setText(donorData.getDonorName());
        txtZipCode.setText(String.valueOf(donorData.getZipCode()));
        txtDonorsContactNumber.setText(donorData.getContactNo());
        txtDonorsState.setText(donorData.getState());
        txtDonorUserName.setText(donorData.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtDonorsName = new javax.swing.JTextField();
        txtDonorsContactNumber = new javax.swing.JTextField();
        txtDonorsAddress = new javax.swing.JTextField();
        txtDonorsCity = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtDonorsState = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        txtDonorUserName = new javax.swing.JTextField();
        lblUserPhoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Donor Information"));
        setForeground(new java.awt.Color(0, 51, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setForeground(new java.awt.Color(0, 51, 153));
        lblName.setText("Donor's Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 77, -1, -1));
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 201, -1, -1));

        lblPhoneNumber.setForeground(new java.awt.Color(0, 51, 153));
        lblPhoneNumber.setText("Phone Number");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 115, -1, -1));

        lblAddress.setForeground(new java.awt.Color(0, 51, 153));
        lblAddress.setText("Address Line1");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblCity.setForeground(new java.awt.Color(0, 51, 153));
        lblCity.setText("City");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblTitle.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 153));
        lblTitle.setText("View Donor's ACCOUNT");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, 280, 35));

        lblState.setForeground(new java.awt.Color(0, 51, 153));
        lblState.setText("State");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lblZipCode.setForeground(new java.awt.Color(0, 51, 153));
        lblZipCode.setText("ZipCode");
        add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        add(txtDonorsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 77, 181, -1));
        add(txtDonorsContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 115, 181, -1));
        add(txtDonorsAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 147, 181, -1));
        add(txtDonorsCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 181, -1));
        add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 181, -1));
        add(txtDonorsState, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 181, -1));

        btnBack.setForeground(new java.awt.Color(0, 51, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        lblUserName.setForeground(new java.awt.Color(0, 51, 153));
        lblUserName.setText("UserName");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        add(txtDonorUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 181, -1));
        add(lblUserPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 87, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medistopUI.images/2966327.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 150, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        showPanel.remove(this);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserPhoto;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtDonorUserName;
    private javax.swing.JTextField txtDonorsAddress;
    private javax.swing.JTextField txtDonorsCity;
    private javax.swing.JTextField txtDonorsContactNumber;
    private javax.swing.JTextField txtDonorsName;
    private javax.swing.JTextField txtDonorsState;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}