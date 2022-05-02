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
import HealthBuddy.Config.SMSUtility;
import HealthBuddy.Config.SendEmailUtility;
import HealthBuddy.Config.Config;
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

        userAccLabel9.setText("Hi  " + donorData.getDonorName());
        setSize(1540,800);
    }
    
    public void initCharityDirTableModel() {
        charityDirectoryTableModel = new DefaultTableModel();
        charityDirectoryTableModel.addColumn("Charity Name");
        charityDirectoryTableModel.addColumn("City");
        charityDirectoryTableModel.addColumn("Charity Cause");
    }
    
    
    public void populateCharityTable()
    {
        DefaultTableModel charityModel = (DefaultTableModel) charityDirTable9.getModel();

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
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable9.getModel();
        
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
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable9.getModel();
        
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
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable9.getModel();
        
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
        DefaultTableModel appointmentHisTable = (DefaultTableModel) searchDonationCatalogTable9.getModel();
        
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

        donationTabbedPane9 = new javax.swing.JTabbedPane();
        menuPanel9 = new javax.swing.JPanel();
        deliveryDirLabel9 = new javax.swing.JLabel();
        delDirectoryScollPanel9 = new javax.swing.JScrollPane();
        charityDirTable9 = new javax.swing.JTable();
        menuItemName19 = new javax.swing.JLabel();
        deliveryDirLabel29 = new javax.swing.JLabel();
        deliveryDirLabel39 = new javax.swing.JLabel();
        twoHundBtn9 = new javax.swing.JButton();
        hundBtn9 = new javax.swing.JButton();
        onefiftyBtn9 = new javax.swing.JButton();
        amountTF9 = new javax.swing.JTextField();
        frequencyCombobox9 = new javax.swing.JComboBox<>();
        menuItemName69 = new javax.swing.JLabel();
        createDonationBtn9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        manageOrdersTab9 = new javax.swing.JPanel();
        propertyComboBox9 = new javax.swing.JComboBox<>();
        searchHeaderLabel9 = new javax.swing.JLabel();
        propertyValueTextField9 = new javax.swing.JTextField();
        donationListSearchButton9 = new javax.swing.JButton();
        resetTableButton9 = new javax.swing.JButton();
        searchCarCatalogScrollPanel9 = new javax.swing.JScrollPane();
        searchDonationCatalogTable9 = new javax.swing.JTable();
        userAccLabel9 = new javax.swing.JLabel();
        helpTextLabel9 = new javax.swing.JLabel();
        deliveryDirLabel59 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        donationTabbedPane9.setBackground(new java.awt.Color(0, 102, 102));
        donationTabbedPane9.setForeground(new java.awt.Color(255, 255, 255));
        donationTabbedPane9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        menuPanel9.setBackground(new java.awt.Color(255, 255, 255));

        deliveryDirLabel9.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deliveryDirLabel9.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel9.setText("Giving a Little is Better than Not Giving at ALL !!");

        charityDirTable9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        charityDirTable9.setForeground(new java.awt.Color(0, 102, 102));
        charityDirTable9.setModel(charityDirectoryTableModel);
        charityDirTable9.setRowHeight(40);
        delDirectoryScollPanel9.setViewportView(charityDirTable9);

        menuItemName19.setBackground(new java.awt.Color(255, 255, 255));
        menuItemName19.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        menuItemName19.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName19.setText("Donation Amount");

        deliveryDirLabel29.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deliveryDirLabel29.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel29.setText("Charity Catalog");

        deliveryDirLabel39.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deliveryDirLabel39.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel39.setText("Contribute, make a Difference..");

        twoHundBtn9.setBackground(new java.awt.Color(0, 102, 102));
        twoHundBtn9.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        twoHundBtn9.setForeground(new java.awt.Color(255, 255, 255));
        twoHundBtn9.setText("$ 200");
        twoHundBtn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        twoHundBtn9.setBorderPainted(false);
        twoHundBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoHundBtn9ActionPerformed(evt);
            }
        });

        hundBtn9.setBackground(new java.awt.Color(0, 102, 102));
        hundBtn9.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        hundBtn9.setForeground(new java.awt.Color(255, 255, 255));
        hundBtn9.setText("$ 100");
        hundBtn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hundBtn9.setBorderPainted(false);
        hundBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundBtn9ActionPerformed(evt);
            }
        });

        onefiftyBtn9.setBackground(new java.awt.Color(0, 102, 102));
        onefiftyBtn9.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        onefiftyBtn9.setForeground(new java.awt.Color(255, 255, 255));
        onefiftyBtn9.setText("$ 150");
        onefiftyBtn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        onefiftyBtn9.setBorderPainted(false);
        onefiftyBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onefiftyBtn9ActionPerformed(evt);
            }
        });

        amountTF9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amountTF9.setForeground(new java.awt.Color(0, 102, 102));
        amountTF9.setText(" ");

        frequencyCombobox9.setBackground(new java.awt.Color(255, 255, 255));
        frequencyCombobox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        frequencyCombobox9.setForeground(new java.awt.Color(0, 102, 102));
        frequencyCombobox9.setMaximumRowCount(10);
        frequencyCombobox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Bi Weekly", "Monthly", "Quarterly", "Yearly", "One Time" }));
        frequencyCombobox9.setActionCommand("");
        frequencyCombobox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyCombobox9ActionPerformed(evt);
            }
        });

        menuItemName69.setBackground(new java.awt.Color(255, 255, 255));
        menuItemName69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName69.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName69.setText("Frequency");

        createDonationBtn9.setBackground(new java.awt.Color(0, 102, 102));
        createDonationBtn9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        createDonationBtn9.setForeground(new java.awt.Color(255, 255, 255));
        createDonationBtn9.setText("Make Donation");
        createDonationBtn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createDonationBtn9.setBorderPainted(false);
        createDonationBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDonationBtn9ActionPerformed(evt);
            }
        });

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/newdonation.gif")).getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT));

        jLabel2.setIcon(imageIcon);

        javax.swing.GroupLayout menuPanel9Layout = new javax.swing.GroupLayout(menuPanel9);
        menuPanel9.setLayout(menuPanel9Layout);
        menuPanel9Layout.setHorizontalGroup(
            menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanel9Layout.createSequentialGroup()
                        .addGroup(menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemName19, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delDirectoryScollPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuPanel9Layout.createSequentialGroup()
                                .addGroup(menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(menuPanel9Layout.createSequentialGroup()
                                        .addComponent(hundBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(onefiftyBtn9)
                                        .addGap(18, 18, 18)
                                        .addComponent(twoHundBtn9))
                                    .addComponent(menuItemName69, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(frequencyCombobox9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountTF9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(deliveryDirLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveryDirLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deliveryDirLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createDonationBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        menuPanel9Layout.setVerticalGroup(
            menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(deliveryDirLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanel9Layout.createSequentialGroup()
                        .addComponent(deliveryDirLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(deliveryDirLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delDirectoryScollPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(menuItemName19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amountTF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(onefiftyBtn9)
                                .addComponent(twoHundBtn9))
                            .addComponent(hundBtn9))
                        .addGap(18, 18, 18)
                        .addGroup(menuPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frequencyCombobox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemName69))))
                .addGap(3, 3, 3)
                .addComponent(createDonationBtn9)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        donationTabbedPane9.addTab("New Donation", menuPanel9);

        manageOrdersTab9.setBackground(new java.awt.Color(255, 255, 255));
        manageOrdersTab9.setForeground(new java.awt.Color(0, 102, 102));

        propertyComboBox9.setBackground(new java.awt.Color(255, 255, 255));
        propertyComboBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertyComboBox9.setForeground(new java.awt.Color(0, 102, 102));
        propertyComboBox9.setMaximumRowCount(12);
        propertyComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Charity Name", "City", "Charity Cause" }));
        propertyComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyComboBox9ActionPerformed(evt);
            }
        });

        searchHeaderLabel9.setBackground(new java.awt.Color(255, 255, 255));
        searchHeaderLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchHeaderLabel9.setForeground(new java.awt.Color(0, 102, 102));
        searchHeaderLabel9.setText("Select property to filter out records");

        propertyValueTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        propertyValueTextField9.setForeground(new java.awt.Color(0, 102, 102));
        propertyValueTextField9.setText(" ");

        donationListSearchButton9.setBackground(new java.awt.Color(0, 102, 102));
        donationListSearchButton9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        donationListSearchButton9.setForeground(new java.awt.Color(255, 255, 255));
        donationListSearchButton9.setText("Search");
        donationListSearchButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        donationListSearchButton9.setBorderPainted(false);
        donationListSearchButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationListSearchButton9ActionPerformed(evt);
            }
        });

        resetTableButton9.setBackground(new java.awt.Color(0, 102, 102));
        resetTableButton9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        resetTableButton9.setForeground(new java.awt.Color(255, 255, 255));
        resetTableButton9.setText("Reset");
        resetTableButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetTableButton9.setBorderPainted(false);
        resetTableButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTableButton9ActionPerformed(evt);
            }
        });

        searchDonationCatalogTable9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchDonationCatalogTable9.setForeground(new java.awt.Color(0, 102, 102));
        searchDonationCatalogTable9.setModel(donationHistoryTableModel);
        searchDonationCatalogTable9.setRowHeight(40);
        searchDonationCatalogTable9.setSelectionBackground(new java.awt.Color(0, 102, 102));
        searchCarCatalogScrollPanel9.setViewportView(searchDonationCatalogTable9);

        userAccLabel9.setBackground(new java.awt.Color(255, 255, 255));
        userAccLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userAccLabel9.setForeground(new java.awt.Color(0, 102, 102));
        userAccLabel9.setText(" ");

        helpTextLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helpTextLabel9.setForeground(new java.awt.Color(0, 0, 102));
        helpTextLabel9.setText(" ");

        deliveryDirLabel59.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel59.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deliveryDirLabel59.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel59.setText("Donation History");

        ImageIcon imageIcona = new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/search.gif")).getImage().getScaledInstance(650, 550, Image.SCALE_DEFAULT));

        jLabel1.setIcon(imageIcona);

        javax.swing.GroupLayout manageOrdersTab9Layout = new javax.swing.GroupLayout(manageOrdersTab9);
        manageOrdersTab9.setLayout(manageOrdersTab9Layout);
        manageOrdersTab9Layout.setHorizontalGroup(
            manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                        .addGroup(manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userAccLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                                .addGap(677, 677, 677)
                                .addComponent(helpTextLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                        .addGroup(manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchCarCatalogScrollPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                                        .addComponent(propertyComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(propertyValueTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(donationListSearchButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(resetTableButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deliveryDirLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchHeaderLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        manageOrdersTab9Layout.setVerticalGroup(
            manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(userAccLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                        .addComponent(deliveryDirLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchHeaderLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageOrdersTab9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(donationListSearchButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(resetTableButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(propertyValueTextField9)
                            .addComponent(propertyComboBox9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(45, 45, 45)
                        .addComponent(searchCarCatalogScrollPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(manageOrdersTab9Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(helpTextLabel9)
                .addContainerGap())
        );

        donationTabbedPane9.addTab("Donation History", manageOrdersTab9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(donationTabbedPane9)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(donationTabbedPane9)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void propertyComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyComboBox9ActionPerformed
        // TODO add your handling code here:

        String propertyLabel = ((Object)propertyComboBox9.getSelectedItem()).toString();
        String propertyName = ((Object)propertyComboBox9.getSelectedItem()).toString();
        propertyValueTextField9.setText("");

        helpTextLabel9.setText("");
        switch (propertyName) {
            case "charityName": helpTextLabel9.setText("Please type in valid charity name. Any other value would result in invalid filters."); break;
            case "charityCause": helpTextLabel9.setText("Acceptable values: X1, X2 etc.");break;
 
        }

    }//GEN-LAST:event_propertyComboBox9ActionPerformed

    private void donationListSearchButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationListSearchButton9ActionPerformed
        // TODO add your handling code here:

        String propertyLabel = ((Object)propertyComboBox9.getSelectedItem()).toString();

        String filterPropertyValue = propertyValueTextField9.getText();
        
        if (propertyLabel.equals("Charity Name")) {
            populateDonationHistoryTableWithCharityName(filterPropertyValue);
        
        } else if (propertyLabel.equals("City")) {
            populateDonationHistoryTableWithCharityCity(filterPropertyValue);
        
        } else if (propertyLabel.equals("Charity Cause")) {
            populateDonationHistoryTableWithCharityCause(filterPropertyValue);
        }

    }//GEN-LAST:event_donationListSearchButton9ActionPerformed

    private void resetTableButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTableButton9ActionPerformed
        // TODO add your handling code here:
       // populateSearchTableHistory(carCatalog.getCars());
       populateDonationHistoryTable();
    }//GEN-LAST:event_resetTableButton9ActionPerformed

    private void frequencyCombobox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyCombobox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequencyCombobox9ActionPerformed

    private void hundBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hundBtn9ActionPerformed
        // TODO add your handling code here:
        amountTF9.setText("100.0");
    }//GEN-LAST:event_hundBtn9ActionPerformed

    private void onefiftyBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onefiftyBtn9ActionPerformed
        // TODO add your handling code here:
        amountTF9.setText("150.0");
    }//GEN-LAST:event_onefiftyBtn9ActionPerformed

    private void twoHundBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoHundBtn9ActionPerformed
        // TODO add your handling code here:
        amountTF9.setText("200.0");
    }//GEN-LAST:event_twoHundBtn9ActionPerformed

    private void createDonationBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDonationBtn9ActionPerformed
        // TODO add your handling code here:
        int selectedRow = charityDirTable9.getSelectedRow();
        
          try
            {
                float am = Float.parseFloat(amountTF9.getText().trim());
                if(amountTF9.getText() != "" || amountTF9.getText() != null)
                {
                    TrustDetails fundInfo = ecoSystem.getDonationDirectory().newDonation();
                    fundInfo.setDonationDate(new Date());
                    fundInfo.seTrustOrgName(charityDirTable9.getValueAt(selectedRow, 0).toString());
                    fundInfo.seTrustOrgCity(charityDirTable9.getValueAt(selectedRow, 1).toString());
                    fundInfo.setDonation(amountTF9.getText());
                    fundInfo.setFrequencyType(((Object)frequencyCombobox9.getSelectedItem()).toString());
                    fundInfo.setDonor(ecoSystem.getDonorDir().getDonor(userAccount.getUsername()));


                    fundInfo.seTrustCause(Objects.isNull(charityDirTable9.getValueAt(selectedRow, 2)) ? " " : charityDirTable9.getValueAt(selectedRow, 2).toString());
                   

                    String body = "Hey " + fundInfo.getDonor().getDonorName() +",\n Contribution of $" + amountTF9.getText() + "was made towards " + fundInfo.geTrustOrgName()+ "\n We appreciate your donation! Your contribution will help us change lives – literally!\n  " + " \n Donation frequency:  " + fundInfo.getFrequencyType() + "\n Donation Cause  : " + fundInfo.geTrustCause()+ "\n\n\n Thank you and best regards, \n HealthBuddy Team";
                    JOptionPane.showMessageDialog(null, body, "Success", JOptionPane.INFORMATION_MESSAGE);

                    String subject = " Receipt of your donation! ";

                    try {
                        SendEmailUtility.sendEmail(subject, Config.emailId, Config.password, body, new String[]{fundInfo.getDonor().getEmail()});
                    } catch (Exception e) {

                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Looks like Something is wrong!", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                    populateDonationHistoryTable();
                    amountTF9.setText("");
                }
            
                else
                {
                    JOptionPane.showMessageDialog(null, " Added amount is Incorrect. Kindly correct it! ", "Error! ", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Added Amount is Incorrect. Kindly correct it!", "Error", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_createDonationBtn9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTF9;
    private javax.swing.JTable charityDirTable9;
    private javax.swing.JButton createDonationBtn9;
    private javax.swing.JScrollPane delDirectoryScollPanel9;
    private javax.swing.JLabel deliveryDirLabel29;
    private javax.swing.JLabel deliveryDirLabel39;
    private javax.swing.JLabel deliveryDirLabel59;
    private javax.swing.JLabel deliveryDirLabel9;
    private javax.swing.JButton donationListSearchButton9;
    private javax.swing.JTabbedPane donationTabbedPane9;
    private javax.swing.JComboBox<String> frequencyCombobox9;
    private javax.swing.JLabel helpTextLabel9;
    private javax.swing.JButton hundBtn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel manageOrdersTab9;
    private javax.swing.JLabel menuItemName19;
    private javax.swing.JLabel menuItemName69;
    private javax.swing.JPanel menuPanel9;
    private javax.swing.JButton onefiftyBtn9;
    private javax.swing.JComboBox<String> propertyComboBox9;
    private javax.swing.JTextField propertyValueTextField9;
    private javax.swing.JButton resetTableButton9;
    private javax.swing.JScrollPane searchCarCatalogScrollPanel9;
    private javax.swing.JTable searchDonationCatalogTable9;
    private javax.swing.JLabel searchHeaderLabel9;
    private javax.swing.JButton twoHundBtn9;
    private javax.swing.JLabel userAccLabel9;
    // End of variables declaration//GEN-END:variables

}
