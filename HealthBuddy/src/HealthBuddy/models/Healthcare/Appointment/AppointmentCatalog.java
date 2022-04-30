package HealthBuddy.models.Healthcare.Appointment;

import java.util.ArrayList;

/**
 *
 * @author Nidhi Singh
 */
public class AppointmentCatalog {

    private ArrayList<AppointmentInformation> appointmentCatalog;

    public AppointmentCatalog() {
        this.appointmentCatalog = new ArrayList<AppointmentInformation>();
    }

    public ArrayList<AppointmentInformation> getAppointmentCatalog() {
        return appointmentCatalog;
    }

    public void setAppointmentCatalog(ArrayList<AppointmentInformation> appointmentCatalog) {
        this.appointmentCatalog = appointmentCatalog;
    }

    public AppointmentInformation createAppointment() {
        AppointmentInformation appointment = new AppointmentInformation();
        appointmentCatalog.add(appointment);
        return appointment;
    }

    public void deletePatient(AppointmentInformation appointment) {
        appointmentCatalog.remove(appointment);
    }
}
