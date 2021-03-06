package HealthBuddy.models.Trust.Role;

import HealthBuddy.models.Enterprise.EnterpriseTrust;
import HealthBuddy.models.Trust.Organisation.TrustOrgVolunteer;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.User.User;
import javax.swing.JPanel;
import HealthBuddy.ui.TrustVolunteer.WorkAreaVolunteerJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class TrustVolunteerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise,Network network, EcoSystem business)
    {
        return new WorkAreaVolunteerJPanel(userProcessContainer, account,(TrustOrgVolunteer) organisation,(EnterpriseTrust) enterprise,network, business);
    }
}
