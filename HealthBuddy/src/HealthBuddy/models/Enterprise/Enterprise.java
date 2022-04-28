package HealthBuddy.models.Enterprise;

import HealthBuddy.models.Organisation.Organisation;
import HealthBuddy.models.Organisation.OrganisationCatalog;

/**
 *
 * @author Dimple Patel
 */
public abstract class Enterprise extends Organisation{

    private EnterpriseClassification enterpriseClassification;
    private OrganisationCatalog organisationList;
    
    public Enterprise(String enterpriseName,EnterpriseClassification classification){
        super(enterpriseName);
        this.enterpriseClassification=classification;
        organisationList= new OrganisationCatalog();
    }
     public Enterprise(String enterpriseName,EnterpriseClassification classification, String cause){
        super(enterpriseName, cause);
        this.enterpriseClassification=classification;
        organisationList= new OrganisationCatalog();
    }
    public enum EnterpriseClassification{
                User("User"), Healthcare("Healthcare"), BloodDonorCenter("BloodDonorCenter"), Trust("Trust") ;
                private String val;
                private EnterpriseClassification(String val){
                    this.val=val;
                }

        public String getVal() {
            return val;
        }

        @Override
        public String toString() {
            return val;
        }           
    }
    public OrganisationCatalog getOrganizationCatalog() {
        return organisationList;
    }
    public EnterpriseClassification getEnterpriseClassification() {
        return enterpriseClassification;
    }

    public void setEnterpriseClassification(EnterpriseClassification enterpriseClassification) {
        this.enterpriseClassification = enterpriseClassification;
    }
}
