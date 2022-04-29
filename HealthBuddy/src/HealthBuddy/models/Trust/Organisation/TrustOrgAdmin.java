package HealthBuddy.models.Trust.Organisation;

import java.util.ArrayList;
import HealthBuddy.models.Trust.Role.TrustAdminRole;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;

/**
 *
 * @author Nidhi Singh
 */
public class TrustOrgAdmin extends Organisation{
     
    public TrustOrgAdmin() {
        super(Organisation.Type.TrustAdmin.getValue());
    }
   

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new TrustAdminRole());
        return role;
    }
    
}
