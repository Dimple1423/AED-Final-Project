package HealthBuddy.models.Trust.Role;

import HealthBuddy.models.Trust.Organisation.TrustOrganisationManager;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.EnterpriseTrust;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.UserAccount.UserAccount;
import javax.swing.JPanel;
import HealthBuddy.models.Role.Role;
import HealthBuddy.ui.FundManager.ManagerWorkAreaJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class TrustManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network,EcoSystem system) {
        //need to write the code here:
       return new ManagerWorkAreaJPanel(userProcessContainer,account,(TrustOrganisationManager) organisation,(FundingEnterprise) enterprise,network,system);
    }
}
