package HealthBuddy.models.Role;

import HealthBuddy.models.EcoSystem;
import javax.swing.JPanel;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.User.User;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.ui.patient.WorkAreaPatientPanel;

/**
 *
 * @author Bhawna Singh
 */
public class Patient extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new WorkAreaPatientPanel(userProcessContainer, system, account, organisation);

    }
    
}

