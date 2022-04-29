package HealthBuddy.models.User.Organisation;

import HealthBuddy.models.Organisation.Organisation;
import java.util.ArrayList;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.Role.Donor;

/**
 *
 * @author Nidhi Singh
 */
public class DonorOrganisation extends Organisation {
    public DonorOrganisation() 
    {
        super(Organisation.Type.Donor.getValue());
    }

    @Override
     public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new Donor());
        return role;
    }
}
