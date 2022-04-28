package medistopBackend.WorkQueue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import HealthBuddy.models.UserAccount.User;
import HealthBuddy.Util.Utilities;

/**
 *
 * @author Bhawna Singh
 */
public class DoctorAttendantWQ extends WorkRequest{
    
    private String doctor;
    public String city;
    private String nameOfHealthcare;
    private LocalDateTime timings;

    public String getHealthcareName() {
        return nameOfHealthcare;
    }

    public void setHealthcareName(String nameOfHealthcare) {
        this.nameOfHealthcare = nameOfHealthcare;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDoctor() 
    {
        return doctor;
    }
    
    public void setDoctor(String doctor) 
    {
        this.doctor = doctor;
    }
    
    public String getTimings() {
        return timings.format(Utilities.formatter);
    }

    public void setTimings(LocalDateTime timings) {
        this.timings = timings;
    }
    @Override
    public String toString(){
        return this.nameOfHealthcare;
    }
}