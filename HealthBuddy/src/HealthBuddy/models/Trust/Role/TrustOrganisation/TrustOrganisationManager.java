package HealthBuddy.models.Funds.Organisation;

import HealthBuddy.Role.Role;
import HealthBuddy.models.Trust.Role.TrustManagerRole;
import java.util.ArrayList;

import HealthBuddy.models.Funds.Role.ManagerRole;
import HealthBuddy.models.Organisation.Organisation;

/**
 *
 * @author Bhawna Singh
 */
public class TrustOrganisationManager extends Organisation{
    public TrustOrganisationManager() {
        super(Organisation.Type.Manager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new TrustManagerRole());
        return role;
    }
}
