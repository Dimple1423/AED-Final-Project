package HealthBuddy.models.Healthcare.Role;

import javax.swing.JPanel;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.User.User;
import HealthBuddy.ui.admin.WorkAreaAdminPanel;

/**
 *
 * @author Bhawna Singh
 */
public class HealthcareAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new WorkAreaAdminPanel(userProcessContainer, enterprise);//To change body of generated methods, choose Tools | Templates.
    }
}
    