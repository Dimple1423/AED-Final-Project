package HeathBuddy.models.Role;

import javax.swing.JPanel;
import HeathBuddy.models.EcoSystem;
import HeathBuddy.models.Enterprise.Enterprise;
import HeathBuddy.models.Network.Network;
import HeathBuddy.models.Organisation.Organisation;
import HeathBuddy.models.UserAccount.UserAccount;
import HeathBuddy.ui.SystemAdminWorkArea.SystemAdministratorWorkAreaJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class SysAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new SystemAdministratorWorkAreaJPanel(userProcessContainer, system);


    }
   
}
