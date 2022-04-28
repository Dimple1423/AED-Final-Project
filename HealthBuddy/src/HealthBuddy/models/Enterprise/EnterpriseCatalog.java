package HealthBuddy.models.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Dimple Patel
 */
public class EnterpriseCatalog {
     private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseCatalog(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseClassification type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseClassification.Healthcare){
            enterprise = new EnterpriseHealthcare(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseClassification.BloodDonorCenter){
            enterprise = new EnterpriseBloodDonorCenter(name);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseClassification.Trust){
            enterprise = new EnterpriseTrust(name);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseClassification.User){
            enterprise = new EnterpriseUser(name);
            enterpriseList.add(enterprise);
        }
        
        
        return enterprise;
    } 
    
    
     public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseClassification type, String cause){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseClassification.Healthcare){
            enterprise = new EnterpriseHealthcare(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseClassification.BloodDonorCenter){
            enterprise = new EnterpriseBloodDonorCenter(name);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseClassification.Trust){
            enterprise = new EnterpriseTrust(name, cause);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseClassification.User){
            enterprise = new EnterpriseUser(name);
            enterpriseList.add(enterprise);
        }
        
        
        return enterprise;
    }    
}
