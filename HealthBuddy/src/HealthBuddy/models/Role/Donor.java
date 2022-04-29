package HealthBuddy.models.Role;

import javax.swing.JPanel;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Network.Network;
import HealthBuddy.ui.donor.DonorWorkAreaPanel;
import HealthBuddy.models.User.User;

/**
 *
 * @author Bhawna Singh
 */
public class Donor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new DonorWorkAreaPanel(system, account); //To change body of generated methods, choose Tools | Templates.
    }
}
