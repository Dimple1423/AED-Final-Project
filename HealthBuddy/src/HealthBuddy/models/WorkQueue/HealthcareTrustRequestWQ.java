package HealthBuddy.models.WorkQueue;

/**
 *
 * @author Dimple Patel
 */
public class HealthcareTrustRequestWQ extends WorkRequest {

    private float amount;
    private String Message;
    private String PatientName;
    private String city;
    private String hospitalName;
    private String funderName;

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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getFunderName() {
        return funderName;
    }

    public void setFunderName(String funderName) {
        this.funderName = funderName;
    }

    @Override
    public String toString() {
        return this.PatientName;
    }
}
