/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.models.User.Organisation;

import java.util.ArrayList;
import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Role.Donor;
import HealthBuddy.models.Role.Role;

/**
 *
 * @author Nidhi Singh
 */
public class DonorOrganisation extends Organisation {
    public DonorOrganisation() 
    {
        super(Organisation.Type.Donor.getValue());
    }

    @Override
     public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new Donor());
        return role;
    }
}
