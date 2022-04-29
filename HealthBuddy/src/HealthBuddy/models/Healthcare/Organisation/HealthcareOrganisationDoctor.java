package HealthBuddy.models.Healthcare.Organisation;

import java.util.ArrayList;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Healthcare.Role.HealthcareDoctor;
import HealthBuddy.models.Role.Role;

/**
 *
 * @author Nidhi Singh
 */
public class HealthcareOrganisationDoctor extends Organisation {

    public HealthcareOrganisationDoctor() {
         super(Organisation.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthcareDoctor());
        return roles;
    }
}
