package HealthBuddy.models.Trust.Role;

import HealthBuddy.models.Trust.Organisation.TrustOrganisationVolunteer;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.EnterpriseTrust;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.UserAccount.User;
import javax.swing.JPanel;
import HealthBuddy.ui.TrustVolunteer.VolunteerWorkAreaJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class TrustVolunteerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise,Network network, EcoSystem business)
    {
        //need to write the code here
        return new VolunteerWorkAreaJPanel(userProcessContainer, account,(TrustOrganisationVolunteer) organisation,(FundingEnterprise) enterprise,network, business);
    }
}
