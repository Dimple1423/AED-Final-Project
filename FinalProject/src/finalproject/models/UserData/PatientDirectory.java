package finalproject.models.UserData;

import java.util.ArrayList;
import java.util.stream.Collectors;
import finalproject.models.WorkQueue.WorkQueue;
import finalproject.models.UserData.PatientData;

/**
 *
 * @author Bhawna Singh
 */
public class PatientDirectory {
     private ArrayList<PatientData> patientDirectory;
    private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    public PatientDirectory()
    {
        this.patientDirectory = new ArrayList<PatientData>();
       this.workQueue = new WorkQueue();
    }

    public ArrayList<PatientData> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<PatientData> patientDirectory) 
    {
        this.patientDirectory = patientDirectory;
    }
    
    public PatientData createPatient()
    {
        PatientData patientObj = new PatientData();
        patientDirectory.add(patientObj);
        return patientObj;
    }
    public void removePatient(PatientData patient)
    {
        patientDirectory.remove(patient);
    }


    public PatientData addPat(PatientData patientData)
    {

        patientDirectory.add(patientData);
        return patientData;
    }


    public PatientData getPatient(String username) {

        return patientDirectory.stream().filter(donor -> donor.getUsername()
                        .equals(username))
                .collect(Collectors.toList()).get(0);


    }


}
