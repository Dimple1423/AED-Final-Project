package HealthBuddy.models.Healthcare.Role;

import javax.swing.JPanel;
import HealthBuddy.models.EcoSystem;
import HealthBuddy.models.Enterprise.Enterprise;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationDoctor;
import HealthBuddy.models.Network.Network;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;
import HealthBuddy.models.User.User;
import HealthBuddy.ui.doctor.WorkAreaDoctorJPanel;

/**
 *
 * @author Bhawna Singh
 */
public class HealthcareDoctor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new WorkAreaDoctorJPanel(userProcessContainer,account,(HealthcareOrganisationDoctor) organisation,enterprise, system); 
    }
    
}
