/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        if(type==Enterprise.EnterpriseClassification.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseClassification.Bloodbank){
            enterprise = new BloodbankEnterprise(name);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseClassification.Funds){
            enterprise = new FundingEnterprise(name);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseClassification.User){
            enterprise = new UserEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        
        return enterprise;
    } 
    
    
     public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseClassification type, String cause){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseClassification.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseClassification.Bloodbank){
            enterprise = new BloodbankEnterprise(name);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseClassification.Funds){
            enterprise = new FundingEnterprise(name, cause);
            enterpriseList.add(enterprise);
        }
          else if(type==Enterprise.EnterpriseClassification.User){
            enterprise = new UserEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        
        return enterprise;
    }    
}
