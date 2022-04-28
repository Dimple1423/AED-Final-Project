
package HealthBuddy.models.BloodDonorCenter.Role;

import javax.swing.JPanel;
import HealthBuddy.models.BloodDonorCenter.Organisation.BDCControllerOrganisation;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.EnterpriseBloodDonorCenter;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.UserAccount.User;
import HealthBuddy.ui.BloodDonorCenter.BloodDonorCenterControllerMainPageJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class BloodDonorCenterController extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new BloodDonorCenterControllerMainPageJPanel(userProcessContainer,account,(BDCControllerOrganisation)organisation,(EnterpriseBloodDonorCenter)enterprise,network,system);
    }
   
}
