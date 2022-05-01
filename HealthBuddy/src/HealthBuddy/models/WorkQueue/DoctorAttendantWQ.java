package HealthBuddy.models.WorkQueue;

import HealthBuddy.models.Healthcare.Appointment.AppointmentInformation;

/**
 *
 * @author Dimple Patel
 */
public class DoctorAttendantWQ extends WorkRequest {

    private AppointmentInformation appointmentDetails;

    public DoctorAttendantWQ() {
        appointmentDetails = new AppointmentInformation();
    }

    public AppointmentInformation getAppointmentInformation() {
        return appointmentDetails;
    }

    public void setAppointmentInformation(AppointmentInformation appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }

    @Override
    public String toString() {
        return appointmentDetails.getPatient().getPatientName();
    }
}
