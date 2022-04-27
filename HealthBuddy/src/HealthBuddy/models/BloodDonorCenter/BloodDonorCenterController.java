
package Healthbuddy.models.BloodDonorCenter.Role;

import javax.swing.JPanel;
import Healthbuddy.models.BloodDonorCenter.Organisation.HeadsOrganisation;
import Healthbuddy.models.EcoSystem;
import Healthbuddy.models.Enterprise.BloodDonorCenterEnterprise;
import Healthbuddy.models.Enterprise.Enterprise;
import Healthbuddy.models.Network.Network;
import Healthbuddy.models.Organisation.Organisation;
import Healthbuddy.models.Role.Role;
import Healthbuddy.models.UserAccount.UserAccount;
import Healthbuddy.ui.BloodDonorCenter.HeadBloodDonorCenterMainPageJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class BloodDonorCenterHead extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new ControllerBloodDonorCenterMainPageJPanel(userProcessContainer,account,(ControllerOrganisation)organisation,(BloodDonorCenterEnterprise)enterprise,network,system);
    }
   
}
