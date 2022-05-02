package HealthBuddy.ui.doctor;

import javax.swing.JPanel;
import javax.swing.JOptionPane;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationAssistant;
import HealthBuddy.models.Healthcare.Appointment.AppointmentInformation;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationDoctor;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationAttendant;
import HealthBuddy.models.User.User;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.WorkQueue.DoctorAttendantWQ;
import HealthBuddy.models.WorkQueue.DoctorAssistantAccountWQ;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author Dimple Patel
 */
public class WorkAreaDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaDoctorJPanel
     */
    
    private EcoSystem ecosystem;
    private Enterprise enterprise;
    private User userAccount;
    private HealthcareOrganisationDoctor docOrganisation;
    private AppointmentInformation appointment;
    private JPanel displayJPanel;
    
    public WorkAreaDoctorJPanel() {
        initComponents();
    }

    public WorkAreaDoctorJPanel(JPanel displayJPanel,User userAccount ,HealthcareOrganisationDoctor docOrganisation, Enterprise enterprise, EcoSystem ecosystem) 
    {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.userAccount = userAccount;
        valuePatientName9.setText(userAccount.getUsername());
        this.docOrganisation = docOrganisation;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        setSize(1540,800);
        
        populateForm();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPatientName9 = new javax.swing.JLabel();
        txtPatientName9 = new javax.swing.JTextField();
        txtDOB9 = new javax.swing.JTextField();
        lblDOB9 = new javax.swing.JLabel();
        lblBloodGroup9 = new javax.swing.JLabel();
        txtBloodGroup9 = new javax.swing.JTextField();
        lblDisease9 = new javax.swing.JLabel();
        txtDisease9 = new javax.swing.JTextField();
        lblPrescription9 = new javax.swing.JLabel();
        txtPrescription9 = new javax.swing.JTextField();
        menuItemName19 = new javax.swing.JLabel();
        menuItemName9 = new javax.swing.JLabel();
        RadioBloodYes9 = new javax.swing.JRadioButton();
        RadioBloodNo9 = new javax.swing.JRadioButton();
        lblWelcome9 = new javax.swing.JLabel();
        valuePatientName9 = new javax.swing.JLabel();
        btnAddPrescription9 = new javax.swing.JButton();
        btnRefresh9 = new javax.swing.JButton();
        lblPatientName19 = new javax.swing.JLabel();
        lblPatientsWaiting9 = new javax.swing.JLabel();
        RadioFundsYes9 = new javax.swing.JRadioButton();
        RadioFundsNo9 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 102, 102));

        lblPatientName9.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientName9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPatientName9.setForeground(new java.awt.Color(0, 102, 102));
        lblPatientName9.setText("Patient Name:");

        txtPatientName9.setEditable(false);
        txtPatientName9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPatientName9.setForeground(new java.awt.Color(0, 102, 102));
        txtPatientName9.setText(" ");

        txtDOB9.setEditable(false);
        txtDOB9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDOB9.setForeground(new java.awt.Color(0, 102, 102));
        txtDOB9.setText(" ");
        txtDOB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOB9ActionPerformed(evt);
            }
        });

        lblDOB9.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDOB9.setForeground(new java.awt.Color(0, 102, 102));
        lblDOB9.setText("Date of Birth:");

        lblBloodGroup9.setBackground(new java.awt.Color(255, 255, 255));
        lblBloodGroup9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBloodGroup9.setForeground(new java.awt.Color(0, 102, 102));
        lblBloodGroup9.setText("Blood Group:");

        txtBloodGroup9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBloodGroup9.setForeground(new java.awt.Color(0, 102, 102));
        txtBloodGroup9.setText(" ");

        lblDisease9.setBackground(new java.awt.Color(255, 255, 255));
        lblDisease9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDisease9.setForeground(new java.awt.Color(0, 102, 102));
        lblDisease9.setText("Disease:");

        txtDisease9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDisease9.setForeground(new java.awt.Color(0, 102, 102));
        txtDisease9.setText(" ");
        txtDisease9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisease9ActionPerformed(evt);
            }
        });

        lblPrescription9.setBackground(new java.awt.Color(255, 255, 255));
        lblPrescription9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPrescription9.setForeground(new java.awt.Color(0, 102, 102));
        lblPrescription9.setText("Prescription:");

        txtPrescription9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrescription9.setForeground(new java.awt.Color(0, 102, 102));
        txtPrescription9.setText(" ");

        menuItemName19.setBackground(new java.awt.Color(255, 255, 255));
        menuItemName19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName19.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName19.setText("Blood Required:");

        menuItemName9.setBackground(new java.awt.Color(255, 255, 255));
        menuItemName9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuItemName9.setForeground(new java.awt.Color(0, 102, 102));
        menuItemName9.setText("Funds Required:");

        RadioBloodYes9.setBackground(new java.awt.Color(255, 255, 255));
        RadioBloodYes9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioBloodYes9.setForeground(new java.awt.Color(0, 102, 102));
        RadioBloodYes9.setText("Yes");
        RadioBloodYes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBloodYes9ActionPerformed(evt);
            }
        });

        RadioBloodNo9.setBackground(new java.awt.Color(255, 255, 255));
        RadioBloodNo9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioBloodNo9.setForeground(new java.awt.Color(0, 102, 102));
        RadioBloodNo9.setText("No");
        RadioBloodNo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBloodNo9ActionPerformed(evt);
            }
        });

        lblWelcome9.setBackground(new java.awt.Color(255, 255, 255));
        lblWelcome9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWelcome9.setForeground(new java.awt.Color(0, 102, 102));
        lblWelcome9.setText("Welcome ");

        valuePatientName9.setBackground(new java.awt.Color(255, 255, 255));
        valuePatientName9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valuePatientName9.setForeground(new java.awt.Color(0, 102, 102));
        valuePatientName9.setText("value");

        btnAddPrescription9.setBackground(new java.awt.Color(0, 102, 102));
        btnAddPrescription9.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        btnAddPrescription9.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPrescription9.setText("Add Prescription");
        btnAddPrescription9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddPrescription9.setBorderPainted(false);
        btnAddPrescription9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPrescription9ActionPerformed(evt);
            }
        });

        btnRefresh9.setBackground(new java.awt.Color(0, 102, 102));
        btnRefresh9.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        btnRefresh9.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh9.setText("Refresh");
        btnRefresh9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh9.setBorderPainted(false);
        btnRefresh9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh9ActionPerformed(evt);
            }
        });

        lblPatientName19.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientName19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPatientName19.setForeground(new java.awt.Color(0, 102, 102));
        lblPatientName19.setText("Patients Waiting:");

        lblPatientsWaiting9.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientsWaiting9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPatientsWaiting9.setForeground(new java.awt.Color(0, 102, 102));

        RadioFundsYes9.setBackground(new java.awt.Color(255, 255, 255));
        RadioFundsYes9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioFundsYes9.setForeground(new java.awt.Color(0, 102, 102));
        RadioFundsYes9.setText("Yes");
        RadioFundsYes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioFundsYes9ActionPerformed(evt);
            }
        });

        RadioFundsNo9.setBackground(new java.awt.Color(255, 255, 255));
        RadioFundsNo9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RadioFundsNo9.setForeground(new java.awt.Color(0, 102, 102));
        RadioFundsNo9.setText("No");
        RadioFundsNo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioFundsNo9ActionPerformed(evt);
            }
        });

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/HealthBuddy/ui/images/hipertensao.gif")).getImage().getScaledInstance(650, 550, Image.SCALE_DEFAULT));

        jLabel1.setIcon(imageIcon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(menuItemName19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuItemName9, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(RadioFundsYes9)
                                        .addGap(43, 43, 43)
                                        .addComponent(RadioFundsNo9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(RadioBloodYes9)
                                        .addGap(43, 43, 43)
                                        .addComponent(RadioBloodNo9))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(btnAddPrescription9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblPrescription9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDisease9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBloodGroup9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDOB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPatientName9, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDisease9, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtBloodGroup9)
                                    .addComponent(txtDOB9)
                                    .addComponent(txtPatientName9)
                                    .addComponent(txtPrescription9))))
                        .addGap(930, 1026, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblWelcome9)
                                .addGap(89, 89, 89))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientName19, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valuePatientName9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 915, Short.MAX_VALUE)
                                .addComponent(btnRefresh9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientsWaiting9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(216, 216, 216)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RadioBloodNo9, RadioBloodYes9, RadioFundsNo9, RadioFundsYes9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWelcome9)
                            .addComponent(valuePatientName9))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPatientsWaiting9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPatientName19))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatientName9)
                                        .addGap(31, 31, 31)
                                        .addComponent(lblDOB9)
                                        .addGap(34, 34, 34)
                                        .addComponent(lblBloodGroup9)
                                        .addGap(32, 32, 32)
                                        .addComponent(lblDisease9)
                                        .addGap(32, 32, 32)
                                        .addComponent(lblPrescription9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPatientName9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtDOB9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtBloodGroup9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtDisease9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtPrescription9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RadioBloodYes9)
                                        .addComponent(RadioBloodNo9))
                                    .addComponent(menuItemName19, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(menuItemName9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RadioFundsYes9)
                                        .addComponent(RadioFundsNo9)))
                                .addGap(67, 67, 67)
                                .addComponent(btnAddPrescription9))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefresh9))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblPatientsWaiting9, valuePatientName9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblPatientName19, lblWelcome9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBloodGroup9, lblDOB9, lblDisease9, lblPatientName9, lblPrescription9, menuItemName19, menuItemName9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {RadioBloodNo9, RadioBloodYes9, RadioFundsNo9, RadioFundsYes9});

    }// </editor-fold>//GEN-END:initComponents

    private void txtDOB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOB9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOB9ActionPerformed

    private void txtDisease9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisease9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisease9ActionPerformed

    private void RadioBloodYes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBloodYes9ActionPerformed
        RadioBloodNo9.setSelected(false);
    }//GEN-LAST:event_RadioBloodYes9ActionPerformed

    private void RadioBloodNo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBloodNo9ActionPerformed
        RadioBloodYes9.setSelected(false);
    }//GEN-LAST:event_RadioBloodNo9ActionPerformed

    private void btnAddPrescription9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPrescription9ActionPerformed
        // TODO add your handling code here:
         appointment.setDiseases(txtDisease9.getText());
                appointment.setPrescription(txtPrescription9.getText());
                boolean bloodRequired = isBloodRequired();
                boolean donationRequired = isDonationRequired();
                appointment.setisappointmentTaken(true);
                appointment.setIsBloodNeeded(bloodRequired);
                appointment.setIsFundNeeded(donationRequired);
                
                DoctorAttendantWQ attendantWorkQueue = new DoctorAttendantWQ();
                DoctorAssistantAccountWQ assistantWorkQueue = new DoctorAssistantAccountWQ();
                
                attendantWorkQueue.setAppointmentInformation(appointment);
                attendantWorkQueue.setSender(userAccount);
                attendantWorkQueue.setMessage("Prescribed");
                assistantWorkQueue.setApd(appointment);
                assistantWorkQueue.setFundingRequired(donationRequired);
                assistantWorkQueue.setFundingApproved(false);
                assistantWorkQueue.setPrescribed(txtPrescription9.getText());
                HealthcareOrganisationAttendant orgAttendant = null;
                JOptionPane.showMessageDialog(null, "Prescription details updation complete!!","Success", JOptionPane.INFORMATION_MESSAGE);
        
        for (Organisation organisation : enterprise.getOrganizationCatalog().getOrganizationList()){
            if (organisation instanceof HealthcareOrganisationAttendant){
                orgAttendant = (HealthcareOrganisationAttendant)organisation;
                break;
            }
        }
        if (orgAttendant!=null && appointment.isIsBloodNeeded() == true){
            orgAttendant.getDoctorAttendantWQ().getWorkRequestList().add(attendantWorkQueue);
            userAccount.getWorkQueue().getWorkRequestList().add(attendantWorkQueue);
        }
        HealthcareOrganisationAssistant orgAssistant = null;
        for (Organisation organisation : enterprise.getOrganizationCatalog().getOrganizationList()){
            if (organisation instanceof HealthcareOrganisationAssistant){
                orgAssistant = (HealthcareOrganisationAssistant)organisation;
                break;
            }
        }
        if (orgAssistant!=null && appointment.isFundNeeded() == true){
            orgAssistant.getFundApplicationQueue().getWorkRequestList().add(assistantWorkQueue);
            userAccount.getWorkQueue().getWorkRequestList().add(assistantWorkQueue);
        }
        //--->Resetting form fields
        resetFields();
        populateForm();
    }//GEN-LAST:event_btnAddPrescription9ActionPerformed

    private void btnRefresh9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh9ActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_btnRefresh9ActionPerformed

    private void RadioFundsYes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioFundsYes9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioFundsYes9ActionPerformed

    private void RadioFundsNo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioFundsNo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioFundsNo9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioBloodNo9;
    private javax.swing.JRadioButton RadioBloodYes9;
    private javax.swing.JRadioButton RadioFundsNo9;
    private javax.swing.JRadioButton RadioFundsYes9;
    private javax.swing.JButton btnAddPrescription9;
    private javax.swing.JButton btnRefresh9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBloodGroup9;
    private javax.swing.JLabel lblDOB9;
    private javax.swing.JLabel lblDisease9;
    private javax.swing.JLabel lblPatientName19;
    private javax.swing.JLabel lblPatientName9;
    private javax.swing.JLabel lblPatientsWaiting9;
    private javax.swing.JLabel lblPrescription9;
    private javax.swing.JLabel lblWelcome9;
    private javax.swing.JLabel menuItemName19;
    private javax.swing.JLabel menuItemName9;
    private javax.swing.JTextField txtBloodGroup9;
    private javax.swing.JTextField txtDOB9;
    private javax.swing.JTextField txtDisease9;
    private javax.swing.JTextField txtPatientName9;
    private javax.swing.JTextField txtPrescription9;
    private javax.swing.JLabel valuePatientName9;
    // End of variables declaration//GEN-END:variables

