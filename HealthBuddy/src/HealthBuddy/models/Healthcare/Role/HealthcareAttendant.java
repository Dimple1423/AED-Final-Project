package HealthBuddy.models.Healthcare.Role;

import javax.swing.JPanel;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationAttendant;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.User.User;
import HealthBuddy.ui.attendant.WorkAreaAttendantJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class HealthcareAttendant extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new WorkAreaAttendantJPanel(userProcessContainer,account,(HealthcareOrganisationAttendant) organisation,enterprise,network,system);
    }
    
}