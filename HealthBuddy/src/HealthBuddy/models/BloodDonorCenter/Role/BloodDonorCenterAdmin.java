package HealthBuddy.models.BloodDonorCenter.Role;

import javax.swing.JPanel;
import HeathBuddy.models.EcoSystem;
import HeathBuddy.models.Enterprise.Enterprise;
import HeathBuddy.models.Network.Network;
import HeathBuddy.models.Organisation.Organisation;
import HeathBuddy.models.Role.Role;
import HeathBuddy.models.UserAccount.UserAccount;
import HealthBuddy.ui.admin.AdminWorkAreaPanel;

/**
 *
 * @author Bhawna Singh
 */
public class BloodDonorCenterAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new AdminWorkAreaPanel(userProcessContainer, enterprise); //To change body of generated methods, choose Tools | Templates.
    }
    
    