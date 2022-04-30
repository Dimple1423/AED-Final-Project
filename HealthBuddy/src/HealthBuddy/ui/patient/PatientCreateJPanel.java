package HealthBuddy.ui.patient;

import java.awt.CardLayout;
import HealthBuddy.ui.donor.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.filechooser.FileSystemView;
import javax.swing.ImageIcon;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.UserData.DonorData;
import HealthBuddy.models.UserData.DonorCatalog;
import HealthBuddy.models.UserData.PatientData;
import HealthBuddy.models.UserData.PatientCatalog;
import HealthBuddy.Util.OTPUtility;
import HealthBuddy.Util.SMSUtility;
import HealthBuddy.Util.SendEmailUtility;
import HealthBuddy.Util.Utilities;

/**
 *
 * @author Dimple Patel
 */
public class PatientCreateJPanel extends javax.swing.JPanel {
    
    private JPanel bodyPanel;
    private EcoSystem ecosystem;
    private PatientCatalog patientDirectoy;

    /** Creates new form DonorForm */
    public PatientCreateJPanel(JPanel bodyPanel, EcoSystem ecosystem) {
        initComponents();
        this.bodyPanel = bodyPanel;
        this.ecosystem = ecosystem;
        setSize(1540,830);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deliveryDirLabel = new javax.swing.JLabel();
        deliveryDirLabel1 = new javax.swing.JLabel();
        deliveryDirLabel2 = new javax.swing.JLabel();
        menuItemName = new javax.swing.JLabel();
        donorNameTF = new javax.swing.JTextField();
        menuItemName1 = new javax.swing.JLabel();
        maleRB = new javax.swing.JRadioButton();
        femaleRB = new javax.swing.JRadioButton();
        notToSayRB = new javax.swing.JRadioButton();
        biRB = new javax.swing.JRadioButton();
        dobTF = new javax.swing.JTextField();
        menuItemName2 = new javax.swing.JLabel();
        menuItemName3 = new javax.swing.JLabel();
        addTF = new javax.swing.JTextField();
        menuItemName4 = new javax.swing.JLabel();
        cityTF = new javax.swing.JTextField();
        menuItemName5 = new javax.swing.JLabel();
        stateCombobox = new javax.swing.JComboBox<>();
        menuItemName6 = new javax.swing.JLabel();
        zipCodeTF = new javax.swing.JTextField();
        menuItemName7 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        menuItemName8 = new javax.swing.JLabel();
        uploadPicBtn = new javax.swing.JButton();
        profilePicPathLabel = new javax.swing.JLabel();
        menuItemName9 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        menuItemName10 = new javax.swing.JLabel();
        bloodGroupCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(null);
        setForeground(new java.awt.Color(0, 102, 102));
        setAutoscrolls(true);

        deliveryDirLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        deliveryDirLabel.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel.setText("Register as a Patient");

        deliveryDirLabel1.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        deliveryDirLabel1.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel1.setText("Help us, Help you!");

        deliveryDirLabel2.setBackground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        deliveryDirLabel2.setForeground(new java.awt.Color(0, 102, 102));
        deliveryDirLabel2.setText("We want to help you...");

        menuItemName.setBackground(null);
        menuItemName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName.setText("Patient Name:");

        donorNameTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        donorNameTF.setForeground(new java.awt.Color(0, 102, 102));
        donorNameTF.setText(" ");

        menuItemName1.setBackground(null);
        menuItemName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName1.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName1.setText("Gender:");

        maleRB.setBackground(new java.awt.Color(255, 255, 255));
        maleRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maleRB.setForeground(new java.awt.Color(0, 102, 102));
        maleRB.setText("Male");

        femaleRB.setBackground(new java.awt.Color(255, 255, 255));
        femaleRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        femaleRB.setForeground(new java.awt.Color(0, 102, 102));
        femaleRB.setText("Female");
        femaleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRBActionPerformed(evt);
            }
        });

        notToSayRB.setBackground(new java.awt.Color(255, 255, 255));
        notToSayRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notToSayRB.setForeground(new java.awt.Color(0, 102, 102));
        notToSayRB.setText("Prefer Not to Say");

        biRB.setBackground(new java.awt.Color(255, 255, 255));
        biRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        biRB.setForeground(new java.awt.Color(0, 102, 102));
        biRB.setText("Bi Sexual");
        biRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biRBActionPerformed(evt);
            }
        });

        dobTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dobTF.setForeground(new java.awt.Color(0, 102, 102));
        dobTF.setText(" ");

        menuItemName2.setBackground(null);
        menuItemName2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName2.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName2.setText("Date of Birth:");

        menuItemName3.setBackground(null);
        menuItemName3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName3.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName3.setText("Address:");

        addTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addTF.setForeground(new java.awt.Color(0, 102, 102));
        addTF.setText(" ");

        menuItemName4.setBackground(null);
        menuItemName4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName4.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName4.setText("City:");

        cityTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityTF.setForeground(new java.awt.Color(0, 102, 102));
        cityTF.setText(" ");

        menuItemName5.setBackground(null);
        menuItemName5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName5.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName5.setText("State:");

        stateCombobox.setForeground(new java.awt.Color(0, 0, 102));
        stateCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY", " " }));

        menuItemName6.setBackground(null);
        menuItemName6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName6.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName6.setText("Zip Code:");

        zipCodeTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zipCodeTF.setForeground(new java.awt.Color(0, 102, 102));
        zipCodeTF.setText(" ");

        menuItemName7.setBackground(null);
        menuItemName7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName7.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName7.setText("Profile Picture:");

        phoneTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneTF.setForeground(new java.awt.Color(0, 102, 102));
        phoneTF.setText(" ");

        menuItemName8.setBackground(null);
        menuItemName8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName8.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName8.setText("Contact:");

        uploadPicBtn.setBackground(new java.awt.Color(0, 102, 102));
        uploadPicBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uploadPicBtn.setForeground(new java.awt.Color(255, 255, 255));
        uploadPicBtn.setText("Upload +");
        uploadPicBtn.setBorderPainted(false);
        uploadPicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPicBtnActionPerformed(evt);
            }
        });

        profilePicPathLabel.setText(" ");

        menuItemName9.setBackground(null);
        menuItemName9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName9.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName9.setText("Email:");

        emailTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailTF.setForeground(new java.awt.Color(0, 102, 102));
        emailTF.setText(" ");
        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(0, 102, 102));
        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.setBorderPainted(false);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.setBorderPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        menuItemName10.setBackground(null);
        menuItemName10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName10.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuItemName10.setText("Blood Group:");

        bloodGroupCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bloodGroupCB.setForeground(new java.awt.Color(0, 102, 102));
        bloodGroupCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-", " " }));
        bloodGroupCB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        ImageIcon imageIcon =  new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/patient.gif")).getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT));
        jLabel2.setIcon(imageIcon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deliveryDirLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(490, 490, 490)
                        .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(profilePicPathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(deliveryDirLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuItemName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuItemName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleRB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRB)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(biRB)
                                                .addGap(18, 18, 18)
                                                .addComponent(notToSayRB))))
                                    .addComponent(donorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menuItemName2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuItemName3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dobTF, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(addTF)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(menuItemName8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(menuItemName7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(menuItemName9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(menuItemName10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bloodGroupCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(uploadPicBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(emailTF)
                                    .addComponent(phoneTF)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(menuItemName6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(menuItemName4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(menuItemName5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(stateCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zipCodeTF)
                                    .addComponent(cityTF))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(477, 477, 477)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(1253, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {biRB, femaleRB, maleRB, notToSayRB});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addTF, bloodGroupCB, cityTF, dobTF, donorNameTF, emailTF, phoneTF, stateCombobox, uploadPicBtn, zipCodeTF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryDirLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(20, 20, 20)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuItemName)
                            .addComponent(donorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menuItemName1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(maleRB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(femaleRB)
                                    .addComponent(biRB)
                                    .addComponent(notToSayRB))
                                .addGap(3, 3, 3)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuItemName2)
                            .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuItemName3)
                            .addComponent(addTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuItemName4)
                            .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuItemName6)
                            .addComponent(zipCodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menuItemName5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stateCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuItemName8)
                            .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemName7)
                            .addComponent(uploadPicBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemName9)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemName10)
                            .addComponent(bloodGroupCB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(registerBtn)
                        .addGap(2406, 2406, 2406)
                        .addComponent(profilePicPathLabel)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2463, 2463, 2463))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addTF, cityTF, dobTF, donorNameTF, emailTF, phoneTF, zipCodeTF});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {biRB, femaleRB, maleRB, notToSayRB});

    }// </editor-fold>//GEN-END:initComponents

    private boolean femail=true;
    private boolean fbloodgroup=true;
    private void biRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biRBActionPerformed

    private void uploadPicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPicBtnActionPerformed
        // TODO add your handling code here:
        String profilePicPath;
        
         JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            if (selectedFile.getName().endsWith(".jfif") || selectedFile.getName().contains(".jpeg") || selectedFile.getName().contains(".jpg") || selectedFile.getName().contains(".png")){
                profilePicPathLabel.setText(selectedFile.getName());
                profilePicPath = selectedFile.getAbsolutePath();
            } else {
                JOptionPane.showConfirmDialog(null, "Only jpeg/jpg and png format supported.", "Error!",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
            }

        }
    }//GEN-LAST:event_uploadPicBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        
        
            try {
            String date = Utilities.getTrimmedText(dobTF);
            String name = Utilities.getTrimmedText(donorNameTF);
            String gender = getGenderValuesFromGivenRadioButtons();
            String phone = Utilities.getTrimmedText(phoneTF);
            String city = Utilities.getTrimmedText(cityTF);
            String state = stateCombobox.getSelectedItem().toString();
            String address = Utilities.getTrimmedText(addTF);
            int zipCode = Integer.parseInt(Utilities.getTrimmedText(zipCodeTF));
            String email = Utilities.getTrimmedText(emailTF);
            String profilePath = profilePicPathLabel.getText();
            String blood = (String) bloodGroupCB.getSelectedItem();
        


            if (phone.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the valid details for Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the valid details for Email", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (blood.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the valid details for Blood", "Error", JOptionPane.ERROR_MESSAGE);
            }

            PatientData patient = new PatientData();
            patient.setPatientName(name);
            patient.setAddress(address);
            patient.setCity(city);
            patient.setState(state);
            patient.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(date));
            patient.setContactNo(phone);
            patient.setProfilePic(profilePath);
            patient.setGender(gender);
            patient.setZipCode(zipCode);
            patient.setEmail(email);
            patient.setBloodGroup(blood);

            femail = email.contains("@");

               
            //this is done in order to validate the email bloodGroup:
                if (femail) {
                    String[] to = {email};
                    String phoneNumber = patient.getContactNo();
                    String from = "medistop2021vzd@gmail.com";
                    String pwd = "TravelDell@26893";

                    String code = OTPUtility.generateOTP(4);

                    String message = "Dear "+ name +",\n\nPlease enter the below code to activate your account:" + " " + code +"\n\nThanks,\nTeam MediStop";
                    String subject = "Account Verification Mail";
                    SMSUtility.sendSMS(patient.getContactNo(), " Account Verification Mail  " + message);

                    JOptionPane.showMessageDialog(null, "Successfully recorded the Donor Details.\n Please proceed to activate your account.","Success",JOptionPane.INFORMATION_MESSAGE);

                    PatientValidateJPanel validatePatientJPanel = new PatientValidateJPanel(bodyPanel, ecosystem,code, patient );
                    bodyPanel.add("ValidatePatientJPanel", validatePatientJPanel);
                    CardLayout layout = (CardLayout) bodyPanel.getLayout();
                    layout.next(bodyPanel);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email or Blood-Group inputes are not correct Please Try Again", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please enter the valid details", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        

       
    }//GEN-LAST:event_registerBtnActionPerformed

    
    
    public String getGenderValuesFromGivenRadioButtons()
    {
        if(maleRB.isSelected())
        {
            return "Male";
        }
        else if(femaleRB.isSelected())
        {
            return "Female";
        }  else if(biRB.isSelected())
        {
            return "Bi Sexual";
        }  else if(notToSayRB.isSelected())
        {
            return "Unknown";
        }

        return null;
    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
          bodyPanel.remove(this);
        CardLayout layout = (CardLayout) bodyPanel.getLayout();
        layout.previous(bodyPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void femaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRBActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JRadioButton biRB;
    private javax.swing.JComboBox<String> bloodGroupCB;
    private javax.swing.JTextField cityTF;
    private javax.swing.JLabel deliveryDirLabel;
    private javax.swing.JLabel deliveryDirLabel1;
    private javax.swing.JLabel deliveryDirLabel2;
    private javax.swing.JTextField dobTF;
    private javax.swing.JTextField donorNameTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JLabel menuItemName;
    private javax.swing.JLabel menuItemName1;
    private javax.swing.JLabel menuItemName10;
    private javax.swing.JLabel menuItemName2;
    private javax.swing.JLabel menuItemName3;
    private javax.swing.JLabel menuItemName4;
    private javax.swing.JLabel menuItemName5;
    private javax.swing.JLabel menuItemName6;
    private javax.swing.JLabel menuItemName7;
    private javax.swing.JLabel menuItemName8;
    private javax.swing.JLabel menuItemName9;
    private javax.swing.JRadioButton notToSayRB;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JLabel profilePicPathLabel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JComboBox<String> stateCombobox;
    private javax.swing.JButton uploadPicBtn;
    private javax.swing.JTextField zipCodeTF;
    // End of variables declaration//GEN-END:variables

}
