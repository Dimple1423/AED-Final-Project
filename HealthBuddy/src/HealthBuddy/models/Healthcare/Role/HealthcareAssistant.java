package HealthBuddy.models.Healthcare.Role;

import javax.swing.JPanel;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationAssistant;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.User.User;
import HealthBuddy.ui.Assistant.AssistantWorkAreaPanel;

/**
 *
 * @author Bhawna Singh
 */
public class HealthcareAssistant extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new AssistantWorkAreaPanel(userProcessContainer, account, (HealthcareOrganisationAssistant) organisation, enterprise, network, system); //To change body of generated methods, choose Tools | Templates.
    }
}
