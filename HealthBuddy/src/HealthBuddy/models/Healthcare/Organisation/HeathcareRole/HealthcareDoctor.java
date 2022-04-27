package Healthbuddy.models.Healthcare.Role;

import javax.swing.JPanel;
import Healthbuddy.models.EcoSystem;
import Healthbuddy.models.Enterprise.Enterprise;
import Healthbuddy.models.Healthcare.Organisation.HealthcareOrganisationDoctor;
import Healthbuddy.models.Network.Network;
import Healthbuddy.models.Organisation.Organisation;
import Healthbuddy.models.Role.Role;
import Healthbuddy.models.UserAccount.UserAccount;
import Healthbuddy.ui.doctor.DoctorWorkAreaJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class HealthcareDoctor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account,(HealthcareOrganisationDoctor) organisation,enterprise, system); //To change body of generated methods, choose Tools | Templates.
    }
    
}
