package HealthBuddy.models.Trust.Role;

import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Trust.Organisation.TrustOrgManager;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Enterprise.EnterpriseTrust;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.User.User;
import javax.swing.JPanel;
import HealthBuddy.models.Role.Role;
import HealthBuddy.ui.TrustManager.WorkAreaManagerJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class TrustManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network,EcoSystem system) {
        //need to write the code here:
       return new WorkAreaManagerJPanel(userProcessContainer,account,(TrustOrgManager) organisation,(EnterpriseTrust) enterprise,network,system);
    }
}
