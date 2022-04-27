package HealthBuddy.models.Healthcare.Appointment;

import java.util.ArrayList;

/**
 *
 * @author Bhawna Singh
 */
public class AppointCatalog {
    private ArrayList<AppointmentDetails> AppointCatalog;
    
    public AppointCatalog()
    {
        this.AppointCatalog = new ArrayList<AppointmentDetails>();
    }

    public ArrayList<AppointmentDetails> getAppointCatalog() {
        return AppointCatalog;
    }

    public void setAppointCatalog(ArrayList<AppointmentDetails> appointCatalog) {
       // ArrayList<AppointmentDetails> appointmentCatalog = appointmentCatalog;
        this.AppointCatalog = appointCatalog;
    }
    
    public AppointmentDetails createAppointment()
    {
        var appointment = new AppointmentDetails();
        AppointCatalog.add(appointment);
        return appointment;
    }
    public void deletePatient(AppointmentDetails appointment)
    {
        AppointCatalog.remove(appointment);
    }
}

