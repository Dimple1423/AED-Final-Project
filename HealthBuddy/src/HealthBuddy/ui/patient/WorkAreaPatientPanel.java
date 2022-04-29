/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HealthBuddy.ui.patient;


import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Hospital.Appointment.AppointmentDetails;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAssistant;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Patient;
import medistopBackend.UserAccount.UserAccount;
import medistopBackend.UserData.DonorData;
import medistopBackend.UserData.PatientData;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import medistopBackend.Network.Network;
import medistopBackend.WorkQueue.AssistantAddingTimingsWorkQueue;
import medistopBackend.WorkQueue.PatientBookingWorkQueue;
import medistopBackend.WorkQueue.WorkRequest;
import medistopUtil.SMSUtility;
import medistopUtil.WhatsappUtility;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author 18577
 */
public class WorkAreaPatientPanel extends javax.swing.JPanel {
    DefaultTableModel appointmentDirectoryTableModel;
    DefaultTableModel appointmentHistoryTableModel;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private PatientData patientData;
    private Organisation organisation;
    private JPanel bodyPanel;

    /** Creates new form DonorWorkAreaPanel */
    public WorkAreaPatientPanel(JPanel bodyPanel, EcoSystem ecoSys, UserAccount userAcc, Organisation organisation) {
        ecoSystem = ecoSys;
        userAccount = userAcc;
        this.bodyPanel = bodyPanel;
        patientData = ecoSystem.getPatientDir().getPatient(userAcc.getUsername());
        this.organisation = organisation;
        initApptDirTableModel();
        initApptHistoryDirTableModel();
        initComponents();
        populateAvailAppontments();
        populateAppointmentHistoryTable();


    }
    
    public void initApptDirTableModel() {
        appointmentDirectoryTableModel = new DefaultTableModel();
        appointmentDirectoryTableModel.addColumn("Hospital");
        appointmentDirectoryTableModel.addColumn("Doctor");
        appointmentDirectoryTableModel.addColumn("Timestamp");
        appointmentDirectoryTableModel.addColumn("Status");
    }
    
    public void initApptHistoryDirTableModel() {


        
        appointmentHistoryTableModel = new DefaultTableModel();
        appointmentHistoryTableModel.addColumn("Patient Name");

        appointmentHistoryTableModel.addColumn("Time stamp");
        appointmentHistoryTableModel.addColumn("Doctor Name");

        appointmentHistoryTableModel.addColumn("Hospital");
        appointmentHistoryTableModel.addColumn("City");
        appointmentHistoryTableModel.addColumn("Disease");    


    }
    
    
     public void populateAvailAppontments()
    {
        DefaultTableModel model = (DefaultTableModel) appointDirTable.getModel();
        
        model.setRowCount(0);
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

        for (Network network: ecoSystem.getNetworkList()) {
        
          for(WorkRequest request: ecoSystem.getPatientDir().getWorkQueue().getWorkRequestList()){
            AssistantAddingTimingsWorkQueue assistantAddingTimingsWorkQueue = new AssistantAddingTimingsWorkQueue();
              assistantAddingTimingsWorkQueue = (AssistantAddingTimingsWorkQueue)request;
            if(network.getNetworkName().equals(assistantAddingTimingsWorkQueue.getCity()))
            {

                Object[] rowdata = {assistantAddingTimingsWorkQueue, assistantAddingTimingsWorkQueue.getDoctor(),
                        assistantAddingTimingsWorkQueue.getTimings(),
                        assistantAddingTimingsWorkQueue.getStatus() };

                model.addRow(rowdata);
            }
        }
          
        
        
        
        
        }
        
        
        
          
    }


