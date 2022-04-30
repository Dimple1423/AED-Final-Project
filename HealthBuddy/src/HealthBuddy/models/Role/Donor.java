package HealthBuddy.models.Role;

import javax.swing.JPanel;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Network.Network;
import HealthBuddy.ui.donor.WorkAreaDonorJPanel;
import HealthBuddy.models.User.User;

/**
 *
 * @author Bhawna Singh
 */
public class Donor extends Role {

    @Override
    //To change body of generated methods, choose Tools | Templates
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new WorkAreaDonorJPanel(system, account);
    }
}
