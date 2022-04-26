/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.models.Healthcare.Organisation;
import java.util.ArrayList;
import HealthBuddy.models.Healthcare.Role.HealthcareAttendant;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.WorkQueue.WorkQueue;

/**
 *
 * @author Nidhi Singh
 */
public class HealthcareOrganisationAttendant extends Organisation {
    private WorkQueue doctorAttendantWQ;
    private WorkQueue BloodHeadAttendantWQ;
    
    public HealthcareOrganisationAttendant() {
        super(Organisation.Type.Attendant.getValue());
        doctorAttendantWQ = new WorkQueue();
        BloodHeadAttendantWQ= new WorkQueue();
    }
    
    public WorkQueue getDoctorAttendantWQ() {
        return doctorAttendantWQ;
    }

    public void setDoctorAttendantWQ(WorkQueue doctorAttendantWQ) {
        this.doctorAttendantWQ = doctorAttendantWQ;
    }

    public WorkQueue getBloodHeadAttendantWQ() {
        return BloodHeadAttendantWQ;
    }

    public void setBloodHeadAttendantWQ(WorkQueue BloodHeadAttendantWQ) {
        this.BloodHeadAttendantWQ = BloodHeadAttendantWQ;
    }
 
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new HealthcareAttendant());
        return role;
    }
    
}
