package HealthBuddy.models.User.Organisation;

import HealthBuddy.models.Organisation.Organisation;
import java.util.ArrayList;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.Role.Patient;

/**
 *
 * @author Nidhi Singh
 */
public class PatientOrganisation extends Organisation {
     public PatientOrganisation()
    {
        super(Organisation.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new Patient());
        return role;
    }
}
