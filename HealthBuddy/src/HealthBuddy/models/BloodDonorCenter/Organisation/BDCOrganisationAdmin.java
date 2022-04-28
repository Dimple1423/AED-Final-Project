package HealthBuddy.models.BloodDonorCenter.Organisation;
import HealthBuddy.models.BloodDonorCenter.Role.BloodDonorCenterAdmin;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.Healthcare.Role.HealthcareDoctor;
import java.util.ArrayList;

/**
 *
 * @author Dimple Patel
 */
public class BDCOrganisationAdmin extends Organisation{
    public BDCOrganisationAdmin() {
        super(Organisation.Type.BloodbankAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodDonorCenterAdmin());
        return roles;
    }    
}