public void populateForm()
    {
        for(AppointmentInformation appointment : ecosystem.getAppointmentCatalog().getAppointmentCatalog())
        {
            if(appointment.isisappointmentTaken() != true)
            {
                this.appointment = appointment;
                txtPatientName9.setText(appointment.getPatient().getPatientName());
                txtDOB9.setText(String.valueOf(appointment.getPatient().getDateOfBirth()));
                txtBloodGroup9.setText(appointment.getPatient().getBloodGroup());
                populateLabel();
                break;
                
            }
        }
    }

public void populateLabel(){
        int count = -1;
        for(AppointmentInformation appointment : ecosystem.getAppointmentCatalog().getAppointmentCatalog())
        {
            if(appointment.isisappointmentTaken() == false)
            {
                count++;
            }
        }
        lblPatientsWaiting9.setText(String.valueOf(count));
    }

public boolean isBloodRequired()
    {
         boolean output=false;
        if(RadioBloodYes9.isSelected())
        {
            return true;
        }
        else if(RadioBloodNo9.isSelected())
        {
            return false;
        }
        return false;
    }

public boolean isDonationRequired()
    {
        boolean output=false;
        if(RadioFundsYes9.isSelected())
        {
            return true;
        }
        else if(RadioFundsNo9.isSelected())
        {
            return false;
        }
        
        return false;

//         output=RadioFundsYes.isSelected()?true:false;
//         output=RadioFundsNo.isSelected()?false:true;
//         
//        return output;
    }

public void resetFields(){
    txtPatientName9.setText("");
        txtDOB9.setText("");
        txtBloodGroup9.setText("");
        txtDisease9.setText("");
        txtPrescription9.setText("");
}
}