    public void populateAppointmentHistoryTable() {
        DefaultTableModel model = (DefaultTableModel) searchDonationCatalogTable.getModel();

        model.setRowCount(0);

        for(AppointmentDetails appDetails : ecoSystem.getAppointmentDirectory().getAppointmentDirectory())
        {
            if(userAccount.getUsername().equalsIgnoreCase(appDetails.getPatient().getUsername()))
            {
                Object[] row = new Object[6];
                row[0] = appDetails.getPatient().getPatientName();
                row[1] = appDetails.getDate();
                row[2] = appDetails.getDoctorName();
                row[3] = appDetails.getHospitalName();
                row[4] = appDetails.getCityOfTreated();
                row[5] = appDetails.getDiseases();

                model.addRow(row);
            }
        }

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
        appointDirTable = new javax.swing.JTable();
        deliveryDirLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        manageOrdersTab = new javax.swing.JPanel();
        searchCarCatalogScrollPanel = new javax.swing.JScrollPane();
        searchDonationCatalogTable = new javax.swing.JTable();
        deliveryDirLabel4 = new javax.swing.JLabel();
        helpTextLabel = new javax.swing.JLabel();

        donationTabbedPane.setForeground(new java.awt.Color(0, 0, 102));
        donationTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        deliveryDirLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel.setForeground(new java.awt.Color(0, 0, 102));
        deliveryDirLabel.setText("Book an appoinment with us to get the help you need...");

        delDirectoryScollPanel.setForeground(new java.awt.Color(0, 0, 102));
        delDirectoryScollPanel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N

        appointDirTable.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        appointDirTable.setForeground(new java.awt.Color(0, 0, 102));
        appointDirTable.setModel(appointmentDirectoryTableModel);
        appointDirTable.setRowHeight(40);
        delDirectoryScollPanel.setViewportView(appointDirTable);

        deliveryDirLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel2.setForeground(new java.awt.Color(0, 0, 102));
        deliveryDirLabel2.setText("Available appointments");

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 102));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(0, 0, 102));
        registerBtn.setText("Book Appointment");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
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
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(802, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delDirectoryScollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(backBtn))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        donationTabbedPane.addTab("New Appointment", menuPanel);

        searchDonationCatalogTable.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        searchDonationCatalogTable.setForeground(new java.awt.Color(0, 0, 102));
        searchDonationCatalogTable.setModel(appointmentHistoryTableModel);
        searchDonationCatalogTable.setRowHeight(40);
        searchCarCatalogScrollPanel.setViewportView(searchDonationCatalogTable);

        deliveryDirLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel4.setForeground(new java.awt.Color(0, 0, 102));
        deliveryDirLabel4.setText("Appointment History");

        helpTextLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helpTextLabel.setForeground(new java.awt.Color(0, 0, 102));
        helpTextLabel.setText(" ");

        javax.swing.GroupLayout manageOrdersTabLayout = new javax.swing.GroupLayout(manageOrdersTab);
        manageOrdersTab.setLayout(manageOrdersTabLayout);
        manageOrdersTabLayout.setHorizontalGroup(
            manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(helpTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(deliveryDirLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manageOrdersTabLayout.setVerticalGroup(
            manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrdersTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(deliveryDirLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(manageOrdersTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(helpTextLabel))
                    .addGroup(manageOrdersTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        donationTabbedPane.addTab("Appointment History", manageOrdersTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        bodyPanel.remove(this);
        CardLayout layout = (CardLayout) bodyPanel.getLayout();
        layout.previous(bodyPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) appointDirTable.getModel();
        int selectedRow = appointDirTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        AssistantAddingTimingsWorkQueue request = (AssistantAddingTimingsWorkQueue)appointDirTable.getValueAt(selectedRow,0);
        if(request.getStatus().equals("Booked")){
            JOptionPane.showMessageDialog(null,"Select Valid Slot. The slot you are trying to book is not available.");
        }
        else{
            request.setStatus("Booked");
//            Network net = (Network) cityJComboBox.getSelectedItem();
            populateAvailAppontments();
            PatientBookingWorkQueue patientBookingWorkQueue = new PatientBookingWorkQueue();
            PatientData patientData = null;
            for(PatientData pat : ecoSystem.getPatientDir().getPatientDirectory()){
                if(pat.getUsername().equals(userAccount.getUsername()))
                {
                    patientData = pat;
                    break;
                }
            }
            patientBookingWorkQueue.setPatient(patientData);
            patientBookingWorkQueue.setSender(userAccount);
            patientBookingWorkQueue.setStatus("Booked");
            patientBookingWorkQueue.setCity(request.getCity());
            patientBookingWorkQueue.setDoctor(request.getDoctor());
            patientBookingWorkQueue.setHospitalName(request.getHospitalName());
            Enterprise enterprise = null;
            for(Network n: ecoSystem.getNetworkList() ){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getName().equalsIgnoreCase(request.getHospitalName()))
                    {
                        enterprise = e;
                        break;
                    }
                }
            }
            HospitalOrganisationAssistant org = null;
            for (Organisation o : enterprise.getOrganizationDirectory().getOrganizationList()){
                if(o instanceof HospitalOrganisationAssistant)
                {
                    org = (HospitalOrganisationAssistant)o;
                    break;
                }
            }
            org.getIncomingPatients().getWorkRequestList().add(patientBookingWorkQueue);
            userAccount.getWorkQueue().getWorkRequestList().add(patientBookingWorkQueue);

            String message = "Dear "+ patientData.getPatientName() +",\n\nYour appointment has been requested for " + " " + request.getTimings() + " with Doctor: " + request.getDoctor() + " at Hospital " + request.getHospitalName()+"\n\nThanks,\nTeam MediStop";
            SMSUtility.sendSMS(patientData.getContactNo(), message);
            WhatsappUtility.sendWhatsappMessage(patientData.getContactNo(), message);
            JOptionPane.showMessageDialog(null,"Slot has been booked.");

            populateAppointmentHistoryTable();
        }




    }//GEN-LAST:event_registerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointDirTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane delDirectoryScollPanel;
    private javax.swing.JLabel deliveryDirLabel;
    private javax.swing.JLabel deliveryDirLabel2;
    private javax.swing.JLabel deliveryDirLabel4;
    private javax.swing.JTabbedPane donationTabbedPane;
    private javax.swing.JLabel helpTextLabel;
    private javax.swing.JPanel manageOrdersTab;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JScrollPane searchCarCatalogScrollPanel;
    private javax.swing.JTable searchDonationCatalogTable;
    // End of variables declaration//GEN-END:variables

}
