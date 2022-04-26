package HealthBuddy.models.Role;
import HealthBuddy.models.User.User;
import javax.swing.JPanel;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Network.Network;
/**
 *
 * @author Bhawna Singh
 */

public abstract class Role {
    public enum RoleType{
        HealthcareAdmin("HealthcareAdmin"), 
        Doctor("Doctor"),
        Nurse("NURSE"),
        Frontdesk("Frontdesk"),
        Donor("Donor"),
        Patient("Patient"),
        TrustAdmin("TrustAdmin"),
        Manager("Manager"),
        Volunteer("Volunteer"),
        BloodDonorCenterAdmin("BloodDonorCenterAdmin"),
        BloodDonorCenterController("BloodDonorCenterController"),;
        

private String val;
private RoleType(String val){
    this.val=val;
}
//Changing body of generated methods, choose Tools | Templates
@Override
public String toString() {
    return val; 
}
}
public abstract JPanel createWorkArea(JPanel userProcessContainer, 
        User account, 
        Organisation organisation, 
        Enterprise enterprise,
        Network network,
        EcoSystem system);
}
