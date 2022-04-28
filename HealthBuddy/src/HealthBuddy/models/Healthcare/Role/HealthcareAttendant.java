package HealthBuddy.models.Healthcare.Role;

import javax.swing.JPanel;
import Healthbuddy.models.EcoSystem;
import Healthbuddy.models.Enterprise.Enterprise;
import Healthbuddy.models.Healthcare.Organisation.HealthcareOrganisationAttendant;
import Healthbuddy.models.Network.Network;
import Healthbuddy.models.Organisation.Organisation;
import Healthbuddy.models.Role.Role;
import Healthbuddy.models.UserAccount.UserAccount;
import Healthbuddy.ui.attendant.AttendantWorkAreaPanel;

/**
 *
 * @author Bhawna Singh
 */
public class HealthcareAttendant extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new AttendantWorkAreaPanel(userProcessContainer,account,(HealthcareOrganisationAttendant) organisation,enterprise,network,system);
    }
    
}