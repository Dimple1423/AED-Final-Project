/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.models.Healthcare.Organisation;

import java.util.ArrayList;
import HealthBuddy.models.Healthcare.Role.HealthcareAdmin;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Role;

/**
 *
 * @author Nidhi Singh
 */
public class HealthcareOrganisationAdmin extends Organisation{

    public HealthcareOrganisationAdmin() {
        super(Organisation.Type.Doctor.getValue());
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new HealthcareAdmin());
        return role;
    }
    
}
