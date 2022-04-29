package HealthBuddy.models.UserData;

import java.util.stream.Collectors;
import java.util.ArrayList;
import HealthBuddy.models.UserData.PatientData;
import HealthBuddy.models.WorkQueue.WorkQueue;

/**
 *
 * @author Bhawna Singh
 */
public class PatientCatalog {
     private ArrayList<PatientData> patientCatalog;
    private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    public PatientCatalog()
    {
        this.patientCatalog = new ArrayList<PatientData>();
       this.workQueue = new WorkQueue();
    }

    public ArrayList<PatientData> getPatientCatalog() {
        return patientCatalog;
    }

    public void setPatientCatalog(ArrayList<PatientData> patientCatalog) 
    {
        this.patientCatalog = patientCatalog;
    }
    
    public PatientData createPatient()
    {
        PatientData patientObj = new PatientData();
        patientCatalog.add(patientObj);
        return patientObj;
    }
    public void removePatient(PatientData patient)
    {
        patientCatalog.remove(patient);
    }


    public PatientData addPat(PatientData patientData)
    {

        patientCatalog.add(patientData);
        return patientData;
    }


    public PatientData getPatient(String username) {

        return patientCatalog.stream().filter(donor -> donor.getUsername()
                        .equals(username))
                .collect(Collectors.toList()).get(0);


    }


}
