/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HealthBuddy.ui.donor;

import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.User.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Funds.Donation.FundsInfo;
import medistopBackend.Network.Network;
import medistopBackend.UserData.DonorData;
import medistopUtil.SMSUtility;
import medistopUtil.SendEmailUtility;
import medistopUtil.Utilities;

/**
 *
 * @author 18577
 */
public class WorkAreaDonorJPanel extends javax.swing.JPanel {
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private DonorData donorData;

    DefaultTableModel charityDirectoryTableModel;
    DefaultTableModel donationHistoryTableModel;
    

    /** Creates new form DonorWorkAreaPanel */
    public WorkAreaDonorJPanel(EcoSystem ecoSys,UserAccount userAcc) {
        ecoSystem = ecoSys;
        userAccount = userAcc;
        donorData = ecoSystem.getDonorDir().getDonor(userAcc.getUsername());

        initCharityDirTableModel();
        initDonationHistoryDirTableModel();
        initComponents();
        populateCharityTable();
        populateDonationHistoryTable();

        userAccLabel.setText("Hi  " + donorData.getDonorName());
    }
    
    public void initCharityDirTableModel() {
        charityDirectoryTableModel = new DefaultTableModel();
        charityDirectoryTableModel.addColumn("Charity Name");
        charityDirectoryTableModel.addColumn("City");
        charityDirectoryTableModel.addColumn("Charity Cause");
    }
    
    
    public void populateCharityTable()
    {
        DefaultTableModel charityModel = (DefaultTableModel) charityDirTable.getModel();

        charityModel.setRowCount(0);

        for (Network net : ecoSystem.getNetworkList()) {

            String networkName = net.getNetworkName();

            List<Enterprise> charityList = net.getEnterpriseDirectory().getEnterpriseList().stream()
                    .filter(enterprise ->
                            enterprise.getEnterpriseClassification().equals(Enterprise.EnterpriseClassification.Funds))
                    .collect(Collectors.toList());

            for (Enterprise enterprise: charityList) {

                String[] rowData = {enterprise.getName(), networkName, enterprise.getCause()};

                charityModel.addRow(rowData);


            }

        }

 
    }
    
    
    public void populateDonationHistoryTable() {

        List<FundsInfo> donorData = ecoSystem.getDonationDirectory().getFundsInfoForADonor(userAccount.getUsername());
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable.getModel();
        
        appointmentHisTable.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        for (FundsInfo fundInfo: donorData) {

            String[] rowData = {fundInfo.getFundsOrgName(), fundInfo.getFundsOrgCity(),
                    fundInfo.getFundsCause(), fundInfo.getFrequencyType(), fundInfo.getDonation(),
                    formatter.format(fundInfo.getDonationDate())
            };

            appointmentHisTable.addRow(rowData);
        }
        
        
                
        
    
    }
    
    public void populateDonationHistoryTableWithCharityName(String charityname) {

        List<FundsInfo> donorData = ecoSystem.getDonationDirectory().getFundsInfoForACharityName(charityname);
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable.getModel();
        
        appointmentHisTable.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        for (FundsInfo fundInfo: donorData) {

            String[] rowData = {fundInfo.getFundsOrgName(), fundInfo.getFundsOrgCity(),
                    fundInfo.getFundsCause(), fundInfo.getFrequencyType(), fundInfo.getDonation(),
                    formatter.format(fundInfo.getDonationDate())
            };

            appointmentHisTable.addRow(rowData);
        }
        
        
                
        
    
    }
    
    
     public void populateDonationHistoryTableWithCharityCause(String cause) {

        List<FundsInfo> donorData = ecoSystem.getDonationDirectory().getFundsInfoForACharityCause(cause);
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable.getModel();
        
        appointmentHisTable.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        for (FundsInfo fundInfo: donorData) {

            String[] rowData = {fundInfo.getFundsOrgName(), fundInfo.getFundsOrgCity(),
                    fundInfo.getFundsCause(), fundInfo.getFrequencyType(), fundInfo.getDonation(),
                    formatter.format(fundInfo.getDonationDate())
            };

            appointmentHisTable.addRow(rowData);
        }
        
        
   }
     
    public void populateDonationHistoryTableWithCharityCity(String city) {

        List<FundsInfo> donorData = ecoSystem.getDonationDirectory().getFundsInfoForACharityCity(city);
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable.getModel();
        
        appointmentHisTable.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        for (FundsInfo fundInfo: donorData) {

            String[] rowData = {fundInfo.getFundsOrgName(), fundInfo.getFundsOrgCity(),
                    fundInfo.getFundsCause(), fundInfo.getFrequencyType(), fundInfo.getDonation(),
                    formatter.format(fundInfo.getDonationDate())
            };

            appointmentHisTable.addRow(rowData);
        }           
        
    
    } 
     
     
     
