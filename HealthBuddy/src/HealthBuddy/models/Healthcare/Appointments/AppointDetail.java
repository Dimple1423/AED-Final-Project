package HealthBuddy.models.Healthcare.Appointment;
import HealthBuddy.models.UserData.PatientData;
import java.util.Date;

/**
 *
 * @author Bhawna Singh
 */
public class AppointDetail {
    private PatientData patientData;
    private String disease;
    private String prescription;
    private boolean isBloodNeeded;
    private boolean isFundNeeded;
    private Date date;
    private String healthcareName;
    private String doctorName;
    private String cityOfTreatment;
    private boolean isAppointmentTaken;

    public PatientData getPatient() {
        return patientData;
    }

    public boolean isAppointmentTaken() {
        return isAppointmentTaken;
    }

    public void setisAppointmentTaken(boolean isAppointmentTaken) {
        this.isAppointmentTaken = isAppointmentTaken;
    }
     
   public void setPatient(PatientData patientData) {
        this.patientData = patientData;
    }

    public String getHealthcareName() {
        return healthcareName;
    }

    public void setHealthcareName(String healthcareName) {
        this.healthcareName = healthcareName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getCityOfTreated() {
        return cityOfTreatment;
    }

    public void setCityOfTreated(String cityOfTreatment) {
        this.cityOfTreatment = cityOfTreatment;
    }
    
    public String getDiseases() {
        return disease;
    }

    public void setDiseases(String disease) {
        this.disease = disease;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public boolean isIsBloodNeeded() {
        return isBloodNeeded;
    }

    public void setIsBloodNeeded(boolean isBloodNeeded) {
        this.isBloodNeeded = isBloodNeeded;
    }

    public boolean isFundNeeded() {
        return isFundNeeded;
    }

    public void setIsFundNeeded(boolean isFundNeeded) {
        this.isFundNeeded = isFundNeeded;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }   
}
