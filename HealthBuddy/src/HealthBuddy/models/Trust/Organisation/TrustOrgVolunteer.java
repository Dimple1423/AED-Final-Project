package HealthBuddy.models.Trust.Organisation;

import java.util.ArrayList;

import HealthBuddy.models.Role.Role;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Trust.Role.TrustVolunteerRole;


/**
 *
 * @author Nidhi Singh
 */
public class TrustOrgVolunteer extends Organisation{
    
    public TrustOrgVolunteer() {
        super(Organisation.Type.Volunteer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new TrustVolunteerRole());
        return role;
    }
}
