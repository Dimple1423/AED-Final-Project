package HealthBuddy.models.Trust.Role;

import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.UserAccount.User;
//import HealthBuddy.ui.Admin.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import HealthBuddy.ui.admin.AdminWorkAreaPanel;

/**
 *
 * @author Bhawna Singh
 */
public class TrustAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network ,EcoSystem business) 
    {
         //need to add the work Area for AdminWorkAreaHere
        return new AdminWorkAreaPanel(userProcessContainer, enterprise);
    }
}
