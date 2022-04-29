package HealthBuddy.models.Role;

import HealthBuddy.models.EcoSystem;
import javax.swing.JPanel;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.ui.SystemAdminWorkArea.SystemAdministratorWorkAreaJPanel;
import HealthBuddy.models.User.User;

/**
 *
 * @author Bhawna Singh
 */
public class SysAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new SystemAdministratorWorkAreaJPanel(userProcessContainer, system);
    }
}
