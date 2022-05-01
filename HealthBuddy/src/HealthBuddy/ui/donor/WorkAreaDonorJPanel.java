package HealthBuddy.ui.donor;

import HealthBuddy.models.User.User;
import HealthBuddy.models.EcoSystem;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Trust.Donation.TrustDetails;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.UserData.DonorData;
import HealthBuddy.Util.SMSUtility;
import HealthBuddy.Util.SendEmailUtility;
import HealthBuddy.Util.Utilities;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author Dimple Patel
 */
public class WorkAreaDonorJPanel extends javax.swing.JPanel {
    private User userAccount;
    private EcoSystem ecoSystem;
    private DonorData donorData;

    DefaultTableModel charityDirectoryTableModel;
    DefaultTableModel donationHistoryTableModel;
    

    /** Creates new form DonorWorkAreaPanel */
    public WorkAreaDonorJPanel(EcoSystem ecoSys,User userAcc) {
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

            List<Enterprise> charityList = net.getEnterpriseCatalog().getEnterpriseList().stream()
                    .filter(enterprise ->
                            enterprise.getEnterpriseClassification().equals(Enterprise.EnterpriseClassification.Trust))
                    .collect(Collectors.toList());

            for (Enterprise enterprise: charityList) {

                String[] rowData = {enterprise.getName(), networkName, enterprise.getCause()};

                charityModel.addRow(rowData);
            }
        }
    }
    
    
    public void populateDonationHistoryTable() {

        List<TrustDetails> donorData = ecoSystem.getDonationDirectory().getTrustDetailsForADonor(userAccount.getUsername());
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable.getModel();
        
        appointmentHisTable.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        for (TrustDetails fundInfo: donorData) {

            String[] rowData = {fundInfo.geTrustOrgName(), fundInfo.geTrustOrgCity(),
                    fundInfo.geTrustCause(), fundInfo.getFrequencyType(), fundInfo.getDonation(),
                    formatter.format(fundInfo.getDonationDate())
            };

            appointmentHisTable.addRow(rowData);
        }
        
        
                
        
    
    }
    
    public void populateDonationHistoryTableWithCharityName(String charityname) {

        List<TrustDetails> donorData = ecoSystem.getDonationDirectory().getTrustDetailsForACharityName(charityname);
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable.getModel();
        
        appointmentHisTable.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        for (TrustDetails fundInfo: donorData) {

            String[] rowData = {fundInfo.geTrustOrgName(), fundInfo.geTrustOrgCity(),
                    fundInfo.geTrustCause(), fundInfo.getFrequencyType(), fundInfo.getDonation(),
                    formatter.format(fundInfo.getDonationDate())
            };
            appointmentHisTable.addRow(rowData);
        }
    }
    
    
     public void populateDonationHistoryTableWithCharityCause(String cause) {

        List<TrustDetails> donorData = ecoSystem.getDonationDirectory().getTrustDetailsForACharityCause(cause);
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable.getModel();
        
        appointmentHisTable.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        for (TrustDetails fundInfo: donorData) {

            String[] rowData = {fundInfo.geTrustOrgName(), fundInfo.geTrustOrgCity(),
                    fundInfo.geTrustCause(), fundInfo.getFrequencyType(), fundInfo.getDonation(),
                    formatter.format(fundInfo.getDonationDate())
            };

            appointmentHisTable.addRow(rowData);
        }
   }
     
    public void populateDonationHistoryTableWithCharityCity(String city) {

        List<TrustDetails> donorData = ecoSystem.getDonationDirectory().getTrustDetailsForACharityCity(city);
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable.getModel();
        
        appointmentHisTable.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        for (TrustDetails fundInfo: donorData) {

            String[] rowData = {fundInfo.geTrustOrgName(), fundInfo.geTrustOrgCity(),
                    fundInfo.geTrustCause(), fundInfo.getFrequencyType(), fundInfo.getDonation(),
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
        jLabel2 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        donationTabbedPane.setBackground(new java.awt.Color(0, 102, 102));
        donationTabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        donationTabbedPane.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

        deliveryDirLabel.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deliveryDirLabel.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel.setText("100% of your donation will help a patient in need ...");

        charityDirTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        charityDirTable.setForeground(new java.awt.Color(0, 102, 102));
        charityDirTable.setModel(charityDirectoryTableModel);
        charityDirTable.setRowHeight(40);
        delDirectoryScollPanel.setViewportView(charityDirTable);

        menuItemName1.setBackground(new java.awt.Color(255, 255, 255));
        menuItemName1.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        menuItemName1.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName1.setText("Donation Amount");

        deliveryDirLabel2.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deliveryDirLabel2.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel2.setText("Charity Directory");

        deliveryDirLabel3.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deliveryDirLabel3.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel3.setText("DONATE, Save Lives!");

        twoHundBtn.setBackground(new java.awt.Color(0, 102, 102));
        twoHundBtn.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        twoHundBtn.setForeground(new java.awt.Color(255, 255, 255));
        twoHundBtn.setText("$ 200");
        twoHundBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        twoHundBtn.setBorderPainted(false);
        twoHundBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoHundBtnActionPerformed(evt);
            }
        });

        hundBtn.setBackground(new java.awt.Color(0, 102, 102));
        hundBtn.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        hundBtn.setForeground(new java.awt.Color(255, 255, 255));
        hundBtn.setText("$ 100");
        hundBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hundBtn.setBorderPainted(false);
        hundBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundBtnActionPerformed(evt);
            }
        });

        onefiftyBtn.setBackground(new java.awt.Color(0, 102, 102));
        onefiftyBtn.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        onefiftyBtn.setForeground(new java.awt.Color(255, 255, 255));
        onefiftyBtn.setText("$ 150");
        onefiftyBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        onefiftyBtn.setBorderPainted(false);
        onefiftyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onefiftyBtnActionPerformed(evt);
            }
        });

        amountTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amountTF.setForeground(new java.awt.Color(0, 102, 102));
        amountTF.setText(" ");

        frequencyCombobox.setBackground(new java.awt.Color(255, 255, 255));
        frequencyCombobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        frequencyCombobox.setForeground(new java.awt.Color(0, 102, 102));
        frequencyCombobox.setMaximumRowCount(10);
        frequencyCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Bi Weekly", "Monthly", "Quarterly", "Yearly", "One Time" }));
        frequencyCombobox.setActionCommand("");
        frequencyCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyComboboxActionPerformed(evt);
            }
        });

        menuItemName6.setBackground(new java.awt.Color(255, 255, 255));
        menuItemName6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName6.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName6.setText("Frequency");

        createDonationBtn.setBackground(new java.awt.Color(0, 102, 102));
        createDonationBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        createDonationBtn.setForeground(new java.awt.Color(255, 255, 255));
        createDonationBtn.setText("Make Donation");
        createDonationBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createDonationBtn.setBorderPainted(false);
        createDonationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDonationBtnActionPerformed(evt);
            }
        });

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/newdonation.gif")).getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT));

        jLabel2.setIcon(imageIcon);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deliveryDirLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menuItemName1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(menuPanelLayout.createSequentialGroup()
                                                .addComponent(hundBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(onefiftyBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(twoHundBtn))
                                            .addComponent(menuItemName6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(frequencyCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createDonationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(deliveryDirLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(menuItemName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(onefiftyBtn)
                                .addComponent(twoHundBtn))
                            .addComponent(hundBtn))
                        .addGap(18, 18, 18)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frequencyCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemName6))))
                .addGap(3, 3, 3)
                .addComponent(createDonationBtn)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        donationTabbedPane.addTab("New Donation", menuPanel);

        manageOrdersTab.setBackground(new java.awt.Color(255, 255, 255));
        manageOrdersTab.setForeground(new java.awt.Color(0, 102, 102));

        propertyComboBox.setBackground(new java.awt.Color(255, 255, 255));
        propertyComboBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        propertyComboBox.setForeground(new java.awt.Color(0, 102, 102));
        propertyComboBox.setMaximumRowCount(12);
        propertyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Charity Name", "City", "Charity Cause" }));
        propertyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyComboBoxActionPerformed(evt);
            }
        });

        searchHeaderLabel.setBackground(new java.awt.Color(255, 255, 255));
        searchHeaderLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchHeaderLabel.setForeground(new java.awt.Color(0, 102, 102));
        searchHeaderLabel.setText("Select property to filter out records");

        propertyValueTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        propertyValueTextField.setForeground(new java.awt.Color(0, 102, 102));
        propertyValueTextField.setText(" ");

        donationListSearchButton.setBackground(new java.awt.Color(0, 102, 102));
        donationListSearchButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        donationListSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        donationListSearchButton.setText("Search");
        donationListSearchButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        donationListSearchButton.setBorderPainted(false);
        donationListSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationListSearchButtonActionPerformed(evt);
            }
        });

        resetTableButton.setBackground(new java.awt.Color(0, 102, 102));
        resetTableButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        resetTableButton.setForeground(new java.awt.Color(255, 255, 255));
        resetTableButton.setText("Reset");
        resetTableButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetTableButton.setBorderPainted(false);
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

        userAccLabel.setBackground(new java.awt.Color(255, 255, 255));
        userAccLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userAccLabel.setForeground(new java.awt.Color(0, 102, 102));
        userAccLabel.setText(" ");

        helpTextLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helpTextLabel.setForeground(new java.awt.Color(0, 0, 102));
        helpTextLabel.setText(" ");

        deliveryDirLabel5.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deliveryDirLabel5.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel5.setText("Donation History");

        ImageIcon imageIcona = new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/search.gif")).getImage().getScaledInstance(650, 550, Image.SCALE_DEFAULT));

        jLabel1.setIcon(imageIcona);

        javax.swing.GroupLayout manageOrdersTabLayout = new javax.swing.GroupLayout(manageOrdersTab);
        manageOrdersTab.setLayout(manageOrdersTabLayout);
        manageOrdersTabLayout.setHorizontalGroup(
            manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userAccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                                .addGap(677, 677, 677)
                                .addComponent(helpTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                                        .addComponent(propertyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(propertyValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(donationListSearchButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(resetTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deliveryDirLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        manageOrdersTabLayout.setVerticalGroup(
            manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(userAccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addComponent(deliveryDirLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchHeaderLabel)
                        .addGap(18, 18, 18)
                        .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                                .addComponent(donationListSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45))
                            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                                .addComponent(resetTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45))
                            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                                .addComponent(propertyValueTextField)
                                .addGap(42, 42, 42))
                            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                                .addComponent(propertyComboBox)
                                .addGap(45, 45, 45)))
                        .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(helpTextLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    TrustDetails fundInfo = ecoSystem.getDonationDirectory().newDonation();
                    fundInfo.setDonationDate(new Date());
                    fundInfo.seTrustOrgName(charityDirTable.getValueAt(selectedRow, 0).toString());
                    fundInfo.seTrustOrgCity(charityDirTable.getValueAt(selectedRow, 1).toString());
                    fundInfo.setDonation(amountTF.getText());
                    fundInfo.setFrequencyType(((Object)frequencyCombobox.getSelectedItem()).toString());
                    fundInfo.setDonor(ecoSystem.getDonorDir().getDonor(userAccount.getUsername()));


                    fundInfo.seTrustCause(Objects.isNull(charityDirTable.getValueAt(selectedRow, 2)) ? " " : charityDirTable.getValueAt(selectedRow, 2).toString());
                   

                    String body = "Hi " + fundInfo.getDonor().getDonorName() +",\n $  " + amountTF.getText() + "was donated to organization " + fundInfo.geTrustOrgName()+ "\n You have made a meaningful contribution. \n  " + " \n Frequency of donor:  " + fundInfo.getFrequencyType() + "\n Donation Cause  : " + fundInfo.geTrustCause()+ "\n\n\n Thanks, \n Team MediStop";
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
