package HeathBuddy.models.Role;

import javax.swing.JPanel;
import HeathBuddy.models.EcoSystem;
import HeathBuddy.models.Enterprise.Enterprise;
import HeathBuddy.models.Network.Network;
import HeathBuddy.models.Organisation.Organisation;
import HeathBuddy.models.UserAccount.UserAccount;
import HeathBuddy.ui.donor.DonorWorkAreaPanel;

/**
 *
 * @author Bhawna Singh
 */
public class Donor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new DonorWorkAreaPanel(system, account); //To change body of generated methods, choose Tools | Templates.
    }
    

}