    public void initDonationHistoryDirTableModel() {
        
        donationHistoryTableModel = new DefaultTableModel();
        donationHistoryTableModel.addColumn("Charity Name");
        donationHistoryTableModel.addColumn("Charity City");
        donationHistoryTableModel.addColumn("Charity Cause");  
        donationHistoryTableModel.addColumn("Donation Frequency");
        donationHistoryTableModel.addColumn("Donation Amount");
        donationHistoryTableModel.addColumn("Donation Date");


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donationTabbedPane = new javax.swing.JTabbedPane();
        menuPanel = new javax.swing.JPanel();
        deliveryDirLabel = new javax.swing.JLabel();
        delDirectoryScollPanel = new javax.swing.JScrollPane();
        charityDirTable = new javax.swing.JTable();
        menuItemName1 = new javax.swing.JLabel();
        deliveryDirLabel2 = new javax.swing.JLabel();
        deliveryDirLabel3 = new javax.swing.JLabel();
        twoHundBtn = new javax.swing.JButton();
        hundBtn = new javax.swing.JButton();
        onefiftyBtn = new javax.swing.JButton();
        amountTF = new javax.swing.JTextField();
        frequencyCombobox = new javax.swing.JComboBox<>();
        menuItemName6 = new javax.swing.JLabel();
        createDonationBtn = new javax.swing.JButton();
        manageOrdersTab = new javax.swing.JPanel();
        propertyComboBox = new javax.swing.JComboBox<>();
        searchHeaderLabel = new javax.swing.JLabel();
        propertyValueTextField = new javax.swing.JTextField();
        donationListSearchButton = new javax.swing.JButton();
        resetTableButton = new javax.swing.JButton();
        searchCarCatalogScrollPanel = new javax.swing.JScrollPane();
        searchDonationCatalogTable = new javax.swing.JTable();
        userAccLabel = new javax.swing.JLabel();
        helpTextLabel = new javax.swing.JLabel();
        deliveryDirLabel5 = new javax.swing.JLabel();

        donationTabbedPane.setForeground(new java.awt.Color(0, 0, 102));
        donationTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        deliveryDirLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel.setForeground(new java.awt.Color(0, 0, 102));
        deliveryDirLabel.setText("100% of your donation will help a patient in need ...");

        charityDirTable.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        charityDirTable.setForeground(new java.awt.Color(0, 0, 102));
        charityDirTable.setModel(charityDirectoryTableModel);
        charityDirTable.setRowHeight(40);
        delDirectoryScollPanel.setViewportView(charityDirTable);

        menuItemName1.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        menuItemName1.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName1.setText("Donation Amount");

        deliveryDirLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel2.setForeground(new java.awt.Color(0, 0, 102));
        deliveryDirLabel2.setText("Charity Directory");

        deliveryDirLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel3.setForeground(new java.awt.Color(0, 0, 102));
        deliveryDirLabel3.setText("DONATE, Save Lives!");

        twoHundBtn.setBackground(new java.awt.Color(0, 51, 102));
        twoHundBtn.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        twoHundBtn.setForeground(new java.awt.Color(204, 204, 204));
        twoHundBtn.setText("$ 200");
        twoHundBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoHundBtnActionPerformed(evt);
            }
        });

        hundBtn.setBackground(new java.awt.Color(0, 51, 102));
        hundBtn.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        hundBtn.setForeground(new java.awt.Color(204, 204, 204));
        hundBtn.setText("$ 100");
        hundBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundBtnActionPerformed(evt);
            }
        });

        onefiftyBtn.setBackground(new java.awt.Color(0, 51, 102));
        onefiftyBtn.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        onefiftyBtn.setForeground(new java.awt.Color(204, 204, 204));
        onefiftyBtn.setText("$ 150");
        onefiftyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onefiftyBtnActionPerformed(evt);
            }
        });

        amountTF.setText(" ");

        frequencyCombobox.setForeground(new java.awt.Color(0, 0, 102));
        frequencyCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Bi Weekly", "Monthly", "Quarterly", "Yearly", "One Time" }));
        frequencyCombobox.setActionCommand("");
        frequencyCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyComboboxActionPerformed(evt);
            }
        });

        menuItemName6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName6.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName6.setText("Frequency");

        createDonationBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        createDonationBtn.setForeground(new java.awt.Color(0, 0, 102));
        createDonationBtn.setText("Make Donation");
        createDonationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDonationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deliveryDirLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(hundBtn)
                                .addGap(18, 18, 18)
                                .addComponent(onefiftyBtn)
                                .addGap(18, 18, 18)
                                .addComponent(twoHundBtn)
                                .addGap(18, 18, 18)
                                .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(menuItemName1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createDonationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(menuItemName6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(frequencyCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deliveryDirLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItemName1)
                .addGap(11, 11, 11)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(onefiftyBtn)
                        .addComponent(twoHundBtn))
                    .addComponent(hundBtn))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frequencyCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemName6))
                .addGap(35, 35, 35)
                .addComponent(createDonationBtn)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        donationTabbedPane.addTab("New Donation", menuPanel);

        propertyComboBox.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        propertyComboBox.setForeground(new java.awt.Color(0, 0, 102));
        propertyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Charity Name", "City", "Charity Cause" }));
        propertyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyComboBoxActionPerformed(evt);
            }
        });

        searchHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchHeaderLabel.setText("Select property to filter out records");

        propertyValueTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        propertyValueTextField.setForeground(new java.awt.Color(0, 0, 102));
        propertyValueTextField.setText(" ");

        donationListSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        donationListSearchButton.setForeground(new java.awt.Color(0, 0, 102));
        donationListSearchButton.setText("Search");
        donationListSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationListSearchButtonActionPerformed(evt);
            }
        });

        resetTableButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        resetTableButton.setForeground(new java.awt.Color(0, 0, 102));
        resetTableButton.setText("Reset");
        resetTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTableButtonActionPerformed(evt);
            }
        });

        searchDonationCatalogTable.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        searchDonationCatalogTable.setForeground(new java.awt.Color(0, 0, 102));
        searchDonationCatalogTable.setModel(donationHistoryTableModel);
        searchDonationCatalogTable.setRowHeight(40);
        searchCarCatalogScrollPanel.setViewportView(searchDonationCatalogTable);

        userAccLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        userAccLabel.setForeground(new java.awt.Color(0, 0, 102));
        userAccLabel.setText(" ");

        helpTextLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helpTextLabel.setForeground(new java.awt.Color(0, 0, 102));
        helpTextLabel.setText(" ");

        deliveryDirLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel5.setForeground(new java.awt.Color(0, 0, 102));
        deliveryDirLabel5.setText("Donation History");

        javax.swing.GroupLayout manageOrdersTabLayout = new javax.swing.GroupLayout(manageOrdersTab);
        manageOrdersTab.setLayout(manageOrdersTabLayout);
        manageOrdersTabLayout.setHorizontalGroup(
            manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(helpTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                                .addComponent(propertyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(propertyValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(donationListSearchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetTableButton))
                            .addComponent(searchHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userAccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(manageOrdersTabLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(deliveryDirLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(965, Short.MAX_VALUE)))
        );
        manageOrdersTabLayout.setVerticalGroup(
            manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(userAccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(searchHeaderLabel)
                .addGap(18, 18, 18)
                .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(donationListSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(propertyComboBox)
                        .addComponent(propertyValueTextField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(manageOrdersTabLayout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(deliveryDirLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(699, Short.MAX_VALUE)))
        );

        donationTabbedPane.addTab("Donation History", manageOrdersTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(donationTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(donationTabbedPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void propertyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyComboBoxActionPerformed
        // TODO add your handling code here:

        String propertyLabel = ((Object)propertyComboBox.getSelectedItem()).toString();
        String propertyName = ((Object)propertyComboBox.getSelectedItem()).toString();
        propertyValueTextField.setText("");

        helpTextLabel.setText("");
        switch (propertyName) {
            case "charityName": helpTextLabel.setText("Please type in valid charity name. Any other value would result in invalid filters."); break;
            case "charityCause": helpTextLabel.setText("Acceptable values: X1, X2 etc.");break;
 
        }

    }//GEN-LAST:event_propertyComboBoxActionPerformed

    private void donationListSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationListSearchButtonActionPerformed
        // TODO add your handling code here:

        String propertyLabel = ((Object)propertyComboBox.getSelectedItem()).toString();

        String filterPropertyValue = propertyValueTextField.getText();
        
        if (propertyLabel.equals("Charity Name")) {
            populateDonationHistoryTableWithCharityName(filterPropertyValue);
        
        } else if (propertyLabel.equals("City")) {
            populateDonationHistoryTableWithCharityCity(filterPropertyValue);
        
        } else if (propertyLabel.equals("Charity Cause")) {
            populateDonationHistoryTableWithCharityCause(filterPropertyValue);
        }

    }//GEN-LAST:event_donationListSearchButtonActionPerformed

    private void resetTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTableButtonActionPerformed
        // TODO add your handling code here:
       // populateSearchTableHistory(carCatalog.getCars());
       populateDonationHistoryTable();
    }//GEN-LAST:event_resetTableButtonActionPerformed

    private void frequencyComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequencyComboboxActionPerformed

    private void hundBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hundBtnActionPerformed
        // TODO add your handling code here:
        amountTF.setText("100.0");
    }//GEN-LAST:event_hundBtnActionPerformed

    private void onefiftyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onefiftyBtnActionPerformed
        // TODO add your handling code here:
        amountTF.setText("150.0");
    }//GEN-LAST:event_onefiftyBtnActionPerformed

    private void twoHundBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoHundBtnActionPerformed
        // TODO add your handling code here:
        amountTF.setText("200.0");
    }//GEN-LAST:event_twoHundBtnActionPerformed

    private void createDonationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDonationBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = charityDirTable.getSelectedRow();
        
          try
            {
                float am = Float.parseFloat(amountTF.getText().trim());
                if(amountTF.getText() != "" || amountTF.getText() != null)
                {
                    FundsInfo fundInfo = ecoSystem.getDonationDirectory().newDonation();
                    fundInfo.setDonationDate(new Date());
                    fundInfo.setFundsOrgName(charityDirTable.getValueAt(selectedRow, 0).toString());
                    fundInfo.setFundsOrgCity(charityDirTable.getValueAt(selectedRow, 1).toString());
                    fundInfo.setDonation(amountTF.getText());
                    fundInfo.setFrequencyType(((Object)frequencyCombobox.getSelectedItem()).toString());
                    fundInfo.setDonor(ecoSystem.getDonorDir().getDonor(userAccount.getUsername()));


                    fundInfo.setFundsCause(Objects.isNull(charityDirTable.getValueAt(selectedRow, 2)) ? " " : charityDirTable.getValueAt(selectedRow, 2).toString());
                   

                    String body = "Hi " + fundInfo.getDonor().getDonorName() +",\n $  " + amountTF.getText() + "was donated to organization " + fundInfo.getFundsOrgName() + "\n You have made a meaningful contribution. \n  " + " \n Frequency of donor:  " + fundInfo.getFrequencyType() + "\n Donation Cause  : " + fundInfo.getFundsCause() + "\n\n\n Thanks, \n Team MediStop";
                    JOptionPane.showMessageDialog(null, body, "Success", JOptionPane.INFORMATION_MESSAGE);

                    String subject = " Receipt of your donation! ";

                    try {
                        SendEmailUtility.sendEmail(subject, Utilities.email, Utilities.password, body, new String[]{fundInfo.getDonor().getEmail()});
                    } catch (Exception e) {

                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Something went wrong!", "Error", JOptionPane.INFORMATION_MESSAGE);

                    }


                    populateDonationHistoryTable();

                    amountTF.setText("");
                }
            
                else
                {
                    JOptionPane.showMessageDialog(null, " Incorrect amount added. Please correct it! ", "Error! ", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Incorrect amount added. Please correct it!", "Error", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_createDonationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTF;
    private javax.swing.JTable charityDirTable;
    private javax.swing.JButton createDonationBtn;
    private javax.swing.JScrollPane delDirectoryScollPanel;
    private javax.swing.JLabel deliveryDirLabel;
    private javax.swing.JLabel deliveryDirLabel2;
    private javax.swing.JLabel deliveryDirLabel3;
    private javax.swing.JLabel deliveryDirLabel5;
    private javax.swing.JButton donationListSearchButton;
    private javax.swing.JTabbedPane donationTabbedPane;
    private javax.swing.JComboBox<String> frequencyCombobox;
    private javax.swing.JLabel helpTextLabel;
    private javax.swing.JButton hundBtn;
    private javax.swing.JPanel manageOrdersTab;
    private javax.swing.JLabel menuItemName1;
    private javax.swing.JLabel menuItemName6;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton onefiftyBtn;
    private javax.swing.JComboBox<String> propertyComboBox;
    private javax.swing.JTextField propertyValueTextField;
    private javax.swing.JButton resetTableButton;
    private javax.swing.JScrollPane searchCarCatalogScrollPanel;
    private javax.swing.JTable searchDonationCatalogTable;
    private javax.swing.JLabel searchHeaderLabel;
    private javax.swing.JButton twoHundBtn;
    private javax.swing.JLabel userAccLabel;
    // End of variables declaration//GEN-END:variables

}
