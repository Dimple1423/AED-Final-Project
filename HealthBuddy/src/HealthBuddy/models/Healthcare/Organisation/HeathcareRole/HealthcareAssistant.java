package Healthbuddy.models.Healthcare.Role;

import javax.swing.JPanel;
import Healthbuddy.models.EcoSystem;
import Healthbuddy.models.Enterprise.Enterprise;
import Healthbuddy.models.Healthcare.Organisation.HealthcareOrganisationAssistant;
import Healthbuddy.models.Network.Network;
import Healthbuddy.models.Organisation.Organisation;
import Healthbuddy.models.Role.Role;
import Healthbuddy.models.UserAccount.UserAccount;
import Healthbuddy.ui.Assistant.AssistantWorkAreaPanel;

/**
 *
 * @author Bhawna Singh
 */
public class HealthcareAssistant extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new AssistantWorkAreaPanel(userProcessContainer,account,(HealthcareOrganisationAssistant)organisation,enterprise,network,system); //To change body of generated methods, choose Tools | Templates.
    }


    
}
