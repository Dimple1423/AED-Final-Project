package HealthBuddy.models.WorkQueue;

import HealthBuddy.models.UserData.PatientData;

/**
 *
 * @author Dimple Patel
 */
public class PatientBookingWQ extends WorkRequest {

    private PatientData patient;
    private String doctor;
    public String city;
    private String hospitalName;

    public PatientData getPatient() {
        return patient;
    }

    public void setPatient(PatientData patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return this.patient.getPatientName();
    }
}
