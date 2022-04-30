package HealthBuddy.models.BloodDonorCenter.Role;

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
public class BloodDonorCenterAdmin extends Role {
//Changing generated methods body, choose Tools | Templates

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new WorkAreaAdminPanel(userProcessContainer, enterprise);
    }
}
