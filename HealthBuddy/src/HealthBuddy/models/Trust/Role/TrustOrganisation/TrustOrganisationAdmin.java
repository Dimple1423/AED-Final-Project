package HealthBuddy.models.Trust.Organisation;

import java.util.ArrayList;
import HealthBuddy.models.Trust.Role.TrustAdmin;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;

/**
 *
 * @author Bhawna Singh
 */
public class TrustOrganisationAdmin extends Organisation{
     
    public TrustOrganisationAdmin() {
        super(Organisation.Type.FunderAdmin.getValue()); //FunderAdmin is present in Organisation Folder too. make changes in both
    }
   

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new TrustAdminRole());
        return role;
    }
    
}
