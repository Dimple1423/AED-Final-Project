/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.models.User.Organisation;

import java.util.ArrayList;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Patient;
import HealthBuddy.models.Role.Role;

/**
 *
 * @author Nidhi Singh
 */
public class PatientOrganisation extends Organisation {
     public PatientOrganisation()
    {
        super(Organisation.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new Patient());
        return role;
    }
}
