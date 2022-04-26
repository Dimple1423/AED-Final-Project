package HeathBuddy.models.Role;

import javax.swing.JPanel;
import HeathBuddy.models.EcoSystem;
import HeathBuddy.models.Enterprise.Enterprise;
import HeathBuddy.models.Network.Network;
import HeathBuddy.models.Organisation.Organisation;
import HeathBuddy.models.UserAccount.UserAccount;
import HealthBuddy.ui.patient.PatientWorkAreaPanel;

/**
 *
 * @author Bhawna Singh
 */
public class Patient extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new PatientWorkAreaPanel(userProcessContainer, system, account, organisation);

    }
    
}

