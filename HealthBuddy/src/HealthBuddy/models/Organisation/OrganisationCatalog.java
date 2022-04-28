/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthBuddy.models.Organisation;


import HealthBuddy.models.Organisation.Organisation.Type;
import HealthBuddy.models.User.Organisation.DonorOrganisation;
import HealthBuddy.models.User.Organisation.PatientOrganisation;
import HealthBuddy.models.UserAccount.User;

import HealthBuddy.models.Bloodbank.Organisation.BloodbankAdminOrg;
import HealthBuddy.models.Bloodbank.Organisation.HeadsOrganisation;
import HealthBuddy.models.Funds.Organisation.FundsOrganisationAdmin;
import HealthBuddy.models.Funds.Organisation.FundsOrganisationManager;
import HealthBuddy.models.Funds.Organisation.FundsOrganisationVolunteer;
import HealthBuddy.models.Enterprise.FundingEnterprise;
import HealthBuddy.models.Organisation.Organisation.Type;
import HealthBuddy.models.User.Organisation.DonorOrganisation;
import HealthBuddy.models.User.Organisation.PatientOrganisation;
import HealthBuddy.models.UserAccount.User;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationDoctor;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationAdmin;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationAttendant;
import HealthBuddy.models.Healthcare.Organisation.HealthcareOrganisationAssistant;

import java.util.ArrayList;

/**
 *
 * @author Nidhi Singh
 */
public class OrganisationCatalog {
    private ArrayList<Organisation> organisationList;

    public OrganisationCatalog() {
        organisationList = new ArrayList();
    }

    public ArrayList<Organisation> getOrganizationList() {
        return organisationList;
    }
    
    
    public Organisation createOrganisation(Type type){
        Organisation organisation = null;
        if (type.getValue().equals(Type.Doctor.getValue()))
        {
            organisation = new HealthcareOrganisationDoctor();
            organisationList.add(organisation);
        }
        
        else if (type.getValue().equals(Type.Patient.getValue()))
        {
            organisation = new PatientOrganisation();
            organisationList.add(organisation);
        }
        
        else if(type.getValue().equals(Type.Donor.getValue()))
        {
            organisation = new DonorOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.HealthcareAdmin.getValue()))
        {
            organisation = new HealthcareOrganisationAdmin();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Assistant.getValue()))
        {
            organisation = new HealthcareOrganisationAssistant();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Attendant.getValue()))
        {
            organisation = new HealthcareOrganisationAttendant();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.BloodbankAdmin.getValue()))
        {
            organisation = new BloodbankAdminOrg();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.BloodBankHead.getValue()))
        {
            organisation = new HeadsOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.FunderAdmin.getValue()))
        {
            organisation = new FundsOrganisationAdmin();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Volunteer.getValue()))
        {
            organisation = new FundsOrganisationVolunteer();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Manager.getValue()))
        {
            organisation = new FundsOrganisationManager();
            organisationList.add(organisation);
        }
        
        return organisation;
    }
}
