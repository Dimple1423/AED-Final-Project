package HealthBuddy.models.Role;

import javax.swing.JPanel;
import HealthBuddy.models.UserAccount.User;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
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

@Override
public String toString() {
    return val; //To change body of generated methods, choose Tools | Templates.
}
}
public abstract JPanel createWorkArea(JPanel userProcessContainer, 
        User account, 
        Organisation organisation, 
        Enterprise enterprise,
        Network network,
        EcoSystem system);



}
