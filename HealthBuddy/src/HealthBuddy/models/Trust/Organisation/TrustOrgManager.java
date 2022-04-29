package HealthBuddy.models.Trust.Organisation;

import java.util.ArrayList;

import HealthBuddy.models.Trust.Role.TrustManagerRole;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.Organisation.Organisation;

/**
 *
 * @author Nidhi Singh
 */
public class TrustOrgManager extends Organisation{
    public TrustOrgManager() {
        super(Organisation.Type.Manager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new TrustManagerRole());
        return role;
    }
}
